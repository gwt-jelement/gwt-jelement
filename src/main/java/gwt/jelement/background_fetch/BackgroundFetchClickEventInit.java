/*
 * Copyright 2017 Abed Tony BenBrahim <tony.benrahim@10xdev.com>
 *     and Gwt-JElement project contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.jelement.background_fetch;

import gwt.jelement.background_fetch.BackgroundFetchEventInit;
import gwt.jelement.background_fetch.BackgroundFetchState;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class BackgroundFetchClickEventInit extends BackgroundFetchEventInit{

    @JsProperty(name="state")
    private String state;

    public BackgroundFetchClickEventInit(){
    }

    @JsOverlay
    public final BackgroundFetchState getState(){
        return BackgroundFetchState.of(this.state);
    }

    @JsOverlay
    public final void setState(BackgroundFetchState state){
        this.state = state.getInternalValue();
    }

}

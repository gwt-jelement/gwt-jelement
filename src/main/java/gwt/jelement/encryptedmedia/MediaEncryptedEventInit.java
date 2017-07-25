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
package gwt.jelement.encryptedmedia;

import gwt.jelement.events.EventInit;
import elemental2.core.ArrayBuffer;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaEncryptedEventInit extends EventInit{

    @JsProperty(name="initDataType")
    private String initDataType;

    @JsProperty(name="initData")
    private ArrayBuffer initData;

    public MediaEncryptedEventInit(){
    }

    @JsOverlay
    public final String getInitDataType(){
        return this.initDataType;
    }

    @JsOverlay
    public final void setInitDataType(String initDataType){
        this.initDataType = initDataType;
    }

    @JsOverlay
    public final ArrayBuffer getInitData(){
        return this.initData;
    }

    @JsOverlay
    public final void setInitData(ArrayBuffer initData){
        this.initData = initData;
    }

}

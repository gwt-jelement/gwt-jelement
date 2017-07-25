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
package gwt.jelement.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class EventInit{

    public EventInit(){
    }

    @JsProperty(name="bubbles")
    public boolean bubbles;

    @JsOverlay
    public final boolean getBubbles(){
        return this.bubbles;
    }

    @JsOverlay
    public final void setBubbles(boolean bubbles){
        this.bubbles = bubbles;
    }

    @JsProperty(name="cancelable")
    public boolean cancelable;

    @JsOverlay
    public final boolean getCancelable(){
        return this.cancelable;
    }

    @JsOverlay
    public final void setCancelable(boolean cancelable){
        this.cancelable = cancelable;
    }

    @JsProperty(name="composed")
    public boolean composed;

    @JsOverlay
    public final boolean getComposed(){
        return this.composed;
    }

    @JsOverlay
    public final void setComposed(boolean composed){
        this.composed = composed;
    }


}

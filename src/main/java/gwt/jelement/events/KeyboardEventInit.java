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
public class KeyboardEventInit extends EventModifierInit{

    @JsProperty(name="key")
    private String key;

    @JsProperty(name="code")
    private String code;

    @JsProperty(name="location")
    private double location;

    @JsProperty(name="repeat")
    private boolean repeat;

    @JsProperty(name="isComposing")
    private boolean isComposing;

    public KeyboardEventInit(){
    }

    @JsOverlay
    public final String getKey(){
        return this.key;
    }

    @JsOverlay
    public final void setKey(String key){
        this.key = key;
    }

    @JsOverlay
    public final String getCode(){
        return this.code;
    }

    @JsOverlay
    public final void setCode(String code){
        this.code = code;
    }

    @JsOverlay
    public final double getLocation(){
        return this.location;
    }

    @JsOverlay
    public final void setLocation(double location){
        this.location = location;
    }

    @JsOverlay
    public final boolean isRepeat(){
        return this.repeat;
    }

    @JsOverlay
    public final void setRepeat(boolean repeat){
        this.repeat = repeat;
    }

    @JsOverlay
    public final boolean isIsComposing(){
        return this.isComposing;
    }

    @JsOverlay
    public final void setIsComposing(boolean isComposing){
        this.isComposing = isComposing;
    }


}

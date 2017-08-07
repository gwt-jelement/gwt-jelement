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

import gwt.jelement.clipboard.DataTransfer;
import gwt.jelement.dom.StaticRange;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="InputEvent", isNative = true)
public class InputEvent extends UIEvent {
    @JsConstructor
    public InputEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public InputEvent(String type, InputEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="data")
    public native String getData();
    
    @JsProperty(name="isComposing")
    public native boolean getIsComposing();
    
    @JsProperty(name="inputType")
    public native String getInputType();
    
    @JsProperty(name="dataTransfer")
    public native DataTransfer getDataTransfer();
    
    @JsMethod(name = "getTargetRanges")
    public native StaticRange[] getTargetRanges();
    
}

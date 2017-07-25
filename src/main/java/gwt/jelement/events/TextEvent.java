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

import gwt.jelement.events.UIEvent;
import gwt.jelement.frame.Window;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TextEvent extends UIEvent{
    
    @JsConstructor
    public TextEvent(){
        super((String) null);
    }
    
    @JsProperty(name="data")
    public native String getData();
    
    @JsMethod(name = "initTextEvent")
    public native void initTextEvent();
    
    
    @JsMethod(name = "initTextEvent")
    public native void initTextEvent(String type);
    
    
    @JsMethod(name = "initTextEvent")
    public native void initTextEvent(String type, boolean bubbles);
    
    
    @JsMethod(name = "initTextEvent")
    public native void initTextEvent(String type, boolean bubbles, boolean cancelable);
    
    
    @JsMethod(name = "initTextEvent")
    public native void initTextEvent(String type, boolean bubbles, boolean cancelable, Window view);
    
    
    @JsMethod(name = "initTextEvent")
    public native void initTextEvent(String type, boolean bubbles, boolean cancelable, Window view, String data);
    
    
}

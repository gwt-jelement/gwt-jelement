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

import gwt.jelement.frame.Window;
import gwt.jelement.input.InputDeviceCapabilities;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="UIEvent", isNative = true)
public class UIEvent extends Event{
    @JsConstructor
    public UIEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public UIEvent(String type, UIEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="view")
    public native Window getView();
    
    @JsProperty(name="detail")
    public native double getDetail();
    
    @JsProperty(name="sourceCapabilities")
    public native InputDeviceCapabilities getSourceCapabilities();
    
    @JsProperty(name="which")
    public native double getWhich();
    
    @JsMethod(name = "initUIEvent")
    public native void initUIEvent();
    
    @JsMethod(name = "initUIEvent")
    public native void initUIEvent(String type);
    
    @JsMethod(name = "initUIEvent")
    public native void initUIEvent(String type, boolean bubbles);
    
    @JsMethod(name = "initUIEvent")
    public native void initUIEvent(String type, boolean bubbles, boolean cancelable);
    
    @JsMethod(name = "initUIEvent")
    public native void initUIEvent(String type, boolean bubbles, boolean cancelable, Window view);
    
    @JsMethod(name = "initUIEvent")
    public native void initUIEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail);
    
}

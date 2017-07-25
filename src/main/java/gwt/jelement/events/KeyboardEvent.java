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

import gwt.jelement.events.KeyboardEventInit;
import gwt.jelement.events.UIEvent;
import gwt.jelement.frame.Window;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class KeyboardEvent extends UIEvent{
    public static int DOM_KEY_LOCATION_STANDARD;
    public static int DOM_KEY_LOCATION_LEFT;
    public static int DOM_KEY_LOCATION_RIGHT;
    public static int DOM_KEY_LOCATION_NUMPAD;
    
    
    @JsConstructor
    public KeyboardEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public KeyboardEvent(String type, KeyboardEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="key")
    public native String getKey();
    
    @JsProperty(name="code")
    public native String getCode();
    
    @JsProperty(name="location")
    public native double getLocation();
    
    @JsProperty(name="ctrlKey")
    public native boolean getCtrlKey();
    
    @JsProperty(name="shiftKey")
    public native boolean getShiftKey();
    
    @JsProperty(name="altKey")
    public native boolean getAltKey();
    
    @JsProperty(name="metaKey")
    public native boolean getMetaKey();
    
    @JsProperty(name="repeat")
    public native boolean getRepeat();
    
    @JsProperty(name="isComposing")
    public native boolean getIsComposing();
    
    @JsProperty(name="charCode")
    public native double getCharCode();
    
    @JsProperty(name="keyCode")
    public native double getKeyCode();
    
    @JsMethod(name = "getModifierState")
    public native boolean getModifierState(String keyArg);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent();
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view, String keyIdentifier);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view, String keyIdentifier, double location);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view, String keyIdentifier, double location, boolean ctrlKey);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view, String keyIdentifier, double location, boolean ctrlKey, boolean altKey);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view, String keyIdentifier, double location, boolean ctrlKey, boolean altKey, boolean shiftKey);
    
    
    @JsMethod(name = "initKeyboardEvent")
    public native void initKeyboardEvent(String type, boolean bubbles, boolean cancelable, Window view, String keyIdentifier, double location, boolean ctrlKey, boolean altKey, boolean shiftKey, boolean metaKey);
    
    
}

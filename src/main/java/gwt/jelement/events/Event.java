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

import gwt.jelement.events.EventInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Event{
    public static int NONE;
    public static int CAPTURING_PHASE;
    public static int AT_TARGET;
    public static int BUBBLING_PHASE;
    
    
    @JsConstructor
    public Event(String type){
    }
    
    @JsConstructor
    public Event(String type, EventInit eventInitDict){
    }
    
    @JsProperty(name="type")
    public String type;
    
    @JsProperty(name="target")
    public EventTarget target;
    
    @JsProperty(name="currentTarget")
    public EventTarget currentTarget;
    
    @JsProperty(name="eventPhase")
    public short eventPhase;
    
    @JsProperty(name="bubbles")
    public boolean bubbles;
    
    @JsProperty(name="cancelable")
    public boolean cancelable;
    
    @JsProperty(name="defaultPrevented")
    public boolean defaultPrevented;
    
    @JsProperty(name="composed")
    public boolean composed;
    
    @JsProperty(name="isTrusted")
    public boolean isTrusted;
    
    @JsProperty(name="timeStamp")
    public double timeStamp;
    
    @JsProperty(name="srcElement")
    public EventTarget srcElement;
    
    @JsProperty(name="returnValue")
    public boolean returnValue;
    
    @JsProperty(name="cancelBubble")
    public boolean cancelBubble;
    
    @JsProperty(name="path")
    public EventTarget[] path;
    
    @JsMethod(name = "composedPath")
    public native EventTarget[] composedPath();
    
    @JsMethod(name = "initEvent")
    public native void initEvent(String type);
    
    @JsMethod(name = "initEvent")
    public native void initEvent(String type, boolean bubbles);
    
    @JsMethod(name = "initEvent")
    public native void initEvent(String type, boolean bubbles, boolean cancelable);
    
    @JsMethod(name = "preventDefault")
    public native void preventDefault();
    
    @JsMethod(name = "stopImmediatePropagation")
    public native void stopImmediatePropagation();
    
    @JsMethod(name = "stopPropagation")
    public native void stopPropagation();
    
}

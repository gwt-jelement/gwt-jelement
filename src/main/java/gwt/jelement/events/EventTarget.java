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

import gwt.jelement.events.AddEventListenerOptions;
import gwt.jelement.events.Event;
import gwt.jelement.events.EventListener;
import gwt.jelement.events.EventListenerOptions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class EventTarget{
    
    @JsMethod(name = "addEventListener")
    public native void addEventListener(String type, EventListener listener);
    
    @JsMethod(name = "addEventListener")
    public native void addEventListener(String type, EventListener listener, AddEventListenerOptions options);
    
    @JsMethod(name = "addEventListener")
    public native void addEventListener(String type, EventListener listener, boolean options);
    
    @JsMethod(name = "dispatchEvent")
    public native boolean dispatchEvent(Event event);
    
    @JsMethod(name = "removeEventListener")
    public native void removeEventListener(String type, EventListener listener);
    
    @JsMethod(name = "removeEventListener")
    public native void removeEventListener(String type, EventListener listener, EventListenerOptions options);
    
    @JsMethod(name = "removeEventListener")
    public native void removeEventListener(String type, EventListener listener, boolean options);
    
}

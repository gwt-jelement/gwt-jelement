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
package gwt.jelement.eventsource;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.eventsource.EventSourceInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class EventSource extends EventTarget{
    public static int CONNECTING;
    public static int OPEN;
    public static int CLOSED;
    
    
    @JsConstructor
    public EventSource(String url){
        super();
    }
    
    @JsConstructor
    public EventSource(String url, EventSourceInit eventSourceInitDict){
        super();
    }
    
    @JsProperty(name="onopen")
    public EventHandlerNonNull onopen;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="withCredentials")
    public native boolean getWithCredentials();
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsMethod(name = "close")
    public native void close();
    
}

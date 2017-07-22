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
package gwt.jelement.dom;

import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MessagePort extends EventTarget{
    
    @JsConstructor
    public MessagePort(){
        super();
    }
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    public EventHandlerNonNull onmessageerror;
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message, MessagePort[] transfer);
    
    @JsMethod(name = "start")
    public native void start();
    
}

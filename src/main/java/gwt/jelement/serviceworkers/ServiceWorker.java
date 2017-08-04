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
package gwt.jelement.serviceworkers;

import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ServiceWorker", isNative = true)
public class ServiceWorker extends EventTarget{
    @JsProperty(name="onstatechange")
    private EventHandlerNonNull onstatechange;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="state")
    private String state;
    
    @JsProperty(name="scriptURL")
    public native String getScriptURL();
    
    @JsOverlay
    public final EventHandlerNonNull getOnStatechange(){
        return this.onstatechange;
    }
    
    @JsOverlay
    public final void setOnStatechange(EventHandlerNonNull onstatechange){
        this.onstatechange = onstatechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final ServiceWorkerState getState(){
       return ServiceWorkerState.of(state);
    }
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message, MessagePort[] transfer);
    
}

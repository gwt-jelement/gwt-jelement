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
package gwt.jelement.compositorworker;

import gwt.jelement.dom.FrameRequestCallback;
import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.workers.WorkerGlobalScope;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CompositorWorkerGlobalScope extends WorkerGlobalScope{
    
    @JsConstructor
    public CompositorWorkerGlobalScope(){
        super();
    }
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsMethod(name = "cancelAnimationFrame")
    public native void cancelAnimationFrame(long handle);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Any message);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Any message, MessagePort[] transfer);
    
    @JsMethod(name = "requestAnimationFrame")
    public native long requestAnimationFrame(FrameRequestCallback callback);
    
}

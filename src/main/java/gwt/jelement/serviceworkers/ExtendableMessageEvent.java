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
import gwt.jelement.serviceworkers.Client;
import gwt.jelement.serviceworkers.ExtendableEvent;
import gwt.jelement.serviceworkers.ServiceWorker;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ExtendableMessageEvent extends ExtendableEvent{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ClientOrServiceWorkerOrMessagePortUnionType {
        @JsOverlay
        default Client asClient(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ServiceWorker asServiceWorker(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default MessagePort asMessagePort(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isClient(){
            return (Object) this instanceof Client;
        }
    
        @JsOverlay
        default boolean isServiceWorker(){
            return (Object) this instanceof ServiceWorker;
        }
    
        @JsOverlay
        default boolean isMessagePort(){
            return (Object) this instanceof MessagePort;
        }
    
    }
    
    @JsConstructor
    public ExtendableMessageEvent(){
        super((String) null);
    }
    
    @JsProperty(name="data")
    public native Any getData();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="lastEventId")
    public native String getLastEventId();
    
    @JsProperty(name="source")
    public native ExtendableMessageEvent.ClientOrServiceWorkerOrMessagePortUnionType getSource();
    
    @JsProperty(name="ports")
    public native MessagePort[] getPorts();
    
    
}

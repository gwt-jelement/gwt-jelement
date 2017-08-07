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

import gwt.jelement.core.Js;
import gwt.jelement.dom.MessagePort;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ExtendableMessageEvent", isNative = true)
public class ExtendableMessageEvent extends ExtendableEvent {
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface SourceUnion {
        @JsOverlay
        static SourceUnion of(Client value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static SourceUnion of(ServiceWorker value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static SourceUnion of(MessagePort value){
            return Js.cast(value);
        }
    
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
    
    @JsProperty(name="source")
    private SourceUnion source;
    
    @JsConstructor
    public ExtendableMessageEvent(){
        super((String) null);
    }
    
    @JsProperty(name="data")
    public native Object getData();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="lastEventId")
    public native String getLastEventId();
    
    @JsOverlay
    public final SourceUnion getSource(){
        return this.source;
    }
    
    @JsProperty(name="ports")
    public native MessagePort[] getPorts();
    
}

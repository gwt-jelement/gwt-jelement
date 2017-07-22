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
import gwt.jelement.serviceworkers.ClientType;
import gwt.jelement.serviceworkers.ContextFrameType;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Client{
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsOverlay
    public final ClientType getTypeAsClientType(){
        return ClientType.of(getType());
    }
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsOverlay
    public final ContextFrameType getFrameTypeAsContextFrameType(){
        return ContextFrameType.of(getFrameType());
    }
    
    @JsProperty(name="frameType")
    public native String getFrameType();
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message, MessagePort[] transfer);
    
}

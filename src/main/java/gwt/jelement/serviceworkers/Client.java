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

import gwt.jelement.core.IsObject;
import gwt.jelement.core.JsObject;
import gwt.jelement.dom.MessagePort;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Client", isNative = true)
public class Client implements IsObject {
    @JsProperty(name="type")
    private String type;
    
    @JsProperty(name="frameType")
    private String frameType;
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsOverlay
    public final ClientType getType(){
       return ClientType.of(type);
    }
    
    @JsOverlay
    public final ContextFrameType getFrameType(){
       return ContextFrameType.of(frameType);
    }
    
    @JsMethod(name = "postMessage")
    public native void postMessage(JsObject message);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(JsObject message, MessagePort[] transfer);
    
}

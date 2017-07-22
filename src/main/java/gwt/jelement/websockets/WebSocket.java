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
package gwt.jelement.websockets;

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.ArrayBufferView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.websockets.BinaryType;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WebSocket extends EventTarget{
    public static int CONNECTING;
    public static int OPEN;
    public static int CLOSING;
    public static int CLOSED;
    
    
    @JsConstructor
    public WebSocket(){
        super();
    }
    
    @JsProperty(name="onopen")
    public EventHandlerNonNull onopen;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="binaryType")
    public BinaryType binaryType;
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="bufferedAmount")
    public native double getBufferedAmount();
    
    @JsProperty(name="extensions")
    public native String getExtensions();
    
    @JsProperty(name="protocol")
    public native String getProtocol();
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "close")
    public native void close(short code);
    
    @JsMethod(name = "close")
    public native void close(short code, String reason);
    
    @JsMethod(name = "send")
    public native void send(String data);
    
    @JsMethod(name = "send")
    public native void send(Blob data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBuffer data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBufferView data);
    
}

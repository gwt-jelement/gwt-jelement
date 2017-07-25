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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.websockets.BinaryType;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
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
    
    
    @JsProperty(name="onopen")
    private EventHandlerNonNull onopen;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="binaryType")
    private String binaryType;
    
    @JsConstructor
    public WebSocket(){
        super();
    }
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="bufferedAmount")
    public native double getBufferedAmount();
    
    @JsOverlay
    public final EventHandlerNonNull getOnOpen(){
        return this.onopen;
    }
    
    @JsOverlay
    public final void setOnOpen(EventHandlerNonNull onopen){
        this.onopen = onopen;
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
    public final EventHandlerNonNull getOnClose(){
        return this.onclose;
    }
    
    @JsOverlay
    public final void setOnClose(EventHandlerNonNull onclose){
        this.onclose = onclose;
    }
    
    @JsProperty(name="extensions")
    public native String getExtensions();
    
    @JsProperty(name="protocol")
    public native String getProtocol();
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsOverlay
    public final BinaryType getBinaryType(){
       return BinaryType.of(binaryType);
    }
    
    @JsOverlay
    public final void setBinaryType(BinaryType binaryType){
       this.binaryType = binaryType.getInternalValue();
    }
    
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

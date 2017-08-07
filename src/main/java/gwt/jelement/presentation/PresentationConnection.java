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
package gwt.jelement.presentation;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.websockets.BinaryType;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="PresentationConnection", isNative = true)
public class PresentationConnection extends EventTarget {
    @JsProperty(name="onconnect")
    private EventHandlerNonNull onconnect;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="onterminate")
    private EventHandlerNonNull onterminate;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="state")
    private String state;
    
    @JsProperty(name="binaryType")
    private String binaryType;
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsOverlay
    public final EventHandlerNonNull getOnConnect(){
        return this.onconnect;
    }
    
    @JsOverlay
    public final void setOnConnect(EventHandlerNonNull onconnect){
        this.onconnect = onconnect;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClose(){
        return this.onclose;
    }
    
    @JsOverlay
    public final void setOnClose(EventHandlerNonNull onclose){
        this.onclose = onclose;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTerminate(){
        return this.onterminate;
    }
    
    @JsOverlay
    public final void setOnTerminate(EventHandlerNonNull onterminate){
        this.onterminate = onterminate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsOverlay
    public final PresentationConnectionState getState(){
       return PresentationConnectionState.of(state);
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
    
    @JsMethod(name = "send")
    public native void send(String message);
    
    @JsMethod(name = "send")
    public native void send(Blob data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBuffer data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBufferView data);
    
    @JsMethod(name = "terminate")
    public native void terminate();
    
}

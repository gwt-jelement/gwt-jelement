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
package gwt.jelement.peerconnection;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="RTCDataChannel", isNative = true)
public class RTCDataChannel extends EventTarget{
    @JsProperty(name="onopen")
    private EventHandlerNonNull onopen;
    
    @JsProperty(name="onbufferedamountlow")
    private EventHandlerNonNull onbufferedamountlow;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="readyState")
    private String readyState;
    
    @JsConstructor
    public RTCDataChannel(){
        super();
    }
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="ordered")
    public native boolean getOrdered();
    
    @JsProperty(name="maxRetransmitTime")
    public native short getMaxRetransmitTime();
    
    @JsProperty(name="maxRetransmits")
    public native short getMaxRetransmits();
    
    @JsProperty(name="protocol")
    public native String getProtocol();
    
    @JsProperty(name="negotiated")
    public native boolean getNegotiated();
    
    @JsProperty(name="id")
    public native short getId();
    
    @JsProperty(name="bufferedAmount")
    public native double getBufferedAmount();
    
    @JsProperty(name="bufferedAmountLowThreshold")
    public native double getBufferedAmountLowThreshold();
    
    @JsProperty(name="bufferedAmountLowThreshold")
    public native void setBufferedAmountLowThreshold(double bufferedAmountLowThreshold);
    
    @JsOverlay
    public final EventHandlerNonNull getOnOpen(){
        return this.onopen;
    }
    
    @JsOverlay
    public final void setOnOpen(EventHandlerNonNull onopen){
        this.onopen = onopen;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBufferedamountlow(){
        return this.onbufferedamountlow;
    }
    
    @JsOverlay
    public final void setOnBufferedamountlow(EventHandlerNonNull onbufferedamountlow){
        this.onbufferedamountlow = onbufferedamountlow;
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
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsProperty(name="binaryType")
    public native String getBinaryType();
    
    @JsProperty(name="binaryType")
    public native void setBinaryType(String binaryType);
    
    @JsProperty(name="reliable")
    public native boolean getReliable();
    
    @JsOverlay
    public final RTCDataChannelState getReadyState(){
       return RTCDataChannelState.of(readyState);
    }
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "send")
    public native void send(String data);
    
    @JsMethod(name = "send")
    public native void send(Blob data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBuffer data);
    
    @JsMethod(name = "send")
    public native void send(ArrayBufferView data);
    
}

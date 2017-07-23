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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.peerconnection.RTCDataChannelState;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class RTCDataChannel extends EventTarget{
    
    @JsConstructor
    public RTCDataChannel(){
        super();
    }
    
    @JsProperty(name="label")
    public String label;
    
    @JsProperty(name="ordered")
    public boolean ordered;
    
    @JsProperty(name="maxRetransmitTime")
    public short maxRetransmitTime;
    
    @JsProperty(name="maxRetransmits")
    public short maxRetransmits;
    
    @JsProperty(name="protocol")
    public String protocol;
    
    @JsProperty(name="negotiated")
    public boolean negotiated;
    
    @JsProperty(name="id")
    public short id;
    
    @JsProperty(name="readyState")
    public String readyState;
    @JsOverlay
    public final RTCDataChannelState getReadyState(){
       return RTCDataChannelState.of(readyState);
    }
    
    @JsProperty(name="bufferedAmount")
    public double bufferedAmount;
    
    @JsProperty(name="bufferedAmountLowThreshold")
    public double bufferedAmountLowThreshold;
    
    @JsProperty(name="onopen")
    public EventHandlerNonNull onopen;
    
    @JsProperty(name="onbufferedamountlow")
    public EventHandlerNonNull onbufferedamountlow;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="binaryType")
    public String binaryType;
    
    @JsProperty(name="reliable")
    public boolean reliable;
    
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

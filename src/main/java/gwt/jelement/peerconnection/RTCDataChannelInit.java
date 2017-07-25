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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCDataChannelInit{

    public RTCDataChannelInit(){
    }

    @JsProperty(name="ordered")
    public boolean ordered;

    @JsOverlay
    public final boolean getOrdered(){
        return this.ordered;
    }

    @JsOverlay
    public final void setOrdered(boolean ordered){
        this.ordered = ordered;
    }

    @JsProperty(name="maxRetransmitTime")
    public short maxRetransmitTime;

    @JsOverlay
    public final short getMaxRetransmitTime(){
        return this.maxRetransmitTime;
    }

    @JsOverlay
    public final void setMaxRetransmitTime(short maxRetransmitTime){
        this.maxRetransmitTime = maxRetransmitTime;
    }

    @JsProperty(name="maxRetransmits")
    public short maxRetransmits;

    @JsOverlay
    public final short getMaxRetransmits(){
        return this.maxRetransmits;
    }

    @JsOverlay
    public final void setMaxRetransmits(short maxRetransmits){
        this.maxRetransmits = maxRetransmits;
    }

    @JsProperty(name="protocol")
    public String protocol;

    @JsOverlay
    public final String getProtocol(){
        return this.protocol;
    }

    @JsOverlay
    public final void setProtocol(String protocol){
        this.protocol = protocol;
    }

    @JsProperty(name="negotiated")
    public boolean negotiated;

    @JsOverlay
    public final boolean getNegotiated(){
        return this.negotiated;
    }

    @JsOverlay
    public final void setNegotiated(boolean negotiated){
        this.negotiated = negotiated;
    }

    @JsProperty(name="id")
    public short id;

    @JsOverlay
    public final short getId(){
        return this.id;
    }

    @JsOverlay
    public final void setId(short id){
        this.id = id;
    }


}

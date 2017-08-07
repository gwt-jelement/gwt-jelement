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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCDataChannelInit extends JsObject{

    @JsProperty(name="ordered")
    private boolean ordered;

    @JsProperty(name="maxRetransmitTime")
    private short maxRetransmitTime;

    @JsProperty(name="maxRetransmits")
    private short maxRetransmits;

    @JsProperty(name="protocol")
    private String protocol;

    @JsProperty(name="negotiated")
    private boolean negotiated;

    @JsProperty(name="id")
    private short id;

    public RTCDataChannelInit(){
    }

    @JsOverlay
    public final boolean isOrdered(){
        return this.ordered;
    }

    @JsOverlay
    public final void setOrdered(boolean ordered){
        this.ordered = ordered;
    }

    @JsOverlay
    public final short getMaxRetransmitTime(){
        return this.maxRetransmitTime;
    }

    @JsOverlay
    public final void setMaxRetransmitTime(short maxRetransmitTime){
        this.maxRetransmitTime = maxRetransmitTime;
    }

    @JsOverlay
    public final short getMaxRetransmits(){
        return this.maxRetransmits;
    }

    @JsOverlay
    public final void setMaxRetransmits(short maxRetransmits){
        this.maxRetransmits = maxRetransmits;
    }

    @JsOverlay
    public final String getProtocol(){
        return this.protocol;
    }

    @JsOverlay
    public final void setProtocol(String protocol){
        this.protocol = protocol;
    }

    @JsOverlay
    public final boolean isNegotiated(){
        return this.negotiated;
    }

    @JsOverlay
    public final void setNegotiated(boolean negotiated){
        this.negotiated = negotiated;
    }

    @JsOverlay
    public final short getId(){
        return this.id;
    }

    @JsOverlay
    public final void setId(short id){
        this.id = id;
    }


}

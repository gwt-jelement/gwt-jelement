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
public class RTCIceCandidateInit{

    public RTCIceCandidateInit(){
    }

    @JsProperty(name="candidate")
    public String candidate;

    @JsOverlay
    public final String getCandidate(){
        return this.candidate;
    }

    @JsOverlay
    public final void setCandidate(String candidate){
        this.candidate = candidate;
    }

    @JsProperty(name="sdpMid")
    public String sdpMid;

    @JsOverlay
    public final String getSdpMid(){
        return this.sdpMid;
    }

    @JsOverlay
    public final void setSdpMid(String sdpMid){
        this.sdpMid = sdpMid;
    }

    @JsProperty(name="sdpMLineIndex")
    public short sdpMLineIndex;

    @JsOverlay
    public final short getSdpMLineIndex(){
        return this.sdpMLineIndex;
    }

    @JsOverlay
    public final void setSdpMLineIndex(short sdpMLineIndex){
        this.sdpMLineIndex = sdpMLineIndex;
    }


}

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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="RTCIceCandidate", isNative = true)
public class RTCIceCandidate implements IsObject {
    @JsConstructor
    public RTCIceCandidate(RTCIceCandidateInit candidateInitDict){
    }
    
    @JsProperty(name="candidate")
    public native String getCandidate();
    
    @JsProperty(name="candidate")
    public native void setCandidate(String candidate);
    
    @JsProperty(name="sdpMid")
    public native String getSdpMid();
    
    @JsProperty(name="sdpMid")
    public native void setSdpMid(String sdpMid);
    
    @JsProperty(name="sdpMLineIndex")
    public native short getSdpMLineIndex();
    
    @JsProperty(name="sdpMLineIndex")
    public native void setSdpMLineIndex(short sdpMLineIndex);
    
}

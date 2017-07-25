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

import gwt.jelement.peerconnection.RTCBundlePolicy;
import gwt.jelement.peerconnection.RTCCertificate;
import gwt.jelement.peerconnection.RTCIceServer;
import gwt.jelement.peerconnection.RTCIceTransportPolicy;
import gwt.jelement.peerconnection.RTCRtcpMuxPolicy;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCConfiguration{

    @JsProperty(name="iceServers")
    private RTCIceServer[] iceServers;

    @JsProperty(name="iceTransportPolicy")
    private String iceTransportPolicy;

    @JsProperty(name="iceTransports")
    private String iceTransports;

    @JsProperty(name="bundlePolicy")
    private String bundlePolicy;

    @JsProperty(name="rtcpMuxPolicy")
    private String rtcpMuxPolicy;

    @JsProperty(name="certificates")
    private RTCCertificate[] certificates;

    @JsProperty(name="iceCandidatePoolSize")
    private byte iceCandidatePoolSize;

    public RTCConfiguration(){
    }

    @JsOverlay
    public final RTCIceServer[] getIceServers(){
        return this.iceServers;
    }

    @JsOverlay
    public final void setIceServers(RTCIceServer[] iceServers){
        this.iceServers = iceServers;
    }

    @JsOverlay
    public final RTCIceTransportPolicy getIceTransportPolicy(){
        return RTCIceTransportPolicy.of(this.iceTransportPolicy);
    }

    @JsOverlay
    public final void setIceTransportPolicy(RTCIceTransportPolicy iceTransportPolicy){
        this.iceTransportPolicy = iceTransportPolicy.getInternalValue();
    }

    @JsOverlay
    public final RTCIceTransportPolicy getIceTransports(){
        return RTCIceTransportPolicy.of(this.iceTransports);
    }

    @JsOverlay
    public final void setIceTransports(RTCIceTransportPolicy iceTransports){
        this.iceTransports = iceTransports.getInternalValue();
    }

    @JsOverlay
    public final RTCBundlePolicy getBundlePolicy(){
        return RTCBundlePolicy.of(this.bundlePolicy);
    }

    @JsOverlay
    public final void setBundlePolicy(RTCBundlePolicy bundlePolicy){
        this.bundlePolicy = bundlePolicy.getInternalValue();
    }

    @JsOverlay
    public final RTCRtcpMuxPolicy getRtcpMuxPolicy(){
        return RTCRtcpMuxPolicy.of(this.rtcpMuxPolicy);
    }

    @JsOverlay
    public final void setRtcpMuxPolicy(RTCRtcpMuxPolicy rtcpMuxPolicy){
        this.rtcpMuxPolicy = rtcpMuxPolicy.getInternalValue();
    }

    @JsOverlay
    public final RTCCertificate[] getCertificates(){
        return this.certificates;
    }

    @JsOverlay
    public final void setCertificates(RTCCertificate[] certificates){
        this.certificates = certificates;
    }

    @JsOverlay
    public final byte getIceCandidatePoolSize(){
        return this.iceCandidatePoolSize;
    }

    @JsOverlay
    public final void setIceCandidatePoolSize(byte iceCandidatePoolSize){
        this.iceCandidatePoolSize = iceCandidatePoolSize;
    }

}

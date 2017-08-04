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
public class RTCOfferOptions extends RTCOfferAnswerOptions{

    @JsProperty(name="iceRestart")
    private boolean iceRestart;

    @JsProperty(name="offerToReceiveVideo")
    private double offerToReceiveVideo;

    @JsProperty(name="offerToReceiveAudio")
    private double offerToReceiveAudio;

    public RTCOfferOptions(){
    }

    @JsOverlay
    public final boolean isIceRestart(){
        return this.iceRestart;
    }

    @JsOverlay
    public final void setIceRestart(boolean iceRestart){
        this.iceRestart = iceRestart;
    }

    @JsOverlay
    public final double getOfferToReceiveVideo(){
        return this.offerToReceiveVideo;
    }

    @JsOverlay
    public final void setOfferToReceiveVideo(double offerToReceiveVideo){
        this.offerToReceiveVideo = offerToReceiveVideo;
    }

    @JsOverlay
    public final double getOfferToReceiveAudio(){
        return this.offerToReceiveAudio;
    }

    @JsOverlay
    public final void setOfferToReceiveAudio(double offerToReceiveAudio){
        this.offerToReceiveAudio = offerToReceiveAudio;
    }


}

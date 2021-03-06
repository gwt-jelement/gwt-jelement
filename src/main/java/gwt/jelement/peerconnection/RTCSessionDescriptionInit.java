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
public class RTCSessionDescriptionInit extends JsObject{

    @JsProperty(name="type")
    private String type;

    @JsProperty(name="sdp")
    private String sdp;

    public RTCSessionDescriptionInit(){
    }

    @JsOverlay
    public final RTCSdpType getType(){
        return RTCSdpType.of(this.type);
    }

    @JsOverlay
    public final void setType(RTCSdpType type){
        this.type = type.getInternalValue();
    }

    @JsOverlay
    public final String getSdp(){
        return this.sdp;
    }

    @JsOverlay
    public final void setSdp(String sdp){
        this.sdp = sdp;
    }


}

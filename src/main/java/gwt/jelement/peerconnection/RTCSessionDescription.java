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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="RTCSessionDescription", isNative = true)
public class RTCSessionDescription extends JsObject{
    @JsProperty(name="type")
    private String type;
    
    @JsConstructor
    public RTCSessionDescription(){
        super();
    }
    
    @JsConstructor
    public RTCSessionDescription(RTCSessionDescriptionInit descriptionInitDict){
        super();
    }
    
    @JsProperty(name="sdp")
    public native String getSdp();
    
    @JsProperty(name="sdp")
    public native void setSdp(String sdp);
    
    @JsOverlay
    public final RTCSdpType getType(){
       return RTCSdpType.of(type);
    }
    
    @JsOverlay
    public final void setType(RTCSdpType type){
       this.type = type.getInternalValue();
    }
    
}

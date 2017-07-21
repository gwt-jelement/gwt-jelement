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
package gwt.jelement.vr;

import gwt.jelement.dom.FrameRequestCallback;
import gwt.jelement.events.EventTarget;
import gwt.jelement.vr.VRDisplayCapabilities;
import gwt.jelement.vr.VREye;
import gwt.jelement.vr.VREyeParameters;
import gwt.jelement.vr.VRFrameData;
import gwt.jelement.vr.VRLayer;
import gwt.jelement.vr.VRStageParameters;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class VRDisplay extends EventTarget{
    
    @JsConstructor
    public VRDisplay(){
        super();
    }
    
    @JsProperty(name="depthNear")
    public double depthNear;
    
    @JsProperty(name="depthFar")
    public double depthFar;
    
    @JsProperty(name="displayId")
    public native long getDisplayId();
    
    @JsProperty(name="displayName")
    public native String getDisplayName();
    
    @JsProperty(name="isPresenting")
    public native boolean getIsPresenting();
    
    @JsProperty(name="capabilities")
    public native VRDisplayCapabilities getCapabilities();
    
    @JsProperty(name="stageParameters")
    public native VRStageParameters getStageParameters();
    
    @JsMethod(name = "cancelAnimationFrame")
    public native void cancelAnimationFrame(long handle);
    
    @JsMethod(name = "exitPresent")
    public native Promise exitPresent();
    
    @JsOverlay
    public VREyeParameters getEyeParameters(VREye whichEye){
        return getEyeParameters(whichEye.getInternalValue());
    }
    
    @JsMethod(name = "getEyeParameters")
    public native VREyeParameters getEyeParameters(String whichEye);
    
    @JsMethod(name = "getFrameData")
    public native boolean getFrameData(VRFrameData frameData);
    
    @JsMethod(name = "getLayers")
    public native VRLayer[] getLayers();
    
    @JsMethod(name = "requestAnimationFrame")
    public native long requestAnimationFrame(FrameRequestCallback callback);
    
    @JsMethod(name = "requestPresent")
    public native Promise requestPresent(VRLayer[] layers);
    
    @JsMethod(name = "submitFrame")
    public native void submitFrame();
    
}

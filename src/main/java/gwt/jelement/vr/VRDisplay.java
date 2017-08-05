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

import gwt.jelement.core.Promise;
import gwt.jelement.dom.FrameRequestCallback;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="VRDisplay", isNative = true)
public class VRDisplay extends EventTarget{
    @JsProperty(name="displayId")
    public native double getDisplayId();
    
    @JsProperty(name="displayName")
    public native String getDisplayName();
    
    @JsProperty(name="isPresenting")
    public native boolean getIsPresenting();
    
    @JsProperty(name="capabilities")
    public native VRDisplayCapabilities getCapabilities();
    
    @JsProperty(name="stageParameters")
    public native VRStageParameters getStageParameters();
    
    @JsProperty(name="depthNear")
    public native double getDepthNear();
    
    @JsProperty(name="depthNear")
    public native void setDepthNear(double depthNear);
    
    @JsProperty(name="depthFar")
    public native double getDepthFar();
    
    @JsProperty(name="depthFar")
    public native void setDepthFar(double depthFar);
    
    @JsMethod(name = "cancelAnimationFrame")
    public native void cancelAnimationFrame(double handle);
    
    @JsMethod(name = "exitPresent")
    public native Promise exitPresent();
    
    @JsOverlay
    public final VREyeParameters getEyeParameters(VREye whichEye){
        return getEyeParameters(whichEye.getInternalValue());
    }
    
    @JsMethod(name = "getEyeParameters")
    public native VREyeParameters getEyeParameters(String whichEye);
    
    @JsMethod(name = "getFrameData")
    public native boolean getFrameData(VRFrameData frameData);
    
    @JsMethod(name = "getLayers")
    public native VRLayer[] getLayers();
    
    @JsMethod(name = "requestAnimationFrame")
    public native double requestAnimationFrame(FrameRequestCallback callback);
    
    @JsMethod(name = "requestPresent")
    public native Promise requestPresent(VRLayer[] layers);
    
    @JsMethod(name = "submitFrame")
    public native void submitFrame();
    
}

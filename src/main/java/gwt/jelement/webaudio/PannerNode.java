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
package gwt.jelement.webaudio;

import gwt.jelement.webaudio.AudioNode;
import gwt.jelement.webaudio.AudioParam;
import gwt.jelement.webaudio.DistanceModelType;
import gwt.jelement.webaudio.PanningModelType;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PannerNode extends AudioNode{
    
    @JsConstructor
    public PannerNode(){
        super();
    }
    
    @JsProperty(name="panningModel")
    public PanningModelType panningModel;
    
    @JsProperty(name="distanceModel")
    public DistanceModelType distanceModel;
    
    @JsProperty(name="refDistance")
    public double refDistance;
    
    @JsProperty(name="maxDistance")
    public double maxDistance;
    
    @JsProperty(name="rolloffFactor")
    public double rolloffFactor;
    
    @JsProperty(name="coneInnerAngle")
    public double coneInnerAngle;
    
    @JsProperty(name="coneOuterAngle")
    public double coneOuterAngle;
    
    @JsProperty(name="coneOuterGain")
    public double coneOuterGain;
    
    @JsProperty(name="positionX")
    public native AudioParam getPositionX();
    
    @JsProperty(name="positionY")
    public native AudioParam getPositionY();
    
    @JsProperty(name="positionZ")
    public native AudioParam getPositionZ();
    
    @JsProperty(name="orientationX")
    public native AudioParam getOrientationX();
    
    @JsProperty(name="orientationY")
    public native AudioParam getOrientationY();
    
    @JsProperty(name="orientationZ")
    public native AudioParam getOrientationZ();
    
    @JsMethod(name = "setOrientation")
    public native void setOrientation(float x, float y, float z);
    
    @JsMethod(name = "setPosition")
    public native void setPosition(float x, float y, float z);
    
}

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

import gwt.jelement.webaudio.AudioParam;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AudioListener{
    
    @JsProperty(name="positionX")
    public native AudioParam getPositionX();
    
    @JsProperty(name="positionY")
    public native AudioParam getPositionY();
    
    @JsProperty(name="positionZ")
    public native AudioParam getPositionZ();
    
    @JsProperty(name="forwardX")
    public native AudioParam getForwardX();
    
    @JsProperty(name="forwardY")
    public native AudioParam getForwardY();
    
    @JsProperty(name="forwardZ")
    public native AudioParam getForwardZ();
    
    @JsProperty(name="upX")
    public native AudioParam getUpX();
    
    @JsProperty(name="upY")
    public native AudioParam getUpY();
    
    @JsProperty(name="upZ")
    public native AudioParam getUpZ();
    
    @JsMethod(name = "setOrientation")
    public native void setOrientation(float x, float y, float z, float xUp, float yUp, float zUp);
    
    
    @JsMethod(name = "setPosition")
    public native void setPosition(float x, float y, float z);
    
    
}

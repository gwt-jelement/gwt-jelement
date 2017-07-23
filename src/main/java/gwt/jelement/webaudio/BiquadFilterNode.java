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
import gwt.jelement.webaudio.BiquadFilterType;
import elemental2.core.Float32Array;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class BiquadFilterNode extends AudioNode{
    
    @JsConstructor
    public BiquadFilterNode(){
        super();
    }
    
    @JsProperty(name="type")
    public String type;
    @JsOverlay
    public final BiquadFilterType getType(){
       return BiquadFilterType.of(type);
    }
    
    @JsOverlay
    public final void setType(BiquadFilterType type){
       this.type = type.getInternalValue();
    }
    
    @JsProperty(name="frequency")
    public AudioParam frequency;
    
    @JsProperty(name="detune")
    public AudioParam detune;
    
    @JsProperty(name="Q")
    public AudioParam Q;
    
    @JsProperty(name="gain")
    public AudioParam gain;
    
    @JsMethod(name = "getFrequencyResponse")
    public native void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
    
}

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

import gwt.jelement.webaudio.AnalyserOptions;
import gwt.jelement.webaudio.AudioNode;
import gwt.jelement.webaudio.BaseAudioContext;
import elemental2.core.Float32Array;
import elemental2.core.Uint8Array;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AnalyserNode extends AudioNode{
    
    @JsConstructor
    public AnalyserNode(BaseAudioContext context){
        super();
    }
    
    @JsConstructor
    public AnalyserNode(BaseAudioContext context, AnalyserOptions options){
        super();
    }
    
    @JsProperty(name="fftSize")
    public double fftSize;
    
    @JsProperty(name="minDecibels")
    public double minDecibels;
    
    @JsProperty(name="maxDecibels")
    public double maxDecibels;
    
    @JsProperty(name="smoothingTimeConstant")
    public double smoothingTimeConstant;
    
    @JsProperty(name="frequencyBinCount")
    public native double getFrequencyBinCount();
    
    @JsMethod(name = "getByteFrequencyData")
    public native void getByteFrequencyData(Uint8Array array);
    
    @JsMethod(name = "getByteTimeDomainData")
    public native void getByteTimeDomainData(Uint8Array array);
    
    @JsMethod(name = "getFloatFrequencyData")
    public native void getFloatFrequencyData(Float32Array array);
    
    @JsMethod(name = "getFloatTimeDomainData")
    public native void getFloatTimeDomainData(Float32Array array);
    
}

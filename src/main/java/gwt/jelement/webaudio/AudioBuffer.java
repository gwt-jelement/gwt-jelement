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

import gwt.jelement.webaudio.AudioBufferOptions;
import elemental2.core.Float32Array;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AudioBuffer{
    
    @JsConstructor
    public AudioBuffer(AudioBufferOptions options){
    }
    
    @JsProperty(name="length")
    public double length;
    
    @JsProperty(name="duration")
    public double duration;
    
    @JsProperty(name="sampleRate")
    public float sampleRate;
    
    @JsProperty(name="numberOfChannels")
    public double numberOfChannels;
    
    @JsMethod(name = "copyFromChannel")
    public native void copyFromChannel(Float32Array destination, double channelNumber);
    
    @JsMethod(name = "copyFromChannel")
    public native void copyFromChannel(Float32Array destination, double channelNumber, double startInChannel);
    
    @JsMethod(name = "copyToChannel")
    public native void copyToChannel(Float32Array source, double channelNumber);
    
    @JsMethod(name = "copyToChannel")
    public native void copyToChannel(Float32Array source, double channelNumber, double startInChannel);
    
    @JsMethod(name = "getChannelData")
    public native Float32Array getChannelData(double channelIndex);
    
}

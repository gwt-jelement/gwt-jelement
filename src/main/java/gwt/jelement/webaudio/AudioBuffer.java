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

import gwt.jelement.core.Float32Array;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AudioBuffer", isNative = true)
public class AudioBuffer extends JsObject{
    @JsConstructor
    public AudioBuffer(AudioBufferOptions options){
        super();
    }
    
    @JsProperty(name="duration")
    public native double getDuration();
    
    @JsProperty(name="sampleRate")
    public native double getSampleRate();
    
    @JsProperty(name="numberOfChannels")
    public native double getNumberOfChannels();
    
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

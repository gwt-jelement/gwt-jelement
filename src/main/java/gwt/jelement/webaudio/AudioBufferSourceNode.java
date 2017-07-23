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

import gwt.jelement.webaudio.AudioBuffer;
import gwt.jelement.webaudio.AudioBufferSourceOptions;
import gwt.jelement.webaudio.AudioParam;
import gwt.jelement.webaudio.AudioScheduledSourceNode;
import gwt.jelement.webaudio.BaseAudioContext;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AudioBufferSourceNode extends AudioScheduledSourceNode{
    
    @JsConstructor
    public AudioBufferSourceNode(BaseAudioContext context){
        super();
    }
    
    @JsConstructor
    public AudioBufferSourceNode(BaseAudioContext context, AudioBufferSourceOptions options){
        super();
    }
    
    @JsProperty(name="buffer")
    public AudioBuffer buffer;
    
    @JsProperty(name="playbackRate")
    public AudioParam playbackRate;
    
    @JsProperty(name="detune")
    public AudioParam detune;
    
    @JsProperty(name="loop")
    public boolean loop;
    
    @JsProperty(name="loopStart")
    public double loopStart;
    
    @JsProperty(name="loopEnd")
    public double loopEnd;
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "start")
    public native void start(double when);
    
    @JsMethod(name = "start")
    public native void start(double when, double grainOffset);
    
    @JsMethod(name = "start")
    public native void start(double when, double grainOffset, double grainDuration);
    
}

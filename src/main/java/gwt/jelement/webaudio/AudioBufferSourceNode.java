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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AudioBufferSourceNode", isNative = true)
public class AudioBufferSourceNode extends AudioScheduledSourceNode {
    @JsConstructor
    public AudioBufferSourceNode(BaseAudioContext context){
        super();
    }
    
    @JsConstructor
    public AudioBufferSourceNode(BaseAudioContext context, AudioBufferSourceOptions options){
        super();
    }
    
    @JsProperty(name="buffer")
    public native AudioBuffer getBuffer();
    
    @JsProperty(name="buffer")
    public native void setBuffer(AudioBuffer buffer);
    
    @JsProperty(name="playbackRate")
    public native AudioParam getPlaybackRate();
    
    @JsProperty(name="detune")
    public native AudioParam getDetune();
    
    @JsProperty(name="loop")
    public native boolean getLoop();
    
    @JsProperty(name="loop")
    public native void setLoop(boolean loop);
    
    @JsProperty(name="loopStart")
    public native double getLoopStart();
    
    @JsProperty(name="loopStart")
    public native void setLoopStart(double loopStart);
    
    @JsProperty(name="loopEnd")
    public native double getLoopEnd();
    
    @JsProperty(name="loopEnd")
    public native void setLoopEnd(double loopEnd);
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "start")
    public native void start(double when);
    
    @JsMethod(name = "start")
    public native void start(double when, double grainOffset);
    
    @JsMethod(name = "start")
    public native void start(double when, double grainOffset, double grainDuration);
    
}

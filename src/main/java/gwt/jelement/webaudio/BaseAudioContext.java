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

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.html.HTMLMediaElement;
import gwt.jelement.mediastream.MediaStream;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="BaseAudioContext", isNative = true)
public class BaseAudioContext extends EventTarget{
    @JsProperty(name="onstatechange")
    private EventHandlerNonNull onstatechange;
    
    @JsProperty(name="state")
    private String state;
    
    @JsConstructor
    public BaseAudioContext(){
        super();
    }
    
    @JsProperty(name="destination")
    public native AudioDestinationNode getDestination();
    
    @JsProperty(name="currentTime")
    public native double getCurrentTime();
    
    @JsProperty(name="sampleRate")
    public native float getSampleRate();
    
    @JsProperty(name="listener")
    public native AudioListener getListener();
    
    @JsOverlay
    public final EventHandlerNonNull getOnStatechange(){
        return this.onstatechange;
    }
    
    @JsOverlay
    public final void setOnStatechange(EventHandlerNonNull onstatechange){
        this.onstatechange = onstatechange;
    }
    
    @JsOverlay
    public final AudioContextState getState(){
       return AudioContextState.of(state);
    }
    
    @JsMethod(name = "createAnalyser")
    public native AnalyserNode createAnalyser();
    
    @JsMethod(name = "createBiquadFilter")
    public native BiquadFilterNode createBiquadFilter();
    
    @JsMethod(name = "createBuffer")
    public native AudioBuffer createBuffer(double numberOfChannels, double numberOfFrames, float sampleRate);
    
    @JsMethod(name = "createBufferSource")
    public native AudioBufferSourceNode createBufferSource();
    
    @JsMethod(name = "createChannelMerger")
    public native ChannelMergerNode createChannelMerger();
    
    @JsMethod(name = "createChannelMerger")
    public native ChannelMergerNode createChannelMerger(double numberOfInputs);
    
    @JsMethod(name = "createChannelSplitter")
    public native ChannelSplitterNode createChannelSplitter();
    
    @JsMethod(name = "createChannelSplitter")
    public native ChannelSplitterNode createChannelSplitter(double numberOfOutputs);
    
    @JsMethod(name = "createConstantSource")
    public native ConstantSourceNode createConstantSource();
    
    @JsMethod(name = "createConvolver")
    public native ConvolverNode createConvolver();
    
    @JsMethod(name = "createDelay")
    public native DelayNode createDelay();
    
    @JsMethod(name = "createDelay")
    public native DelayNode createDelay(double maxDelayTime);
    
    @JsMethod(name = "createDynamicsCompressor")
    public native DynamicsCompressorNode createDynamicsCompressor();
    
    @JsMethod(name = "createGain")
    public native GainNode createGain();
    
    @JsMethod(name = "createIIRFilter")
    public native IIRFilterNode createIIRFilter(double[] feedForward, double[] feedBack);
    
    @JsMethod(name = "createMediaElementSource")
    public native MediaElementAudioSourceNode createMediaElementSource(HTMLMediaElement mediaElement);
    
    @JsMethod(name = "createMediaStreamDestination")
    public native MediaStreamAudioDestinationNode createMediaStreamDestination();
    
    @JsMethod(name = "createMediaStreamSource")
    public native MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream);
    
    @JsMethod(name = "createOscillator")
    public native OscillatorNode createOscillator();
    
    @JsMethod(name = "createPanner")
    public native PannerNode createPanner();
    
    @JsMethod(name = "createPeriodicWave")
    public native PeriodicWave createPeriodicWave(float[] real, float[] imag);
    
    @JsMethod(name = "createPeriodicWave")
    public native PeriodicWave createPeriodicWave(float[] real, float[] imag, PeriodicWaveConstraints options);
    
    @JsMethod(name = "createScriptProcessor")
    public native ScriptProcessorNode createScriptProcessor();
    
    @JsMethod(name = "createScriptProcessor")
    public native ScriptProcessorNode createScriptProcessor(double bufferSize);
    
    @JsMethod(name = "createScriptProcessor")
    public native ScriptProcessorNode createScriptProcessor(double bufferSize, double numberOfInputChannels);
    
    @JsMethod(name = "createScriptProcessor")
    public native ScriptProcessorNode createScriptProcessor(double bufferSize, double numberOfInputChannels, double numberOfOutputChannels);
    
    @JsMethod(name = "createStereoPanner")
    public native StereoPannerNode createStereoPanner();
    
    @JsMethod(name = "createWaveShaper")
    public native WaveShaperNode createWaveShaper();
    
    @JsMethod(name = "decodeAudioData")
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData);
    
    @JsMethod(name = "decodeAudioData")
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback);
    
    @JsMethod(name = "decodeAudioData")
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback, DecodeErrorCallback errorCallback);
    
    @JsMethod(name = "resume")
    public native Promise<Void> resume();
    
}

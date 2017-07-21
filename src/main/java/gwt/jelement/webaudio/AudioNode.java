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

import gwt.jelement.events.EventTarget;
import gwt.jelement.webaudio.AudioNode;
import gwt.jelement.webaudio.AudioParam;
import gwt.jelement.webaudio.BaseAudioContext;
import gwt.jelement.webaudio.ChannelCountMode;
import gwt.jelement.webaudio.ChannelInterpretation;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AudioNode extends EventTarget{
    
    @JsConstructor
    public AudioNode(){
        super();
    }
    
    @JsProperty(name="channelCount")
    public long channelCount;
    
    @JsProperty(name="channelCountMode")
    public ChannelCountMode channelCountMode;
    
    @JsProperty(name="channelInterpretation")
    public ChannelInterpretation channelInterpretation;
    
    @JsProperty(name="context")
    public native BaseAudioContext getContext();
    
    @JsProperty(name="numberOfInputs")
    public native long getNumberOfInputs();
    
    @JsProperty(name="numberOfOutputs")
    public native long getNumberOfOutputs();
    
    @JsMethod(name = "connect")
    public native AudioNode connect(AudioNode destination);
    
    @JsMethod(name = "connect")
    public native void connect(AudioParam destination);
    
    @JsMethod(name = "connect")
    public native AudioNode connect(AudioNode destination, long output);
    
    @JsMethod(name = "connect")
    public native void connect(AudioParam destination, long output);
    
    @JsMethod(name = "connect")
    public native AudioNode connect(AudioNode destination, long output, long input);
    
    @JsMethod(name = "disconnect")
    public native void disconnect();
    
    @JsMethod(name = "disconnect")
    public native void disconnect(long output);
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioNode destination);
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioParam destination);
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioNode destination, long output);
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioParam destination, long output);
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioNode destination, long output, long input);
    
}

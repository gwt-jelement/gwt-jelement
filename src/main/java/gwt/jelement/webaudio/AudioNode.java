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
    
    @JsProperty(name="channelCountMode")
    private String channelCountMode;
    
    @JsProperty(name="channelInterpretation")
    private String channelInterpretation;
    
    @JsConstructor
    public AudioNode(){
        super();
    }
    
    @JsProperty(name="context")
    public native BaseAudioContext getContext();
    
    @JsProperty(name="numberOfInputs")
    public native double getNumberOfInputs();
    
    @JsProperty(name="numberOfOutputs")
    public native double getNumberOfOutputs();
    
    @JsProperty(name="channelCount")
    public native double getChannelCount();
    
    @JsProperty(name="channelCount")
    public native void setChannelCount(double channelCount);
    
    @JsOverlay
    public final ChannelCountMode getChannelCountMode(){
       return ChannelCountMode.of(channelCountMode);
    }
    
    @JsOverlay
    public final void setChannelCountMode(ChannelCountMode channelCountMode){
       this.channelCountMode = channelCountMode.getInternalValue();
    }
    
    @JsOverlay
    public final ChannelInterpretation getChannelInterpretation(){
       return ChannelInterpretation.of(channelInterpretation);
    }
    
    @JsOverlay
    public final void setChannelInterpretation(ChannelInterpretation channelInterpretation){
       this.channelInterpretation = channelInterpretation.getInternalValue();
    }
    
    @JsMethod(name = "connect")
    public native AudioNode connect(AudioNode destination);
    
    
    @JsMethod(name = "connect")
    public native void connect(AudioParam destination);
    
    
    @JsMethod(name = "connect")
    public native AudioNode connect(AudioNode destination, double output);
    
    
    @JsMethod(name = "connect")
    public native void connect(AudioParam destination, double output);
    
    
    @JsMethod(name = "connect")
    public native AudioNode connect(AudioNode destination, double output, double input);
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect();
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect(double output);
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioNode destination);
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioParam destination);
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioNode destination, double output);
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioParam destination, double output);
    
    
    @JsMethod(name = "disconnect")
    public native void disconnect(AudioNode destination, double output, double input);
    
    
}

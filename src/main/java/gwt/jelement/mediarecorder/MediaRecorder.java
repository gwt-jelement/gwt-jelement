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
package gwt.jelement.mediarecorder;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.mediarecorder.RecordingState;
import gwt.jelement.mediastream.MediaStream;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaRecorder extends EventTarget{
    
    @JsConstructor
    public MediaRecorder(){
        super();
    }
    
    @JsProperty(name="stream")
    public MediaStream stream;
    
    @JsProperty(name="mimeType")
    public String mimeType;
    
    @JsProperty(name="state")
    public String state;
    @JsOverlay
    public final RecordingState getState(){
       return RecordingState.of(state);
    }
    
    @JsProperty(name="onstart")
    public EventHandlerNonNull onstart;
    
    @JsProperty(name="onstop")
    public EventHandlerNonNull onstop;
    
    @JsProperty(name="ondataavailable")
    public EventHandlerNonNull ondataavailable;
    
    @JsProperty(name="onpause")
    public EventHandlerNonNull onpause;
    
    @JsProperty(name="onresume")
    public EventHandlerNonNull onresume;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="videoBitsPerSecond")
    public double videoBitsPerSecond;
    
    @JsProperty(name="audioBitsPerSecond")
    public double audioBitsPerSecond;
    
    @JsMethod(name = "isTypeSupported")
    public native boolean isTypeSupported(String type);
    
    @JsMethod(name = "pause")
    public native void pause();
    
    @JsMethod(name = "requestData")
    public native void requestData();
    
    @JsMethod(name = "resume")
    public native void resume();
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "start")
    public native void start(double timeslice);
    
    @JsMethod(name = "stop")
    public native void stop();
    
}

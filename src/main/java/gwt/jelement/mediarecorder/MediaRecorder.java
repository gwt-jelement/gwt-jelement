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

@JsType(namespace = JsPackage.GLOBAL, name="MediaRecorder", isNative = true)
public class MediaRecorder extends EventTarget{
    @JsProperty(name="onstart")
    private EventHandlerNonNull onstart;
    
    @JsProperty(name="onstop")
    private EventHandlerNonNull onstop;
    
    @JsProperty(name="ondataavailable")
    private EventHandlerNonNull ondataavailable;
    
    @JsProperty(name="onpause")
    private EventHandlerNonNull onpause;
    
    @JsProperty(name="onresume")
    private EventHandlerNonNull onresume;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="state")
    private String state;
    
    @JsConstructor
    public MediaRecorder(){
        super();
    }
    
    @JsProperty(name="stream")
    public native MediaStream getStream();
    
    @JsProperty(name="mimeType")
    public native String getMimeType();
    
    @JsOverlay
    public final EventHandlerNonNull getOnStart(){
        return this.onstart;
    }
    
    @JsOverlay
    public final void setOnStart(EventHandlerNonNull onstart){
        this.onstart = onstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnStop(){
        return this.onstop;
    }
    
    @JsOverlay
    public final void setOnStop(EventHandlerNonNull onstop){
        this.onstop = onstop;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDataavailable(){
        return this.ondataavailable;
    }
    
    @JsOverlay
    public final void setOnDataavailable(EventHandlerNonNull ondataavailable){
        this.ondataavailable = ondataavailable;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPause(){
        return this.onpause;
    }
    
    @JsOverlay
    public final void setOnPause(EventHandlerNonNull onpause){
        this.onpause = onpause;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnResume(){
        return this.onresume;
    }
    
    @JsOverlay
    public final void setOnResume(EventHandlerNonNull onresume){
        this.onresume = onresume;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsProperty(name="videoBitsPerSecond")
    public native double getVideoBitsPerSecond();
    
    @JsProperty(name="audioBitsPerSecond")
    public native double getAudioBitsPerSecond();
    
    @JsOverlay
    public final RecordingState getState(){
       return RecordingState.of(state);
    }
    
    @JsMethod(name = "isTypeSupported")
    public static native boolean isTypeSupported(String type);
    
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

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
package gwt.jelement.mediastream;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.mediastream.MediaStreamTrack;
import gwt.jelement.mediastream.MediaStreamTrackState;
import gwt.jelement.mediastream.MediaTrackCapabilities;
import gwt.jelement.mediastream.MediaTrackConstraints;
import gwt.jelement.mediastream.MediaTrackSettings;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaStreamTrack", isNative = true)
public class MediaStreamTrack extends EventTarget{
    @JsProperty(name="onmute")
    private EventHandlerNonNull onmute;
    
    @JsProperty(name="onunmute")
    private EventHandlerNonNull onunmute;
    
    @JsProperty(name="onended")
    private EventHandlerNonNull onended;
    
    @JsProperty(name="readyState")
    private String readyState;
    
    @JsConstructor
    public MediaStreamTrack(){
        super();
    }
    
    @JsProperty(name="kind")
    public native String getKind();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="enabled")
    public native boolean getEnabled();
    
    @JsProperty(name="enabled")
    public native void setEnabled(boolean enabled);
    
    @JsProperty(name="muted")
    public native boolean getMuted();
    
    @JsOverlay
    public final EventHandlerNonNull getOnMute(){
        return this.onmute;
    }
    
    @JsOverlay
    public final void setOnMute(EventHandlerNonNull onmute){
        this.onmute = onmute;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUnmute(){
        return this.onunmute;
    }
    
    @JsOverlay
    public final void setOnUnmute(EventHandlerNonNull onunmute){
        this.onunmute = onunmute;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnded(){
        return this.onended;
    }
    
    @JsOverlay
    public final void setOnEnded(EventHandlerNonNull onended){
        this.onended = onended;
    }
    
    @JsProperty(name="contentHint")
    public native String getContentHint();
    
    @JsProperty(name="contentHint")
    public native void setContentHint(String contentHint);
    
    @JsOverlay
    public final MediaStreamTrackState getReadyState(){
       return MediaStreamTrackState.of(readyState);
    }
    
    @JsMethod(name = "applyConstraints")
    public native Promise<MediaTrackConstraints> applyConstraints();
    
    @JsMethod(name = "applyConstraints")
    public native Promise<MediaTrackConstraints> applyConstraints(MediaTrackConstraints constraints);
    
    @JsMethod(name = "clone")
    public native MediaStreamTrack clone();
    
    @JsMethod(name = "getCapabilities")
    public native MediaTrackCapabilities getCapabilities();
    
    @JsMethod(name = "getConstraints")
    public native MediaTrackConstraints getConstraints();
    
    @JsMethod(name = "getSettings")
    public native MediaTrackSettings getSettings();
    
    @JsMethod(name = "stop")
    public native void stop();
    
}

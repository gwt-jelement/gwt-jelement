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

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaStreamTrack extends EventTarget{
    
    @JsConstructor
    public MediaStreamTrack(){
        super();
    }
    
    @JsProperty(name="kind")
    public String kind;
    
    @JsProperty(name="id")
    public String id;
    
    @JsProperty(name="label")
    public String label;
    
    @JsProperty(name="enabled")
    public boolean enabled;
    
    @JsProperty(name="muted")
    public boolean muted;
    
    @JsProperty(name="onmute")
    public EventHandlerNonNull onmute;
    
    @JsProperty(name="onunmute")
    public EventHandlerNonNull onunmute;
    
    @JsProperty(name="readyState")
    public String readyState;
    @JsOverlay
    public final MediaStreamTrackState getReadyState(){
       return MediaStreamTrackState.of(readyState);
    }
    
    @JsProperty(name="onended")
    public EventHandlerNonNull onended;
    
    @JsProperty(name="contentHint")
    public String contentHint;
    
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

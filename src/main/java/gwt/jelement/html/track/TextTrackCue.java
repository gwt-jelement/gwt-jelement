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
package gwt.jelement.html.track;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.html.track.TextTrack;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TextTrackCue", isNative = true)
public class TextTrackCue extends EventTarget{
    @JsProperty(name="onenter")
    private EventHandlerNonNull onenter;
    
    @JsProperty(name="onexit")
    private EventHandlerNonNull onexit;
    
    @JsConstructor
    public TextTrackCue(){
        super();
    }
    
    @JsProperty(name="track")
    public native TextTrack getTrack();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="id")
    public native void setId(String id);
    
    @JsProperty(name="startTime")
    public native double getStartTime();
    
    @JsProperty(name="startTime")
    public native void setStartTime(double startTime);
    
    @JsProperty(name="endTime")
    public native double getEndTime();
    
    @JsProperty(name="endTime")
    public native void setEndTime(double endTime);
    
    @JsProperty(name="pauseOnExit")
    public native boolean getPauseOnExit();
    
    @JsProperty(name="pauseOnExit")
    public native void setPauseOnExit(boolean pauseOnExit);
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnter(){
        return this.onenter;
    }
    
    @JsOverlay
    public final void setOnEnter(EventHandlerNonNull onenter){
        this.onenter = onenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnExit(){
        return this.onexit;
    }
    
    @JsOverlay
    public final void setOnExit(EventHandlerNonNull onexit){
        this.onexit = onexit;
    }
    
}

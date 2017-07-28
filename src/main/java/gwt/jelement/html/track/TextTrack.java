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
import gwt.jelement.html.track.TextTrackCue;
import gwt.jelement.html.track.TextTrackCueList;
import gwt.jelement.html.track.TextTrackKind;
import gwt.jelement.html.track.TextTrackMode;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TextTrack", isNative = true)
public class TextTrack extends EventTarget{
    @JsProperty(name="oncuechange")
    private EventHandlerNonNull oncuechange;
    
    @JsProperty(name="kind")
    private String kind;
    
    @JsProperty(name="mode")
    private String mode;
    
    @JsConstructor
    public TextTrack(){
        super();
    }
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="language")
    public native String getLanguage();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="cues")
    public native TextTrackCueList getCues();
    
    @JsProperty(name="activeCues")
    public native TextTrackCueList getActiveCues();
    
    @JsOverlay
    public final EventHandlerNonNull getOnCuechange(){
        return this.oncuechange;
    }
    
    @JsOverlay
    public final void setOnCuechange(EventHandlerNonNull oncuechange){
        this.oncuechange = oncuechange;
    }
    
    @JsOverlay
    public final TextTrackKind getKind(){
       return TextTrackKind.of(kind);
    }
    
    @JsOverlay
    public final TextTrackMode getMode(){
       return TextTrackMode.of(mode);
    }
    
    @JsOverlay
    public final void setMode(TextTrackMode mode){
       this.mode = mode.getInternalValue();
    }
    
    @JsMethod(name = "addCue")
    public native void addCue(TextTrackCue cue);
    
    @JsMethod(name = "removeCue")
    public native void removeCue(TextTrackCue cue);
    
}

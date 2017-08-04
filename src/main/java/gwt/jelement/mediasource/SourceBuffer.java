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
package gwt.jelement.mediasource;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.html.TimeRanges;
import gwt.jelement.html.track.AudioTrackList;
import gwt.jelement.html.track.VideoTrackList;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SourceBuffer", isNative = true)
public class SourceBuffer extends EventTarget{
    @JsProperty(name="onupdatestart")
    private EventHandlerNonNull onupdatestart;
    
    @JsProperty(name="onupdate")
    private EventHandlerNonNull onupdate;
    
    @JsProperty(name="onupdateend")
    private EventHandlerNonNull onupdateend;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="mode")
    private String mode;
    
    @JsProperty(name="updating")
    public native boolean getUpdating();
    
    @JsProperty(name="buffered")
    public native TimeRanges getBuffered();
    
    @JsProperty(name="timestampOffset")
    public native double getTimestampOffset();
    
    @JsProperty(name="timestampOffset")
    public native void setTimestampOffset(double timestampOffset);
    
    @JsProperty(name="audioTracks")
    public native AudioTrackList getAudioTracks();
    
    @JsProperty(name="videoTracks")
    public native VideoTrackList getVideoTracks();
    
    @JsProperty(name="appendWindowStart")
    public native double getAppendWindowStart();
    
    @JsProperty(name="appendWindowStart")
    public native void setAppendWindowStart(double appendWindowStart);
    
    @JsProperty(name="appendWindowEnd")
    public native double getAppendWindowEnd();
    
    @JsProperty(name="appendWindowEnd")
    public native void setAppendWindowEnd(double appendWindowEnd);
    
    @JsOverlay
    public final EventHandlerNonNull getOnUpdatestart(){
        return this.onupdatestart;
    }
    
    @JsOverlay
    public final void setOnUpdatestart(EventHandlerNonNull onupdatestart){
        this.onupdatestart = onupdatestart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUpdate(){
        return this.onupdate;
    }
    
    @JsOverlay
    public final void setOnUpdate(EventHandlerNonNull onupdate){
        this.onupdate = onupdate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUpdateend(){
        return this.onupdateend;
    }
    
    @JsOverlay
    public final void setOnUpdateend(EventHandlerNonNull onupdateend){
        this.onupdateend = onupdateend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAbort(){
        return this.onabort;
    }
    
    @JsOverlay
    public final void setOnAbort(EventHandlerNonNull onabort){
        this.onabort = onabort;
    }
    
    @JsProperty(name="trackDefaults")
    public native TrackDefaultList getTrackDefaults();
    
    @JsProperty(name="trackDefaults")
    public native void setTrackDefaults(TrackDefaultList trackDefaults);
    
    @JsOverlay
    public final AppendMode getMode(){
       return AppendMode.of(mode);
    }
    
    @JsOverlay
    public final void setMode(AppendMode mode){
       this.mode = mode.getInternalValue();
    }
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "appendBuffer")
    public native void appendBuffer(ArrayBuffer data);
    
    @JsMethod(name = "appendBuffer")
    public native void appendBuffer(ArrayBufferView data);
    
    @JsMethod(name = "remove")
    public native void remove(double start, double end);
    
}

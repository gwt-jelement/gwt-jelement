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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaSource", isNative = true)
public class MediaSource extends EventTarget{
    @JsProperty(name="onsourceopen")
    private EventHandlerNonNull onsourceopen;
    
    @JsProperty(name="onsourceended")
    private EventHandlerNonNull onsourceended;
    
    @JsProperty(name="onsourceclose")
    private EventHandlerNonNull onsourceclose;
    
    @JsConstructor
    public MediaSource(){
        super();
    }
    
    @JsProperty(name="sourceBuffers")
    public native SourceBufferList getSourceBuffers();
    
    @JsProperty(name="activeSourceBuffers")
    public native SourceBufferList getActiveSourceBuffers();
    
    @JsProperty(name="duration")
    public native double getDuration();
    
    @JsProperty(name="duration")
    public native void setDuration(double duration);
    
    @JsOverlay
    public final EventHandlerNonNull getOnSourceopen(){
        return this.onsourceopen;
    }
    
    @JsOverlay
    public final void setOnSourceopen(EventHandlerNonNull onsourceopen){
        this.onsourceopen = onsourceopen;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSourceended(){
        return this.onsourceended;
    }
    
    @JsOverlay
    public final void setOnSourceended(EventHandlerNonNull onsourceended){
        this.onsourceended = onsourceended;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSourceclose(){
        return this.onsourceclose;
    }
    
    @JsOverlay
    public final void setOnSourceclose(EventHandlerNonNull onsourceclose){
        this.onsourceclose = onsourceclose;
    }
    
    @JsProperty(name="readyState")
    public native String getReadyState();
    
    @JsMethod(name = "addSourceBuffer")
    public native SourceBuffer addSourceBuffer(String type);
    
    @JsMethod(name = "clearLiveSeekableRange")
    public native void clearLiveSeekableRange();
    
    @JsMethod(name = "endOfStream")
    public native void endOfStream();
    
    @JsOverlay
    public final void endOfStream(EndOfStreamError error){
        endOfStream(error.getInternalValue());
    }
    
    @JsMethod(name = "endOfStream")
    public native void endOfStream(String error);
    
    @JsMethod(name = "isTypeSupported")
    public static native boolean isTypeSupported(String type);
    
    @JsMethod(name = "removeSourceBuffer")
    public native void removeSourceBuffer(SourceBuffer buffer);
    
    @JsMethod(name = "setLiveSeekableRange")
    public native void setLiveSeekableRange(double start, double end);
    
}

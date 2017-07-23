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
import gwt.jelement.mediasource.EndOfStreamError;
import gwt.jelement.mediasource.SourceBuffer;
import gwt.jelement.mediasource.SourceBufferList;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaSource extends EventTarget{
    
    @JsConstructor
    public MediaSource(){
        super();
    }
    
    @JsProperty(name="sourceBuffers")
    public SourceBufferList sourceBuffers;
    
    @JsProperty(name="activeSourceBuffers")
    public SourceBufferList activeSourceBuffers;
    
    @JsProperty(name="duration")
    public double duration;
    
    @JsProperty(name="onsourceopen")
    public EventHandlerNonNull onsourceopen;
    
    @JsProperty(name="onsourceended")
    public EventHandlerNonNull onsourceended;
    
    @JsProperty(name="onsourceclose")
    public EventHandlerNonNull onsourceclose;
    
    @JsProperty(name="readyState")
    public String readyState;
    
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
    public native boolean isTypeSupported(String type);
    
    @JsMethod(name = "removeSourceBuffer")
    public native void removeSourceBuffer(SourceBuffer buffer);
    
    @JsMethod(name = "setLiveSeekableRange")
    public native void setLiveSeekableRange(double start, double end);
    
}

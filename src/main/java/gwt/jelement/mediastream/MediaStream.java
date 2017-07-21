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
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.mediastream.MediaStreamTrack;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaStream extends EventTarget{
    
    @JsConstructor
    public MediaStream(){
        super();
    }
    
    @JsConstructor
    public MediaStream(MediaStream stream){
        super();
    }
    
    @JsConstructor
    public MediaStream(MediaStreamTrack[] tracks){
        super();
    }
    
    @JsProperty(name="onaddtrack")
    public EventHandlerNonNull onaddtrack;
    
    @JsProperty(name="onremovetrack")
    public EventHandlerNonNull onremovetrack;
    
    @JsProperty(name="onactive")
    public EventHandlerNonNull onactive;
    
    @JsProperty(name="oninactive")
    public EventHandlerNonNull oninactive;
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="active")
    public native boolean getActive();
    
    @JsMethod(name = "addTrack")
    public native void addTrack(MediaStreamTrack track);
    
    @JsMethod(name = "clone")
    public native MediaStream clone();
    
    @JsMethod(name = "getAudioTracks")
    public native MediaStreamTrack[] getAudioTracks();
    
    @JsMethod(name = "getTrackById")
    public native MediaStreamTrack getTrackById(String trackId);
    
    @JsMethod(name = "getTracks")
    public native MediaStreamTrack[] getTracks();
    
    @JsMethod(name = "getVideoTracks")
    public native MediaStreamTrack[] getVideoTracks();
    
    @JsMethod(name = "removeTrack")
    public native void removeTrack(MediaStreamTrack track);
    
}

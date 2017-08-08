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
package gwt.jelement.peerconnection;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.mediastream.MediaStreamTrack;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class RTCDTMFSender extends EventTarget {
    @JsProperty(name="ontonechange")
    private EventHandlerNonNull ontonechange;
    
    @JsProperty(name="canInsertDTMF")
    public native boolean getCanInsertDTMF();
    
    @JsProperty(name="track")
    public native MediaStreamTrack getTrack();
    
    @JsProperty(name="toneBuffer")
    public native String getToneBuffer();
    
    @JsProperty(name="duration")
    public native double getDuration();
    
    @JsProperty(name="interToneGap")
    public native double getInterToneGap();
    
    @JsOverlay
    public final EventHandlerNonNull getOnTonechange(){
        return this.ontonechange;
    }
    
    @JsOverlay
    public final void setOnTonechange(EventHandlerNonNull ontonechange){
        this.ontonechange = ontonechange;
    }
    
    @JsMethod(name = "insertDTMF")
    public native void insertDTMF(String tones);
    
    @JsMethod(name = "insertDTMF")
    public native void insertDTMF(String tones, double duration);
    
    @JsMethod(name = "insertDTMF")
    public native void insertDTMF(String tones, double duration, double interToneGap);
    
}

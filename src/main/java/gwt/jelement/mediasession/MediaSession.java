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
package gwt.jelement.mediasession;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaSession", isNative = true)
public class MediaSession extends IsObject{
    @JsProperty(name="playbackState")
    private String playbackState;
    
    @JsProperty(name="metadata")
    public native MediaMetadata getMetadata();
    
    @JsProperty(name="metadata")
    public native void setMetadata(MediaMetadata metadata);
    
    @JsOverlay
    public final MediaSessionPlaybackState getPlaybackState(){
       return MediaSessionPlaybackState.of(playbackState);
    }
    
    @JsOverlay
    public final void setPlaybackState(MediaSessionPlaybackState playbackState){
       this.playbackState = playbackState.getInternalValue();
    }
    
    @JsOverlay
    public final void setActionHandler(MediaSessionAction action, MediaSessionActionHandler handler){
        setActionHandler(action.getInternalValue(), handler);
    }
    
    @JsMethod(name = "setActionHandler")
    public native void setActionHandler(String action, MediaSessionActionHandler handler);
    
}

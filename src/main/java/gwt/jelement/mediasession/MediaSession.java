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

import gwt.jelement.mediasession.MediaMetadata;
import gwt.jelement.mediasession.MediaSessionAction;
import gwt.jelement.mediasession.MediaSessionActionHandler;
import gwt.jelement.mediasession.MediaSessionPlaybackState;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaSession{
    
    @JsProperty(name="metadata")
    public MediaMetadata metadata;
    
    @JsProperty(name="playbackState")
    public MediaSessionPlaybackState playbackState;
    
    @JsOverlay
    public final void setActionHandler(MediaSessionAction action, MediaSessionActionHandler handler){
        setActionHandler(action.getInternalValue(), handler);
    }
    
    @JsMethod(name = "setActionHandler")
    public native void setActionHandler(String action, MediaSessionActionHandler handler);
    
}

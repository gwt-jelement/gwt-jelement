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

import gwt.jelement.events.EventInit;
import gwt.jelement.html.track.AudioTrack;
import gwt.jelement.html.track.TextTrack;
import gwt.jelement.html.track.VideoTrack;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TrackEventInit extends EventInit{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface VideoTrackOrAudioTrackOrTextTrackUnionType {
        @JsOverlay
        default VideoTrack asVideoTrack(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default AudioTrack asAudioTrack(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default TextTrack asTextTrack(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isVideoTrack(){
            return (Object) this instanceof VideoTrack;
        }
    
        @JsOverlay
        default boolean isAudioTrack(){
            return (Object) this instanceof AudioTrack;
        }
    
        @JsOverlay
        default boolean isTextTrack(){
            return (Object) this instanceof TextTrack;
        }
    
    }
    
    @JsProperty(name="track")
    public TrackEventInit.VideoTrackOrAudioTrackOrTextTrackUnionType track;


}

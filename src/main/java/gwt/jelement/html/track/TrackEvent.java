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

import gwt.jelement.core.Js;
import gwt.jelement.events.Event;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="TrackEvent", isNative = true)
public class TrackEvent extends Event {
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface TrackUnion {
        @JsOverlay
        static TrackUnion of(VideoTrack value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static TrackUnion of(AudioTrack value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static TrackUnion of(TextTrack value){
            return Js.cast(value);
        }
    
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
    private TrackUnion track;
    
    @JsConstructor
    public TrackEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public TrackEvent(String type, TrackEventInit eventInitDict){
        super((String) null);
    }
    
    @JsOverlay
    public final TrackUnion getTrack(){
        return this.track;
    }
    
}

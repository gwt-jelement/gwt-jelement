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

import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaStreamConstraints extends JsObject{

    @JsProperty(name="video")
    private VideoUnion video;

    @JsProperty(name="audio")
    private VideoUnion audio;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface VideoUnion {
        @JsOverlay
        static VideoUnion of(boolean value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static VideoUnion of(MediaTrackConstraints value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default boolean asBoolean(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default MediaTrackConstraints asMediaTrackConstraints(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isBoolean(){
            return (Object) this instanceof Boolean;
        }
    
        @JsOverlay
        default boolean isMediaTrackConstraints(){
            return (Object) this instanceof MediaTrackConstraints;
        }
    
    }
    
    public MediaStreamConstraints(){
    }

    @JsOverlay
    public final void setVideo(boolean video){
        this.video = MediaStreamConstraints.VideoUnion.of(video);
    }

    @JsOverlay
    public final void setVideo(MediaTrackConstraints video){
        this.video = MediaStreamConstraints.VideoUnion.of(video);
    }

    @JsOverlay
    public final void setAudio(boolean audio){
        this.audio = MediaStreamConstraints.VideoUnion.of(audio);
    }

    @JsOverlay
    public final void setAudio(MediaTrackConstraints audio){
        this.audio = MediaStreamConstraints.VideoUnion.of(audio);
    }

}

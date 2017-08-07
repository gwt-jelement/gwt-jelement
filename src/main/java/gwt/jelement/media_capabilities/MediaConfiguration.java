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
package gwt.jelement.media_capabilities;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaConfiguration extends JsObject{

    @JsProperty(name="video")
    private VideoConfiguration video;

    @JsProperty(name="audio")
    private AudioConfiguration audio;

    public MediaConfiguration(){
    }

    @JsOverlay
    public final VideoConfiguration getVideo(){
        return this.video;
    }

    @JsOverlay
    public final void setVideo(VideoConfiguration video){
        this.video = video;
    }

    @JsOverlay
    public final AudioConfiguration getAudio(){
        return this.audio;
    }

    @JsOverlay
    public final void setAudio(AudioConfiguration audio){
        this.audio = audio;
    }


}

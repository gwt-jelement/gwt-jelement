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
package gwt.jelement.mediarecorder;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaRecorderOptions extends JsObject{

    @JsProperty(name="mimeType")
    private String mimeType;

    @JsProperty(name="audioBitsPerSecond")
    private double audioBitsPerSecond;

    @JsProperty(name="videoBitsPerSecond")
    private double videoBitsPerSecond;

    @JsProperty(name="bitsPerSecond")
    private double bitsPerSecond;

    public MediaRecorderOptions(){
    }

    @JsOverlay
    public final String getMimeType(){
        return this.mimeType;
    }

    @JsOverlay
    public final void setMimeType(String mimeType){
        this.mimeType = mimeType;
    }

    @JsOverlay
    public final double getAudioBitsPerSecond(){
        return this.audioBitsPerSecond;
    }

    @JsOverlay
    public final void setAudioBitsPerSecond(double audioBitsPerSecond){
        this.audioBitsPerSecond = audioBitsPerSecond;
    }

    @JsOverlay
    public final double getVideoBitsPerSecond(){
        return this.videoBitsPerSecond;
    }

    @JsOverlay
    public final void setVideoBitsPerSecond(double videoBitsPerSecond){
        this.videoBitsPerSecond = videoBitsPerSecond;
    }

    @JsOverlay
    public final double getBitsPerSecond(){
        return this.bitsPerSecond;
    }

    @JsOverlay
    public final void setBitsPerSecond(double bitsPerSecond){
        this.bitsPerSecond = bitsPerSecond;
    }


}

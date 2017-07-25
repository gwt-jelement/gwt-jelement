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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class VideoConfiguration{

    @JsProperty(name="contentType")
    private String contentType;

    @JsProperty(name="width")
    private double width;

    @JsProperty(name="height")
    private double height;

    @JsProperty(name="bitrate")
    private double bitrate;

    @JsProperty(name="framerate")
    private double framerate;

    public VideoConfiguration(){
    }

    @JsOverlay
    public final String getContentType(){
        return this.contentType;
    }

    @JsOverlay
    public final void setContentType(String contentType){
        this.contentType = contentType;
    }

    @JsOverlay
    public final double getWidth(){
        return this.width;
    }

    @JsOverlay
    public final void setWidth(double width){
        this.width = width;
    }

    @JsOverlay
    public final double getHeight(){
        return this.height;
    }

    @JsOverlay
    public final void setHeight(double height){
        this.height = height;
    }

    @JsOverlay
    public final double getBitrate(){
        return this.bitrate;
    }

    @JsOverlay
    public final void setBitrate(double bitrate){
        this.bitrate = bitrate;
    }

    @JsOverlay
    public final double getFramerate(){
        return this.framerate;
    }

    @JsOverlay
    public final void setFramerate(double framerate){
        this.framerate = framerate;
    }

}

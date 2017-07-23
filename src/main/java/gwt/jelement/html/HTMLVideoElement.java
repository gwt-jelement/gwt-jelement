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
package gwt.jelement.html;

import gwt.jelement.html.HTMLMediaElement;
import gwt.jelement.mediasource.VideoPlaybackQuality;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLVideoElement extends HTMLMediaElement{
    
    @JsConstructor
    public HTMLVideoElement(){
        super();
    }
    
    @JsProperty(name="width")
    public double width;
    
    @JsProperty(name="height")
    public double height;
    
    @JsProperty(name="videoWidth")
    public double videoWidth;
    
    @JsProperty(name="videoHeight")
    public double videoHeight;
    
    @JsProperty(name="poster")
    public String poster;
    
    @JsProperty(name="webkitSupportsFullscreen")
    public boolean webkitSupportsFullscreen;
    
    @JsProperty(name="webkitDisplayingFullscreen")
    public boolean webkitDisplayingFullscreen;
    
    @JsProperty(name="webkitDecodedFrameCount")
    public double webkitDecodedFrameCount;
    
    @JsProperty(name="webkitDroppedFrameCount")
    public double webkitDroppedFrameCount;
    
    @JsMethod(name = "getVideoPlaybackQuality")
    public native VideoPlaybackQuality getVideoPlaybackQuality();
    
    @JsMethod(name = "webkitEnterFullScreen")
    public native void webkitEnterFullScreen();
    
    @JsMethod(name = "webkitEnterFullscreen")
    public native void webkitEnterFullscreen();
    
    @JsMethod(name = "webkitExitFullScreen")
    public native void webkitExitFullScreen();
    
    @JsMethod(name = "webkitExitFullscreen")
    public native void webkitExitFullscreen();
    
}

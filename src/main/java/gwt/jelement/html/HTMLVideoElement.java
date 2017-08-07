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

import gwt.jelement.mediasource.VideoPlaybackQuality;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLVideoElement", isNative = true)
public class HTMLVideoElement extends HTMLMediaElement {
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(double width);
    
    @JsProperty(name="height")
    public native double getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(double height);
    
    @JsProperty(name="videoWidth")
    public native double getVideoWidth();
    
    @JsProperty(name="videoHeight")
    public native double getVideoHeight();
    
    @JsProperty(name="poster")
    public native String getPoster();
    
    @JsProperty(name="poster")
    public native void setPoster(String poster);
    
    @JsProperty(name="webkitSupportsFullscreen")
    public native boolean getWebkitSupportsFullscreen();
    
    @JsProperty(name="webkitDisplayingFullscreen")
    public native boolean getWebkitDisplayingFullscreen();
    
    @JsProperty(name="webkitDecodedFrameCount")
    public native double getWebkitDecodedFrameCount();
    
    @JsProperty(name="webkitDroppedFrameCount")
    public native double getWebkitDroppedFrameCount();
    
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

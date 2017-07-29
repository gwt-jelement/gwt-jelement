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

import gwt.jelement.fileapi.BlobCallback;
import gwt.jelement.html.canvas.CanvasContextCreationAttributes;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLCanvasElement", isNative = true)
public class HTMLCanvasElement extends HTMLElement{
    @JsConstructor
    public HTMLCanvasElement(){
        super();
    }
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(double width);
    
    @JsProperty(name="height")
    public native double getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(double height);
    
    @JsMethod(name = "captureStream")
    public native MediaStream captureStream();
    
    @JsMethod(name = "captureStream")
    public native MediaStream captureStream(double frameRate);
    
    @JsMethod(name = "getContext")
    public native <T> T getContext(String contextId);
    
    @JsMethod(name = "getContext")
    public native <T> T getContext(String contextId, CanvasContextCreationAttributes attributes);
    
    @JsMethod(name = "toBlob")
    public native void toBlob(BlobCallback _callback);
    
    @JsMethod(name = "toBlob")
    public native void toBlob(BlobCallback _callback, String type);
    
    @JsMethod(name = "toBlob")
    public native void toBlob(BlobCallback _callback, String type, Object arguments);
    
    @JsMethod(name = "toDataURL")
    public native String toDataURL();
    
    @JsMethod(name = "toDataURL")
    public native String toDataURL(String type);
    
    @JsMethod(name = "toDataURL")
    public native String toDataURL(String type, Object arguments);
    
    @JsMethod(name = "transferControlToOffscreen")
    public native OffscreenCanvas transferControlToOffscreen();
    
}

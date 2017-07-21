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

import gwt.jelement.canvas2d.CanvasRenderingContext2D;
import gwt.jelement.fileapi.BlobCallback;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.canvas.CanvasContextCreationAttributes;
import gwt.jelement.imagebitmap.ImageBitmapRenderingContext;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.webgl.WebGL2RenderingContext;
import gwt.jelement.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLCanvasElement extends HTMLElement{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface RenderingContext {
        @JsOverlay
        default CanvasRenderingContext2D asCanvasRenderingContext2D(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default WebGLRenderingContext asWebGLRenderingContext(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default WebGL2RenderingContext asWebGL2RenderingContext(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ImageBitmapRenderingContext asImageBitmapRenderingContext(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isCanvasRenderingContext2D(){
            return (Object) this instanceof CanvasRenderingContext2D;
        }
    
        @JsOverlay
        default boolean isWebGLRenderingContext(){
            return (Object) this instanceof WebGLRenderingContext;
        }
    
        @JsOverlay
        default boolean isWebGL2RenderingContext(){
            return (Object) this instanceof WebGL2RenderingContext;
        }
    
        @JsOverlay
        default boolean isImageBitmapRenderingContext(){
            return (Object) this instanceof ImageBitmapRenderingContext;
        }
    
    }
    
    @JsConstructor
    public HTMLCanvasElement(){
        super();
    }
    
    @JsProperty(name="width")
    public long width;
    
    @JsProperty(name="height")
    public long height;
    
    @JsMethod(name = "captureStream")
    public native MediaStream captureStream();
    
    @JsMethod(name = "captureStream")
    public native MediaStream captureStream(double frameRate);
    
    @JsMethod(name = "getContext")
    public native HTMLCanvasElement.RenderingContext getContext(String contextId);
    
    @JsMethod(name = "getContext")
    public native HTMLCanvasElement.RenderingContext getContext(String contextId, CanvasContextCreationAttributes attributes);
    
    @JsMethod(name = "toBlob")
    public native void toBlob(BlobCallback _callback);
    
    @JsMethod(name = "toBlob")
    public native void toBlob(BlobCallback _callback, String type);
    
    @JsMethod(name = "toBlob")
    public native void toBlob(BlobCallback _callback, String type, Any arguments);
    
    @JsMethod(name = "toDataURL")
    public native String toDataURL();
    
    @JsMethod(name = "toDataURL")
    public native String toDataURL(String type);
    
    @JsMethod(name = "toDataURL")
    public native String toDataURL(String type, Any arguments);
    
    @JsMethod(name = "transferControlToOffscreen")
    public native OffscreenCanvas transferControlToOffscreen();
    
}

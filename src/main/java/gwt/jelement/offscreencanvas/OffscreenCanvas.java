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
package gwt.jelement.offscreencanvas;

import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.canvas.CanvasContextCreationAttributes;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.ImageEncodeOptions;
import gwt.jelement.offscreencanvas.OffscreenRenderingContextType;
import gwt.jelement.offscreencanvas2d.OffscreenCanvasRenderingContext2D;
import gwt.jelement.webgl.WebGL2RenderingContext;
import gwt.jelement.webgl.WebGLRenderingContext;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="OffscreenCanvas", isNative = true)
public class OffscreenCanvas extends EventTarget{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface OffscreenRenderingContext {
        @JsOverlay
        static OffscreenRenderingContext of(OffscreenCanvasRenderingContext2D value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static OffscreenRenderingContext of(WebGLRenderingContext value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static OffscreenRenderingContext of(WebGL2RenderingContext value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default OffscreenCanvasRenderingContext2D asOffscreenCanvasRenderingContext2D(){
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
        default boolean isOffscreenCanvasRenderingContext2D(){
            return (Object) this instanceof OffscreenCanvasRenderingContext2D;
        }
    
        @JsOverlay
        default boolean isWebGLRenderingContext(){
            return (Object) this instanceof WebGLRenderingContext;
        }
    
        @JsOverlay
        default boolean isWebGL2RenderingContext(){
            return (Object) this instanceof WebGL2RenderingContext;
        }
    
    }
    
    @JsConstructor
    public OffscreenCanvas(double width, double height){
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
    
    @JsMethod(name = "convertToBlob")
    public native Promise<Blob> convertToBlob();
    
    @JsMethod(name = "convertToBlob")
    public native Promise<Blob> convertToBlob(ImageEncodeOptions options);
    
    @JsOverlay
    public final OffscreenCanvas.OffscreenRenderingContext getContext(OffscreenRenderingContextType contextType){
        return getContext(contextType.getInternalValue());
    }
    
    @JsMethod(name = "getContext")
    public native OffscreenCanvas.OffscreenRenderingContext getContext(String contextType);
    
    @JsOverlay
    public final OffscreenCanvas.OffscreenRenderingContext getContext(OffscreenRenderingContextType contextType, CanvasContextCreationAttributes attributes){
        return getContext(contextType.getInternalValue(), attributes);
    }
    
    @JsMethod(name = "getContext")
    public native OffscreenCanvas.OffscreenRenderingContext getContext(String contextType, CanvasContextCreationAttributes attributes);
    
    @JsMethod(name = "transferToImageBitmap")
    public native ImageBitmap transferToImageBitmap();
    
}

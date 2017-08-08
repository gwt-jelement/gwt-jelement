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
package gwt.jelement.imagebitmap;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.svg.SVGImageElement;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class ImageBitmapFactories implements IsObject {
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
}

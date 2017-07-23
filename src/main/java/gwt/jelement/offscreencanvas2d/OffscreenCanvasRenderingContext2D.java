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
package gwt.jelement.offscreencanvas2d;

import gwt.jelement.canvas2d.CanvasFillRule;
import gwt.jelement.canvas2d.CanvasGradient;
import gwt.jelement.canvas2d.CanvasPattern;
import gwt.jelement.canvas2d.CanvasRenderingContext2D;
import gwt.jelement.canvas2d.ImageSmoothingQuality;
import gwt.jelement.canvas2d.Path2D;
import gwt.jelement.css.cssom.CSSImageValue;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.html.ImageDataColorSettings;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.svg.SVGImageElement;
import elemental2.core.Float32Array;
import elemental2.core.Uint16Array;
import elemental2.core.Uint8ClampedArray;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class OffscreenCanvasRenderingContext2D{
    
    @JsProperty(name="canvas")
    public OffscreenCanvas canvas;
    
    @JsProperty(name="globalAlpha")
    public double globalAlpha;
    
    @JsProperty(name="globalCompositeOperation")
    public String globalCompositeOperation;
    
    @JsProperty(name="filter")
    public String filter;
    
    @JsProperty(name="imageSmoothingEnabled")
    public boolean imageSmoothingEnabled;
    
    @JsProperty(name="imageSmoothingQuality")
    public String imageSmoothingQuality;
    
    @JsOverlay
    public final ImageSmoothingQuality getImageSmoothingQuality(){
       return ImageSmoothingQuality.of(imageSmoothingQuality);
    }
    
    @JsOverlay
    public final void setImageSmoothingQuality(ImageSmoothingQuality imageSmoothingQuality){
       this.imageSmoothingQuality = imageSmoothingQuality.getInternalValue();
    }
    
    @JsProperty(name="strokeStyle")
    public CanvasRenderingContext2D.StringOrCanvasGradientOrCanvasPatternUnionType strokeStyle;
    
    @JsProperty(name="fillStyle")
    public CanvasRenderingContext2D.StringOrCanvasGradientOrCanvasPatternUnionType fillStyle;
    
    @JsProperty(name="shadowOffsetX")
    public double shadowOffsetX;
    
    @JsProperty(name="shadowOffsetY")
    public double shadowOffsetY;
    
    @JsProperty(name="shadowBlur")
    public double shadowBlur;
    
    @JsProperty(name="shadowColor")
    public String shadowColor;
    
    @JsProperty(name="lineWidth")
    public double lineWidth;
    
    @JsProperty(name="lineCap")
    public String lineCap;
    
    @JsProperty(name="lineJoin")
    public String lineJoin;
    
    @JsProperty(name="miterLimit")
    public double miterLimit;
    
    @JsProperty(name="lineDashOffset")
    public double lineDashOffset;
    
    @JsMethod(name = "beginPath")
    public native void beginPath();
    
    @JsMethod(name = "clearRect")
    public native void clearRect(double x, double y, double width, double height);
    
    @JsMethod(name = "clip")
    public native void clip();
    
    @JsMethod(name = "clip")
    public native void clip(Path2D path);
    
    @JsMethod(name = "commit")
    public native Promise commit();
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(ImageData imagedata);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(double sw, double sh);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(double sw, double sh, ImageDataColorSettings imageDataColorSettings);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(Uint8ClampedArray data, double sw, double sh, ImageDataColorSettings imageDataColorSettings);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(Uint16Array data, double sw, double sh, ImageDataColorSettings imageDataColorSettings);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(Float32Array data, double sw, double sh, ImageDataColorSettings imageDataColorSettings);
    
    @JsMethod(name = "createLinearGradient")
    public native CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(CSSImageValue image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(HTMLImageElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(SVGImageElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(HTMLVideoElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(HTMLCanvasElement image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(ImageBitmap image, String repetitionType);
    
    @JsMethod(name = "createPattern")
    public native CanvasPattern createPattern(OffscreenCanvas image, String repetitionType);
    
    @JsMethod(name = "createRadialGradient")
    public native CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(CSSImageValue image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLImageElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(SVGImageElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLVideoElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLCanvasElement image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(ImageBitmap image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(OffscreenCanvas image, double x, double y);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(CSSImageValue image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLImageElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(SVGImageElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLVideoElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLCanvasElement image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(ImageBitmap image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(OffscreenCanvas image, double x, double y, double width, double height);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(CSSImageValue image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLImageElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(SVGImageElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLVideoElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(HTMLCanvasElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(ImageBitmap image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "drawImage")
    public native void drawImage(OffscreenCanvas image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    
    @JsMethod(name = "fill")
    public native void fill();
    
    @JsOverlay
    public final void fill(CanvasFillRule winding){
        fill(winding.getInternalValue());
    }
    
    @JsMethod(name = "fill")
    public native void fill(Path2D path);
    
    @JsMethod(name = "fill")
    public native void fill(String winding);
    
    @JsOverlay
    public final void fill(Path2D path, CanvasFillRule winding){
        fill(path, winding.getInternalValue());
    }
    
    @JsMethod(name = "fill")
    public native void fill(Path2D path, String winding);
    
    @JsMethod(name = "fillRect")
    public native void fillRect(double x, double y, double width, double height);
    
    @JsMethod(name = "getImageData")
    public native ImageData getImageData(double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "getLineDash")
    public native double[] getLineDash();
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(double x, double y);
    
    @JsOverlay
    public final boolean isPointInPath(double x, double y, CanvasFillRule winding){
        return isPointInPath(x, y, winding.getInternalValue());
    }
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(Path2D path, double x, double y);
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(double x, double y, String winding);
    
    @JsOverlay
    public final boolean isPointInPath(Path2D path, double x, double y, CanvasFillRule winding){
        return isPointInPath(path, x, y, winding.getInternalValue());
    }
    
    @JsMethod(name = "isPointInPath")
    public native boolean isPointInPath(Path2D path, double x, double y, String winding);
    
    @JsMethod(name = "isPointInStroke")
    public native boolean isPointInStroke(double x, double y);
    
    @JsMethod(name = "isPointInStroke")
    public native boolean isPointInStroke(Path2D path, double x, double y);
    
    @JsMethod(name = "putImageData")
    public native void putImageData(ImageData imagedata, double dx, double dy);
    
    @JsMethod(name = "putImageData")
    public native void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
    
    @JsMethod(name = "resetTransform")
    public native void resetTransform();
    
    @JsMethod(name = "restore")
    public native void restore();
    
    @JsMethod(name = "rotate")
    public native void rotate(double angle);
    
    @JsMethod(name = "save")
    public native void save();
    
    @JsMethod(name = "scale")
    public native void scale(double x, double y);
    
    @JsMethod(name = "setLineDash")
    public native void setLineDash(double[] dash);
    
    @JsMethod(name = "setTransform")
    public native void setTransform(double a, double b, double c, double d, double e, double f);
    
    @JsMethod(name = "stroke")
    public native void stroke();
    
    @JsMethod(name = "stroke")
    public native void stroke(Path2D path);
    
    @JsMethod(name = "strokeRect")
    public native void strokeRect(double x, double y, double width, double height);
    
    @JsMethod(name = "transform")
    public native void transform(double a, double b, double c, double d, double e, double f);
    
    @JsMethod(name = "translate")
    public native void translate(double x, double y);
    
}

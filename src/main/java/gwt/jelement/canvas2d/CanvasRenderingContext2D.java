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
package gwt.jelement.canvas2d;

import gwt.jelement.core.Float32Array;
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Uint16Array;
import gwt.jelement.core.Uint8ClampedArray;
import gwt.jelement.css.cssom.CSSImageValue;
import gwt.jelement.dom.Element;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.html.ImageDataColorSettings;
import gwt.jelement.html.TextMetrics;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.svg.SVGImageElement;
import gwt.jelement.svg.SVGMatrix;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="CanvasRenderingContext2D", isNative = true)
public class CanvasRenderingContext2D extends JsObject{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface StrokeStyleUnion {
        @JsOverlay
        static StrokeStyleUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static StrokeStyleUnion of(CanvasGradient value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static StrokeStyleUnion of(CanvasPattern value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default CanvasGradient asCanvasGradient(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default CanvasPattern asCanvasPattern(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isCanvasGradient(){
            return (Object) this instanceof CanvasGradient;
        }
    
        @JsOverlay
        default boolean isCanvasPattern(){
            return (Object) this instanceof CanvasPattern;
        }
    
    }
    
    @JsProperty(name="strokeStyle")
    private StrokeStyleUnion strokeStyle;
    
    @JsProperty(name="fillStyle")
    private StrokeStyleUnion fillStyle;
    
    @JsProperty(name="imageSmoothingQuality")
    private String imageSmoothingQuality;
    
    @JsConstructor
    public CanvasRenderingContext2D(){
        super();
    }
    
    @JsProperty(name="canvas")
    public native HTMLCanvasElement getCanvas();
    
    @JsProperty(name="currentTransform")
    public native SVGMatrix getCurrentTransform();
    
    @JsProperty(name="currentTransform")
    public native void setCurrentTransform(SVGMatrix currentTransform);
    
    @JsProperty(name="globalAlpha")
    public native double getGlobalAlpha();
    
    @JsProperty(name="globalAlpha")
    public native void setGlobalAlpha(double globalAlpha);
    
    @JsProperty(name="globalCompositeOperation")
    public native String getGlobalCompositeOperation();
    
    @JsProperty(name="globalCompositeOperation")
    public native void setGlobalCompositeOperation(String globalCompositeOperation);
    
    @JsProperty(name="filter")
    public native String getFilter();
    
    @JsProperty(name="filter")
    public native void setFilter(String filter);
    
    @JsProperty(name="imageSmoothingEnabled")
    public native boolean getImageSmoothingEnabled();
    
    @JsProperty(name="imageSmoothingEnabled")
    public native void setImageSmoothingEnabled(boolean imageSmoothingEnabled);
    
    @JsOverlay
    public final StrokeStyleUnion getStrokeStyle(){
        return this.strokeStyle;
    }
    
    @JsOverlay
    public final void setStrokeStyle(String strokeStyle){
        this.strokeStyle = CanvasRenderingContext2D.StrokeStyleUnion.of(strokeStyle);
    }
    
    @JsOverlay
    public final void setStrokeStyle(CanvasGradient strokeStyle){
        this.strokeStyle = CanvasRenderingContext2D.StrokeStyleUnion.of(strokeStyle);
    }
    
    @JsOverlay
    public final void setStrokeStyle(CanvasPattern strokeStyle){
        this.strokeStyle = CanvasRenderingContext2D.StrokeStyleUnion.of(strokeStyle);
    }
    
    @JsOverlay
    public final StrokeStyleUnion getFillStyle(){
        return this.fillStyle;
    }
    
    @JsOverlay
    public final void setFillStyle(String fillStyle){
        this.fillStyle = CanvasRenderingContext2D.StrokeStyleUnion.of(fillStyle);
    }
    
    @JsOverlay
    public final void setFillStyle(CanvasGradient fillStyle){
        this.fillStyle = CanvasRenderingContext2D.StrokeStyleUnion.of(fillStyle);
    }
    
    @JsOverlay
    public final void setFillStyle(CanvasPattern fillStyle){
        this.fillStyle = CanvasRenderingContext2D.StrokeStyleUnion.of(fillStyle);
    }
    
    @JsProperty(name="shadowOffsetX")
    public native double getShadowOffsetX();
    
    @JsProperty(name="shadowOffsetX")
    public native void setShadowOffsetX(double shadowOffsetX);
    
    @JsProperty(name="shadowOffsetY")
    public native double getShadowOffsetY();
    
    @JsProperty(name="shadowOffsetY")
    public native void setShadowOffsetY(double shadowOffsetY);
    
    @JsProperty(name="shadowBlur")
    public native double getShadowBlur();
    
    @JsProperty(name="shadowBlur")
    public native void setShadowBlur(double shadowBlur);
    
    @JsProperty(name="shadowColor")
    public native String getShadowColor();
    
    @JsProperty(name="shadowColor")
    public native void setShadowColor(String shadowColor);
    
    @JsProperty(name="lineWidth")
    public native double getLineWidth();
    
    @JsProperty(name="lineWidth")
    public native void setLineWidth(double lineWidth);
    
    @JsProperty(name="lineCap")
    public native String getLineCap();
    
    @JsProperty(name="lineCap")
    public native void setLineCap(String lineCap);
    
    @JsProperty(name="lineJoin")
    public native String getLineJoin();
    
    @JsProperty(name="lineJoin")
    public native void setLineJoin(String lineJoin);
    
    @JsProperty(name="miterLimit")
    public native double getMiterLimit();
    
    @JsProperty(name="miterLimit")
    public native void setMiterLimit(double miterLimit);
    
    @JsProperty(name="lineDashOffset")
    public native double getLineDashOffset();
    
    @JsProperty(name="lineDashOffset")
    public native void setLineDashOffset(double lineDashOffset);
    
    @JsProperty(name="font")
    public native String getFont();
    
    @JsProperty(name="font")
    public native void setFont(String font);
    
    @JsProperty(name="textAlign")
    public native String getTextAlign();
    
    @JsProperty(name="textAlign")
    public native void setTextAlign(String textAlign);
    
    @JsProperty(name="textBaseline")
    public native String getTextBaseline();
    
    @JsProperty(name="textBaseline")
    public native void setTextBaseline(String textBaseline);
    
    @JsProperty(name="direction")
    public native String getDirection();
    
    @JsProperty(name="direction")
    public native void setDirection(String direction);
    
    @JsOverlay
    public final ImageSmoothingQuality getImageSmoothingQuality(){
       return ImageSmoothingQuality.of(imageSmoothingQuality);
    }
    
    @JsOverlay
    public final void setImageSmoothingQuality(ImageSmoothingQuality imageSmoothingQuality){
       this.imageSmoothingQuality = imageSmoothingQuality.getInternalValue();
    }
    
    @JsMethod(name = "addHitRegion")
    public native void addHitRegion();
    
    @JsMethod(name = "addHitRegion")
    public native void addHitRegion(HitRegionOptions options);
    
    @JsMethod(name = "arc")
    public native void arc(double x, double y, double radius, double startAngle, double endAngle);
    
    @JsMethod(name = "arc")
    public native void arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);
    
    @JsMethod(name = "arcTo")
    public native void arcTo(double x1, double y1, double x2, double y2, double radius);
    
    @JsMethod(name = "beginPath")
    public native void beginPath();
    
    @JsMethod(name = "bezierCurveTo")
    public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);
    
    @JsMethod(name = "clearHitRegions")
    public native void clearHitRegions();
    
    @JsMethod(name = "clearRect")
    public native void clearRect(double x, double y, double width, double height);
    
    @JsMethod(name = "clip")
    public native void clip();
    
    @JsOverlay
    public final void clip(CanvasFillRule winding){
        clip(winding.getInternalValue());
    }
    
    @JsMethod(name = "clip")
    public native void clip(Path2D path);
    
    @JsMethod(name = "clip")
    public native void clip(String winding);
    
    @JsOverlay
    public final void clip(Path2D path, CanvasFillRule winding){
        clip(path, winding.getInternalValue());
    }
    
    @JsMethod(name = "clip")
    public native void clip(Path2D path, String winding);
    
    @JsMethod(name = "closePath")
    public native void closePath();
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(ImageData imagedata);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(double sw, double sh);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(double sw, double sh, ImageDataColorSettings imageDataColorSettings);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(Uint8ClampedArray data, double sw, double sh);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(Uint16Array data, double sw, double sh);
    
    @JsMethod(name = "createImageData")
    public native ImageData createImageData(Float32Array data, double sw, double sh);
    
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
    
    @JsMethod(name = "drawFocusIfNeeded")
    public native void drawFocusIfNeeded(Element element);
    
    @JsMethod(name = "drawFocusIfNeeded")
    public native void drawFocusIfNeeded(Path2D path, Element element);
    
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
    
    @JsMethod(name = "ellipse")
    public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle);
    
    @JsMethod(name = "ellipse")
    public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle, boolean anticlockwise);
    
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
    
    @JsMethod(name = "fillText")
    public native void fillText(String text, double x, double y);
    
    @JsMethod(name = "fillText")
    public native void fillText(String text, double x, double y, double maxWidth);
    
    @JsMethod(name = "getContextAttributes")
    public native CanvasRenderingContext2DSettings getContextAttributes();
    
    @JsMethod(name = "getImageData")
    public native ImageData getImageData(double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "getLineDash")
    public native double[] getLineDash();
    
    @JsMethod(name = "isContextLost")
    public native boolean isContextLost();
    
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
    
    @JsMethod(name = "lineTo")
    public native void lineTo(double x, double y);
    
    @JsMethod(name = "measureText")
    public native TextMetrics measureText(String text);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(double x, double y);
    
    @JsMethod(name = "putImageData")
    public native void putImageData(ImageData imagedata, double dx, double dy);
    
    @JsMethod(name = "putImageData")
    public native void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
    
    @JsMethod(name = "quadraticCurveTo")
    public native void quadraticCurveTo(double cpx, double cpy, double x, double y);
    
    @JsMethod(name = "rect")
    public native void rect(double x, double y, double width, double height);
    
    @JsMethod(name = "removeHitRegion")
    public native void removeHitRegion(String id);
    
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
    
    @JsMethod(name = "scrollPathIntoView")
    public native void scrollPathIntoView();
    
    @JsMethod(name = "scrollPathIntoView")
    public native void scrollPathIntoView(Path2D path);
    
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
    
    @JsMethod(name = "strokeText")
    public native void strokeText(String text, double x, double y);
    
    @JsMethod(name = "strokeText")
    public native void strokeText(String text, double x, double y, double maxWidth);
    
    @JsMethod(name = "transform")
    public native void transform(double a, double b, double c, double d, double e, double f);
    
    @JsMethod(name = "translate")
    public native void translate(double x, double y);
    
}

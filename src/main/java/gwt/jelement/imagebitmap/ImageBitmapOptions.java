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

import gwt.jelement.imagebitmap.ColorSpaceConversion;
import gwt.jelement.imagebitmap.ImageOrientation;
import gwt.jelement.imagebitmap.PremultiplyAlpha;
import gwt.jelement.imagebitmap.ResizeQuality;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ImageBitmapOptions{

    @JsProperty(name="imageOrientation")
    private String imageOrientation;

    @JsProperty(name="premultiplyAlpha")
    private String premultiplyAlpha;

    @JsProperty(name="colorSpaceConversion")
    private String colorSpaceConversion;

    @JsProperty(name="resizeWidth")
    private double resizeWidth;

    @JsProperty(name="resizeHeight")
    private double resizeHeight;

    @JsProperty(name="resizeQuality")
    private String resizeQuality;

    public ImageBitmapOptions(){
    }

    @JsOverlay
    public final ImageOrientation getImageOrientation(){
        return ImageOrientation.of(this.imageOrientation);
    }

    @JsOverlay
    public final void setImageOrientation(ImageOrientation imageOrientation){
        this.imageOrientation = imageOrientation.getInternalValue();
    }

    @JsOverlay
    public final PremultiplyAlpha getPremultiplyAlpha(){
        return PremultiplyAlpha.of(this.premultiplyAlpha);
    }

    @JsOverlay
    public final void setPremultiplyAlpha(PremultiplyAlpha premultiplyAlpha){
        this.premultiplyAlpha = premultiplyAlpha.getInternalValue();
    }

    @JsOverlay
    public final ColorSpaceConversion getColorSpaceConversion(){
        return ColorSpaceConversion.of(this.colorSpaceConversion);
    }

    @JsOverlay
    public final void setColorSpaceConversion(ColorSpaceConversion colorSpaceConversion){
        this.colorSpaceConversion = colorSpaceConversion.getInternalValue();
    }

    @JsOverlay
    public final double getResizeWidth(){
        return this.resizeWidth;
    }

    @JsOverlay
    public final void setResizeWidth(double resizeWidth){
        this.resizeWidth = resizeWidth;
    }

    @JsOverlay
    public final double getResizeHeight(){
        return this.resizeHeight;
    }

    @JsOverlay
    public final void setResizeHeight(double resizeHeight){
        this.resizeHeight = resizeHeight;
    }

    @JsOverlay
    public final ResizeQuality getResizeQuality(){
        return ResizeQuality.of(this.resizeQuality);
    }

    @JsOverlay
    public final void setResizeQuality(ResizeQuality resizeQuality){
        this.resizeQuality = resizeQuality.getInternalValue();
    }

}

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

    public ImageBitmapOptions(){
    }

    @JsProperty(name="imageOrientation")
    public String imageOrientation;

    @JsOverlay
    public final ImageOrientation getImageOrientation(){
        return ImageOrientation.of(this.imageOrientation);
    }

    @JsOverlay
    public final void setImageOrientation(ImageOrientation imageOrientation){
        this.imageOrientation = imageOrientation.getInternalValue();
    }

    @JsProperty(name="premultiplyAlpha")
    public String premultiplyAlpha;

    @JsOverlay
    public final PremultiplyAlpha getPremultiplyAlpha(){
        return PremultiplyAlpha.of(this.premultiplyAlpha);
    }

    @JsOverlay
    public final void setPremultiplyAlpha(PremultiplyAlpha premultiplyAlpha){
        this.premultiplyAlpha = premultiplyAlpha.getInternalValue();
    }

    @JsProperty(name="colorSpaceConversion")
    public String colorSpaceConversion;

    @JsOverlay
    public final ColorSpaceConversion getColorSpaceConversion(){
        return ColorSpaceConversion.of(this.colorSpaceConversion);
    }

    @JsOverlay
    public final void setColorSpaceConversion(ColorSpaceConversion colorSpaceConversion){
        this.colorSpaceConversion = colorSpaceConversion.getInternalValue();
    }

    @JsProperty(name="resizeWidth")
    public double resizeWidth;

    @JsOverlay
    public final double getResizeWidth(){
        return this.resizeWidth;
    }

    @JsOverlay
    public final void setResizeWidth(double resizeWidth){
        this.resizeWidth = resizeWidth;
    }

    @JsProperty(name="resizeHeight")
    public double resizeHeight;

    @JsOverlay
    public final double getResizeHeight(){
        return this.resizeHeight;
    }

    @JsOverlay
    public final void setResizeHeight(double resizeHeight){
        this.resizeHeight = resizeHeight;
    }

    @JsProperty(name="resizeQuality")
    public String resizeQuality;

    @JsOverlay
    public final ResizeQuality getResizeQuality(){
        return ResizeQuality.of(this.resizeQuality);
    }

    @JsOverlay
    public final void setResizeQuality(ResizeQuality resizeQuality){
        this.resizeQuality = resizeQuality.getInternalValue();
    }


}

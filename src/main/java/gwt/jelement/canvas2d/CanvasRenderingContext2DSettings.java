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

import gwt.jelement.core.JsObject;
import gwt.jelement.html.canvas.CanvasColorSpace;
import gwt.jelement.html.canvas.CanvasPixelFormat;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class CanvasRenderingContext2DSettings extends JsObject{

    @JsProperty(name="alpha")
    private boolean alpha;

    @JsProperty(name="colorSpace")
    private String colorSpace;

    @JsProperty(name="pixelFormat")
    private String pixelFormat;

    @JsProperty(name="linearPixelMath")
    private boolean linearPixelMath;

    public CanvasRenderingContext2DSettings(){
    }

    @JsOverlay
    public final boolean isAlpha(){
        return this.alpha;
    }

    @JsOverlay
    public final void setAlpha(boolean alpha){
        this.alpha = alpha;
    }

    @JsOverlay
    public final CanvasColorSpace getColorSpace(){
        return CanvasColorSpace.of(this.colorSpace);
    }

    @JsOverlay
    public final void setColorSpace(CanvasColorSpace colorSpace){
        this.colorSpace = colorSpace.getInternalValue();
    }

    @JsOverlay
    public final CanvasPixelFormat getPixelFormat(){
        return CanvasPixelFormat.of(this.pixelFormat);
    }

    @JsOverlay
    public final void setPixelFormat(CanvasPixelFormat pixelFormat){
        this.pixelFormat = pixelFormat.getInternalValue();
    }

    @JsOverlay
    public final boolean isLinearPixelMath(){
        return this.linearPixelMath;
    }

    @JsOverlay
    public final void setLinearPixelMath(boolean linearPixelMath){
        this.linearPixelMath = linearPixelMath;
    }


}

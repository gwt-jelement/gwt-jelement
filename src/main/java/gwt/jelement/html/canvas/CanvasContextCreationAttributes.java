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
package gwt.jelement.html.canvas;

import gwt.jelement.html.canvas.CanvasColorSpace;
import gwt.jelement.html.canvas.CanvasPixelFormat;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CanvasContextCreationAttributes{

    @JsProperty(name="alpha")
    public boolean alpha;

    @JsProperty(name="colorSpace")
    public CanvasColorSpace colorSpace;

    @JsProperty(name="pixelFormat")
    public CanvasPixelFormat pixelFormat;

    @JsProperty(name="linearPixelMath")
    public boolean linearPixelMath;

    @JsProperty(name="depth")
    public boolean depth;

    @JsProperty(name="stencil")
    public boolean stencil;

    @JsProperty(name="antialias")
    public boolean antialias;

    @JsProperty(name="premultipliedAlpha")
    public boolean premultipliedAlpha;

    @JsProperty(name="preserveDrawingBuffer")
    public boolean preserveDrawingBuffer;

    @JsProperty(name="failIfMajorPerformanceCaveat")
    public boolean failIfMajorPerformanceCaveat;


}

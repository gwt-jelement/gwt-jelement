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
    public boolean alpha = true;

    @JsProperty(name="colorSpace")
    public CanvasColorSpace colorSpace = CanvasColorSpace.of("legacy-srgb");

    @JsProperty(name="pixelFormat")
    public CanvasPixelFormat pixelFormat = CanvasPixelFormat.of("8-8-8-8");

    @JsProperty(name="linearPixelMath")
    public boolean linearPixelMath = false;

    @JsProperty(name="depth")
    public boolean depth = true;

    @JsProperty(name="stencil")
    public boolean stencil = false;

    @JsProperty(name="antialias")
    public boolean antialias = true;

    @JsProperty(name="premultipliedAlpha")
    public boolean premultipliedAlpha = true;

    @JsProperty(name="preserveDrawingBuffer")
    public boolean preserveDrawingBuffer = false;

    @JsProperty(name="failIfMajorPerformanceCaveat")
    public boolean failIfMajorPerformanceCaveat = false;


}

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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="CanvasPath", isNative = true)
public class CanvasPath{
    @JsMethod(name = "arc")
    public native void arc(float x, float y, float radius, float startAngle, float endAngle);
    
    @JsMethod(name = "arc")
    public native void arc(float x, float y, float radius, float startAngle, float endAngle, boolean anticlockwise);
    
    @JsMethod(name = "arcTo")
    public native void arcTo(float x1, float y1, float x2, float y2, float radius);
    
    @JsMethod(name = "bezierCurveTo")
    public native void bezierCurveTo(float cp1x, float cp1y, float cp2x, float cp2y, float x, float y);
    
    @JsMethod(name = "closePath")
    public native void closePath();
    
    @JsMethod(name = "ellipse")
    public native void ellipse(float x, float y, float radiusX, float radiusY, float rotation, float startAngle, float endAngle);
    
    @JsMethod(name = "ellipse")
    public native void ellipse(float x, float y, float radiusX, float radiusY, float rotation, float startAngle, float endAngle, boolean anticlockwise);
    
    @JsMethod(name = "lineTo")
    public native void lineTo(float x, float y);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(float x, float y);
    
    @JsMethod(name = "quadraticCurveTo")
    public native void quadraticCurveTo(float cpx, float cpy, float x, float y);
    
    @JsMethod(name = "rect")
    public native void rect(float x, float y, float width, float height);
    
}

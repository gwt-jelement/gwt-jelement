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
import gwt.jelement.svg.SVGMatrix;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Path2D", isNative = true)
public class Path2D extends JsObject{
    @JsConstructor
    public Path2D(){
        super();
    }
    
    @JsConstructor
    public Path2D(Path2D path){
        super();
    }
    
    @JsConstructor
    public Path2D(String text){
        super();
    }
    
    @JsMethod(name = "addPath")
    public native void addPath(Path2D path);
    
    @JsMethod(name = "addPath")
    public native void addPath(Path2D path, SVGMatrix transform);
    
    @JsMethod(name = "arc")
    public native void arc(double x, double y, double radius, double startAngle, double endAngle);
    
    @JsMethod(name = "arc")
    public native void arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);
    
    @JsMethod(name = "arcTo")
    public native void arcTo(double x1, double y1, double x2, double y2, double radius);
    
    @JsMethod(name = "bezierCurveTo")
    public native void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);
    
    @JsMethod(name = "closePath")
    public native void closePath();
    
    @JsMethod(name = "ellipse")
    public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle);
    
    @JsMethod(name = "ellipse")
    public native void ellipse(double x, double y, double radiusX, double radiusY, double rotation, double startAngle, double endAngle, boolean anticlockwise);
    
    @JsMethod(name = "lineTo")
    public native void lineTo(double x, double y);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(double x, double y);
    
    @JsMethod(name = "quadraticCurveTo")
    public native void quadraticCurveTo(double cpx, double cpy, double x, double y);
    
    @JsMethod(name = "rect")
    public native void rect(double x, double y, double width, double height);
    
}

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
package gwt.jelement.svg;

import gwt.jelement.svg.SVGMatrix;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGMatrix{
    
    @JsProperty(name="a")
    public double a;
    
    @JsProperty(name="b")
    public double b;
    
    @JsProperty(name="c")
    public double c;
    
    @JsProperty(name="d")
    public double d;
    
    @JsProperty(name="e")
    public double e;
    
    @JsProperty(name="f")
    public double f;
    
    @JsMethod(name = "flipX")
    public native SVGMatrix flipX();
    
    @JsMethod(name = "flipY")
    public native SVGMatrix flipY();
    
    @JsMethod(name = "inverse")
    public native SVGMatrix inverse();
    
    @JsMethod(name = "multiply")
    public native SVGMatrix multiply(SVGMatrix secondMatrix);
    
    @JsMethod(name = "rotate")
    public native SVGMatrix rotate(float angle);
    
    @JsMethod(name = "rotateFromVector")
    public native SVGMatrix rotateFromVector(float x, float y);
    
    @JsMethod(name = "scale")
    public native SVGMatrix scale(float scaleFactor);
    
    @JsMethod(name = "scaleNonUniform")
    public native SVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY);
    
    @JsMethod(name = "skewX")
    public native SVGMatrix skewX(float angle);
    
    @JsMethod(name = "skewY")
    public native SVGMatrix skewY(float angle);
    
    @JsMethod(name = "translate")
    public native SVGMatrix translate(float x, float y);
    
}

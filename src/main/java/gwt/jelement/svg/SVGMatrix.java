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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGMatrix", isNative = true)
public class SVGMatrix extends IsObject{
    @JsProperty(name="a")
    public native double getA();
    
    @JsProperty(name="a")
    public native void setA(double a);
    
    @JsProperty(name="b")
    public native double getB();
    
    @JsProperty(name="b")
    public native void setB(double b);
    
    @JsProperty(name="c")
    public native double getC();
    
    @JsProperty(name="c")
    public native void setC(double c);
    
    @JsProperty(name="d")
    public native double getD();
    
    @JsProperty(name="d")
    public native void setD(double d);
    
    @JsProperty(name="e")
    public native double getE();
    
    @JsProperty(name="e")
    public native void setE(double e);
    
    @JsProperty(name="f")
    public native double getF();
    
    @JsProperty(name="f")
    public native void setF(double f);
    
    @JsMethod(name = "flipX")
    public native SVGMatrix flipX();
    
    @JsMethod(name = "flipY")
    public native SVGMatrix flipY();
    
    @JsMethod(name = "inverse")
    public native SVGMatrix inverse();
    
    @JsMethod(name = "multiply")
    public native SVGMatrix multiply(SVGMatrix secondMatrix);
    
    @JsMethod(name = "rotate")
    public native SVGMatrix rotate(double angle);
    
    @JsMethod(name = "rotateFromVector")
    public native SVGMatrix rotateFromVector(double x, double y);
    
    @JsMethod(name = "scale")
    public native SVGMatrix scale(double scaleFactor);
    
    @JsMethod(name = "scaleNonUniform")
    public native SVGMatrix scaleNonUniform(double scaleFactorX, double scaleFactorY);
    
    @JsMethod(name = "skewX")
    public native SVGMatrix skewX(double angle);
    
    @JsMethod(name = "skewY")
    public native SVGMatrix skewY(double angle);
    
    @JsMethod(name = "translate")
    public native SVGMatrix translate(double x, double y);
    
}

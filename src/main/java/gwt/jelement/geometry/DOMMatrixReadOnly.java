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
package gwt.jelement.geometry;

import gwt.jelement.dom.Float32Array;
import gwt.jelement.dom.Float64Array;
import gwt.jelement.geometry.DOMMatrix;
import gwt.jelement.geometry.DOMMatrixInit;
import gwt.jelement.geometry.DOMMatrixReadOnly;
import gwt.jelement.geometry.DOMPoint;
import gwt.jelement.geometry.DOMPointInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class DOMMatrixReadOnly{
    
    @JsConstructor
    public DOMMatrixReadOnly(){
    }
    
    @JsConstructor
    public DOMMatrixReadOnly(String init){
    }
    
    @JsConstructor
    public DOMMatrixReadOnly(double[] init){
    }
    
    @JsProperty(name="a")
    public native double getA();
    
    @JsProperty(name="b")
    public native double getB();
    
    @JsProperty(name="c")
    public native double getC();
    
    @JsProperty(name="d")
    public native double getD();
    
    @JsProperty(name="e")
    public native double getE();
    
    @JsProperty(name="f")
    public native double getF();
    
    @JsProperty(name="m11")
    public native double getM11();
    
    @JsProperty(name="m12")
    public native double getM12();
    
    @JsProperty(name="m13")
    public native double getM13();
    
    @JsProperty(name="m14")
    public native double getM14();
    
    @JsProperty(name="m21")
    public native double getM21();
    
    @JsProperty(name="m22")
    public native double getM22();
    
    @JsProperty(name="m23")
    public native double getM23();
    
    @JsProperty(name="m24")
    public native double getM24();
    
    @JsProperty(name="m31")
    public native double getM31();
    
    @JsProperty(name="m32")
    public native double getM32();
    
    @JsProperty(name="m33")
    public native double getM33();
    
    @JsProperty(name="m34")
    public native double getM34();
    
    @JsProperty(name="m41")
    public native double getM41();
    
    @JsProperty(name="m42")
    public native double getM42();
    
    @JsProperty(name="m43")
    public native double getM43();
    
    @JsProperty(name="m44")
    public native double getM44();
    
    @JsProperty(name="is2D")
    public native boolean getIs2D();
    
    @JsProperty(name="isIdentity")
    public native boolean getIsIdentity();
    
    @JsMethod(name = "flipX")
    public native DOMMatrix flipX();
    
    @JsMethod(name = "flipY")
    public native DOMMatrix flipY();
    
    @JsMethod(name = "fromFloat32Array")
    public native DOMMatrixReadOnly fromFloat32Array(Float32Array array32);
    
    @JsMethod(name = "fromFloat64Array")
    public native DOMMatrixReadOnly fromFloat64Array(Float64Array array64);
    
    @JsMethod(name = "fromMatrix")
    public native DOMMatrixReadOnly fromMatrix();
    
    @JsMethod(name = "fromMatrix")
    public native DOMMatrixReadOnly fromMatrix(DOMMatrixInit other);
    
    @JsMethod(name = "inverse")
    public native DOMMatrix inverse();
    
    @JsMethod(name = "multiply")
    public native DOMMatrix multiply();
    
    @JsMethod(name = "multiply")
    public native DOMMatrix multiply(DOMMatrixInit other);
    
    @JsMethod(name = "rotate")
    public native DOMMatrix rotate();
    
    @JsMethod(name = "rotate")
    public native DOMMatrix rotate(double rotX);
    
    @JsMethod(name = "rotate")
    public native DOMMatrix rotate(double rotX, double rotY);
    
    @JsMethod(name = "rotate")
    public native DOMMatrix rotate(double rotX, double rotY, double rotZ);
    
    @JsMethod(name = "rotateAxisAngle")
    public native DOMMatrix rotateAxisAngle();
    
    @JsMethod(name = "rotateAxisAngle")
    public native DOMMatrix rotateAxisAngle(double x);
    
    @JsMethod(name = "rotateAxisAngle")
    public native DOMMatrix rotateAxisAngle(double x, double y);
    
    @JsMethod(name = "rotateAxisAngle")
    public native DOMMatrix rotateAxisAngle(double x, double y, double z);
    
    @JsMethod(name = "rotateAxisAngle")
    public native DOMMatrix rotateAxisAngle(double x, double y, double z, double angle);
    
    @JsMethod(name = "rotateFromVector")
    public native DOMMatrix rotateFromVector();
    
    @JsMethod(name = "rotateFromVector")
    public native DOMMatrix rotateFromVector(double x);
    
    @JsMethod(name = "rotateFromVector")
    public native DOMMatrix rotateFromVector(double x, double y);
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale();
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale(double scaleX);
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale(double scaleX, double scaleY);
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ);
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX);
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX, double originY);
    
    @JsMethod(name = "scale")
    public native DOMMatrix scale(double scaleX, double scaleY, double scaleZ, double originX, double originY, double originZ);
    
    @JsMethod(name = "scale3d")
    public native DOMMatrix scale3d();
    
    @JsMethod(name = "scale3d")
    public native DOMMatrix scale3d(double scale);
    
    @JsMethod(name = "scale3d")
    public native DOMMatrix scale3d(double scale, double originX);
    
    @JsMethod(name = "scale3d")
    public native DOMMatrix scale3d(double scale, double originX, double originY);
    
    @JsMethod(name = "scale3d")
    public native DOMMatrix scale3d(double scale, double originX, double originY, double originZ);
    
    @JsMethod(name = "skewX")
    public native DOMMatrix skewX();
    
    @JsMethod(name = "skewX")
    public native DOMMatrix skewX(double sx);
    
    @JsMethod(name = "skewY")
    public native DOMMatrix skewY();
    
    @JsMethod(name = "skewY")
    public native DOMMatrix skewY(double sy);
    
    @JsMethod(name = "toFloat32Array")
    public native Float32Array toFloat32Array();
    
    @JsMethod(name = "toFloat64Array")
    public native Float64Array toFloat64Array();
    
    @JsMethod(name = "toJSON")
    public native Any toJSON();
    
    @JsMethod(name = "toString")
    public native String toString();
    
    @JsMethod(name = "transformPoint")
    public native DOMPoint transformPoint();
    
    @JsMethod(name = "transformPoint")
    public native DOMPoint transformPoint(DOMPointInit point);
    
    @JsMethod(name = "translate")
    public native DOMMatrix translate();
    
    @JsMethod(name = "translate")
    public native DOMMatrix translate(double tx);
    
    @JsMethod(name = "translate")
    public native DOMMatrix translate(double tx, double ty);
    
    @JsMethod(name = "translate")
    public native DOMMatrix translate(double tx, double ty, double tz);
    
}

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
package gwt.jelement.core;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Math", isNative = true)
public class Math extends IsObject{
    public static double E; /* 2.718281828459045 */
    public static double LN2; /* 0.6931471805599453 */
    public static double LN10; /* 2.302585092994046 */
    public static double LOG2E; /* 1.4426950408889634 */
    public static double LOG10E; /* 0.4342944819032518 */
    public static double PI; /* 3.141592653589793 */
    public static double SQRT1_2; /* 0.7071067811865476 */
    public static double SQRT2; /* 1.4142135623730951 */
    
    @JsMethod(name = "abs")
    public static native double abs(double x);
    
    @JsMethod(name = "acos")
    public static native double acos(double x);
    
    @JsMethod(name = "acosh")
    public static native double acosh(double x);
    
    @JsMethod(name = "asin")
    public static native double asin(double x);
    
    @JsMethod(name = "asinh")
    public static native double asinh(double x);
    
    @JsMethod(name = "atan")
    public static native double atan(double x);
    
    @JsMethod(name = "atan2")
    public static native double atan2(double y, double x);
    
    @JsMethod(name = "atanh")
    public static native double atanh(double x);
    
    @JsMethod(name = "cbrt")
    public static native double cbrt(double x);
    
    @JsMethod(name = "ceil")
    public static native double ceil(double x);
    
    @JsMethod(name = "clz32")
    public static native double clz32(double x);
    
    @JsMethod(name = "cos")
    public static native double cos(double x);
    
    @JsMethod(name = "cosh")
    public static native double cosh(double x);
    
    @JsMethod(name = "exp")
    public static native double exp(double x);
    
    @JsMethod(name = "expm1")
    public static native double expm1(double x);
    
    @JsMethod(name = "floor")
    public static native double floor(double x);
    
    @JsMethod(name = "fround")
    public static native double fround(double x);
    
    @JsMethod(name = "hypot")
    public static native double hypot(double... x);
    
    @JsMethod(name = "imul")
    public static native double imul(double x, double y);
    
    @JsMethod(name = "log")
    public static native double log(double x);
    
    @JsMethod(name = "log10")
    public static native double log10(double x);
    
    @JsMethod(name = "log1p")
    public static native double log1p(double x);
    
    @JsMethod(name = "log2")
    public static native double log2(double x);
    
    @JsMethod(name = "max")
    public static native double max(double... x);
    
    @JsMethod(name = "min")
    public static native double min(double... x);
    
    @JsMethod(name = "pow")
    public static native double pow(double x, double y);
    
    @JsMethod(name = "random")
    public static native double random();
    
    @JsMethod(name = "round")
    public static native double round(double x);
    
    @JsMethod(name = "sign")
    public static native double sign(double x);
    
    @JsMethod(name = "sin")
    public static native double sin(double x);
    
    @JsMethod(name = "sinh")
    public static native double sinh(double x);
    
    @JsMethod(name = "sqrt")
    public static native double sqrt(double x);
    
    @JsMethod(name = "tan")
    public static native double tan(double x);
    
    @JsMethod(name = "tanh")
    public static native double tanh(double x);
    
    @JsMethod(name = "trunc")
    public static native double trunc(double x);
    
}

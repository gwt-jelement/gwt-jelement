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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGFECompositeElement", isNative = true)
public class SVGFECompositeElement extends SVGElement {
    public static short SVG_FECOMPOSITE_OPERATOR_UNKNOWN; /* 0 */
    public static short SVG_FECOMPOSITE_OPERATOR_OVER; /* 1 */
    public static short SVG_FECOMPOSITE_OPERATOR_IN; /* 2 */
    public static short SVG_FECOMPOSITE_OPERATOR_OUT; /* 3 */
    public static short SVG_FECOMPOSITE_OPERATOR_ATOP; /* 4 */
    public static short SVG_FECOMPOSITE_OPERATOR_XOR; /* 5 */
    public static short SVG_FECOMPOSITE_OPERATOR_ARITHMETIC; /* 6 */
    
    @JsProperty(name="in2")
    public native SVGAnimatedString getIn2();
    
    @JsProperty(name="in1")
    public native SVGAnimatedString getIn1();
    
    @JsProperty(name="operator")
    public native SVGAnimatedEnumeration getOperator();
    
    @JsProperty(name="k1")
    public native SVGAnimatedNumber getK1();
    
    @JsProperty(name="k2")
    public native SVGAnimatedNumber getK2();
    
    @JsProperty(name="k3")
    public native SVGAnimatedNumber getK3();
    
    @JsProperty(name="k4")
    public native SVGAnimatedNumber getK4();
    
    @JsProperty(name="x")
    public native SVGAnimatedLength getX();
    
    @JsProperty(name="y")
    public native SVGAnimatedLength getY();
    
    @JsProperty(name="width")
    public native SVGAnimatedLength getWidth();
    
    @JsProperty(name="height")
    public native SVGAnimatedLength getHeight();
    
    @JsProperty(name="result")
    public native SVGAnimatedString getResult();
    
}

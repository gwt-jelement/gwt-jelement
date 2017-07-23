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

import gwt.jelement.svg.SVGAnimatedEnumeration;
import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGAnimatedNumber;
import gwt.jelement.svg.SVGAnimatedString;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGFECompositeElement extends SVGElement{
    public static int SVG_FECOMPOSITE_OPERATOR_UNKNOWN;
    public static int SVG_FECOMPOSITE_OPERATOR_OVER;
    public static int SVG_FECOMPOSITE_OPERATOR_IN;
    public static int SVG_FECOMPOSITE_OPERATOR_OUT;
    public static int SVG_FECOMPOSITE_OPERATOR_ATOP;
    public static int SVG_FECOMPOSITE_OPERATOR_XOR;
    public static int SVG_FECOMPOSITE_OPERATOR_ARITHMETIC;
    
    
    @JsConstructor
    public SVGFECompositeElement(){
        super();
    }
    
    @JsProperty(name="in2")
    public SVGAnimatedString in2;
    
    @JsProperty(name="in1")
    public SVGAnimatedString in1;
    
    @JsProperty(name="operator")
    public SVGAnimatedEnumeration operator;
    
    @JsProperty(name="k1")
    public SVGAnimatedNumber k1;
    
    @JsProperty(name="k2")
    public SVGAnimatedNumber k2;
    
    @JsProperty(name="k3")
    public SVGAnimatedNumber k3;
    
    @JsProperty(name="k4")
    public SVGAnimatedNumber k4;
    
    @JsProperty(name="x")
    public SVGAnimatedLength x;
    
    @JsProperty(name="y")
    public SVGAnimatedLength y;
    
    @JsProperty(name="width")
    public SVGAnimatedLength width;
    
    @JsProperty(name="height")
    public SVGAnimatedLength height;
    
    @JsProperty(name="result")
    public SVGAnimatedString result;
    
    
}

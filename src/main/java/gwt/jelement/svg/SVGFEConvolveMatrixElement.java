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

import gwt.jelement.svg.SVGAnimatedBoolean;
import gwt.jelement.svg.SVGAnimatedEnumeration;
import gwt.jelement.svg.SVGAnimatedInteger;
import gwt.jelement.svg.SVGAnimatedNumber;
import gwt.jelement.svg.SVGAnimatedNumberList;
import gwt.jelement.svg.SVGAnimatedString;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGFEConvolveMatrixElement extends SVGElement{
    public static int SVG_EDGEMODE_UNKNOWN;
    public static int SVG_EDGEMODE_DUPLICATE;
    public static int SVG_EDGEMODE_WRAP;
    public static int SVG_EDGEMODE_NONE;
    
    
    @JsConstructor
    public SVGFEConvolveMatrixElement(){
        super();
    }
    
    @JsProperty(name="in1")
    public SVGAnimatedString in1;
    
    @JsProperty(name="orderX")
    public SVGAnimatedInteger orderX;
    
    @JsProperty(name="orderY")
    public SVGAnimatedInteger orderY;
    
    @JsProperty(name="kernelMatrix")
    public SVGAnimatedNumberList kernelMatrix;
    
    @JsProperty(name="divisor")
    public SVGAnimatedNumber divisor;
    
    @JsProperty(name="bias")
    public SVGAnimatedNumber bias;
    
    @JsProperty(name="targetX")
    public SVGAnimatedInteger targetX;
    
    @JsProperty(name="targetY")
    public SVGAnimatedInteger targetY;
    
    @JsProperty(name="edgeMode")
    public SVGAnimatedEnumeration edgeMode;
    
    @JsProperty(name="kernelUnitLengthX")
    public SVGAnimatedNumber kernelUnitLengthX;
    
    @JsProperty(name="kernelUnitLengthY")
    public SVGAnimatedNumber kernelUnitLengthY;
    
    @JsProperty(name="preserveAlpha")
    public SVGAnimatedBoolean preserveAlpha;
    
    
}

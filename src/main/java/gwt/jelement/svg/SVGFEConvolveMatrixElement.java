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
import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGAnimatedNumber;
import gwt.jelement.svg.SVGAnimatedNumberList;
import gwt.jelement.svg.SVGAnimatedString;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
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
    public native SVGAnimatedString getIn1();
    
    @JsProperty(name="orderX")
    public native SVGAnimatedInteger getOrderX();
    
    @JsProperty(name="orderY")
    public native SVGAnimatedInteger getOrderY();
    
    @JsProperty(name="kernelMatrix")
    public native SVGAnimatedNumberList getKernelMatrix();
    
    @JsProperty(name="divisor")
    public native SVGAnimatedNumber getDivisor();
    
    @JsProperty(name="bias")
    public native SVGAnimatedNumber getBias();
    
    @JsProperty(name="targetX")
    public native SVGAnimatedInteger getTargetX();
    
    @JsProperty(name="targetY")
    public native SVGAnimatedInteger getTargetY();
    
    @JsProperty(name="edgeMode")
    public native SVGAnimatedEnumeration getEdgeMode();
    
    @JsProperty(name="kernelUnitLengthX")
    public native SVGAnimatedNumber getKernelUnitLengthX();
    
    @JsProperty(name="kernelUnitLengthY")
    public native SVGAnimatedNumber getKernelUnitLengthY();
    
    @JsProperty(name="preserveAlpha")
    public native SVGAnimatedBoolean getPreserveAlpha();
    
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

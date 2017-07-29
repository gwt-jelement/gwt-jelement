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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGComponentTransferFunctionElement", isNative = true)
public class SVGComponentTransferFunctionElement extends SVGElement{
    public static short SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN;
    public static short SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY;
    public static short SVG_FECOMPONENTTRANSFER_TYPE_TABLE;
    public static short SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE;
    public static short SVG_FECOMPONENTTRANSFER_TYPE_LINEAR;
    public static short SVG_FECOMPONENTTRANSFER_TYPE_GAMMA;
    
    @JsConstructor
    public SVGComponentTransferFunctionElement(){
        super();
    }
    
    @JsProperty(name="type")
    public native SVGAnimatedEnumeration getType();
    
    @JsProperty(name="tableValues")
    public native SVGAnimatedNumberList getTableValues();
    
    @JsProperty(name="slope")
    public native SVGAnimatedNumber getSlope();
    
    @JsProperty(name="intercept")
    public native SVGAnimatedNumber getIntercept();
    
    @JsProperty(name="amplitude")
    public native SVGAnimatedNumber getAmplitude();
    
    @JsProperty(name="exponent")
    public native SVGAnimatedNumber getExponent();
    
    @JsProperty(name="offset")
    public native SVGAnimatedNumber getOffset();
    
}

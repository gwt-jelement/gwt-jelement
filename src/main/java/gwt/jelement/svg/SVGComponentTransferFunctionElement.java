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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SVGComponentTransferFunctionElement", isNative = true)
public class SVGComponentTransferFunctionElement extends SVGElement {
    public static short SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN; /* 0 */
    public static short SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY; /* 1 */
    public static short SVG_FECOMPONENTTRANSFER_TYPE_TABLE; /* 2 */
    public static short SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE; /* 3 */
    public static short SVG_FECOMPONENTTRANSFER_TYPE_LINEAR; /* 4 */
    public static short SVG_FECOMPONENTTRANSFER_TYPE_GAMMA; /* 5 */
    
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

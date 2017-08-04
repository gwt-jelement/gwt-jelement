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

@JsType(namespace = JsPackage.GLOBAL, name="SVGFEBlendElement", isNative = true)
public class SVGFEBlendElement extends SVGElement{
    public static short SVG_FEBLEND_MODE_UNKNOWN; /* 0 */
    public static short SVG_FEBLEND_MODE_NORMAL; /* 1 */
    public static short SVG_FEBLEND_MODE_MULTIPLY; /* 2 */
    public static short SVG_FEBLEND_MODE_SCREEN; /* 3 */
    public static short SVG_FEBLEND_MODE_DARKEN; /* 4 */
    public static short SVG_FEBLEND_MODE_LIGHTEN; /* 5 */
    
    @JsProperty(name="in1")
    public native SVGAnimatedString getIn1();
    
    @JsProperty(name="in2")
    public native SVGAnimatedString getIn2();
    
    @JsProperty(name="mode")
    public native SVGAnimatedEnumeration getMode();
    
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

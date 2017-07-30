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

@JsType(namespace = JsPackage.GLOBAL, name="SVGFETurbulenceElement", isNative = true)
public class SVGFETurbulenceElement extends SVGElement{
    public static short SVG_TURBULENCE_TYPE_UNKNOWN; /* 0 */
    public static short SVG_TURBULENCE_TYPE_FRACTALNOISE; /* 1 */
    public static short SVG_TURBULENCE_TYPE_TURBULENCE; /* 2 */
    public static short SVG_STITCHTYPE_UNKNOWN; /* 0 */
    public static short SVG_STITCHTYPE_STITCH; /* 1 */
    public static short SVG_STITCHTYPE_NOSTITCH; /* 2 */
    
    @JsConstructor
    public SVGFETurbulenceElement(){
        super();
    }
    
    @JsProperty(name="baseFrequencyX")
    public native SVGAnimatedNumber getBaseFrequencyX();
    
    @JsProperty(name="baseFrequencyY")
    public native SVGAnimatedNumber getBaseFrequencyY();
    
    @JsProperty(name="numOctaves")
    public native SVGAnimatedInteger getNumOctaves();
    
    @JsProperty(name="seed")
    public native SVGAnimatedNumber getSeed();
    
    @JsProperty(name="stitchTiles")
    public native SVGAnimatedEnumeration getStitchTiles();
    
    @JsProperty(name="type")
    public native SVGAnimatedEnumeration getType();
    
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

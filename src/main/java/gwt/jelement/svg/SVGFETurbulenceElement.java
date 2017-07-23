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
import gwt.jelement.svg.SVGAnimatedInteger;
import gwt.jelement.svg.SVGAnimatedNumber;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGFETurbulenceElement extends SVGElement{
    public static int SVG_TURBULENCE_TYPE_UNKNOWN;
    public static int SVG_TURBULENCE_TYPE_FRACTALNOISE;
    public static int SVG_TURBULENCE_TYPE_TURBULENCE;
    public static int SVG_STITCHTYPE_UNKNOWN;
    public static int SVG_STITCHTYPE_STITCH;
    public static int SVG_STITCHTYPE_NOSTITCH;
    
    
    @JsConstructor
    public SVGFETurbulenceElement(){
        super();
    }
    
    @JsProperty(name="baseFrequencyX")
    public SVGAnimatedNumber baseFrequencyX;
    
    @JsProperty(name="baseFrequencyY")
    public SVGAnimatedNumber baseFrequencyY;
    
    @JsProperty(name="numOctaves")
    public SVGAnimatedInteger numOctaves;
    
    @JsProperty(name="seed")
    public SVGAnimatedNumber seed;
    
    @JsProperty(name="stitchTiles")
    public SVGAnimatedEnumeration stitchTiles;
    
    @JsProperty(name="type")
    public SVGAnimatedEnumeration type;
    
    
}

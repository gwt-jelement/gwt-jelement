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

import gwt.jelement.svg.SVGAnimatedNumber;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGFESpotLightElement extends SVGElement{
    
    @JsConstructor
    public SVGFESpotLightElement(){
        super();
    }
    
    @JsProperty(name="x")
    public SVGAnimatedNumber x;
    
    @JsProperty(name="y")
    public SVGAnimatedNumber y;
    
    @JsProperty(name="z")
    public SVGAnimatedNumber z;
    
    @JsProperty(name="pointsAtX")
    public SVGAnimatedNumber pointsAtX;
    
    @JsProperty(name="pointsAtY")
    public SVGAnimatedNumber pointsAtY;
    
    @JsProperty(name="pointsAtZ")
    public SVGAnimatedNumber pointsAtZ;
    
    @JsProperty(name="specularExponent")
    public SVGAnimatedNumber specularExponent;
    
    @JsProperty(name="limitingConeAngle")
    public SVGAnimatedNumber limitingConeAngle;
    
    
}

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

import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGGradientElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGRadialGradientElement", isNative = true)
public class SVGRadialGradientElement extends SVGGradientElement{
    @JsConstructor
    public SVGRadialGradientElement(){
        super();
    }
    
    @JsProperty(name="cx")
    public native SVGAnimatedLength getCx();
    
    @JsProperty(name="cy")
    public native SVGAnimatedLength getCy();
    
    @JsProperty(name="r")
    public native SVGAnimatedLength getR();
    
    @JsProperty(name="fx")
    public native SVGAnimatedLength getFx();
    
    @JsProperty(name="fy")
    public native SVGAnimatedLength getFy();
    
    @JsProperty(name="fr")
    public native SVGAnimatedLength getFr();
    
}

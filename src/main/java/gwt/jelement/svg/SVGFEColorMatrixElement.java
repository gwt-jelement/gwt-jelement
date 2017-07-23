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
import gwt.jelement.svg.SVGAnimatedNumberList;
import gwt.jelement.svg.SVGAnimatedString;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGFEColorMatrixElement extends SVGElement{
    public static int SVG_FECOLORMATRIX_TYPE_UNKNOWN;
    public static int SVG_FECOLORMATRIX_TYPE_MATRIX;
    public static int SVG_FECOLORMATRIX_TYPE_SATURATE;
    public static int SVG_FECOLORMATRIX_TYPE_HUEROTATE;
    public static int SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA;
    
    
    @JsConstructor
    public SVGFEColorMatrixElement(){
        super();
    }
    
    @JsProperty(name="in1")
    public SVGAnimatedString in1;
    
    @JsProperty(name="type")
    public SVGAnimatedEnumeration type;
    
    @JsProperty(name="values")
    public SVGAnimatedNumberList values;
    
    
}

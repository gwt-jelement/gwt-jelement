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

import gwt.jelement.css.CSSStyleDeclaration;
import gwt.jelement.dom.DOMStringMap;
import gwt.jelement.dom.Element;
import gwt.jelement.svg.SVGElement;
import gwt.jelement.svg.SVGSVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGElement extends Element{
    
    @JsConstructor
    public SVGElement(){
        super();
    }
    
    @JsProperty(name="dataset")
    public DOMStringMap dataset;
    
    @JsProperty(name="style")
    public CSSStyleDeclaration style;
    
    @JsProperty(name="ownerSVGElement")
    public SVGSVGElement ownerSVGElement;
    
    @JsProperty(name="viewportElement")
    public SVGElement viewportElement;
    
    @JsProperty(name="tabIndex")
    public double tabIndex;
    
    @JsMethod(name = "blur")
    public native void blur();
    
    @JsMethod(name = "focus")
    public native void focus();
    
}

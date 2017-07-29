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

@JsType(namespace = JsPackage.GLOBAL, name="SVGTextPathElement", isNative = true)
public class SVGTextPathElement extends SVGTextContentElement{
    public static short TEXTPATH_METHODTYPE_UNKNOWN;
    public static short TEXTPATH_METHODTYPE_ALIGN;
    public static short TEXTPATH_METHODTYPE_STRETCH;
    public static short TEXTPATH_SPACINGTYPE_UNKNOWN;
    public static short TEXTPATH_SPACINGTYPE_AUTO;
    public static short TEXTPATH_SPACINGTYPE_EXACT;
    
    @JsConstructor
    public SVGTextPathElement(){
        super();
    }
    
    @JsProperty(name="startOffset")
    public native SVGAnimatedLength getStartOffset();
    
    @JsProperty(name="method")
    public native SVGAnimatedEnumeration getMethod();
    
    @JsProperty(name="spacing")
    public native SVGAnimatedEnumeration getSpacing();
    
    @JsProperty(name="href")
    public native SVGAnimatedString getHref();
    
}

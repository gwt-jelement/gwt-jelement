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

import gwt.jelement.svg.SVGMatrix;
import gwt.jelement.svg.SVGTransform;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGTransformList{
    
    @JsProperty(name="length")
    public double length;
    
    @JsProperty(name="numberOfItems")
    public double numberOfItems;
    
    @JsMethod(name = "appendItem")
    public native SVGTransform appendItem(SVGTransform newItem);
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "consolidate")
    public native SVGTransform consolidate();
    
    @JsMethod(name = "createSVGTransformFromMatrix")
    public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    
    @JsMethod(name = "initialize")
    public native SVGTransform initialize(SVGTransform newItem);
    
    @JsMethod(name = "insertItemBefore")
    public native SVGTransform insertItemBefore(SVGTransform newItem, double index);
    
    @JsMethod(name = "removeItem")
    public native SVGTransform removeItem(double index);
    
    @JsMethod(name = "replaceItem")
    public native SVGTransform replaceItem(SVGTransform newItem, double index);
    
}

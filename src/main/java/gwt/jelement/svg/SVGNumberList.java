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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGNumberList", isNative = true)
public class SVGNumberList extends JsObject{
    @JsConstructor
    public SVGNumberList(){
        super();
    }
    
    @JsProperty(name="numberOfItems")
    public native double getNumberOfItems();
    
    @JsMethod(name = "appendItem")
    public native SVGNumber appendItem(SVGNumber newItem);
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "initialize")
    public native SVGNumber initialize(SVGNumber newItem);
    
    @JsMethod(name = "insertItemBefore")
    public native SVGNumber insertItemBefore(SVGNumber newItem, double index);
    
    @JsMethod(name = "removeItem")
    public native SVGNumber removeItem(double index);
    
    @JsMethod(name = "replaceItem")
    public native SVGNumber replaceItem(SVGNumber newItem, double index);
    
}

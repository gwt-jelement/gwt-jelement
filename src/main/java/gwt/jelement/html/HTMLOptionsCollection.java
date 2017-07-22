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
package gwt.jelement.html;

import gwt.jelement.html.HTMLCollection;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLOptGroupElement;
import gwt.jelement.html.HTMLOptionElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLOptionsCollection extends HTMLCollection{
    
    @JsConstructor
    public HTMLOptionsCollection(){
        super();
    }
    
    @JsProperty(name="length")
    public double length;
    
    @JsProperty(name="selectedIndex")
    public double selectedIndex;
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, double before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, double before);
    
    @JsMethod(name = "remove")
    public native void remove(double index);
    
}

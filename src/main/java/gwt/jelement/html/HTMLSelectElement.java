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

import gwt.jelement.dom.NodeList;
import gwt.jelement.html.HTMLCollection;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormElement;
import gwt.jelement.html.HTMLOptGroupElement;
import gwt.jelement.html.HTMLOptionElement;
import gwt.jelement.html.HTMLOptionsCollection;
import gwt.jelement.html.ValidityState;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLSelectElement extends HTMLElement{
    
    @JsConstructor
    public HTMLSelectElement(){
        super();
    }
    
    @JsProperty(name="autofocus")
    public boolean autofocus;
    
    @JsProperty(name="disabled")
    public boolean disabled;
    
    @JsProperty(name="form")
    public HTMLFormElement form;
    
    @JsProperty(name="multiple")
    public boolean multiple;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="required")
    public boolean required;
    
    @JsProperty(name="size")
    public double size;
    
    @JsProperty(name="type")
    public String type;
    
    @JsProperty(name="options")
    public HTMLOptionsCollection options;
    
    @JsProperty(name="length")
    public double length;
    
    @JsProperty(name="selectedOptions")
    public HTMLCollection selectedOptions;
    
    @JsProperty(name="selectedIndex")
    public double selectedIndex;
    
    @JsProperty(name="value")
    public String value;
    
    @JsProperty(name="willValidate")
    public boolean willValidate;
    
    @JsProperty(name="validity")
    public ValidityState validity;
    
    @JsProperty(name="validationMessage")
    public String validationMessage;
    
    @JsProperty(name="labels")
    public NodeList labels;
    
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
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "namedItem")
    public native HTMLOptionElement namedItem(String name);
    
    @JsMethod(name = "remove")
    public native void remove();
    
    @JsMethod(name = "remove")
    public native void remove(double index);
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
}

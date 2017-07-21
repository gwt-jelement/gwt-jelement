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
    
    @JsProperty(name="multiple")
    public boolean multiple;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="required")
    public boolean required;
    
    @JsProperty(name="size")
    public long size;
    
    @JsProperty(name="length")
    public long length;
    
    @JsProperty(name="selectedIndex")
    public long selectedIndex;
    
    @JsProperty(name="value")
    public String value;
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="options")
    public native HTMLOptionsCollection getOptions();
    
    @JsProperty(name="selectedOptions")
    public native HTMLCollection getSelectedOptions();
    
    @JsProperty(name="willValidate")
    public native boolean getWillValidate();
    
    @JsProperty(name="validity")
    public native ValidityState getValidity();
    
    @JsProperty(name="validationMessage")
    public native String getValidationMessage();
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, long before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, long before);
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "namedItem")
    public native HTMLOptionElement namedItem(String name);
    
    @JsMethod(name = "remove")
    public native void remove();
    
    @JsMethod(name = "remove")
    public native void remove(long index);
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
}

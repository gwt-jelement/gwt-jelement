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

import gwt.jelement.dom.DOMTokenList;
import gwt.jelement.dom.NodeList;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormElement;
import gwt.jelement.html.ValidityState;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLOutputElement extends HTMLElement{
    
    @JsConstructor
    public HTMLOutputElement(){
        super();
    }
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="defaultValue")
    public String defaultValue;
    
    @JsProperty(name="value")
    public String value;
    
    @JsProperty(name="htmlFor")
    public native DOMTokenList getHtmlFor();
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="willValidate")
    public native boolean getWillValidate();
    
    @JsProperty(name="validity")
    public native ValidityState getValidity();
    
    @JsProperty(name="validationMessage")
    public native String getValidationMessage();
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
}

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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLButtonElement", isNative = true)
public class HTMLButtonElement extends HTMLElement{
    @JsProperty(name="autofocus")
    public native boolean getAutofocus();
    
    @JsProperty(name="autofocus")
    public native void setAutofocus(boolean autofocus);
    
    @JsProperty(name="disabled")
    public native boolean getDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="formAction")
    public native String getFormAction();
    
    @JsProperty(name="formAction")
    public native void setFormAction(String formAction);
    
    @JsProperty(name="formEnctype")
    public native String getFormEnctype();
    
    @JsProperty(name="formEnctype")
    public native void setFormEnctype(String formEnctype);
    
    @JsProperty(name="formMethod")
    public native String getFormMethod();
    
    @JsProperty(name="formMethod")
    public native void setFormMethod(String formMethod);
    
    @JsProperty(name="formNoValidate")
    public native boolean getFormNoValidate();
    
    @JsProperty(name="formNoValidate")
    public native void setFormNoValidate(boolean formNoValidate);
    
    @JsProperty(name="formTarget")
    public native String getFormTarget();
    
    @JsProperty(name="formTarget")
    public native void setFormTarget(String formTarget);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
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

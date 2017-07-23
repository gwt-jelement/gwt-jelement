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

import gwt.jelement.dom.Document;
import gwt.jelement.frame.Window;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormElement;
import gwt.jelement.html.ValidityState;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLObjectElement extends HTMLElement{
    
    @JsConstructor
    public HTMLObjectElement(){
        super();
    }
    
    @JsProperty(name="data")
    public String data;
    
    @JsProperty(name="type")
    public String type;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="useMap")
    public String useMap;
    
    @JsProperty(name="form")
    public HTMLFormElement form;
    
    @JsProperty(name="width")
    public String width;
    
    @JsProperty(name="height")
    public String height;
    
    @JsProperty(name="contentDocument")
    public Document contentDocument;
    
    @JsProperty(name="contentWindow")
    public Window contentWindow;
    
    @JsProperty(name="willValidate")
    public boolean willValidate;
    
    @JsProperty(name="validity")
    public ValidityState validity;
    
    @JsProperty(name="validationMessage")
    public String validationMessage;
    
    @JsProperty(name="align")
    public String align;
    
    @JsProperty(name="archive")
    public String archive;
    
    @JsProperty(name="code")
    public String code;
    
    @JsProperty(name="declare")
    public boolean declare;
    
    @JsProperty(name="hspace")
    public double hspace;
    
    @JsProperty(name="standby")
    public String standby;
    
    @JsProperty(name="vspace")
    public double vspace;
    
    @JsProperty(name="codeBase")
    public String codeBase;
    
    @JsProperty(name="codeType")
    public String codeType;
    
    @JsProperty(name="border")
    public String border;
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "getSVGDocument")
    public native Document getSVGDocument();
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
}

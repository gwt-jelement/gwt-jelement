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

import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormControlsCollection;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLFormElement", isNative = true)
public class HTMLFormElement extends HTMLElement{
    @JsConstructor
    public HTMLFormElement(){
        super();
    }
    
    @JsProperty(name="acceptCharset")
    public native String getAcceptCharset();
    
    @JsProperty(name="acceptCharset")
    public native void setAcceptCharset(String acceptCharset);
    
    @JsProperty(name="action")
    public native String getAction();
    
    @JsProperty(name="action")
    public native void setAction(String action);
    
    @JsProperty(name="autocomplete")
    public native String getAutocomplete();
    
    @JsProperty(name="autocomplete")
    public native void setAutocomplete(String autocomplete);
    
    @JsProperty(name="enctype")
    public native String getEnctype();
    
    @JsProperty(name="enctype")
    public native void setEnctype(String enctype);
    
    @JsProperty(name="encoding")
    public native String getEncoding();
    
    @JsProperty(name="encoding")
    public native void setEncoding(String encoding);
    
    @JsProperty(name="method")
    public native String getMethod();
    
    @JsProperty(name="method")
    public native void setMethod(String method);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="noValidate")
    public native boolean getNoValidate();
    
    @JsProperty(name="noValidate")
    public native void setNoValidate(boolean noValidate);
    
    @JsProperty(name="target")
    public native String getTarget();
    
    @JsProperty(name="target")
    public native void setTarget(String target);
    
    @JsProperty(name="elements")
    public native HTMLFormControlsCollection getElements();
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "reset")
    public native void reset();
    
    @JsMethod(name = "submit")
    public native void submit();
    
}

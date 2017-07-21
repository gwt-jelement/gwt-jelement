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
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormElement;
import gwt.jelement.html.SelectionMode;
import gwt.jelement.html.ValidityState;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLTextAreaElement extends HTMLElement{
    
    @JsConstructor
    public HTMLTextAreaElement(){
        super();
    }
    
    @JsProperty(name="autofocus")
    public boolean autofocus;
    
    @JsProperty(name="cols")
    public long cols;
    
    @JsProperty(name="dirName")
    public String dirName;
    
    @JsProperty(name="disabled")
    public boolean disabled;
    
    @JsProperty(name="maxLength")
    public long maxLength;
    
    @JsProperty(name="minLength")
    public long minLength;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="placeholder")
    public String placeholder;
    
    @JsProperty(name="readOnly")
    public boolean readOnly;
    
    @JsProperty(name="required")
    public boolean required;
    
    @JsProperty(name="rows")
    public long rows;
    
    @JsProperty(name="wrap")
    public String wrap;
    
    @JsProperty(name="defaultValue")
    public String defaultValue;
    
    @JsProperty(name="value")
    public String value;
    
    @JsProperty(name="selectionStart")
    public long selectionStart;
    
    @JsProperty(name="selectionEnd")
    public long selectionEnd;
    
    @JsProperty(name="selectionDirection")
    public String selectionDirection;
    
    @JsProperty(name="autocapitalize")
    public String autocapitalize;
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="textLength")
    public native long getTextLength();
    
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
    
    @JsMethod(name = "select")
    public native void select();
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
    @JsMethod(name = "setRangeText")
    public native void setRangeText(String replacement);
    
    @JsMethod(name = "setRangeText")
    public native void setRangeText(String replacement, long start, long end);
    
    @JsOverlay
    public void setRangeText(String replacement, long start, long end, SelectionMode selectionMode){
        setRangeText(replacement, start, end, selectionMode.getInternalValue());
    }
    
    @JsMethod(name = "setRangeText")
    public native void setRangeText(String replacement, long start, long end, String selectionMode);
    
    @JsMethod(name = "setSelectionRange")
    public native void setSelectionRange(long start, long end);
    
    @JsMethod(name = "setSelectionRange")
    public native void setSelectionRange(long start, long end, String direction);
    
}

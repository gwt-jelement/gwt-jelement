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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLTextAreaElement", isNative = true)
public class HTMLTextAreaElement extends HTMLElement {
    @JsProperty(name="autofocus")
    public native boolean isAutofocus();
    
    @JsProperty(name="autofocus")
    public native void setAutofocus(boolean autofocus);
    
    @JsProperty(name="cols")
    public native double getCols();
    
    @JsProperty(name="cols")
    public native void setCols(double cols);
    
    @JsProperty(name="dirName")
    public native String getDirName();
    
    @JsProperty(name="dirName")
    public native void setDirName(String dirName);
    
    @JsProperty(name="disabled")
    public native boolean isDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="maxLength")
    public native double getMaxLength();
    
    @JsProperty(name="maxLength")
    public native void setMaxLength(double maxLength);
    
    @JsProperty(name="minLength")
    public native double getMinLength();
    
    @JsProperty(name="minLength")
    public native void setMinLength(double minLength);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="placeholder")
    public native String getPlaceholder();
    
    @JsProperty(name="placeholder")
    public native void setPlaceholder(String placeholder);
    
    @JsProperty(name="readOnly")
    public native boolean isReadOnly();
    
    @JsProperty(name="readOnly")
    public native void setReadOnly(boolean readOnly);
    
    @JsProperty(name="required")
    public native boolean isRequired();
    
    @JsProperty(name="required")
    public native void setRequired(boolean required);
    
    @JsProperty(name="rows")
    public native double getRows();
    
    @JsProperty(name="rows")
    public native void setRows(double rows);
    
    @JsProperty(name="wrap")
    public native String getWrap();
    
    @JsProperty(name="wrap")
    public native void setWrap(String wrap);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="defaultValue")
    public native String getDefaultValue();
    
    @JsProperty(name="defaultValue")
    public native void setDefaultValue(String defaultValue);
    
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
    @JsProperty(name="textLength")
    public native double getTextLength();
    
    @JsProperty(name="willValidate")
    public native boolean isWillValidate();
    
    @JsProperty(name="validity")
    public native ValidityState getValidity();
    
    @JsProperty(name="validationMessage")
    public native String getValidationMessage();
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
    @JsProperty(name="selectionStart")
    public native double getSelectionStart();
    
    @JsProperty(name="selectionStart")
    public native void setSelectionStart(double selectionStart);
    
    @JsProperty(name="selectionEnd")
    public native double getSelectionEnd();
    
    @JsProperty(name="selectionEnd")
    public native void setSelectionEnd(double selectionEnd);
    
    @JsProperty(name="selectionDirection")
    public native String getSelectionDirection();
    
    @JsProperty(name="selectionDirection")
    public native void setSelectionDirection(String selectionDirection);
    
    @JsProperty(name="autocapitalize")
    public native String getAutocapitalize();
    
    @JsProperty(name="autocapitalize")
    public native void setAutocapitalize(String autocapitalize);
    
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
    public native void setRangeText(String replacement, double start, double end);
    
    @JsOverlay
    public final void setRangeText(String replacement, double start, double end, SelectionMode selectionMode){
        setRangeText(replacement, start, end, selectionMode.getInternalValue());
    }
    
    @JsMethod(name = "setRangeText")
    public native void setRangeText(String replacement, double start, double end, String selectionMode);
    
    @JsMethod(name = "setSelectionRange")
    public native void setSelectionRange(double start, double end);
    
    @JsMethod(name = "setSelectionRange")
    public native void setSelectionRange(double start, double end, String direction);
    
}

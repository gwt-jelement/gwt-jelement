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
import gwt.jelement.fileapi.FileList;
import gwt.jelement.filesystem.Entry;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLFormElement;
import gwt.jelement.html.SelectionMode;
import gwt.jelement.html.ValidityState;
import java.util.Date;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLInputElement extends HTMLElement{
    
    @JsConstructor
    public HTMLInputElement(){
        super();
    }
    
    @JsProperty(name="accept")
    public String accept;
    
    @JsProperty(name="alt")
    public String alt;
    
    @JsProperty(name="autocomplete")
    public String autocomplete;
    
    @JsProperty(name="autofocus")
    public boolean autofocus;
    
    @JsProperty(name="defaultChecked")
    public boolean defaultChecked;
    
    @JsProperty(name="checked")
    public boolean checked;
    
    @JsProperty(name="dirName")
    public String dirName;
    
    @JsProperty(name="disabled")
    public boolean disabled;
    
    @JsProperty(name="files")
    public FileList files;
    
    @JsProperty(name="formAction")
    public String formAction;
    
    @JsProperty(name="formEnctype")
    public String formEnctype;
    
    @JsProperty(name="formMethod")
    public String formMethod;
    
    @JsProperty(name="formNoValidate")
    public boolean formNoValidate;
    
    @JsProperty(name="formTarget")
    public String formTarget;
    
    @JsProperty(name="height")
    public long height;
    
    @JsProperty(name="indeterminate")
    public boolean indeterminate;
    
    @JsProperty(name="max")
    public String max;
    
    @JsProperty(name="maxLength")
    public long maxLength;
    
    @JsProperty(name="min")
    public String min;
    
    @JsProperty(name="minLength")
    public long minLength;
    
    @JsProperty(name="multiple")
    public boolean multiple;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="pattern")
    public String pattern;
    
    @JsProperty(name="placeholder")
    public String placeholder;
    
    @JsProperty(name="readOnly")
    public boolean readOnly;
    
    @JsProperty(name="required")
    public boolean required;
    
    @JsProperty(name="size")
    public long size;
    
    @JsProperty(name="src")
    public String src;
    
    @JsProperty(name="step")
    public String step;
    
    @JsProperty(name="type")
    public String type;
    
    @JsProperty(name="defaultValue")
    public String defaultValue;
    
    @JsProperty(name="value")
    public String value;
    
    @JsProperty(name="valueAsDate")
    public Date valueAsDate;
    
    @JsProperty(name="valueAsNumber")
    public double valueAsNumber;
    
    @JsProperty(name="width")
    public long width;
    
    @JsProperty(name="selectionStart")
    public long selectionStart;
    
    @JsProperty(name="selectionEnd")
    public long selectionEnd;
    
    @JsProperty(name="selectionDirection")
    public String selectionDirection;
    
    @JsProperty(name="align")
    public String align;
    
    @JsProperty(name="useMap")
    public String useMap;
    
    @JsProperty(name="autocapitalize")
    public String autocapitalize;
    
    @JsProperty(name="capture")
    public String capture;
    
    @JsProperty(name="webkitdirectory")
    public boolean webkitdirectory;
    
    @JsProperty(name="incremental")
    public boolean incremental;
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="list")
    public native HTMLElement getList();
    
    @JsProperty(name="willValidate")
    public native boolean getWillValidate();
    
    @JsProperty(name="validity")
    public native ValidityState getValidity();
    
    @JsProperty(name="validationMessage")
    public native String getValidationMessage();
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
    @JsProperty(name="webkitEntries")
    public native Entry[] getWebkitEntries();
    
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
    
    @JsMethod(name = "stepDown")
    public native void stepDown();
    
    @JsMethod(name = "stepDown")
    public native void stepDown(long n);
    
    @JsMethod(name = "stepUp")
    public native void stepUp();
    
    @JsMethod(name = "stepUp")
    public native void stepUp(long n);
    
}

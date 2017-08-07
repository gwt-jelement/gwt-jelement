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

import gwt.jelement.core.Date;
import gwt.jelement.dom.NodeList;
import gwt.jelement.fileapi.FileList;
import gwt.jelement.filesystem.Entry;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLInputElement", isNative = true)
public class HTMLInputElement extends HTMLElement {
    @JsProperty(name="accept")
    public native String getAccept();
    
    @JsProperty(name="accept")
    public native void setAccept(String accept);
    
    @JsProperty(name="alt")
    public native String getAlt();
    
    @JsProperty(name="alt")
    public native void setAlt(String alt);
    
    @JsProperty(name="autocomplete")
    public native String getAutocomplete();
    
    @JsProperty(name="autocomplete")
    public native void setAutocomplete(String autocomplete);
    
    @JsProperty(name="autofocus")
    public native boolean getAutofocus();
    
    @JsProperty(name="autofocus")
    public native void setAutofocus(boolean autofocus);
    
    @JsProperty(name="defaultChecked")
    public native boolean getDefaultChecked();
    
    @JsProperty(name="defaultChecked")
    public native void setDefaultChecked(boolean defaultChecked);
    
    @JsProperty(name="checked")
    public native boolean getChecked();
    
    @JsProperty(name="checked")
    public native void setChecked(boolean checked);
    
    @JsProperty(name="dirName")
    public native String getDirName();
    
    @JsProperty(name="dirName")
    public native void setDirName(String dirName);
    
    @JsProperty(name="disabled")
    public native boolean getDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="files")
    public native FileList getFiles();
    
    @JsProperty(name="files")
    public native void setFiles(FileList files);
    
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
    
    @JsProperty(name="height")
    public native double getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(double height);
    
    @JsProperty(name="indeterminate")
    public native boolean getIndeterminate();
    
    @JsProperty(name="indeterminate")
    public native void setIndeterminate(boolean indeterminate);
    
    @JsProperty(name="list")
    public native HTMLElement getList();
    
    @JsProperty(name="max")
    public native String getMax();
    
    @JsProperty(name="max")
    public native void setMax(String max);
    
    @JsProperty(name="maxLength")
    public native double getMaxLength();
    
    @JsProperty(name="maxLength")
    public native void setMaxLength(double maxLength);
    
    @JsProperty(name="min")
    public native String getMin();
    
    @JsProperty(name="min")
    public native void setMin(String min);
    
    @JsProperty(name="minLength")
    public native double getMinLength();
    
    @JsProperty(name="minLength")
    public native void setMinLength(double minLength);
    
    @JsProperty(name="multiple")
    public native boolean getMultiple();
    
    @JsProperty(name="multiple")
    public native void setMultiple(boolean multiple);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="pattern")
    public native String getPattern();
    
    @JsProperty(name="pattern")
    public native void setPattern(String pattern);
    
    @JsProperty(name="placeholder")
    public native String getPlaceholder();
    
    @JsProperty(name="placeholder")
    public native void setPlaceholder(String placeholder);
    
    @JsProperty(name="readOnly")
    public native boolean getReadOnly();
    
    @JsProperty(name="readOnly")
    public native void setReadOnly(boolean readOnly);
    
    @JsProperty(name="required")
    public native boolean getRequired();
    
    @JsProperty(name="required")
    public native void setRequired(boolean required);
    
    @JsProperty(name="size")
    public native double getSize();
    
    @JsProperty(name="size")
    public native void setSize(double size);
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="step")
    public native String getStep();
    
    @JsProperty(name="step")
    public native void setStep(String step);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="defaultValue")
    public native String getDefaultValue();
    
    @JsProperty(name="defaultValue")
    public native void setDefaultValue(String defaultValue);
    
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
    @JsProperty(name="valueAsDate")
    public native Date getValueAsDate();
    
    @JsProperty(name="valueAsDate")
    public native void setValueAsDate(Date valueAsDate);
    
    @JsProperty(name="valueAsNumber")
    public native double getValueAsNumber();
    
    @JsProperty(name="valueAsNumber")
    public native void setValueAsNumber(double valueAsNumber);
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(double width);
    
    @JsProperty(name="willValidate")
    public native boolean getWillValidate();
    
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
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="useMap")
    public native String getUseMap();
    
    @JsProperty(name="useMap")
    public native void setUseMap(String useMap);
    
    @JsProperty(name="autocapitalize")
    public native String getAutocapitalize();
    
    @JsProperty(name="autocapitalize")
    public native void setAutocapitalize(String autocapitalize);
    
    @JsProperty(name="capture")
    public native String getCapture();
    
    @JsProperty(name="capture")
    public native void setCapture(String capture);
    
    @JsProperty(name="webkitdirectory")
    public native boolean getWebkitdirectory();
    
    @JsProperty(name="webkitdirectory")
    public native void setWebkitdirectory(boolean webkitdirectory);
    
    @JsProperty(name="incremental")
    public native boolean getIncremental();
    
    @JsProperty(name="incremental")
    public native void setIncremental(boolean incremental);
    
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
    
    @JsMethod(name = "stepDown")
    public native void stepDown();
    
    @JsMethod(name = "stepDown")
    public native void stepDown(double n);
    
    @JsMethod(name = "stepUp")
    public native void stepUp();
    
    @JsMethod(name = "stepUp")
    public native void stepUp(double n);
    
}

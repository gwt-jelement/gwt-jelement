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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLOptionElement", isNative = true)
public class HTMLOptionElement extends HTMLElement {
    @JsProperty(name="disabled")
    public native boolean isDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="label")
    public native void setLabel(String label);
    
    @JsProperty(name="defaultSelected")
    public native boolean isDefaultSelected();
    
    @JsProperty(name="defaultSelected")
    public native void setDefaultSelected(boolean defaultSelected);
    
    @JsProperty(name="selected")
    public native boolean isSelected();
    
    @JsProperty(name="selected")
    public native void setSelected(boolean selected);
    
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
    @JsProperty(name="text")
    public native String getText();
    
    @JsProperty(name="text")
    public native void setText(String text);
    
    @JsProperty(name="index")
    public native double getIndex();
    
}

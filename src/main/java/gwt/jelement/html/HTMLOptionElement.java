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
import gwt.jelement.html.HTMLFormElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLOptionElement extends HTMLElement{
    
    @JsConstructor
    public HTMLOptionElement(){
        super();
    }
    
    @JsProperty(name="disabled")
    public boolean disabled;
    
    @JsProperty(name="label")
    public String label;
    
    @JsProperty(name="defaultSelected")
    public boolean defaultSelected;
    
    @JsProperty(name="selected")
    public boolean selected;
    
    @JsProperty(name="value")
    public String value;
    
    @JsProperty(name="text")
    public String text;
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="index")
    public native long getIndex();
    
    
}

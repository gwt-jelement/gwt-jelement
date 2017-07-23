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

import gwt.jelement.html.HTMLCollection;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLTableCaptionElement;
import gwt.jelement.html.HTMLTableRowElement;
import gwt.jelement.html.HTMLTableSectionElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLTableElement extends HTMLElement{
    
    @JsConstructor
    public HTMLTableElement(){
        super();
    }
    
    @JsProperty(name="caption")
    public HTMLTableCaptionElement caption;
    
    @JsProperty(name="tHead")
    public HTMLTableSectionElement tHead;
    
    @JsProperty(name="tFoot")
    public HTMLTableSectionElement tFoot;
    
    @JsProperty(name="tBodies")
    public HTMLCollection tBodies;
    
    @JsProperty(name="rows")
    public HTMLCollection rows;
    
    @JsProperty(name="align")
    public String align;
    
    @JsProperty(name="border")
    public String border;
    
    @JsProperty(name="frame")
    public String frame;
    
    @JsProperty(name="rules")
    public String rules;
    
    @JsProperty(name="summary")
    public String summary;
    
    @JsProperty(name="width")
    public String width;
    
    @JsProperty(name="bgColor")
    public String bgColor;
    
    @JsProperty(name="cellPadding")
    public String cellPadding;
    
    @JsProperty(name="cellSpacing")
    public String cellSpacing;
    
    @JsMethod(name = "createCaption")
    public native HTMLTableCaptionElement createCaption();
    
    @JsMethod(name = "createTBody")
    public native HTMLTableSectionElement createTBody();
    
    @JsMethod(name = "createTFoot")
    public native HTMLTableSectionElement createTFoot();
    
    @JsMethod(name = "createTHead")
    public native HTMLTableSectionElement createTHead();
    
    @JsMethod(name = "deleteCaption")
    public native void deleteCaption();
    
    @JsMethod(name = "deleteRow")
    public native void deleteRow(double index);
    
    @JsMethod(name = "deleteTFoot")
    public native void deleteTFoot();
    
    @JsMethod(name = "deleteTHead")
    public native void deleteTHead();
    
    @JsMethod(name = "insertRow")
    public native HTMLTableRowElement insertRow();
    
    @JsMethod(name = "insertRow")
    public native HTMLTableRowElement insertRow(double index);
    
}

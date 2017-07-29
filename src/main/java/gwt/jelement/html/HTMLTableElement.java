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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLTableElement", isNative = true)
public class HTMLTableElement extends HTMLElement{
    @JsConstructor
    public HTMLTableElement(){
        super();
    }
    
    @JsProperty(name="caption")
    public native HTMLTableCaptionElement getCaption();
    
    @JsProperty(name="caption")
    public native void setCaption(HTMLTableCaptionElement caption);
    
    @JsProperty(name="tHead")
    public native HTMLTableSectionElement getTHead();
    
    @JsProperty(name="tHead")
    public native void setTHead(HTMLTableSectionElement tHead);
    
    @JsProperty(name="tFoot")
    public native HTMLTableSectionElement getTFoot();
    
    @JsProperty(name="tFoot")
    public native void setTFoot(HTMLTableSectionElement tFoot);
    
    @JsProperty(name="tBodies")
    public native HTMLCollection getTBodies();
    
    @JsProperty(name="rows")
    public native HTMLCollection getRows();
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="border")
    public native String getBorder();
    
    @JsProperty(name="border")
    public native void setBorder(String border);
    
    @JsProperty(name="frame")
    public native String getFrame();
    
    @JsProperty(name="frame")
    public native void setFrame(String frame);
    
    @JsProperty(name="rules")
    public native String getRules();
    
    @JsProperty(name="rules")
    public native void setRules(String rules);
    
    @JsProperty(name="summary")
    public native String getSummary();
    
    @JsProperty(name="summary")
    public native void setSummary(String summary);
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
    @JsProperty(name="bgColor")
    public native String getBgColor();
    
    @JsProperty(name="bgColor")
    public native void setBgColor(String bgColor);
    
    @JsProperty(name="cellPadding")
    public native String getCellPadding();
    
    @JsProperty(name="cellPadding")
    public native void setCellPadding(String cellPadding);
    
    @JsProperty(name="cellSpacing")
    public native String getCellSpacing();
    
    @JsProperty(name="cellSpacing")
    public native void setCellSpacing(String cellSpacing);
    
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

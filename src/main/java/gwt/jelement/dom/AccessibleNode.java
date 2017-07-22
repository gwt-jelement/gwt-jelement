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
package gwt.jelement.dom;

import gwt.jelement.dom.AccessibleNode;
import gwt.jelement.dom.AccessibleNodeList;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AccessibleNode{
    
    @JsProperty(name="activeDescendant")
    public AccessibleNode activeDescendant;
    
    @JsProperty(name="atomic")
    public boolean atomic;
    
    @JsProperty(name="autocomplete")
    public String autocomplete;
    
    @JsProperty(name="busy")
    public boolean busy;
    
    @JsProperty(name="checked")
    public String checked;
    
    @JsProperty(name="colCount")
    public double colCount;
    
    @JsProperty(name="colIndex")
    public double colIndex;
    
    @JsProperty(name="colSpan")
    public double colSpan;
    
    @JsProperty(name="controls")
    public AccessibleNodeList controls;
    
    @JsProperty(name="current")
    public String current;
    
    @JsProperty(name="describedBy")
    public AccessibleNodeList describedBy;
    
    @JsProperty(name="details")
    public AccessibleNode details;
    
    @JsProperty(name="disabled")
    public boolean disabled;
    
    @JsProperty(name="errorMessage")
    public AccessibleNode errorMessage;
    
    @JsProperty(name="expanded")
    public boolean expanded;
    
    @JsProperty(name="flowTo")
    public AccessibleNodeList flowTo;
    
    @JsProperty(name="hidden")
    public boolean hidden;
    
    @JsProperty(name="invalid")
    public String invalid;
    
    @JsProperty(name="keyShortcuts")
    public String keyShortcuts;
    
    @JsProperty(name="label")
    public String label;
    
    @JsProperty(name="labeledBy")
    public AccessibleNodeList labeledBy;
    
    @JsProperty(name="level")
    public double level;
    
    @JsProperty(name="live")
    public String live;
    
    @JsProperty(name="modal")
    public boolean modal;
    
    @JsProperty(name="multiline")
    public boolean multiline;
    
    @JsProperty(name="multiselectable")
    public boolean multiselectable;
    
    @JsProperty(name="orientation")
    public String orientation;
    
    @JsProperty(name="owns")
    public AccessibleNodeList owns;
    
    @JsProperty(name="placeholder")
    public String placeholder;
    
    @JsProperty(name="posInSet")
    public double posInSet;
    
    @JsProperty(name="pressed")
    public String pressed;
    
    @JsProperty(name="readOnly")
    public boolean readOnly;
    
    @JsProperty(name="relevant")
    public String relevant;
    
    @JsProperty(name="required")
    public boolean required;
    
    @JsProperty(name="role")
    public String role;
    
    @JsProperty(name="roleDescription")
    public String roleDescription;
    
    @JsProperty(name="rowCount")
    public double rowCount;
    
    @JsProperty(name="rowIndex")
    public double rowIndex;
    
    @JsProperty(name="rowSpan")
    public double rowSpan;
    
    @JsProperty(name="selected")
    public boolean selected;
    
    @JsProperty(name="setSize")
    public double setSize;
    
    @JsProperty(name="sort")
    public String sort;
    
    @JsProperty(name="valueMax")
    public double valueMax;
    
    @JsProperty(name="valueMin")
    public double valueMin;
    
    @JsProperty(name="valueNow")
    public double valueNow;
    
    @JsProperty(name="valueText")
    public String valueText;
    
    
}

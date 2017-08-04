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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AccessibleNode", isNative = true)
public class AccessibleNode extends IsObject{
    @JsProperty(name="activeDescendant")
    public native AccessibleNode getActiveDescendant();
    
    @JsProperty(name="activeDescendant")
    public native void setActiveDescendant(AccessibleNode activeDescendant);
    
    @JsProperty(name="atomic")
    public native boolean getAtomic();
    
    @JsProperty(name="atomic")
    public native void setAtomic(boolean atomic);
    
    @JsProperty(name="autocomplete")
    public native String getAutocomplete();
    
    @JsProperty(name="autocomplete")
    public native void setAutocomplete(String autocomplete);
    
    @JsProperty(name="busy")
    public native boolean getBusy();
    
    @JsProperty(name="busy")
    public native void setBusy(boolean busy);
    
    @JsProperty(name="checked")
    public native String getChecked();
    
    @JsProperty(name="checked")
    public native void setChecked(String checked);
    
    @JsProperty(name="colCount")
    public native double getColCount();
    
    @JsProperty(name="colCount")
    public native void setColCount(double colCount);
    
    @JsProperty(name="colIndex")
    public native double getColIndex();
    
    @JsProperty(name="colIndex")
    public native void setColIndex(double colIndex);
    
    @JsProperty(name="colSpan")
    public native double getColSpan();
    
    @JsProperty(name="colSpan")
    public native void setColSpan(double colSpan);
    
    @JsProperty(name="controls")
    public native AccessibleNodeList getControls();
    
    @JsProperty(name="controls")
    public native void setControls(AccessibleNodeList controls);
    
    @JsProperty(name="current")
    public native String getCurrent();
    
    @JsProperty(name="current")
    public native void setCurrent(String current);
    
    @JsProperty(name="describedBy")
    public native AccessibleNodeList getDescribedBy();
    
    @JsProperty(name="describedBy")
    public native void setDescribedBy(AccessibleNodeList describedBy);
    
    @JsProperty(name="details")
    public native AccessibleNode getDetails();
    
    @JsProperty(name="details")
    public native void setDetails(AccessibleNode details);
    
    @JsProperty(name="disabled")
    public native boolean getDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="errorMessage")
    public native AccessibleNode getErrorMessage();
    
    @JsProperty(name="errorMessage")
    public native void setErrorMessage(AccessibleNode errorMessage);
    
    @JsProperty(name="expanded")
    public native boolean getExpanded();
    
    @JsProperty(name="expanded")
    public native void setExpanded(boolean expanded);
    
    @JsProperty(name="flowTo")
    public native AccessibleNodeList getFlowTo();
    
    @JsProperty(name="flowTo")
    public native void setFlowTo(AccessibleNodeList flowTo);
    
    @JsProperty(name="hidden")
    public native boolean getHidden();
    
    @JsProperty(name="hidden")
    public native void setHidden(boolean hidden);
    
    @JsProperty(name="invalid")
    public native String getInvalid();
    
    @JsProperty(name="invalid")
    public native void setInvalid(String invalid);
    
    @JsProperty(name="keyShortcuts")
    public native String getKeyShortcuts();
    
    @JsProperty(name="keyShortcuts")
    public native void setKeyShortcuts(String keyShortcuts);
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="label")
    public native void setLabel(String label);
    
    @JsProperty(name="labeledBy")
    public native AccessibleNodeList getLabeledBy();
    
    @JsProperty(name="labeledBy")
    public native void setLabeledBy(AccessibleNodeList labeledBy);
    
    @JsProperty(name="level")
    public native double getLevel();
    
    @JsProperty(name="level")
    public native void setLevel(double level);
    
    @JsProperty(name="live")
    public native String getLive();
    
    @JsProperty(name="live")
    public native void setLive(String live);
    
    @JsProperty(name="modal")
    public native boolean getModal();
    
    @JsProperty(name="modal")
    public native void setModal(boolean modal);
    
    @JsProperty(name="multiline")
    public native boolean getMultiline();
    
    @JsProperty(name="multiline")
    public native void setMultiline(boolean multiline);
    
    @JsProperty(name="multiselectable")
    public native boolean getMultiselectable();
    
    @JsProperty(name="multiselectable")
    public native void setMultiselectable(boolean multiselectable);
    
    @JsProperty(name="orientation")
    public native String getOrientation();
    
    @JsProperty(name="orientation")
    public native void setOrientation(String orientation);
    
    @JsProperty(name="owns")
    public native AccessibleNodeList getOwns();
    
    @JsProperty(name="owns")
    public native void setOwns(AccessibleNodeList owns);
    
    @JsProperty(name="placeholder")
    public native String getPlaceholder();
    
    @JsProperty(name="placeholder")
    public native void setPlaceholder(String placeholder);
    
    @JsProperty(name="posInSet")
    public native double getPosInSet();
    
    @JsProperty(name="posInSet")
    public native void setPosInSet(double posInSet);
    
    @JsProperty(name="pressed")
    public native String getPressed();
    
    @JsProperty(name="pressed")
    public native void setPressed(String pressed);
    
    @JsProperty(name="readOnly")
    public native boolean getReadOnly();
    
    @JsProperty(name="readOnly")
    public native void setReadOnly(boolean readOnly);
    
    @JsProperty(name="relevant")
    public native String getRelevant();
    
    @JsProperty(name="relevant")
    public native void setRelevant(String relevant);
    
    @JsProperty(name="required")
    public native boolean getRequired();
    
    @JsProperty(name="required")
    public native void setRequired(boolean required);
    
    @JsProperty(name="role")
    public native String getRole();
    
    @JsProperty(name="role")
    public native void setRole(String role);
    
    @JsProperty(name="roleDescription")
    public native String getRoleDescription();
    
    @JsProperty(name="roleDescription")
    public native void setRoleDescription(String roleDescription);
    
    @JsProperty(name="rowCount")
    public native double getRowCount();
    
    @JsProperty(name="rowCount")
    public native void setRowCount(double rowCount);
    
    @JsProperty(name="rowIndex")
    public native double getRowIndex();
    
    @JsProperty(name="rowIndex")
    public native void setRowIndex(double rowIndex);
    
    @JsProperty(name="rowSpan")
    public native double getRowSpan();
    
    @JsProperty(name="rowSpan")
    public native void setRowSpan(double rowSpan);
    
    @JsProperty(name="selected")
    public native boolean getSelected();
    
    @JsProperty(name="selected")
    public native void setSelected(boolean selected);
    
    @JsProperty(name="setSize")
    public native double getSetSize();
    
    @JsProperty(name="setSize")
    public native void setSetSize(double setSize);
    
    @JsProperty(name="sort")
    public native String getSort();
    
    @JsProperty(name="sort")
    public native void setSort(String sort);
    
    @JsProperty(name="valueMax")
    public native double getValueMax();
    
    @JsProperty(name="valueMax")
    public native void setValueMax(double valueMax);
    
    @JsProperty(name="valueMin")
    public native double getValueMin();
    
    @JsProperty(name="valueMin")
    public native void setValueMin(double valueMin);
    
    @JsProperty(name="valueNow")
    public native double getValueNow();
    
    @JsProperty(name="valueNow")
    public native void setValueNow(double valueNow);
    
    @JsProperty(name="valueText")
    public native String getValueText();
    
    @JsProperty(name="valueText")
    public native void setValueText(String valueText);
    
}

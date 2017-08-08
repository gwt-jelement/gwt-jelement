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
package gwt.jelement.editing;

import gwt.jelement.core.IsObject;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.Range;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Selection", isNative = true)
public class Selection implements IsObject {
    @JsProperty(name="anchorNode")
    public native Node getAnchorNode();
    
    @JsProperty(name="anchorOffset")
    public native double getAnchorOffset();
    
    @JsProperty(name="focusNode")
    public native Node getFocusNode();
    
    @JsProperty(name="focusOffset")
    public native double getFocusOffset();
    
    @JsProperty(name="isCollapsed")
    public native boolean isIsCollapsed();
    
    @JsProperty(name="rangeCount")
    public native double getRangeCount();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="baseNode")
    public native Node getBaseNode();
    
    @JsProperty(name="baseOffset")
    public native double getBaseOffset();
    
    @JsProperty(name="extentNode")
    public native Node getExtentNode();
    
    @JsProperty(name="extentOffset")
    public native double getExtentOffset();
    
    @JsMethod(name = "addRange")
    public native void addRange(Range range);
    
    @JsMethod(name = "collapse")
    public native void collapse(Node node);
    
    @JsMethod(name = "collapse")
    public native void collapse(Node node, double offset);
    
    @JsMethod(name = "collapseToEnd")
    public native void collapseToEnd();
    
    @JsMethod(name = "collapseToStart")
    public native void collapseToStart();
    
    @JsMethod(name = "containsNode")
    public native boolean containsNode(Node node);
    
    @JsMethod(name = "containsNode")
    public native boolean containsNode(Node node, boolean allowPartialContainment);
    
    @JsMethod(name = "deleteFromDocument")
    public native void deleteFromDocument();
    
    @JsMethod(name = "empty")
    public native void empty();
    
    @JsMethod(name = "extend")
    public native void extend(Node node);
    
    @JsMethod(name = "extend")
    public native void extend(Node node, double offset);
    
    @JsMethod(name = "getRangeAt")
    public native Range getRangeAt(double index);
    
    @JsMethod(name = "modify")
    public native void modify();
    
    @JsMethod(name = "modify")
    public native void modify(String alter);
    
    @JsMethod(name = "modify")
    public native void modify(String alter, String direction);
    
    @JsMethod(name = "modify")
    public native void modify(String alter, String direction, String granularity);
    
    @JsMethod(name = "removeAllRanges")
    public native void removeAllRanges();
    
    @JsMethod(name = "removeRange")
    public native void removeRange(Range range);
    
    @JsMethod(name = "selectAllChildren")
    public native void selectAllChildren(Node node);
    
    @JsMethod(name = "setBaseAndExtent")
    public native void setBaseAndExtent(Node baseNode, double baseOffset, Node extentNode, double extentOffset);
    
    @JsMethod(name = "setPosition")
    public native void setPosition(Node node);
    
    @JsMethod(name = "setPosition")
    public native void setPosition(Node node, double offset);
    
}

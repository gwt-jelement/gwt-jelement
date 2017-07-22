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

import gwt.jelement.dom.ClientRect;
import gwt.jelement.dom.ClientRectList;
import gwt.jelement.dom.DocumentFragment;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.Range;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Range{
    public static int START_TO_START;
    public static int START_TO_END;
    public static int END_TO_END;
    public static int END_TO_START;
    
    
    @JsConstructor
    public Range(){
    }
    
    @JsProperty(name="startContainer")
    public native Node getStartContainer();
    
    @JsProperty(name="startOffset")
    public native double getStartOffset();
    
    @JsProperty(name="endContainer")
    public native Node getEndContainer();
    
    @JsProperty(name="endOffset")
    public native double getEndOffset();
    
    @JsProperty(name="collapsed")
    public native boolean getCollapsed();
    
    @JsProperty(name="commonAncestorContainer")
    public native Node getCommonAncestorContainer();
    
    @JsMethod(name = "cloneContents")
    public native DocumentFragment cloneContents();
    
    @JsMethod(name = "cloneRange")
    public native Range cloneRange();
    
    @JsMethod(name = "collapse")
    public native void collapse();
    
    @JsMethod(name = "collapse")
    public native void collapse(boolean toStart);
    
    @JsMethod(name = "compareBoundaryPoints")
    public native short compareBoundaryPoints(short how, Range sourceRange);
    
    @JsMethod(name = "comparePoint")
    public native short comparePoint(Node node, double offset);
    
    @JsMethod(name = "createContextualFragment")
    public native DocumentFragment createContextualFragment(String fragment);
    
    @JsMethod(name = "deleteContents")
    public native void deleteContents();
    
    @JsMethod(name = "detach")
    public native void detach();
    
    @JsMethod(name = "expand")
    public native void expand();
    
    @JsMethod(name = "expand")
    public native void expand(String unit);
    
    @JsMethod(name = "extractContents")
    public native DocumentFragment extractContents();
    
    @JsMethod(name = "getBoundingClientRect")
    public native ClientRect getBoundingClientRect();
    
    @JsMethod(name = "getClientRects")
    public native ClientRectList getClientRects();
    
    @JsMethod(name = "insertNode")
    public native void insertNode(Node node);
    
    @JsMethod(name = "intersectsNode")
    public native boolean intersectsNode(Node node);
    
    @JsMethod(name = "isPointInRange")
    public native boolean isPointInRange(Node node, double offset);
    
    @JsMethod(name = "selectNode")
    public native void selectNode(Node node);
    
    @JsMethod(name = "selectNodeContents")
    public native void selectNodeContents(Node node);
    
    @JsMethod(name = "setEnd")
    public native void setEnd(Node node, double offset);
    
    @JsMethod(name = "setEndAfter")
    public native void setEndAfter(Node node);
    
    @JsMethod(name = "setEndBefore")
    public native void setEndBefore(Node node);
    
    @JsMethod(name = "setStart")
    public native void setStart(Node node, double offset);
    
    @JsMethod(name = "setStartAfter")
    public native void setStartAfter(Node node);
    
    @JsMethod(name = "setStartBefore")
    public native void setStartBefore(Node node);
    
    @JsMethod(name = "surroundContents")
    public native void surroundContents(Node newParent);
    
    @JsMethod(name = "toString")
    public native String toString();
    
}

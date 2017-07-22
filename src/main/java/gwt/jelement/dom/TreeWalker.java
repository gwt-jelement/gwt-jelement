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

import gwt.jelement.dom.Node;
import gwt.jelement.dom.NodeFilter;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TreeWalker{
    
    @JsProperty(name="currentNode")
    public Node currentNode;
    
    @JsProperty(name="root")
    public native Node getRoot();
    
    @JsProperty(name="whatToShow")
    public native double getWhatToShow();
    
    @JsProperty(name="filter")
    public native NodeFilter getFilter();
    
    @JsMethod(name = "firstChild")
    public native Node firstChild();
    
    @JsMethod(name = "lastChild")
    public native Node lastChild();
    
    @JsMethod(name = "nextNode")
    public native Node nextNode();
    
    @JsMethod(name = "nextSibling")
    public native Node nextSibling();
    
    @JsMethod(name = "parentNode")
    public native Node parentNode();
    
    @JsMethod(name = "previousNode")
    public native Node previousNode();
    
    @JsMethod(name = "previousSibling")
    public native Node previousSibling();
    
}

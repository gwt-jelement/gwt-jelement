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
import gwt.jelement.dom.NodeList;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MutationRecord{
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="target")
    public native Node getTarget();
    
    @JsProperty(name="addedNodes")
    public native NodeList getAddedNodes();
    
    @JsProperty(name="removedNodes")
    public native NodeList getRemovedNodes();
    
    @JsProperty(name="previousSibling")
    public native Node getPreviousSibling();
    
    @JsProperty(name="nextSibling")
    public native Node getNextSibling();
    
    @JsProperty(name="attributeName")
    public native String getAttributeName();
    
    @JsProperty(name="attributeNamespace")
    public native String getAttributeNamespace();
    
    @JsProperty(name="oldValue")
    public native String getOldValue();
    
    
}

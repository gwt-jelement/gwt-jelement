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

import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Node", isNative = true)
public class Node extends EventTarget{
    public static short ELEMENT_NODE; /* 1 */
    public static short ATTRIBUTE_NODE; /* 2 */
    public static short TEXT_NODE; /* 3 */
    public static short CDATA_SECTION_NODE; /* 4 */
    public static short ENTITY_REFERENCE_NODE; /* 5 */
    public static short ENTITY_NODE; /* 6 */
    public static short PROCESSING_INSTRUCTION_NODE; /* 7 */
    public static short COMMENT_NODE; /* 8 */
    public static short DOCUMENT_NODE; /* 9 */
    public static short DOCUMENT_TYPE_NODE; /* 10 */
    public static short DOCUMENT_FRAGMENT_NODE; /* 11 */
    public static short NOTATION_NODE; /* 12 */
    public static short DOCUMENT_POSITION_DISCONNECTED; /* 0x01 */
    public static short DOCUMENT_POSITION_PRECEDING; /* 0x02 */
    public static short DOCUMENT_POSITION_FOLLOWING; /* 0x04 */
    public static short DOCUMENT_POSITION_CONTAINS; /* 0x08 */
    public static short DOCUMENT_POSITION_CONTAINED_BY; /* 0x10 */
    public static short DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC; /* 0x20 */
    
    @JsConstructor
    public Node(){
        super();
    }
    
    @JsProperty(name="nodeType")
    public native short getNodeType();
    
    @JsProperty(name="nodeName")
    public native String getNodeName();
    
    @JsProperty(name="baseURI")
    public native String getBaseURI();
    
    @JsProperty(name="isConnected")
    public native boolean getIsConnected();
    
    @JsProperty(name="ownerDocument")
    public native Document getOwnerDocument();
    
    @JsProperty(name="parentNode")
    public native Node getParentNode();
    
    @JsProperty(name="parentElement")
    public native Element getParentElement();
    
    @JsProperty(name="childNodes")
    public native NodeList getChildNodes();
    
    @JsProperty(name="firstChild")
    public native Node getFirstChild();
    
    @JsProperty(name="lastChild")
    public native Node getLastChild();
    
    @JsProperty(name="previousSibling")
    public native Node getPreviousSibling();
    
    @JsProperty(name="nextSibling")
    public native Node getNextSibling();
    
    @JsProperty(name="nodeValue")
    public native String getNodeValue();
    
    @JsProperty(name="nodeValue")
    public native void setNodeValue(String nodeValue);
    
    @JsProperty(name="textContent")
    public native String getTextContent();
    
    @JsProperty(name="textContent")
    public native void setTextContent(String textContent);
    
    @JsMethod(name = "appendChild")
    public native Node appendChild(Node node);
    
    @JsMethod(name = "cloneNode")
    public native Node cloneNode();
    
    @JsMethod(name = "cloneNode")
    public native Node cloneNode(boolean deep);
    
    @JsMethod(name = "compareDocumentPosition")
    public native short compareDocumentPosition(Node other);
    
    @JsMethod(name = "contains")
    public native boolean contains(Node other);
    
    @JsMethod(name = "getRootNode")
    public native Node getRootNode();
    
    @JsMethod(name = "getRootNode")
    public native Node getRootNode(GetRootNodeOptions options);
    
    @JsMethod(name = "hasChildNodes")
    public native boolean hasChildNodes();
    
    @JsMethod(name = "insertBefore")
    public native Node insertBefore(Node node, Node child);
    
    @JsMethod(name = "isDefaultNamespace")
    public native boolean isDefaultNamespace(String namespaceURI);
    
    @JsMethod(name = "isEqualNode")
    public native boolean isEqualNode(Node otherNode);
    
    @JsMethod(name = "isSameNode")
    public native boolean isSameNode(Node otherNode);
    
    @JsMethod(name = "lookupNamespaceURI")
    public native String lookupNamespaceURI(String prefix);
    
    @JsMethod(name = "lookupPrefix")
    public native String lookupPrefix(String namespaceURI);
    
    @JsMethod(name = "normalize")
    public native void normalize();
    
    @JsMethod(name = "removeChild")
    public native Node removeChild(Node child);
    
    @JsMethod(name = "replaceChild")
    public native Node replaceChild(Node node, Node child);
    
}

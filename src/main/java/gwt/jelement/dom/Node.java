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

import gwt.jelement.dom.Document;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.GetRootNodeOptions;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.NodeList;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Node extends EventTarget{
    public static int ELEMENT_NODE;
    public static int ATTRIBUTE_NODE;
    public static int TEXT_NODE;
    public static int CDATA_SECTION_NODE;
    public static int ENTITY_REFERENCE_NODE;
    public static int ENTITY_NODE;
    public static int PROCESSING_INSTRUCTION_NODE;
    public static int COMMENT_NODE;
    public static int DOCUMENT_NODE;
    public static int DOCUMENT_TYPE_NODE;
    public static int DOCUMENT_FRAGMENT_NODE;
    public static int NOTATION_NODE;
    public static int DOCUMENT_POSITION_DISCONNECTED;
    public static int DOCUMENT_POSITION_PRECEDING;
    public static int DOCUMENT_POSITION_FOLLOWING;
    public static int DOCUMENT_POSITION_CONTAINS;
    public static int DOCUMENT_POSITION_CONTAINED_BY;
    public static int DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC;
    
    
    @JsConstructor
    public Node(){
        super();
    }
    
    @JsProperty(name="nodeType")
    public short nodeType;
    
    @JsProperty(name="nodeName")
    public String nodeName;
    
    @JsProperty(name="baseURI")
    public String baseURI;
    
    @JsProperty(name="isConnected")
    public boolean isConnected;
    
    @JsProperty(name="ownerDocument")
    public Document ownerDocument;
    
    @JsProperty(name="parentNode")
    public Node parentNode;
    
    @JsProperty(name="parentElement")
    public Element parentElement;
    
    @JsProperty(name="childNodes")
    public NodeList childNodes;
    
    @JsProperty(name="firstChild")
    public Node firstChild;
    
    @JsProperty(name="lastChild")
    public Node lastChild;
    
    @JsProperty(name="previousSibling")
    public Node previousSibling;
    
    @JsProperty(name="nextSibling")
    public Node nextSibling;
    
    @JsProperty(name="nodeValue")
    public String nodeValue;
    
    @JsProperty(name="textContent")
    public String textContent;
    
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

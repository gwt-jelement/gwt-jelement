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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class NodeFilter{
    public static int FILTER_ACCEPT;
    public static int FILTER_REJECT;
    public static int FILTER_SKIP;
    public static int SHOW_ALL;
    public static int SHOW_ELEMENT;
    public static int SHOW_ATTRIBUTE;
    public static int SHOW_TEXT;
    public static int SHOW_CDATA_SECTION;
    public static int SHOW_ENTITY_REFERENCE;
    public static int SHOW_ENTITY;
    public static int SHOW_PROCESSING_INSTRUCTION;
    public static int SHOW_COMMENT;
    public static int SHOW_DOCUMENT;
    public static int SHOW_DOCUMENT_TYPE;
    public static int SHOW_DOCUMENT_FRAGMENT;
    public static int SHOW_NOTATION;
    
    
    @JsMethod(name = "acceptNode")
    public native short acceptNode(Node node);
    
}

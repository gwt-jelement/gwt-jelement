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
    public static final int FILTER_ACCEPT = 1;
    public static final int FILTER_REJECT = 2;
    public static final int FILTER_SKIP = 3;
    public static final int SHOW_ALL = 0xFFFFFFFF;
    public static final int SHOW_ELEMENT = 0x1;
    public static final int SHOW_ATTRIBUTE = 0x2;
    public static final int SHOW_TEXT = 0x4;
    public static final int SHOW_CDATA_SECTION = 0x8;
    public static final int SHOW_ENTITY_REFERENCE = 0x10;
    public static final int SHOW_ENTITY = 0x20;
    public static final int SHOW_PROCESSING_INSTRUCTION = 0x40;
    public static final int SHOW_COMMENT = 0x80;
    public static final int SHOW_DOCUMENT = 0x100;
    public static final int SHOW_DOCUMENT_TYPE = 0x200;
    public static final int SHOW_DOCUMENT_FRAGMENT = 0x400;
    public static final int SHOW_NOTATION = 0x800;
    
    
    @JsMethod(name = "acceptNode")
    public native short acceptNode(Node node);
    
}

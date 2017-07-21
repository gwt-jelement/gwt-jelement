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
package gwt.jelement.xml;

import gwt.jelement.dom.Node;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class XPathResult{
    public static final int ANY_TYPE = 0;
    public static final int NUMBER_TYPE = 1;
    public static final int STRING_TYPE = 2;
    public static final int BOOLEAN_TYPE = 3;
    public static final int UNORDERED_NODE_ITERATOR_TYPE = 4;
    public static final int ORDERED_NODE_ITERATOR_TYPE = 5;
    public static final int UNORDERED_NODE_SNAPSHOT_TYPE = 6;
    public static final int ORDERED_NODE_SNAPSHOT_TYPE = 7;
    public static final int ANY_UNORDERED_NODE_TYPE = 8;
    public static final int FIRST_ORDERED_NODE_TYPE = 9;
    
    
    @JsProperty(name="resultType")
    public native short getResultType();
    
    @JsProperty(name="numberValue")
    public native double getNumberValue();
    
    @JsProperty(name="stringValue")
    public native String getStringValue();
    
    @JsProperty(name="booleanValue")
    public native boolean getBooleanValue();
    
    @JsProperty(name="singleNodeValue")
    public native Node getSingleNodeValue();
    
    @JsProperty(name="invalidIteratorState")
    public native boolean getInvalidIteratorState();
    
    @JsProperty(name="snapshotLength")
    public native long getSnapshotLength();
    
    @JsMethod(name = "iterateNext")
    public native Node iterateNext();
    
    @JsMethod(name = "snapshotItem")
    public native Node snapshotItem(long index);
    
}

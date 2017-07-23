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
    public static int ANY_TYPE;
    public static int NUMBER_TYPE;
    public static int STRING_TYPE;
    public static int BOOLEAN_TYPE;
    public static int UNORDERED_NODE_ITERATOR_TYPE;
    public static int ORDERED_NODE_ITERATOR_TYPE;
    public static int UNORDERED_NODE_SNAPSHOT_TYPE;
    public static int ORDERED_NODE_SNAPSHOT_TYPE;
    public static int ANY_UNORDERED_NODE_TYPE;
    public static int FIRST_ORDERED_NODE_TYPE;
    
    
    @JsProperty(name="resultType")
    public short resultType;
    
    @JsProperty(name="numberValue")
    public double numberValue;
    
    @JsProperty(name="stringValue")
    public String stringValue;
    
    @JsProperty(name="booleanValue")
    public boolean booleanValue;
    
    @JsProperty(name="singleNodeValue")
    public Node singleNodeValue;
    
    @JsProperty(name="invalidIteratorState")
    public boolean invalidIteratorState;
    
    @JsProperty(name="snapshotLength")
    public double snapshotLength;
    
    @JsMethod(name = "iterateNext")
    public native Node iterateNext();
    
    @JsMethod(name = "snapshotItem")
    public native Node snapshotItem(double index);
    
}

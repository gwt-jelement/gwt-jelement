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

import gwt.jelement.dom.Attr;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class NamedNodeMap{
    
    @JsProperty(name="length")
    public native long getLength();
    
    @JsMethod(name = "getNamedItem")
    public native Attr getNamedItem(String name);
    
    @JsMethod(name = "getNamedItemNS")
    public native Attr getNamedItemNS(String namespaceURI, String localName);
    
    @JsMethod(name = "removeNamedItem")
    public native Attr removeNamedItem(String name);
    
    @JsMethod(name = "removeNamedItemNS")
    public native Attr removeNamedItemNS(String namespaceURI, String localName);
    
    @JsMethod(name = "setNamedItem")
    public native Attr setNamedItem(Attr attr);
    
    @JsMethod(name = "setNamedItemNS")
    public native Attr setNamedItemNS(Attr attr);
    
}

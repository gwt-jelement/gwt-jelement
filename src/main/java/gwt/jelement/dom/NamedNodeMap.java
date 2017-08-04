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

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.Js;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="NamedNodeMap", isNative = true)
public class NamedNodeMap extends ArrayLike{
    @JsOverlay
    public final Attr get(String name){
        return (Attr) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "getNamedItem")
    public native Attr getNamedItem(String name);
    
    @JsMethod(name = "getNamedItemNS")
    public native Attr getNamedItemNS(String namespaceURI, String localName);
    
    @JsMethod(name = "item")
    public native Attr item(double index);
    
    @JsMethod(name = "removeNamedItem")
    public native Attr removeNamedItem(String name);
    
    @JsMethod(name = "removeNamedItemNS")
    public native Attr removeNamedItemNS(String namespaceURI, String localName);
    
    @JsMethod(name = "setNamedItem")
    public native Attr setNamedItem(Attr attr);
    
    @JsMethod(name = "setNamedItemNS")
    public native Attr setNamedItemNS(Attr attr);
    
}

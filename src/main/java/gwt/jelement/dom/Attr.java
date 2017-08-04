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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Attr", isNative = true)
public class Attr extends Node{
    @JsProperty(name="namespaceURI")
    public native String getNamespaceURI();
    
    @JsProperty(name="prefix")
    public native String getPrefix();
    
    @JsProperty(name="localName")
    public native String getLocalName();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
    @JsProperty(name="ownerElement")
    public native Element getOwnerElement();
    
    @JsProperty(name="specified")
    public native boolean getSpecified();
    
}

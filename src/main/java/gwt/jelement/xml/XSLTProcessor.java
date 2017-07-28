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

import gwt.jelement.dom.Document;
import gwt.jelement.dom.DocumentFragment;
import gwt.jelement.dom.Node;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="XSLTProcessor", isNative = true)
public class XSLTProcessor{
    @JsConstructor
    public XSLTProcessor(){
    }
    
    @JsMethod(name = "clearParameters")
    public native void clearParameters();
    
    @JsMethod(name = "getParameter")
    public native String getParameter(String namespaceURI, String localName);
    
    @JsMethod(name = "importStylesheet")
    public native void importStylesheet(Node style);
    
    @JsMethod(name = "removeParameter")
    public native void removeParameter(String namespaceURI, String localName);
    
    @JsMethod(name = "reset")
    public native void reset();
    
    @JsMethod(name = "setParameter")
    public native void setParameter(String namespaceURI, String localName, String value);
    
    @JsMethod(name = "transformToDocument")
    public native Document transformToDocument(Node source);
    
    @JsMethod(name = "transformToFragment")
    public native DocumentFragment transformToFragment(Node source, Document output);
    
}

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

import gwt.jelement.core.JsObject;
import gwt.jelement.html.HTMLDocument;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DOMImplementation", isNative = true)
public class DOMImplementation extends JsObject{
    @JsConstructor
    public DOMImplementation(){
        super();
    }
    
    @JsMethod(name = "createDocument")
    public native XMLDocument createDocument(String namespaceURI, String qualifiedName);
    
    @JsMethod(name = "createDocument")
    public native XMLDocument createDocument(String namespaceURI, String qualifiedName, DocumentType doctype);
    
    @JsMethod(name = "createDocumentType")
    public native DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);
    
    @JsMethod(name = "createHTMLDocument")
    public native HTMLDocument createHTMLDocument();
    
    @JsMethod(name = "createHTMLDocument")
    public native HTMLDocument createHTMLDocument(String title);
    
    @JsMethod(name = "hasFeature")
    public native boolean hasFeature();
    
}

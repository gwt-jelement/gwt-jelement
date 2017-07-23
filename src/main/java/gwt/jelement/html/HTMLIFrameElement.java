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
package gwt.jelement.html;

import gwt.jelement.dom.DOMTokenList;
import gwt.jelement.dom.Document;
import gwt.jelement.frame.Window;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLIFrameElement extends HTMLElement{
    
    @JsConstructor
    public HTMLIFrameElement(){
        super();
    }
    
    @JsProperty(name="src")
    public String src;
    
    @JsProperty(name="srcdoc")
    public String srcdoc;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="sandbox")
    public DOMTokenList sandbox;
    
    @JsProperty(name="allowFullscreen")
    public boolean allowFullscreen;
    
    @JsProperty(name="width")
    public String width;
    
    @JsProperty(name="height")
    public String height;
    
    @JsProperty(name="contentDocument")
    public Document contentDocument;
    
    @JsProperty(name="contentWindow")
    public Window contentWindow;
    
    @JsProperty(name="referrerPolicy")
    public String referrerPolicy;
    
    @JsProperty(name="csp")
    public String csp;
    
    @JsProperty(name="allow")
    public DOMTokenList allow;
    
    @JsProperty(name="align")
    public String align;
    
    @JsProperty(name="scrolling")
    public String scrolling;
    
    @JsProperty(name="frameBorder")
    public String frameBorder;
    
    @JsProperty(name="longDesc")
    public String longDesc;
    
    @JsProperty(name="marginHeight")
    public String marginHeight;
    
    @JsProperty(name="marginWidth")
    public String marginWidth;
    
    @JsMethod(name = "getSVGDocument")
    public native Document getSVGDocument();
    
}

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

import gwt.jelement.css.StyleSheet;
import gwt.jelement.dom.DOMTokenList;
import gwt.jelement.dom.Document;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLLinkElement extends HTMLElement{
    
    @JsConstructor
    public HTMLLinkElement(){
        super();
    }
    
    @JsProperty(name="disabled")
    public boolean disabled;
    
    @JsProperty(name="href")
    public String href;
    
    @JsProperty(name="crossOrigin")
    public String crossOrigin;
    
    @JsProperty(name="rel")
    public String rel;
    
    @JsProperty(name="relList")
    public DOMTokenList relList;
    
    @JsProperty(name="media")
    public String media;
    
    @JsProperty(name="hreflang")
    public String hreflang;
    
    @JsProperty(name="type")
    public String type;
    
    @JsProperty(name="as")
    public String as;
    
    @JsProperty(name="referrerPolicy")
    public String referrerPolicy;
    
    @JsProperty(name="sizes")
    public DOMTokenList sizes;
    
    @JsProperty(name="charset")
    public String charset;
    
    @JsProperty(name="rev")
    public String rev;
    
    @JsProperty(name="target")
    public String target;
    
    @JsProperty(name="sheet")
    public StyleSheet sheet;
    
    @JsProperty(name="import")
    public Document import_;
    
    @JsProperty(name="integrity")
    public String integrity;
    
    @JsProperty(name="scope")
    public String scope;
    
    
}

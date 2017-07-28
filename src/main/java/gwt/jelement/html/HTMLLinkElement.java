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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLLinkElement", isNative = true)
public class HTMLLinkElement extends HTMLElement{
    @JsConstructor
    public HTMLLinkElement(){
        super();
    }
    
    @JsProperty(name="disabled")
    public native boolean getDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    @JsProperty(name="href")
    public native String getHref();
    
    @JsProperty(name="href")
    public native void setHref(String href);
    
    @JsProperty(name="crossOrigin")
    public native String getCrossOrigin();
    
    @JsProperty(name="crossOrigin")
    public native void setCrossOrigin(String crossOrigin);
    
    @JsProperty(name="rel")
    public native String getRel();
    
    @JsProperty(name="rel")
    public native void setRel(String rel);
    
    @JsProperty(name="relList")
    public native DOMTokenList getRelList();
    
    @JsProperty(name="media")
    public native String getMedia();
    
    @JsProperty(name="media")
    public native void setMedia(String media);
    
    @JsProperty(name="hreflang")
    public native String getHreflang();
    
    @JsProperty(name="hreflang")
    public native void setHreflang(String hreflang);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="as")
    public native String getAs();
    
    @JsProperty(name="as")
    public native void setAs(String as);
    
    @JsProperty(name="referrerPolicy")
    public native String getReferrerPolicy();
    
    @JsProperty(name="referrerPolicy")
    public native void setReferrerPolicy(String referrerPolicy);
    
    @JsProperty(name="sizes")
    public native DOMTokenList getSizes();
    
    @JsProperty(name="charset")
    public native String getCharset();
    
    @JsProperty(name="charset")
    public native void setCharset(String charset);
    
    @JsProperty(name="rev")
    public native String getRev();
    
    @JsProperty(name="rev")
    public native void setRev(String rev);
    
    @JsProperty(name="target")
    public native String getTarget();
    
    @JsProperty(name="target")
    public native void setTarget(String target);
    
    @JsProperty(name="sheet")
    public native StyleSheet getSheet();
    
    @JsProperty(name="import")
    public native Document getImport();
    
    @JsProperty(name="integrity")
    public native String getIntegrity();
    
    @JsProperty(name="integrity")
    public native void setIntegrity(String integrity);
    
    @JsProperty(name="scope")
    public native String getScope();
    
    @JsProperty(name="scope")
    public native void setScope(String scope);
    
}

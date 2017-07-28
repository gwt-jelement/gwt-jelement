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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLIFrameElement", isNative = true)
public class HTMLIFrameElement extends HTMLElement{
    @JsConstructor
    public HTMLIFrameElement(){
        super();
    }
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="srcdoc")
    public native String getSrcdoc();
    
    @JsProperty(name="srcdoc")
    public native void setSrcdoc(String srcdoc);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="sandbox")
    public native DOMTokenList getSandbox();
    
    @JsProperty(name="allowFullscreen")
    public native boolean getAllowFullscreen();
    
    @JsProperty(name="allowFullscreen")
    public native void setAllowFullscreen(boolean allowFullscreen);
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
    @JsProperty(name="height")
    public native String getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(String height);
    
    @JsProperty(name="contentDocument")
    public native Document getContentDocument();
    
    @JsProperty(name="contentWindow")
    public native Window getContentWindow();
    
    @JsProperty(name="referrerPolicy")
    public native String getReferrerPolicy();
    
    @JsProperty(name="referrerPolicy")
    public native void setReferrerPolicy(String referrerPolicy);
    
    @JsProperty(name="csp")
    public native String getCsp();
    
    @JsProperty(name="csp")
    public native void setCsp(String csp);
    
    @JsProperty(name="allow")
    public native DOMTokenList getAllow();
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="scrolling")
    public native String getScrolling();
    
    @JsProperty(name="scrolling")
    public native void setScrolling(String scrolling);
    
    @JsProperty(name="frameBorder")
    public native String getFrameBorder();
    
    @JsProperty(name="frameBorder")
    public native void setFrameBorder(String frameBorder);
    
    @JsProperty(name="longDesc")
    public native String getLongDesc();
    
    @JsProperty(name="longDesc")
    public native void setLongDesc(String longDesc);
    
    @JsProperty(name="marginHeight")
    public native String getMarginHeight();
    
    @JsProperty(name="marginHeight")
    public native void setMarginHeight(String marginHeight);
    
    @JsProperty(name="marginWidth")
    public native String getMarginWidth();
    
    @JsProperty(name="marginWidth")
    public native void setMarginWidth(String marginWidth);
    
    @JsMethod(name = "getSVGDocument")
    public native Document getSVGDocument();
    
}

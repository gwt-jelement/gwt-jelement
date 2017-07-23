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

import gwt.jelement.css.CSSStyleDeclaration;
import gwt.jelement.dom.DOMStringMap;
import gwt.jelement.dom.Element;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLElement extends Element{
    
    @JsConstructor
    public HTMLElement(){
        super();
    }
    
    @JsProperty(name="title")
    public String title;
    
    @JsProperty(name="lang")
    public String lang;
    
    @JsProperty(name="translate")
    public boolean translate;
    
    @JsProperty(name="dir")
    public String dir;
    
    @JsProperty(name="dataset")
    public DOMStringMap dataset;
    
    @JsProperty(name="hidden")
    public boolean hidden;
    
    @JsProperty(name="tabIndex")
    public double tabIndex;
    
    @JsProperty(name="inert")
    public boolean inert;
    
    @JsProperty(name="accessKey")
    public String accessKey;
    
    @JsProperty(name="draggable")
    public boolean draggable;
    
    @JsProperty(name="spellcheck")
    public boolean spellcheck;
    
    @JsProperty(name="contentEditable")
    public String contentEditable;
    
    @JsProperty(name="isContentEditable")
    public boolean isContentEditable;
    
    @JsProperty(name="inputMode")
    public String inputMode;
    
    @JsProperty(name="offsetParent")
    public Element offsetParent;
    
    @JsProperty(name="offsetTop")
    public double offsetTop;
    
    @JsProperty(name="offsetLeft")
    public double offsetLeft;
    
    @JsProperty(name="offsetWidth")
    public double offsetWidth;
    
    @JsProperty(name="offsetHeight")
    public double offsetHeight;
    
    @JsProperty(name="style")
    public CSSStyleDeclaration style;
    
    @JsProperty(name="innerText")
    public String innerText;
    
    @JsProperty(name="outerText")
    public String outerText;
    
    @JsMethod(name = "blur")
    public native void blur();
    
    @JsMethod(name = "click")
    public native void click();
    
    @JsMethod(name = "focus")
    public native void focus();
    
}

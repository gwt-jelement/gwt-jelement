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

import gwt.jelement.dom.Document;
import gwt.jelement.frame.Window;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLFrameElement extends HTMLElement{
    
    @JsConstructor
    public HTMLFrameElement(){
        super();
    }
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="scrolling")
    public String scrolling;
    
    @JsProperty(name="src")
    public String src;
    
    @JsProperty(name="frameBorder")
    public String frameBorder;
    
    @JsProperty(name="longDesc")
    public String longDesc;
    
    @JsProperty(name="noResize")
    public boolean noResize;
    
    @JsProperty(name="marginHeight")
    public String marginHeight;
    
    @JsProperty(name="marginWidth")
    public String marginWidth;
    
    @JsProperty(name="contentDocument")
    public native Document getContentDocument();
    
    @JsProperty(name="contentWindow")
    public native Window getContentWindow();
    
    
}

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

import gwt.jelement.dom.Element;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.NodeList;
import gwt.jelement.html.HTMLCollection;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ParentNode{
    
    @JsProperty(name="children")
    public HTMLCollection children;
    
    @JsProperty(name="firstElementChild")
    public Element firstElementChild;
    
    @JsProperty(name="lastElementChild")
    public Element lastElementChild;
    
    @JsProperty(name="childElementCount")
    public double childElementCount;
    
    @JsMethod(name = "append")
    public native void append();
    
    @JsMethod(name = "append")
    public native void append(Node... nodes);
    
    @JsMethod(name = "append")
    public native void append(String... nodes);
    
    @JsMethod(name = "prepend")
    public native void prepend();
    
    @JsMethod(name = "prepend")
    public native void prepend(Node... nodes);
    
    @JsMethod(name = "prepend")
    public native void prepend(String... nodes);
    
    @JsMethod(name = "querySelector")
    public native Element querySelector(String selectors);
    
    @JsMethod(name = "querySelectorAll")
    public native NodeList querySelectorAll(String selectors);
    
}

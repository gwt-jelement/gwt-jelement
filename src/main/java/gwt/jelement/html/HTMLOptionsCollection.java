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

import gwt.jelement.core.Js;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.NodeList;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLOptionsCollection", isNative = true)
public class HTMLOptionsCollection extends HTMLBaseCollection<Node, HTMLAllCollection.HTMLOptionsUnion>{
    @JsProperty(name="selectedIndex")
    public native double getSelectedIndex();
    
    @JsProperty(name="selectedIndex")
    public native void setSelectedIndex(double selectedIndex);
    
    @JsProperty(name="length")
    public native void setLength(double length);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptionElement element, double before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, HTMLElement before);
    
    @JsMethod(name = "add")
    public native void add(HTMLOptGroupElement element, double before);
    
    @JsMethod(name = "remove")
    public native void remove(double index);
    
    @JsOverlay
    public final void set(double index, HTMLOptionElement option){
        Js.set(this.object(), index, option);
    }
    
}

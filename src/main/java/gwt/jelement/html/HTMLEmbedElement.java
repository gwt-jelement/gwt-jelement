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
import gwt.jelement.dom.Document;
import gwt.jelement.dom.Node;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLEmbedElement", isNative = true)
public class HTMLEmbedElement extends HTMLElement {
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
    @JsProperty(name="height")
    public native String getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(String height);
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsOverlay
    public final Node get(String name){
        return (Node) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "getSVGDocument")
    public native Document getSVGDocument();
    
    @JsOverlay
    public final Node set(String name, Node value){
        return Js.set(this.object(), name, value);
    }
    
}

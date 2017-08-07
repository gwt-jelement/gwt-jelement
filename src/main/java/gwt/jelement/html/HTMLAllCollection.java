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

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Js;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.NodeList;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLAllCollection", isNative = true)
public class HTMLAllCollection implements IsObject, ArrayLike<Element> {
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface HTMLOptionsUnion {
        @JsOverlay
        static HTMLOptionsUnion of(NodeList value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static HTMLOptionsUnion of(Element value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default NodeList asNodeList(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default Element asElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isNodeList(){
            return (Object) this instanceof NodeList;
        }
    
        @JsOverlay
        default boolean isElement(){
            return (Object) this instanceof Element;
        }
    
    }
    
    @JsOverlay
    public final HTMLAllCollection.HTMLOptionsUnion get(String name){
        return (HTMLAllCollection.HTMLOptionsUnion) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "item")
    public native Element item();
    
    @JsMethod(name = "item")
    public native Element item(double index);
    
    @JsMethod(name = "namedItem")
    public native HTMLAllCollection.HTMLOptionsUnion namedItem(String name);
    
}

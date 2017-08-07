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
package gwt.jelement.css;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Js;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CSSStyleDeclaration", isNative = true)
public class CSSStyleDeclaration implements IsObject, ArrayLike<String> {
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface GetUnion {
        @JsOverlay
        static GetUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static GetUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
    }
    
    @JsProperty(name="cssText")
    public native String getCssText();
    
    @JsProperty(name="cssText")
    public native void setCssText(String cssText);
    
    @JsProperty(name="parentRule")
    public native CSSRule getParentRule();
    
    @JsProperty(name="cssFloat")
    public native String getCssFloat();
    
    @JsProperty(name="cssFloat")
    public native void setCssFloat(String cssFloat);
    
    @JsOverlay
    public final CSSStyleDeclaration.GetUnion get(String name){
        return (CSSStyleDeclaration.GetUnion) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "getPropertyPriority")
    public native String getPropertyPriority(String property);
    
    @JsMethod(name = "getPropertyValue")
    public native String getPropertyValue(String property);
    
    @JsMethod(name = "item")
    public native String item(double index);
    
    @JsMethod(name = "removeProperty")
    public native String removeProperty(String property);
    
    @JsOverlay
    public final void set(String property, String propertyValue){
        Js.set(this.object(), property, propertyValue);
    }
    
    @JsMethod(name = "setProperty")
    public native void setProperty(String property, String value);
    
    @JsMethod(name = "setProperty")
    public native void setProperty(String property, String value, String priority);
    
}

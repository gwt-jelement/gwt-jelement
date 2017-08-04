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
package gwt.jelement.css.cssom;

import gwt.jelement.core.Js;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="CSSUnparsedValue", isNative = true)
public class CSSUnparsedValue extends CSSStyleValue{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface GetUnion {
        @JsOverlay
        static GetUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static GetUnion of(CSSVariableReferenceValue value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default CSSVariableReferenceValue asCSSVariableReferenceValue(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isCSSVariableReferenceValue(){
            return (Object) this instanceof CSSVariableReferenceValue;
        }
    
    }
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsOverlay
    public final CSSUnparsedValue.GetUnion get(double index){
        return (CSSUnparsedValue.GetUnion) Js.get(this.object(), index);
    }
    
}

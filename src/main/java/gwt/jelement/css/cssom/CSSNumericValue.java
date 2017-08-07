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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="CSSNumericValue", isNative = true)
public class CSSNumericValue extends CSSStyleValue {
    @JsMethod(name = "add")
    public native CSSNumericValue add(CSSNumericValue value);
    
    @JsMethod(name = "div")
    public native CSSNumericValue div(double value);
    
    @JsMethod(name = "mul")
    public native CSSNumericValue mul(double value);
    
    @JsMethod(name = "parse")
    public static native CSSNumericValue parse(String cssText);
    
    @JsMethod(name = "sub")
    public native CSSNumericValue sub(CSSNumericValue value);
    
    @JsMethod(name = "to")
    public native CSSNumericValue to(String unit);
    
}

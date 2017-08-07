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
package gwt.jelement.core;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="JSON", isNative = true)
public class JSONImpl implements IsObject {
    @JsMethod(name = "parse")
    public native Object parse(String text);
    
    @JsMethod(name = "parse")
    public native Object parse(String text, JSONModifier reviver);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, String[] replacer);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, JSONModifier replacer);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, Array replacer);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, String[] replacer, String space);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, String[] replacer, double space);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, JSONModifier replacer, String space);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, JSONModifier replacer, double space);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, Array replacer, String space);
    
    @JsMethod(name = "stringify")
    public native String stringify(Object value, Array replacer, double space);
    
}

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
package gwt.jelement.fetch;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Headers", isNative = true)
public class Headers implements IsObject {
    @JsConstructor
    public Headers(){
    }
    
    @JsConstructor
    public Headers(String[][] init){
    }
    
    @JsConstructor
    public Headers(JsObject<String> init){
    }
    
    @JsMethod(name = "append")
    public native void append(String name, String value);
    
    @JsMethod(name = "delete")
    public native void delete(String key);
    
    @JsMethod(name = "get")
    public native String get(String key);
    
    @JsMethod(name = "has")
    public native boolean has(String key);
    
    @JsMethod(name = "set")
    public native void set(String key, String value);
    
}

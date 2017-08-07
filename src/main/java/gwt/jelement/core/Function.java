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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Function", isNative = true)
public class Function implements IsObject {
    @JsProperty(name="caller")
    public static Function caller;
    
    @JsProperty(name="displayName")
    public static String displayName;
    
    @JsProperty(name="length")
    public static int length;
    
    @JsProperty(name="name")
    public static String name;
    
    @JsProperty(name="prototype")
    public static JsObject prototype;
    
    @JsConstructor
    public Function(String functionBody){
    }
    
    @JsConstructor
    public Function(String args, String functionBody){
    }
    
    @JsMethod(name = "apply")
    public native Object apply(Object thisArg);
    
    @JsMethod(name = "apply")
    public native Object apply(Object thisArg, Object[] arguments);
    
    @JsMethod(name = "apply")
    public native Object apply(Object thisArg, Array arguments);
    
    @JsMethod(name = "bind")
    public native Function bind(Object thisArg, Object... arguments);
    
    @JsMethod(name = "call")
    public native Object call(Object thisArg, Object... arguments);
    
    @JsMethod(name = "isGenerator")
    public native boolean isGenerator();
    
}

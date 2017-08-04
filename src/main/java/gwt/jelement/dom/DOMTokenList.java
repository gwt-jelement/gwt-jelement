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

import gwt.jelement.core.ArrayLike;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DOMTokenList", isNative = true)
public class DOMTokenList extends ArrayLike{
    @JsProperty(name="value")
    public native String getValue();
    
    @JsProperty(name="value")
    public native void setValue(String value);
    
    @JsMethod(name = "add")
    public native void add(String... tokens);
    
    @JsMethod(name = "contains")
    public native boolean contains(String token);
    
    @JsMethod(name = "item")
    public native String item(double index);
    
    @JsMethod(name = "remove")
    public native void remove(String... tokens);
    
    @JsMethod(name = "replace")
    public native void replace(String token, String newToken);
    
    @JsMethod(name = "supports")
    public native boolean supports(String token);
    
    @JsMethod(name = "toggle")
    public native boolean toggle(String token);
    
    @JsMethod(name = "toggle")
    public native boolean toggle(String token, boolean force);
    
}

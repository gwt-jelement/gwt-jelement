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
package gwt.jelement.storage;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Storage", isNative = true)
public class Storage extends JsObject{
    @JsConstructor
    public Storage(){
        super();
    }
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "getItem")
    public native String getItem(String key);
    
    @JsMethod(name = "key")
    public native String key(double index);
    
    @JsMethod(name = "removeItem")
    public native void removeItem(String key);
    
    @JsMethod(name = "setItem")
    public native void setItem(String key, String value);
    
}

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
package gwt.jelement.indexeddb;

import gwt.jelement.indexeddb.IDBKeyRange;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="IDBKeyRange", isNative = true)
public class IDBKeyRange{
    @JsProperty(name="lower")
    public native Object getLower();
    
    @JsProperty(name="upper")
    public native Object getUpper();
    
    @JsProperty(name="lowerOpen")
    public native boolean getLowerOpen();
    
    @JsProperty(name="upperOpen")
    public native boolean getUpperOpen();
    
    @JsMethod(name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper);
    
    @JsMethod(name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper, boolean lowerOpen);
    
    @JsMethod(name = "bound")
    public static native IDBKeyRange bound(Object lower, Object upper, boolean lowerOpen, boolean upperOpen);
    
    @JsMethod(name = "includes")
    public native boolean includes(Object key);
    
    @JsMethod(name = "lowerBound")
    public static native IDBKeyRange lowerBound(Object bound);
    
    @JsMethod(name = "lowerBound")
    public static native IDBKeyRange lowerBound(Object bound, boolean open);
    
    @JsMethod(name = "only")
    public static native IDBKeyRange only(Object value);
    
    @JsMethod(name = "upperBound")
    public static native IDBKeyRange upperBound(Object bound);
    
    @JsMethod(name = "upperBound")
    public static native IDBKeyRange upperBound(Object bound, boolean open);
    
}

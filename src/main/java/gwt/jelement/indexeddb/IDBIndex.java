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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="IDBIndex", isNative = true)
public class IDBIndex implements IsObject {
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="objectStore")
    public native IDBObjectStore getObjectStore();
    
    @JsProperty(name="keyPath")
    public native Object getKeyPath();
    
    @JsProperty(name="multiEntry")
    public native boolean isMultiEntry();
    
    @JsProperty(name="unique")
    public native boolean isUnique();
    
    @JsMethod(name = "count")
    public native IDBRequest count();
    
    @JsMethod(name = "count")
    public native IDBRequest count(Object key);
    
    @JsMethod(name = "get")
    public native IDBRequest get(Object key);
    
    @JsMethod(name = "getAll")
    public native IDBRequest getAll();
    
    @JsMethod(name = "getAll")
    public native IDBRequest getAll(Object query);
    
    @JsMethod(name = "getAll")
    public native IDBRequest getAll(Object query, double count);
    
    @JsMethod(name = "getAllKeys")
    public native IDBRequest getAllKeys();
    
    @JsMethod(name = "getAllKeys")
    public native IDBRequest getAllKeys(Object query);
    
    @JsMethod(name = "getAllKeys")
    public native IDBRequest getAllKeys(Object query, double count);
    
    @JsMethod(name = "getKey")
    public native IDBRequest getKey(Object key);
    
    @JsMethod(name = "openCursor")
    public native IDBRequest openCursor();
    
    @JsMethod(name = "openCursor")
    public native IDBRequest openCursor(Object range);
    
    @JsOverlay
    public final IDBRequest openCursor(Object range, IDBCursorDirection direction){
        return openCursor(range, direction.getInternalValue());
    }
    
    @JsMethod(name = "openCursor")
    public native IDBRequest openCursor(Object range, String direction);
    
    @JsMethod(name = "openKeyCursor")
    public native IDBRequest openKeyCursor();
    
    @JsMethod(name = "openKeyCursor")
    public native IDBRequest openKeyCursor(Object range);
    
    @JsOverlay
    public final IDBRequest openKeyCursor(Object range, IDBCursorDirection direction){
        return openKeyCursor(range, direction.getInternalValue());
    }
    
    @JsMethod(name = "openKeyCursor")
    public native IDBRequest openKeyCursor(Object range, String direction);
    
}

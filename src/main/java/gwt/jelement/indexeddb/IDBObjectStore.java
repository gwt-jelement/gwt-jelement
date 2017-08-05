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

import gwt.jelement.core.Array;
import gwt.jelement.core.IsObject;
import gwt.jelement.dom.DOMStringList;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, name="IDBObjectStore", isNative = true)
public class IDBObjectStore extends IsObject{
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="keyPath")
    public native Any getKeyPath();
    
    @JsProperty(name="indexNames")
    public native DOMStringList getIndexNames();
    
    @JsProperty(name="transaction")
    public native IDBTransaction getTransaction();
    
    @JsProperty(name="autoIncrement")
    public native boolean getAutoIncrement();
    
    @JsMethod(name = "add")
    public native IDBRequest add(Any value);
    
    @JsMethod(name = "add")
    public native IDBRequest add(Any value, Any key);
    
    @JsMethod(name = "clear")
    public native IDBRequest clear();
    
    @JsMethod(name = "count")
    public native IDBRequest count();
    
    @JsMethod(name = "count")
    public native IDBRequest count(Any key);
    
    @JsMethod(name = "createIndex")
    public native IDBIndex createIndex(String name, String keyPath);
    
    @JsMethod(name = "createIndex")
    public native IDBIndex createIndex(String name, String[] keyPath);
    
    @JsMethod(name = "createIndex")
    public native IDBIndex createIndex(String name, Array keyPath);
    
    @JsMethod(name = "createIndex")
    public native IDBIndex createIndex(String name, String keyPath, IDBIndexParameters options);
    
    @JsMethod(name = "createIndex")
    public native IDBIndex createIndex(String name, String[] keyPath, IDBIndexParameters options);
    
    @JsMethod(name = "createIndex")
    public native IDBIndex createIndex(String name, Array keyPath, IDBIndexParameters options);
    
    @JsMethod(name = "delete")
    public native IDBRequest delete(Any key);
    
    @JsMethod(name = "deleteIndex")
    public native void deleteIndex(String name);
    
    @JsMethod(name = "get")
    public native IDBRequest get(Any key);
    
    @JsMethod(name = "getAll")
    public native IDBRequest getAll();
    
    @JsMethod(name = "getAll")
    public native IDBRequest getAll(Any query);
    
    @JsMethod(name = "getAll")
    public native IDBRequest getAll(Any query, double count);
    
    @JsMethod(name = "getAllKeys")
    public native IDBRequest getAllKeys();
    
    @JsMethod(name = "getAllKeys")
    public native IDBRequest getAllKeys(Any query);
    
    @JsMethod(name = "getAllKeys")
    public native IDBRequest getAllKeys(Any query, double count);
    
    @JsMethod(name = "getKey")
    public native IDBRequest getKey(Any key);
    
    @JsMethod(name = "index")
    public native IDBIndex index(String name);
    
    @JsMethod(name = "openCursor")
    public native IDBRequest openCursor();
    
    @JsMethod(name = "openCursor")
    public native IDBRequest openCursor(Any range);
    
    @JsOverlay
    public final IDBRequest openCursor(Any range, IDBCursorDirection direction){
        return openCursor(range, direction.getInternalValue());
    }
    
    @JsMethod(name = "openCursor")
    public native IDBRequest openCursor(Any range, String direction);
    
    @JsMethod(name = "openKeyCursor")
    public native IDBRequest openKeyCursor();
    
    @JsMethod(name = "openKeyCursor")
    public native IDBRequest openKeyCursor(Any range);
    
    @JsOverlay
    public final IDBRequest openKeyCursor(Any range, IDBCursorDirection direction){
        return openKeyCursor(range, direction.getInternalValue());
    }
    
    @JsMethod(name = "openKeyCursor")
    public native IDBRequest openKeyCursor(Any range, String direction);
    
    @JsMethod(name = "put")
    public native IDBRequest put(Any value);
    
    @JsMethod(name = "put")
    public native IDBRequest put(Any value, Any key);
    
}

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

import gwt.jelement.dom.DOMException;
import gwt.jelement.dom.DOMStringList;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.indexeddb.IDBDatabase;
import gwt.jelement.indexeddb.IDBObjectStore;
import gwt.jelement.indexeddb.IDBTransactionMode;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class IDBTransaction extends EventTarget{
    
    @JsConstructor
    public IDBTransaction(){
        super();
    }
    
    @JsProperty(name="onabort")
    public EventHandlerNonNull onabort;
    
    @JsProperty(name="oncomplete")
    public EventHandlerNonNull oncomplete;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="objectStoreNames")
    public native DOMStringList getObjectStoreNames();
    
    @JsOverlay
    public  IDBTransactionMode getModeAsIDBTransactionMode(){
        return IDBTransactionMode.of(getMode());
    }
    
    @JsProperty(name="mode")
    public native String getMode();
    
    @JsProperty(name="db")
    public native IDBDatabase getDb();
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "objectStore")
    public native IDBObjectStore objectStore(String name);
    
}

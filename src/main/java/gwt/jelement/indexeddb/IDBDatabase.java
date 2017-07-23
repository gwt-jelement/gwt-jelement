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

import gwt.jelement.dom.DOMStringList;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.indexeddb.IDBObjectStore;
import gwt.jelement.indexeddb.IDBObjectStoreParameters;
import gwt.jelement.indexeddb.IDBTransaction;
import gwt.jelement.indexeddb.IDBTransactionMode;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class IDBDatabase extends EventTarget{
    
    @JsConstructor
    public IDBDatabase(){
        super();
    }
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="version")
    public double version;
    
    @JsProperty(name="objectStoreNames")
    public DOMStringList objectStoreNames;
    
    @JsProperty(name="onabort")
    public EventHandlerNonNull onabort;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onversionchange")
    public EventHandlerNonNull onversionchange;
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "createObjectStore")
    public native IDBObjectStore createObjectStore(String name);
    
    @JsMethod(name = "createObjectStore")
    public native IDBObjectStore createObjectStore(String name, IDBObjectStoreParameters options);
    
    @JsMethod(name = "deleteObjectStore")
    public native void deleteObjectStore(String name);
    
    @JsMethod(name = "transaction")
    public native IDBTransaction transaction(String storeNames);
    
    @JsMethod(name = "transaction")
    public native IDBTransaction transaction(String[] storeNames);
    
    @JsOverlay
    public final IDBTransaction transaction(String storeNames, IDBTransactionMode mode){
        return transaction(storeNames, mode.getInternalValue());
    }
    
    @JsOverlay
    public final IDBTransaction transaction(String[] storeNames, IDBTransactionMode mode){
        return transaction(storeNames, mode.getInternalValue());
    }
    
    @JsMethod(name = "transaction")
    public native IDBTransaction transaction(String storeNames, String mode);
    
    @JsMethod(name = "transaction")
    public native IDBTransaction transaction(String[] storeNames, String mode);
    
}

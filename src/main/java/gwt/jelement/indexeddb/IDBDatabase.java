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
import gwt.jelement.dom.DOMStringList;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="IDBDatabase", isNative = true)
public class IDBDatabase extends EventTarget {
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onversionchange")
    private EventHandlerNonNull onversionchange;
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="version")
    public native double getVersion();
    
    @JsProperty(name="objectStoreNames")
    public native DOMStringList getObjectStoreNames();
    
    @JsOverlay
    public final EventHandlerNonNull getOnAbort(){
        return this.onabort;
    }
    
    @JsOverlay
    public final void setOnAbort(EventHandlerNonNull onabort){
        this.onabort = onabort;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClose(){
        return this.onclose;
    }
    
    @JsOverlay
    public final void setOnClose(EventHandlerNonNull onclose){
        this.onclose = onclose;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnVersionchange(){
        return this.onversionchange;
    }
    
    @JsOverlay
    public final void setOnVersionchange(EventHandlerNonNull onversionchange){
        this.onversionchange = onversionchange;
    }
    
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
    
    @JsMethod(name = "transaction")
    public native IDBTransaction transaction(Array storeNames);
    
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
    
    @JsOverlay
    public final IDBTransaction transaction(Array storeNames, IDBTransactionMode mode){
        return transaction(storeNames, mode.getInternalValue());
    }
    
    @JsMethod(name = "transaction")
    public native IDBTransaction transaction(Array storeNames, String mode);
    
}

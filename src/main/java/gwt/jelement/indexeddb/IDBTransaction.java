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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="IDBTransaction", isNative = true)
public class IDBTransaction extends EventTarget {
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="oncomplete")
    private EventHandlerNonNull oncomplete;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="mode")
    private String mode;
    
    @JsProperty(name="objectStoreNames")
    public native DOMStringList getObjectStoreNames();
    
    @JsProperty(name="db")
    public native IDBDatabase getDb();
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsOverlay
    public final EventHandlerNonNull getOnAbort(){
        return this.onabort;
    }
    
    @JsOverlay
    public final void setOnAbort(EventHandlerNonNull onabort){
        this.onabort = onabort;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnComplete(){
        return this.oncomplete;
    }
    
    @JsOverlay
    public final void setOnComplete(EventHandlerNonNull oncomplete){
        this.oncomplete = oncomplete;
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
    public final IDBTransactionMode getMode(){
       return IDBTransactionMode.of(mode);
    }
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "objectStore")
    public native IDBObjectStore objectStore(String name);
    
}

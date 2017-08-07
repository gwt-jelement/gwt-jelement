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
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="IDBRequest", isNative = true)
public class IDBRequest extends EventTarget {
    @JsProperty(name="onsuccess")
    private EventHandlerNonNull onsuccess;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="readyState")
    private String readyState;
    
    @JsProperty(name="result")
    public native Object getResult();
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsProperty(name="source")
    public native Object getSource();
    
    @JsProperty(name="transaction")
    public native IDBTransaction getTransaction();
    
    @JsOverlay
    public final EventHandlerNonNull getOnSuccess(){
        return this.onsuccess;
    }
    
    @JsOverlay
    public final void setOnSuccess(EventHandlerNonNull onsuccess){
        this.onsuccess = onsuccess;
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
    public final IDBRequestReadyState getReadyState(){
       return IDBRequestReadyState.of(readyState);
    }
    
}

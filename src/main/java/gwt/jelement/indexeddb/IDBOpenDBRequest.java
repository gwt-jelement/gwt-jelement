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

import gwt.jelement.events.EventHandlerNonNull;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="IDBOpenDBRequest", isNative = true)
public class IDBOpenDBRequest extends IDBRequest{
    @JsProperty(name="onblocked")
    private EventHandlerNonNull onblocked;
    
    @JsProperty(name="onupgradeneeded")
    private EventHandlerNonNull onupgradeneeded;
    
    @JsConstructor
    public IDBOpenDBRequest(){
        super();
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBlocked(){
        return this.onblocked;
    }
    
    @JsOverlay
    public final void setOnBlocked(EventHandlerNonNull onblocked){
        this.onblocked = onblocked;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUpgradeneeded(){
        return this.onupgradeneeded;
    }
    
    @JsOverlay
    public final void setOnUpgradeneeded(EventHandlerNonNull onupgradeneeded){
        this.onupgradeneeded = onupgradeneeded;
    }
    
}

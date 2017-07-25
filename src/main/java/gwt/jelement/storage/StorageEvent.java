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

import gwt.jelement.events.Event;
import gwt.jelement.storage.Storage;
import gwt.jelement.storage.StorageEventInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class StorageEvent extends Event{
    
    @JsConstructor
    public StorageEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public StorageEvent(String type, StorageEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="key")
    public native String getKey();
    
    @JsProperty(name="oldValue")
    public native String getOldValue();
    
    @JsProperty(name="newValue")
    public native String getNewValue();
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="storageArea")
    public native Storage getStorageArea();
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent();
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String keyArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String keyArg, String oldValueArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String keyArg, String oldValueArg, String newValueArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String keyArg, String oldValueArg, String newValueArg, String urlArg);
    
    
    @JsMethod(name = "initStorageEvent")
    public native void initStorageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String keyArg, String oldValueArg, String newValueArg, String urlArg, Storage storageAreaArg);
    
    
}

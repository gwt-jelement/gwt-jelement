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

import gwt.jelement.events.EventInit;
import gwt.jelement.storage.Storage;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class StorageEventInit extends EventInit{

    public StorageEventInit(){
    }

    @JsProperty(name="key")
    public String key;

    @JsOverlay
    public final String getKey(){
        return this.key;
    }

    @JsOverlay
    public final void setKey(String key){
        this.key = key;
    }

    @JsProperty(name="oldValue")
    public String oldValue;

    @JsOverlay
    public final String getOldValue(){
        return this.oldValue;
    }

    @JsOverlay
    public final void setOldValue(String oldValue){
        this.oldValue = oldValue;
    }

    @JsProperty(name="newValue")
    public String newValue;

    @JsOverlay
    public final String getNewValue(){
        return this.newValue;
    }

    @JsOverlay
    public final void setNewValue(String newValue){
        this.newValue = newValue;
    }

    @JsProperty(name="url")
    public String url;

    @JsOverlay
    public final String getUrl(){
        return this.url;
    }

    @JsOverlay
    public final void setUrl(String url){
        this.url = url;
    }

    @JsProperty(name="storageArea")
    public Storage storageArea;

    @JsOverlay
    public final Storage getStorageArea(){
        return this.storageArea;
    }

    @JsOverlay
    public final void setStorageArea(Storage storageArea){
        this.storageArea = storageArea;
    }


}

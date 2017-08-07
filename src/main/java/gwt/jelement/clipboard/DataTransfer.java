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
package gwt.jelement.clipboard;

import gwt.jelement.core.IsObject;
import gwt.jelement.dom.Element;
import gwt.jelement.fileapi.FileList;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DataTransfer", isNative = true)
public class DataTransfer implements IsObject {
    @JsConstructor
    public DataTransfer(){
    }
    
    @JsProperty(name="dropEffect")
    public native String getDropEffect();
    
    @JsProperty(name="dropEffect")
    public native void setDropEffect(String dropEffect);
    
    @JsProperty(name="effectAllowed")
    public native String getEffectAllowed();
    
    @JsProperty(name="effectAllowed")
    public native void setEffectAllowed(String effectAllowed);
    
    @JsProperty(name="items")
    public native DataTransferItemList getItems();
    
    @JsProperty(name="types")
    public native String[] getTypes();
    
    @JsProperty(name="files")
    public native FileList getFiles();
    
    @JsMethod(name = "clearData")
    public native void clearData();
    
    @JsMethod(name = "clearData")
    public native void clearData(String format);
    
    @JsMethod(name = "getData")
    public native String getData(String format);
    
    @JsMethod(name = "setData")
    public native void setData(String format, String data);
    
    @JsMethod(name = "setDragImage")
    public native void setDragImage(Element image, double x, double y);
    
}

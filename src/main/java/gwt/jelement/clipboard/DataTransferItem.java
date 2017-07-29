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

import gwt.jelement.core.JsObject;
import gwt.jelement.dom.FunctionStringCallback;
import gwt.jelement.fileapi.File;
import gwt.jelement.filesystem.Entry;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DataTransferItem", isNative = true)
public class DataTransferItem extends JsObject{
    @JsConstructor
    public DataTransferItem(){
        super();
    }
    
    @JsProperty(name="kind")
    public native String getKind();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsMethod(name = "getAsFile")
    public native File getAsFile();
    
    @JsMethod(name = "getAsString")
    public native void getAsString(FunctionStringCallback callback);
    
    @JsMethod(name = "webkitGetAsEntry")
    public native Entry webkitGetAsEntry();
    
}

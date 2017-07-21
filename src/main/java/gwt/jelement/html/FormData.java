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
package gwt.jelement.html;

import gwt.jelement.fileapi.Blob;
import gwt.jelement.fileapi.File;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FormData{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface FormDataEntryValue {
        @JsOverlay
        default File asFile(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isFile(){
            return (Object) this instanceof File;
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
    }
    
    @JsMethod(name = "append")
    public native void append(String name, String value);
    
    @JsMethod(name = "append")
    public native void append(String name, Blob value);
    
    @JsMethod(name = "append")
    public native void append(String name, Blob value, String filename);
    
    @JsMethod(name = "delete")
    public native void delete(String name);
    
    @JsMethod(name = "get")
    public native FormData.FormDataEntryValue get(String name);
    
    @JsMethod(name = "getAll")
    public native FormData.FormDataEntryValue[] getAll(String name);
    
    @JsMethod(name = "has")
    public native boolean has(String name);
    
    @JsMethod(name = "set")
    public native void set(String name, String value);
    
    @JsMethod(name = "set")
    public native void set(String name, Blob value);
    
    @JsMethod(name = "set")
    public native void set(String name, Blob value, String filename);
    
}

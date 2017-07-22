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
package gwt.jelement.fileapi;

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.DOMException;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FileReader extends EventTarget{
    public static int EMPTY;
    public static int LOADING;
    public static int DONE;
    
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface StringOrArrayBufferUnionType {
        @JsOverlay
        static StringOrArrayBufferUnionType of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static StringOrArrayBufferUnionType of(ArrayBuffer value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ArrayBuffer asArrayBuffer(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isArrayBuffer(){
            return (Object) this instanceof ArrayBuffer;
        }
    
    }
    
    @JsConstructor
    public FileReader(){
        super();
    }
    
    @JsProperty(name="onloadstart")
    public EventHandlerNonNull onloadstart;
    
    @JsProperty(name="onprogress")
    public EventHandlerNonNull onprogress;
    
    @JsProperty(name="onload")
    public EventHandlerNonNull onload;
    
    @JsProperty(name="onabort")
    public EventHandlerNonNull onabort;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onloadend")
    public EventHandlerNonNull onloadend;
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="result")
    public native FileReader.StringOrArrayBufferUnionType getResult();
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "readAsArrayBuffer")
    public native void readAsArrayBuffer(Blob blob);
    
    @JsMethod(name = "readAsBinaryString")
    public native void readAsBinaryString(Blob blob);
    
    @JsMethod(name = "readAsDataURL")
    public native void readAsDataURL(Blob blob);
    
    @JsMethod(name = "readAsText")
    public native void readAsText(Blob blob);
    
    @JsMethod(name = "readAsText")
    public native void readAsText(Blob blob, String label);
    
}

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

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.dom.DOMException;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="FileReader", isNative = true)
public class FileReader extends EventTarget{
    public static short EMPTY;
    public static short LOADING;
    public static short DONE;
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ResultUnion {
        @JsOverlay
        static ResultUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ResultUnion of(ArrayBuffer value){
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
    
    @JsProperty(name="result")
    private ResultUnion result;
    
    @JsProperty(name="onloadstart")
    private EventHandlerNonNull onloadstart;
    
    @JsProperty(name="onprogress")
    private EventHandlerNonNull onprogress;
    
    @JsProperty(name="onload")
    private EventHandlerNonNull onload;
    
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onloadend")
    private EventHandlerNonNull onloadend;
    
    @JsConstructor
    public FileReader(){
        super();
    }
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsOverlay
    public final ResultUnion getResult(){
        return this.result;
    }
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadstart(){
        return this.onloadstart;
    }
    
    @JsOverlay
    public final void setOnLoadstart(EventHandlerNonNull onloadstart){
        this.onloadstart = onloadstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnProgress(){
        return this.onprogress;
    }
    
    @JsOverlay
    public final void setOnProgress(EventHandlerNonNull onprogress){
        this.onprogress = onprogress;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoad(){
        return this.onload;
    }
    
    @JsOverlay
    public final void setOnLoad(EventHandlerNonNull onload){
        this.onload = onload;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAbort(){
        return this.onabort;
    }
    
    @JsOverlay
    public final void setOnAbort(EventHandlerNonNull onabort){
        this.onabort = onabort;
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
    public final EventHandlerNonNull getOnLoadend(){
        return this.onloadend;
    }
    
    @JsOverlay
    public final void setOnLoadend(EventHandlerNonNull onloadend){
        this.onloadend = onloadend;
    }
    
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

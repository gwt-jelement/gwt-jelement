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
package gwt.jelement.filesystem;

import gwt.jelement.dom.DOMException;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fileapi.Blob;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FileWriter extends EventTarget{
    public static final int INIT = 0;
    public static final int WRITING = 1;
    public static final int DONE = 2;
    
    
    @JsConstructor
    public FileWriter(){
        super();
    }
    
    @JsProperty(name="onwritestart")
    public EventHandlerNonNull onwritestart;
    
    @JsProperty(name="onprogress")
    public EventHandlerNonNull onprogress;
    
    @JsProperty(name="onwrite")
    public EventHandlerNonNull onwrite;
    
    @JsProperty(name="onabort")
    public EventHandlerNonNull onabort;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onwriteend")
    public EventHandlerNonNull onwriteend;
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsProperty(name="position")
    public native long getPosition();
    
    @JsProperty(name="length")
    public native long getLength();
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "seek")
    public native void seek(long position);
    
    @JsMethod(name = "truncate")
    public native void truncate(long size);
    
    @JsMethod(name = "write")
    public native void write(Blob data);
    
}

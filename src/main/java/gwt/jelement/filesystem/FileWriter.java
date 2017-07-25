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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FileWriter extends EventTarget{
    public static int INIT;
    public static int WRITING;
    public static int DONE;
    
    
    @JsProperty(name="onwritestart")
    private EventHandlerNonNull onwritestart;
    
    @JsProperty(name="onprogress")
    private EventHandlerNonNull onprogress;
    
    @JsProperty(name="onwrite")
    private EventHandlerNonNull onwrite;
    
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onwriteend")
    private EventHandlerNonNull onwriteend;
    
    @JsConstructor
    public FileWriter(){
        super();
    }
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="error")
    public native DOMException getError();
    
    @JsProperty(name="position")
    public native double getPosition();
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsOverlay
    public final EventHandlerNonNull getOnWritestart(){
        return this.onwritestart;
    }
    
    @JsOverlay
    public final void setOnWritestart(EventHandlerNonNull onwritestart){
        this.onwritestart = onwritestart;
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
    public final EventHandlerNonNull getOnWrite(){
        return this.onwrite;
    }
    
    @JsOverlay
    public final void setOnWrite(EventHandlerNonNull onwrite){
        this.onwrite = onwrite;
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
    public final EventHandlerNonNull getOnWriteend(){
        return this.onwriteend;
    }
    
    @JsOverlay
    public final void setOnWriteend(EventHandlerNonNull onwriteend){
        this.onwriteend = onwriteend;
    }
    
    @JsMethod(name = "abort")
    public native void abort();
    
    
    @JsMethod(name = "seek")
    public native void seek(double position);
    
    
    @JsMethod(name = "truncate")
    public native void truncate(double size);
    
    
    @JsMethod(name = "write")
    public native void write(Blob data);
    
    
}

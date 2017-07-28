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
package gwt.jelement.loader.appcache;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ApplicationCache", isNative = true)
public class ApplicationCache extends EventTarget{
    public static short UNCACHED;
    public static short IDLE;
    public static short CHECKING;
    public static short DOWNLOADING;
    public static short UPDATEREADY;
    public static short OBSOLETE;
    
    @JsProperty(name="onchecking")
    private EventHandlerNonNull onchecking;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onnoupdate")
    private EventHandlerNonNull onnoupdate;
    
    @JsProperty(name="ondownloading")
    private EventHandlerNonNull ondownloading;
    
    @JsProperty(name="onprogress")
    private EventHandlerNonNull onprogress;
    
    @JsProperty(name="onupdateready")
    private EventHandlerNonNull onupdateready;
    
    @JsProperty(name="oncached")
    private EventHandlerNonNull oncached;
    
    @JsProperty(name="onobsolete")
    private EventHandlerNonNull onobsolete;
    
    @JsConstructor
    public ApplicationCache(){
        super();
    }
    
    @JsProperty(name="status")
    public native short getStatus();
    
    @JsOverlay
    public final EventHandlerNonNull getOnChecking(){
        return this.onchecking;
    }
    
    @JsOverlay
    public final void setOnChecking(EventHandlerNonNull onchecking){
        this.onchecking = onchecking;
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
    public final EventHandlerNonNull getOnNoupdate(){
        return this.onnoupdate;
    }
    
    @JsOverlay
    public final void setOnNoupdate(EventHandlerNonNull onnoupdate){
        this.onnoupdate = onnoupdate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDownloading(){
        return this.ondownloading;
    }
    
    @JsOverlay
    public final void setOnDownloading(EventHandlerNonNull ondownloading){
        this.ondownloading = ondownloading;
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
    public final EventHandlerNonNull getOnUpdateready(){
        return this.onupdateready;
    }
    
    @JsOverlay
    public final void setOnUpdateready(EventHandlerNonNull onupdateready){
        this.onupdateready = onupdateready;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCached(){
        return this.oncached;
    }
    
    @JsOverlay
    public final void setOnCached(EventHandlerNonNull oncached){
        this.oncached = oncached;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnObsolete(){
        return this.onobsolete;
    }
    
    @JsOverlay
    public final void setOnObsolete(EventHandlerNonNull onobsolete){
        this.onobsolete = onobsolete;
    }
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "swapCache")
    public native void swapCache();
    
    @JsMethod(name = "update")
    public native void update();
    
}

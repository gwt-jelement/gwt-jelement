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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ApplicationCache extends EventTarget{
    public static int UNCACHED;
    public static int IDLE;
    public static int CHECKING;
    public static int DOWNLOADING;
    public static int UPDATEREADY;
    public static int OBSOLETE;
    
    
    @JsConstructor
    public ApplicationCache(){
        super();
    }
    
    @JsProperty(name="onchecking")
    public EventHandlerNonNull onchecking;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onnoupdate")
    public EventHandlerNonNull onnoupdate;
    
    @JsProperty(name="ondownloading")
    public EventHandlerNonNull ondownloading;
    
    @JsProperty(name="onprogress")
    public EventHandlerNonNull onprogress;
    
    @JsProperty(name="onupdateready")
    public EventHandlerNonNull onupdateready;
    
    @JsProperty(name="oncached")
    public EventHandlerNonNull oncached;
    
    @JsProperty(name="onobsolete")
    public EventHandlerNonNull onobsolete;
    
    @JsProperty(name="status")
    public native short getStatus();
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "swapCache")
    public native void swapCache();
    
    @JsMethod(name = "update")
    public native void update();
    
}

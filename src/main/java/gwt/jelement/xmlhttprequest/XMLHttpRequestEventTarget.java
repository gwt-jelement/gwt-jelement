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
package gwt.jelement.xmlhttprequest;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="XMLHttpRequestEventTarget", isNative = true)
public class XMLHttpRequestEventTarget extends EventTarget{
    @JsProperty(name="onloadstart")
    private EventHandlerNonNull onloadstart;
    
    @JsProperty(name="onprogress")
    private EventHandlerNonNull onprogress;
    
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onload")
    private EventHandlerNonNull onload;
    
    @JsProperty(name="ontimeout")
    private EventHandlerNonNull ontimeout;
    
    @JsProperty(name="onloadend")
    private EventHandlerNonNull onloadend;
    
    @JsConstructor
    public XMLHttpRequestEventTarget(){
        super();
    }
    
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
    public final EventHandlerNonNull getOnLoad(){
        return this.onload;
    }
    
    @JsOverlay
    public final void setOnLoad(EventHandlerNonNull onload){
        this.onload = onload;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTimeout(){
        return this.ontimeout;
    }
    
    @JsOverlay
    public final void setOnTimeout(EventHandlerNonNull ontimeout){
        this.ontimeout = ontimeout;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadend(){
        return this.onloadend;
    }
    
    @JsOverlay
    public final void setOnLoadend(EventHandlerNonNull onloadend){
        this.onloadend = onloadend;
    }
    
}

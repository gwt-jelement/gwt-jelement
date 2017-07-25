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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLFrameSetElement extends HTMLElement{
    
    @JsProperty(name="onorientationchange")
    private EventHandlerNonNull onorientationchange;
    
    @JsProperty(name="onbeforeunload")
    private EventHandlerNonNull onbeforeunload;
    
    @JsProperty(name="onhashchange")
    private EventHandlerNonNull onhashchange;
    
    @JsProperty(name="onlanguagechange")
    private EventHandlerNonNull onlanguagechange;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    private EventHandlerNonNull onmessageerror;
    
    @JsProperty(name="onoffline")
    private EventHandlerNonNull onoffline;
    
    @JsProperty(name="ononline")
    private EventHandlerNonNull ononline;
    
    @JsProperty(name="onpagehide")
    private EventHandlerNonNull onpagehide;
    
    @JsProperty(name="onpageshow")
    private EventHandlerNonNull onpageshow;
    
    @JsProperty(name="onpopstate")
    private EventHandlerNonNull onpopstate;
    
    @JsProperty(name="onrejectionhandled")
    private EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onstorage")
    private EventHandlerNonNull onstorage;
    
    @JsProperty(name="onunhandledrejection")
    private EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="onunload")
    private EventHandlerNonNull onunload;
    
    @JsConstructor
    public HTMLFrameSetElement(){
        super();
    }
    
    @JsProperty(name="cols")
    public native String getCols();
    
    @JsProperty(name="cols")
    public native void setCols(String cols);
    
    @JsProperty(name="rows")
    public native String getRows();
    
    @JsProperty(name="rows")
    public native void setRows(String rows);
    
    @JsOverlay
    public final EventHandlerNonNull getOnOrientationchange(){
        return this.onorientationchange;
    }
    
    @JsOverlay
    public final void setOnOrientationchange(EventHandlerNonNull onorientationchange){
        this.onorientationchange = onorientationchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBeforeunload(){
        return this.onbeforeunload;
    }
    
    @JsOverlay
    public final void setOnBeforeunload(EventHandlerNonNull onbeforeunload){
        this.onbeforeunload = onbeforeunload;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnHashchange(){
        return this.onhashchange;
    }
    
    @JsOverlay
    public final void setOnHashchange(EventHandlerNonNull onhashchange){
        this.onhashchange = onhashchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLanguagechange(){
        return this.onlanguagechange;
    }
    
    @JsOverlay
    public final void setOnLanguagechange(EventHandlerNonNull onlanguagechange){
        this.onlanguagechange = onlanguagechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessageerror(){
        return this.onmessageerror;
    }
    
    @JsOverlay
    public final void setOnMessageerror(EventHandlerNonNull onmessageerror){
        this.onmessageerror = onmessageerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnOffline(){
        return this.onoffline;
    }
    
    @JsOverlay
    public final void setOnOffline(EventHandlerNonNull onoffline){
        this.onoffline = onoffline;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnOnline(){
        return this.ononline;
    }
    
    @JsOverlay
    public final void setOnOnline(EventHandlerNonNull ononline){
        this.ononline = ononline;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPagehide(){
        return this.onpagehide;
    }
    
    @JsOverlay
    public final void setOnPagehide(EventHandlerNonNull onpagehide){
        this.onpagehide = onpagehide;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPageshow(){
        return this.onpageshow;
    }
    
    @JsOverlay
    public final void setOnPageshow(EventHandlerNonNull onpageshow){
        this.onpageshow = onpageshow;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPopstate(){
        return this.onpopstate;
    }
    
    @JsOverlay
    public final void setOnPopstate(EventHandlerNonNull onpopstate){
        this.onpopstate = onpopstate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRejectionhandled(){
        return this.onrejectionhandled;
    }
    
    @JsOverlay
    public final void setOnRejectionhandled(EventHandlerNonNull onrejectionhandled){
        this.onrejectionhandled = onrejectionhandled;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnStorage(){
        return this.onstorage;
    }
    
    @JsOverlay
    public final void setOnStorage(EventHandlerNonNull onstorage){
        this.onstorage = onstorage;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUnhandledrejection(){
        return this.onunhandledrejection;
    }
    
    @JsOverlay
    public final void setOnUnhandledrejection(EventHandlerNonNull onunhandledrejection){
        this.onunhandledrejection = onunhandledrejection;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUnload(){
        return this.onunload;
    }
    
    @JsOverlay
    public final void setOnUnload(EventHandlerNonNull onunload){
        this.onunload = onunload;
    }
    
    
}

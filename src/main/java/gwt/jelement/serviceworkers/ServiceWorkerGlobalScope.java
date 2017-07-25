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
package gwt.jelement.serviceworkers;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import gwt.jelement.serviceworkers.Clients;
import gwt.jelement.serviceworkers.ServiceWorkerRegistration;
import gwt.jelement.workers.WorkerGlobalScope;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ServiceWorkerGlobalScope extends WorkerGlobalScope{
    
    @JsProperty(name="onactivate")
    private EventHandlerNonNull onactivate;
    
    @JsProperty(name="onfetch")
    private EventHandlerNonNull onfetch;
    
    @JsProperty(name="oninstall")
    private EventHandlerNonNull oninstall;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="onforeignfetch")
    private EventHandlerNonNull onforeignfetch;
    
    @JsProperty(name="onbackgroundfetched")
    private EventHandlerNonNull onbackgroundfetched;
    
    @JsProperty(name="onbackgroundfetchfail")
    private EventHandlerNonNull onbackgroundfetchfail;
    
    @JsProperty(name="onbackgroundfetchabort")
    private EventHandlerNonNull onbackgroundfetchabort;
    
    @JsProperty(name="onbackgroundfetchclick")
    private EventHandlerNonNull onbackgroundfetchclick;
    
    @JsProperty(name="onsync")
    private EventHandlerNonNull onsync;
    
    @JsProperty(name="onnotificationclick")
    private EventHandlerNonNull onnotificationclick;
    
    @JsProperty(name="onnotificationclose")
    private EventHandlerNonNull onnotificationclose;
    
    @JsProperty(name="onpush")
    private EventHandlerNonNull onpush;
    
    @JsConstructor
    public ServiceWorkerGlobalScope(){
        super();
    }
    
    @JsProperty(name="clients")
    public native Clients getClients();
    
    @JsProperty(name="registration")
    public native ServiceWorkerRegistration getRegistration();
    
    @JsOverlay
    public final EventHandlerNonNull getOnActivate(){
        return this.onactivate;
    }
    
    @JsOverlay
    public final void setOnActivate(EventHandlerNonNull onactivate){
        this.onactivate = onactivate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnFetch(){
        return this.onfetch;
    }
    
    @JsOverlay
    public final void setOnFetch(EventHandlerNonNull onfetch){
        this.onfetch = onfetch;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnInstall(){
        return this.oninstall;
    }
    
    @JsOverlay
    public final void setOnInstall(EventHandlerNonNull oninstall){
        this.oninstall = oninstall;
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
    public final EventHandlerNonNull getOnForeignfetch(){
        return this.onforeignfetch;
    }
    
    @JsOverlay
    public final void setOnForeignfetch(EventHandlerNonNull onforeignfetch){
        this.onforeignfetch = onforeignfetch;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBackgroundfetched(){
        return this.onbackgroundfetched;
    }
    
    @JsOverlay
    public final void setOnBackgroundfetched(EventHandlerNonNull onbackgroundfetched){
        this.onbackgroundfetched = onbackgroundfetched;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBackgroundfetchfail(){
        return this.onbackgroundfetchfail;
    }
    
    @JsOverlay
    public final void setOnBackgroundfetchfail(EventHandlerNonNull onbackgroundfetchfail){
        this.onbackgroundfetchfail = onbackgroundfetchfail;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBackgroundfetchabort(){
        return this.onbackgroundfetchabort;
    }
    
    @JsOverlay
    public final void setOnBackgroundfetchabort(EventHandlerNonNull onbackgroundfetchabort){
        this.onbackgroundfetchabort = onbackgroundfetchabort;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBackgroundfetchclick(){
        return this.onbackgroundfetchclick;
    }
    
    @JsOverlay
    public final void setOnBackgroundfetchclick(EventHandlerNonNull onbackgroundfetchclick){
        this.onbackgroundfetchclick = onbackgroundfetchclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSync(){
        return this.onsync;
    }
    
    @JsOverlay
    public final void setOnSync(EventHandlerNonNull onsync){
        this.onsync = onsync;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnNotificationclick(){
        return this.onnotificationclick;
    }
    
    @JsOverlay
    public final void setOnNotificationclick(EventHandlerNonNull onnotificationclick){
        this.onnotificationclick = onnotificationclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnNotificationclose(){
        return this.onnotificationclose;
    }
    
    @JsOverlay
    public final void setOnNotificationclose(EventHandlerNonNull onnotificationclose){
        this.onnotificationclose = onnotificationclose;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPush(){
        return this.onpush;
    }
    
    @JsOverlay
    public final void setOnPush(EventHandlerNonNull onpush){
        this.onpush = onpush;
    }
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input);
    
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input);
    
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input, Object init);
    
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, Object init);
    
    
    @JsMethod(name = "skipWaiting")
    public native Promise<Void> skipWaiting();
    
    
}

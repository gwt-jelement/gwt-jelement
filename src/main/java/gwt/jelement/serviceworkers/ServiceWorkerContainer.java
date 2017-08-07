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

import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ServiceWorkerContainer", isNative = true)
public class ServiceWorkerContainer extends EventTarget {
    @JsProperty(name="oncontrollerchange")
    private EventHandlerNonNull oncontrollerchange;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="controller")
    public native ServiceWorker getController();
    
    @JsProperty(name="ready")
    public native Promise<ServiceWorkerRegistration> getReady();
    
    @JsOverlay
    public final EventHandlerNonNull getOnControllerchange(){
        return this.oncontrollerchange;
    }
    
    @JsOverlay
    public final void setOnControllerchange(EventHandlerNonNull oncontrollerchange){
        this.oncontrollerchange = oncontrollerchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsMethod(name = "getRegistration")
    public native Promise<ServiceWorkerRegistration> getRegistration();
    
    @JsMethod(name = "getRegistration")
    public native Promise<ServiceWorkerRegistration> getRegistration(String documentURL);
    
    @JsMethod(name = "getRegistrations")
    public native Promise<ServiceWorkerRegistration[]> getRegistrations();
    
    @JsMethod(name = "register")
    public native Promise<ServiceWorkerRegistration> register(String url);
    
    @JsMethod(name = "register")
    public native Promise<ServiceWorkerRegistration> register(String url, RegistrationOptions options);
    
}

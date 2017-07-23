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
import gwt.jelement.events.EventTarget;
import gwt.jelement.serviceworkers.RegistrationOptions;
import gwt.jelement.serviceworkers.ServiceWorker;
import gwt.jelement.serviceworkers.ServiceWorkerRegistration;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ServiceWorkerContainer extends EventTarget{
    
    @JsConstructor
    public ServiceWorkerContainer(){
        super();
    }
    
    @JsProperty(name="controller")
    public ServiceWorker controller;
    
    @JsProperty(name="ready")
    public Promise<ServiceWorkerRegistration> ready;
    
    @JsProperty(name="oncontrollerchange")
    public EventHandlerNonNull oncontrollerchange;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
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

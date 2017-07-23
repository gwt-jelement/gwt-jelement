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

import gwt.jelement.background_fetch.BackgroundFetchManager;
import gwt.jelement.background_sync.SyncManager;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.notifications.GetNotificationOptions;
import gwt.jelement.notifications.Notification;
import gwt.jelement.notifications.NotificationOptions;
import gwt.jelement.push_messaging.PushManager;
import gwt.jelement.serviceworkers.NavigationPreloadManager;
import gwt.jelement.serviceworkers.ServiceWorker;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ServiceWorkerRegistration extends EventTarget{
    
    @JsConstructor
    public ServiceWorkerRegistration(){
        super();
    }
    
    @JsProperty(name="installing")
    public ServiceWorker installing;
    
    @JsProperty(name="waiting")
    public ServiceWorker waiting;
    
    @JsProperty(name="active")
    public ServiceWorker active;
    
    @JsProperty(name="navigationPreload")
    public NavigationPreloadManager navigationPreload;
    
    @JsProperty(name="scope")
    public String scope;
    
    @JsProperty(name="onupdatefound")
    public EventHandlerNonNull onupdatefound;
    
    @JsProperty(name="backgroundFetch")
    public BackgroundFetchManager backgroundFetch;
    
    @JsProperty(name="sync")
    public SyncManager sync;
    
    @JsProperty(name="pushManager")
    public PushManager pushManager;
    
    @JsMethod(name = "getNotifications")
    public native Promise<Notification[]> getNotifications();
    
    @JsMethod(name = "getNotifications")
    public native Promise<Notification[]> getNotifications(GetNotificationOptions filter);
    
    @JsMethod(name = "showNotification")
    public native Promise showNotification(String title);
    
    @JsMethod(name = "showNotification")
    public native Promise showNotification(String title, NotificationOptions options);
    
    @JsMethod(name = "unregister")
    public native Promise<Boolean> unregister();
    
    @JsMethod(name = "update")
    public native Promise<Void> update();
    
}

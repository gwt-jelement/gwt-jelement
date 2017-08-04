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
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ServiceWorkerRegistration", isNative = true)
public class ServiceWorkerRegistration extends EventTarget{
    @JsProperty(name="onupdatefound")
    private EventHandlerNonNull onupdatefound;
    
    @JsProperty(name="installing")
    public native ServiceWorker getInstalling();
    
    @JsProperty(name="waiting")
    public native ServiceWorker getWaiting();
    
    @JsProperty(name="active")
    public native ServiceWorker getActive();
    
    @JsProperty(name="navigationPreload")
    public native NavigationPreloadManager getNavigationPreload();
    
    @JsProperty(name="scope")
    public native String getScope();
    
    @JsOverlay
    public final EventHandlerNonNull getOnUpdatefound(){
        return this.onupdatefound;
    }
    
    @JsOverlay
    public final void setOnUpdatefound(EventHandlerNonNull onupdatefound){
        this.onupdatefound = onupdatefound;
    }
    
    @JsProperty(name="backgroundFetch")
    public native BackgroundFetchManager getBackgroundFetch();
    
    @JsProperty(name="sync")
    public native SyncManager getSync();
    
    @JsProperty(name="pushManager")
    public native PushManager getPushManager();
    
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

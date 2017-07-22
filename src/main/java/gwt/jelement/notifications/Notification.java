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
package gwt.jelement.notifications;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.notifications.NotificationAction;
import gwt.jelement.notifications.NotificationPermission;
import gwt.jelement.notifications.NotificationPermissionCallback;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Notification extends EventTarget{
    
    @JsConstructor
    public Notification(){
        super();
    }
    
    @JsProperty(name="onclick")
    public EventHandlerNonNull onclick;
    
    @JsProperty(name="onshow")
    public EventHandlerNonNull onshow;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsOverlay
    public static final NotificationPermission getPermissionAsNotificationPermission(){
        return NotificationPermission.of(getPermission());
    }
    
    @JsProperty(name="permission")
    public static native String getPermission();
    
    @JsProperty(name="maxActions")
    public static native double getMaxActions();
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsProperty(name="dir")
    public native String getDir();
    
    @JsProperty(name="lang")
    public native String getLang();
    
    @JsProperty(name="body")
    public native String getBody();
    
    @JsProperty(name="tag")
    public native String getTag();
    
    @JsProperty(name="image")
    public native String getImage();
    
    @JsProperty(name="icon")
    public native String getIcon();
    
    @JsProperty(name="badge")
    public native String getBadge();
    
    @JsProperty(name="vibrate")
    public native double[] getVibrate();
    
    @JsProperty(name="timestamp")
    public native double getTimestamp();
    
    @JsProperty(name="renotify")
    public native boolean getRenotify();
    
    @JsProperty(name="silent")
    public native boolean getSilent();
    
    @JsProperty(name="requireInteraction")
    public native boolean getRequireInteraction();
    
    @JsProperty(name="data")
    public native Object getData();
    
    @JsProperty(name="actions")
    public native NotificationAction[] getActions();
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "requestPermission")
    public native Promise<String> requestPermission();
    
    @JsMethod(name = "requestPermission")
    public native Promise<String> requestPermission(NotificationPermissionCallback deprecatedCallback);
    
}

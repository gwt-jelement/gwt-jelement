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
    
    @JsProperty(name="permission")
    public static String permission;
    
    @JsOverlay
    public final static NotificationPermission getPermission(){
       return NotificationPermission.of(permission);
    }
    
    @JsProperty(name="maxActions")
    public static double maxActions;
    
    @JsProperty(name="onclick")
    public EventHandlerNonNull onclick;
    
    @JsProperty(name="onshow")
    public EventHandlerNonNull onshow;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsProperty(name="title")
    public String title;
    
    @JsProperty(name="dir")
    public String dir;
    
    @JsProperty(name="lang")
    public String lang;
    
    @JsProperty(name="body")
    public String body;
    
    @JsProperty(name="tag")
    public String tag;
    
    @JsProperty(name="image")
    public String image;
    
    @JsProperty(name="icon")
    public String icon;
    
    @JsProperty(name="badge")
    public String badge;
    
    @JsProperty(name="vibrate")
    public double[] vibrate;
    
    @JsProperty(name="timestamp")
    public double timestamp;
    
    @JsProperty(name="renotify")
    public boolean renotify;
    
    @JsProperty(name="silent")
    public boolean silent;
    
    @JsProperty(name="requireInteraction")
    public boolean requireInteraction;
    
    @JsProperty(name="data")
    public Object data;
    
    @JsProperty(name="actions")
    public NotificationAction[] actions;
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "requestPermission")
    public native Promise<String> requestPermission();
    
    @JsMethod(name = "requestPermission")
    public native Promise<String> requestPermission(NotificationPermissionCallback deprecatedCallback);
    
}

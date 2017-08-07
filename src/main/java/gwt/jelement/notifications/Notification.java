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

import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Notification", isNative = true)
public class Notification extends EventTarget {
    @JsProperty(name="maxActions")
    public static double maxActions;
    
    @JsProperty(name="onclick")
    private EventHandlerNonNull onclick;
    
    @JsProperty(name="onshow")
    private EventHandlerNonNull onshow;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="permission")
    private static String permission;
    
    @JsConstructor
    public Notification(String title){
        super();
    }
    
    @JsConstructor
    public Notification(String title, NotificationOptions options){
        super();
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClick(){
        return this.onclick;
    }
    
    @JsOverlay
    public final void setOnClick(EventHandlerNonNull onclick){
        this.onclick = onclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnShow(){
        return this.onshow;
    }
    
    @JsOverlay
    public final void setOnShow(EventHandlerNonNull onshow){
        this.onshow = onshow;
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
    public final EventHandlerNonNull getOnClose(){
        return this.onclose;
    }
    
    @JsOverlay
    public final void setOnClose(EventHandlerNonNull onclose){
        this.onclose = onclose;
    }
    
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
    
    @JsOverlay
    public final static NotificationPermission getPermission(){
       return NotificationPermission.of(permission);
    }
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "requestPermission")
    public static native Promise<String> requestPermission();
    
    @JsMethod(name = "requestPermission")
    public static native Promise<String> requestPermission(NotificationPermissionCallback deprecatedCallback);
    
}

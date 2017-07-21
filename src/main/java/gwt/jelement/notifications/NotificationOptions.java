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

import gwt.jelement.notifications.NotificationAction;
import gwt.jelement.notifications.NotificationDirection;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class NotificationOptions{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface LongOrLongArrayUnionType {
        @JsOverlay
        default long asLong(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default long[] asLongArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isLong(){
            return (Object) this instanceof Long;
        }
    
        @JsOverlay
        default boolean isLongArray(){
            return (Object) this instanceof long[];
        }
    
    }
    
    @JsProperty(name="dir")
    public NotificationDirection dir = NotificationDirection.of("auto");

    @JsProperty(name="lang")
    public String lang = "";

    @JsProperty(name="body")
    public String body = "";

    @JsProperty(name="tag")
    public String tag = "";

    @JsProperty(name="image")
    public String image;

    @JsProperty(name="icon")
    public String icon;

    @JsProperty(name="badge")
    public String badge;

    @JsProperty(name="vibrate")
    public NotificationOptions.LongOrLongArrayUnionType vibrate;

    @JsProperty(name="timestamp")
    public long timestamp;

    @JsProperty(name="renotify")
    public boolean renotify = false;

    @JsProperty(name="silent")
    public boolean silent = false;

    @JsProperty(name="requireInteraction")
    public boolean requireInteraction = false;

    @JsProperty(name="data")
    public Any data = null;

    @JsProperty(name="actions")
    public NotificationAction[] actions = new NotificationAction[0];


}

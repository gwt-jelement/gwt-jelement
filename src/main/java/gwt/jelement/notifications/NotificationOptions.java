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
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class NotificationOptions{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface DoubleOrDoubleArrayUnionType {
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default double[] asDoubleArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isDoubleArray(){
            return (Object) this instanceof double[];
        }
    
    }
    
    @JsProperty(name="dir")
    public NotificationDirection dir;

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
    public NotificationOptions.DoubleOrDoubleArrayUnionType vibrate;

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


}

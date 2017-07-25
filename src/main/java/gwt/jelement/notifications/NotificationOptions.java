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

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class NotificationOptions{

    public NotificationOptions(){
    }

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface DoubleOrDoubleArrayUnionType {
        @JsOverlay
        static DoubleOrDoubleArrayUnionType of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static DoubleOrDoubleArrayUnionType of(double[] value){
            return Js.cast(value);
        }
    
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
    public String dir;

    @JsOverlay
    public final NotificationDirection getDir(){
        return NotificationDirection.of(this.dir);
    }

    @JsOverlay
    public final void setDir(NotificationDirection dir){
        this.dir = dir.getInternalValue();
    }

    @JsProperty(name="lang")
    public String lang;

    @JsOverlay
    public final String getLang(){
        return this.lang;
    }

    @JsOverlay
    public final void setLang(String lang){
        this.lang = lang;
    }

    @JsProperty(name="body")
    public String body;

    @JsOverlay
    public final String getBody(){
        return this.body;
    }

    @JsOverlay
    public final void setBody(String body){
        this.body = body;
    }

    @JsProperty(name="tag")
    public String tag;

    @JsOverlay
    public final String getTag(){
        return this.tag;
    }

    @JsOverlay
    public final void setTag(String tag){
        this.tag = tag;
    }

    @JsProperty(name="image")
    public String image;

    @JsOverlay
    public final String getImage(){
        return this.image;
    }

    @JsOverlay
    public final void setImage(String image){
        this.image = image;
    }

    @JsProperty(name="icon")
    public String icon;

    @JsOverlay
    public final String getIcon(){
        return this.icon;
    }

    @JsOverlay
    public final void setIcon(String icon){
        this.icon = icon;
    }

    @JsProperty(name="badge")
    public String badge;

    @JsOverlay
    public final String getBadge(){
        return this.badge;
    }

    @JsOverlay
    public final void setBadge(String badge){
        this.badge = badge;
    }

    @JsProperty(name="vibrate")
    public NotificationOptions.DoubleOrDoubleArrayUnionType vibrate;

    @JsOverlay
    public final void setVibrate(double vibrate){
        this.vibrate = NotificationOptions.DoubleOrDoubleArrayUnionType.of(vibrate);
    }

    @JsOverlay
    public final void setVibrate(double[] vibrate){
        this.vibrate = NotificationOptions.DoubleOrDoubleArrayUnionType.of(vibrate);
    }

    @JsProperty(name="timestamp")
    public double timestamp;

    @JsOverlay
    public final double getTimestamp(){
        return this.timestamp;
    }

    @JsOverlay
    public final void setTimestamp(double timestamp){
        this.timestamp = timestamp;
    }

    @JsProperty(name="renotify")
    public boolean renotify;

    @JsOverlay
    public final boolean getRenotify(){
        return this.renotify;
    }

    @JsOverlay
    public final void setRenotify(boolean renotify){
        this.renotify = renotify;
    }

    @JsProperty(name="silent")
    public boolean silent;

    @JsOverlay
    public final boolean getSilent(){
        return this.silent;
    }

    @JsOverlay
    public final void setSilent(boolean silent){
        this.silent = silent;
    }

    @JsProperty(name="requireInteraction")
    public boolean requireInteraction;

    @JsOverlay
    public final boolean getRequireInteraction(){
        return this.requireInteraction;
    }

    @JsOverlay
    public final void setRequireInteraction(boolean requireInteraction){
        this.requireInteraction = requireInteraction;
    }

    @JsProperty(name="data")
    public Object data;

    @JsOverlay
    public final Object getData(){
        return this.data;
    }

    @JsOverlay
    public final void setData(Object data){
        this.data = data;
    }

    @JsProperty(name="actions")
    public NotificationAction[] actions;

    @JsOverlay
    public final NotificationAction[] getActions(){
        return this.actions;
    }

    @JsOverlay
    public final void setActions(NotificationAction[] actions){
        this.actions = actions;
    }


}

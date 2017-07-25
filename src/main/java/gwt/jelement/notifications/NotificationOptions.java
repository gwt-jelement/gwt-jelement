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

    @JsProperty(name="dir")
    private String dir;

    @JsProperty(name="lang")
    private String lang;

    @JsProperty(name="body")
    private String body;

    @JsProperty(name="tag")
    private String tag;

    @JsProperty(name="image")
    private String image;

    @JsProperty(name="icon")
    private String icon;

    @JsProperty(name="badge")
    private String badge;

    @JsProperty(name="vibrate")
    private VibrateUnion vibrate;

    @JsProperty(name="timestamp")
    private double timestamp;

    @JsProperty(name="renotify")
    private boolean renotify;

    @JsProperty(name="silent")
    private boolean silent;

    @JsProperty(name="requireInteraction")
    private boolean requireInteraction;

    @JsProperty(name="data")
    private Object data;

    @JsProperty(name="actions")
    private NotificationAction[] actions;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface VibrateUnion {
        @JsOverlay
        static VibrateUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static VibrateUnion of(double[] value){
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
    
    public NotificationOptions(){
    }

    @JsOverlay
    public final NotificationDirection getDir(){
        return NotificationDirection.of(this.dir);
    }

    @JsOverlay
    public final void setDir(NotificationDirection dir){
        this.dir = dir.getInternalValue();
    }

    @JsOverlay
    public final String getLang(){
        return this.lang;
    }

    @JsOverlay
    public final void setLang(String lang){
        this.lang = lang;
    }

    @JsOverlay
    public final String getBody(){
        return this.body;
    }

    @JsOverlay
    public final void setBody(String body){
        this.body = body;
    }

    @JsOverlay
    public final String getTag(){
        return this.tag;
    }

    @JsOverlay
    public final void setTag(String tag){
        this.tag = tag;
    }

    @JsOverlay
    public final String getImage(){
        return this.image;
    }

    @JsOverlay
    public final void setImage(String image){
        this.image = image;
    }

    @JsOverlay
    public final String getIcon(){
        return this.icon;
    }

    @JsOverlay
    public final void setIcon(String icon){
        this.icon = icon;
    }

    @JsOverlay
    public final String getBadge(){
        return this.badge;
    }

    @JsOverlay
    public final void setBadge(String badge){
        this.badge = badge;
    }

    @JsOverlay
    public final void setVibrate(double vibrate){
        this.vibrate = NotificationOptions.VibrateUnion.of(vibrate);
    }

    @JsOverlay
    public final void setVibrate(double[] vibrate){
        this.vibrate = NotificationOptions.VibrateUnion.of(vibrate);
    }

    @JsOverlay
    public final double getTimestamp(){
        return this.timestamp;
    }

    @JsOverlay
    public final void setTimestamp(double timestamp){
        this.timestamp = timestamp;
    }

    @JsOverlay
    public final boolean getRenotify(){
        return this.renotify;
    }

    @JsOverlay
    public final void setRenotify(boolean renotify){
        this.renotify = renotify;
    }

    @JsOverlay
    public final boolean getSilent(){
        return this.silent;
    }

    @JsOverlay
    public final void setSilent(boolean silent){
        this.silent = silent;
    }

    @JsOverlay
    public final boolean getRequireInteraction(){
        return this.requireInteraction;
    }

    @JsOverlay
    public final void setRequireInteraction(boolean requireInteraction){
        this.requireInteraction = requireInteraction;
    }

    @JsOverlay
    public final Object getData(){
        return this.data;
    }

    @JsOverlay
    public final void setData(Object data){
        this.data = data;
    }

    @JsOverlay
    public final NotificationAction[] getActions(){
        return this.actions;
    }

    @JsOverlay
    public final void setActions(NotificationAction[] actions){
        this.actions = actions;
    }

}

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

import gwt.jelement.notifications.NotificationActionType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class NotificationAction{

    public NotificationAction(){
    }

    @JsProperty(name="type")
    public String type;

    @JsOverlay
    public final NotificationActionType getType(){
        return NotificationActionType.of(this.type);
    }

    @JsOverlay
    public final void setType(NotificationActionType type){
        this.type = type.getInternalValue();
    }

    @JsProperty(name="action")
    public String action;

    @JsOverlay
    public final String getAction(){
        return this.action;
    }

    @JsOverlay
    public final void setAction(String action){
        this.action = action;
    }

    @JsProperty(name="title")
    public String title;

    @JsOverlay
    public final String getTitle(){
        return this.title;
    }

    @JsOverlay
    public final void setTitle(String title){
        this.title = title;
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

    @JsProperty(name="placeholder")
    public String placeholder;

    @JsOverlay
    public final String getPlaceholder(){
        return this.placeholder;
    }

    @JsOverlay
    public final void setPlaceholder(String placeholder){
        this.placeholder = placeholder;
    }


}

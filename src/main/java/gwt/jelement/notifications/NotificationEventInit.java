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

import gwt.jelement.notifications.Notification;
import gwt.jelement.serviceworkers.ExtendableEventInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class NotificationEventInit extends ExtendableEventInit{

    public NotificationEventInit(){
    }

    @JsProperty(name="notification")
    public Notification notification;

    @JsOverlay
    public final Notification getNotification(){
        return this.notification;
    }

    @JsOverlay
    public final void setNotification(Notification notification){
        this.notification = notification;
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

    @JsProperty(name="reply")
    public String reply;

    @JsOverlay
    public final String getReply(){
        return this.reply;
    }

    @JsOverlay
    public final void setReply(String reply){
        this.reply = reply;
    }


}

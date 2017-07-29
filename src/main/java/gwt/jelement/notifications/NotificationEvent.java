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

import gwt.jelement.serviceworkers.ExtendableEvent;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="NotificationEvent", isNative = true)
public class NotificationEvent extends ExtendableEvent{
    @JsConstructor
    public NotificationEvent(String type, NotificationEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="notification")
    public native Notification getNotification();
    
    @JsProperty(name="action")
    public native String getAction();
    
    @JsProperty(name="reply")
    public native String getReply();
    
}

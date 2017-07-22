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
package gwt.jelement.push_messaging;

import gwt.jelement.push_messaging.PushEncryptionKeyName;
import gwt.jelement.push_messaging.PushSubscriptionOptions;
import elemental2.core.ArrayBuffer;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PushSubscription{
    
    @JsProperty(name="endpoint")
    public native String getEndpoint();
    
    @JsProperty(name="expirationTime")
    public native double getExpirationTime();
    
    @JsProperty(name="options")
    public native PushSubscriptionOptions getOptions();
    
    @JsOverlay
    public final ArrayBuffer getKey(PushEncryptionKeyName name){
        return getKey(name.getInternalValue());
    }
    
    @JsMethod(name = "getKey")
    public native ArrayBuffer getKey(String name);
    
    @JsMethod(name = "toJSON")
    public native Any toJSON();
    
    @JsMethod(name = "unsubscribe")
    public native Promise<Boolean> unsubscribe();
    
}

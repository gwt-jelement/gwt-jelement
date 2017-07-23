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
package gwt.jelement.encryptedmedia;

import gwt.jelement.encryptedmedia.MediaKeyStatusMap;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaKeySession extends EventTarget{
    
    @JsConstructor
    public MediaKeySession(){
        super();
    }
    
    @JsProperty(name="sessionId")
    public String sessionId;
    
    @JsProperty(name="expiration")
    public double expiration;
    
    @JsProperty(name="closed")
    public Promise closed;
    
    @JsProperty(name="keyStatuses")
    public MediaKeyStatusMap keyStatuses;
    
    @JsProperty(name="onkeystatuseschange")
    public EventHandlerNonNull onkeystatuseschange;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsMethod(name = "close")
    public native Promise<Void> close();
    
    @JsMethod(name = "generateRequest")
    public native Promise<Void> generateRequest(String initDataType, ArrayBuffer initData);
    
    @JsMethod(name = "generateRequest")
    public native Promise<Void> generateRequest(String initDataType, ArrayBufferView initData);
    
    @JsMethod(name = "load")
    public native Promise<Boolean> load(String sessionId);
    
    @JsMethod(name = "remove")
    public native Promise<Void> remove();
    
    @JsMethod(name = "update")
    public native Promise<Void> update(ArrayBuffer response);
    
    @JsMethod(name = "update")
    public native Promise<Void> update(ArrayBufferView response);
    
}

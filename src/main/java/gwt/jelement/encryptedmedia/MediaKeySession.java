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

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaKeySession", isNative = true)
public class MediaKeySession extends EventTarget {
    @JsProperty(name="onkeystatuseschange")
    private EventHandlerNonNull onkeystatuseschange;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="sessionId")
    public native String getSessionId();
    
    @JsProperty(name="expiration")
    public native double getExpiration();
    
    @JsProperty(name="closed")
    public native Promise getClosed();
    
    @JsProperty(name="keyStatuses")
    public native MediaKeyStatusMap getKeyStatuses();
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeystatuseschange(){
        return this.onkeystatuseschange;
    }
    
    @JsOverlay
    public final void setOnKeystatuseschange(EventHandlerNonNull onkeystatuseschange){
        this.onkeystatuseschange = onkeystatuseschange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
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

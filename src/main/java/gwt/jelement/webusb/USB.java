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
package gwt.jelement.webusb;

import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="USB", isNative = true)
public class USB extends EventTarget {
    @JsProperty(name="onconnect")
    private EventHandlerNonNull onconnect;
    
    @JsProperty(name="ondisconnect")
    private EventHandlerNonNull ondisconnect;
    
    @JsOverlay
    public final EventHandlerNonNull getOnConnect(){
        return this.onconnect;
    }
    
    @JsOverlay
    public final void setOnConnect(EventHandlerNonNull onconnect){
        this.onconnect = onconnect;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDisconnect(){
        return this.ondisconnect;
    }
    
    @JsOverlay
    public final void setOnDisconnect(EventHandlerNonNull ondisconnect){
        this.ondisconnect = ondisconnect;
    }
    
    @JsMethod(name = "getDevices")
    public native Promise<USBDevice[]> getDevices();
    
    @JsMethod(name = "requestDevice")
    public native Promise<USBDevice[]> requestDevice(USBDeviceRequestOptions options);
    
}

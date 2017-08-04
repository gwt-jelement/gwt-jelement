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
package gwt.jelement.bluetooth;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.DataView;
import gwt.jelement.core.Promise;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="BluetoothRemoteGATTCharacteristic", isNative = true)
public class BluetoothRemoteGATTCharacteristic extends EventTarget{
    @JsProperty(name="oncharacteristicvaluechanged")
    private EventHandlerNonNull oncharacteristicvaluechanged;
    
    @JsProperty(name="service")
    public native BluetoothRemoteGATTService getService();
    
    @JsProperty(name="uuid")
    public native String getUuid();
    
    @JsProperty(name="properties")
    public native BluetoothCharacteristicProperties getProperties();
    
    @JsProperty(name="value")
    public native DataView getValue();
    
    @JsOverlay
    public final EventHandlerNonNull getOnCharacteristicvaluechanged(){
        return this.oncharacteristicvaluechanged;
    }
    
    @JsOverlay
    public final void setOnCharacteristicvaluechanged(EventHandlerNonNull oncharacteristicvaluechanged){
        this.oncharacteristicvaluechanged = oncharacteristicvaluechanged;
    }
    
    @JsMethod(name = "getDescriptor")
    public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(String descriptor);
    
    @JsMethod(name = "getDescriptor")
    public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(double descriptor);
    
    @JsMethod(name = "getDescriptors")
    public native Promise<BluetoothRemoteGATTDescriptor[]> getDescriptors();
    
    @JsMethod(name = "getDescriptors")
    public native Promise<BluetoothRemoteGATTDescriptor[]> getDescriptors(String descriptor);
    
    @JsMethod(name = "getDescriptors")
    public native Promise<BluetoothRemoteGATTDescriptor[]> getDescriptors(double descriptor);
    
    @JsMethod(name = "readValue")
    public native Promise<DataView> readValue();
    
    @JsMethod(name = "startNotifications")
    public native Promise<BluetoothRemoteGATTCharacteristic> startNotifications();
    
    @JsMethod(name = "stopNotifications")
    public native Promise<BluetoothRemoteGATTCharacteristic> stopNotifications();
    
    @JsMethod(name = "writeValue")
    public native Promise<Void> writeValue(ArrayBuffer value);
    
    @JsMethod(name = "writeValue")
    public native Promise<Void> writeValue(ArrayBufferView value);
    
}

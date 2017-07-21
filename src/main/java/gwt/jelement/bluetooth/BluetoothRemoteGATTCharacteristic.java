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

import gwt.jelement.bluetooth.BluetoothCharacteristicProperties;
import gwt.jelement.bluetooth.BluetoothRemoteGATTCharacteristic;
import gwt.jelement.bluetooth.BluetoothRemoteGATTDescriptor;
import gwt.jelement.bluetooth.BluetoothRemoteGATTService;
import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.ArrayBufferView;
import gwt.jelement.dom.DataView;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class BluetoothRemoteGATTCharacteristic extends EventTarget{
    
    @JsConstructor
    public BluetoothRemoteGATTCharacteristic(){
        super();
    }
    
    @JsProperty(name="oncharacteristicvaluechanged")
    public EventHandlerNonNull oncharacteristicvaluechanged;
    
    @JsProperty(name="service")
    public native BluetoothRemoteGATTService getService();
    
    @JsProperty(name="uuid")
    public native String getUuid();
    
    @JsProperty(name="properties")
    public native BluetoothCharacteristicProperties getProperties();
    
    @JsProperty(name="value")
    public native DataView getValue();
    
    @JsMethod(name = "getDescriptor")
    public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(String descriptor);
    
    @JsMethod(name = "getDescriptor")
    public native Promise<BluetoothRemoteGATTDescriptor> getDescriptor(long descriptor);
    
    @JsMethod(name = "getDescriptors")
    public native Promise<BluetoothRemoteGATTDescriptor[]> getDescriptors();
    
    @JsMethod(name = "getDescriptors")
    public native Promise<BluetoothRemoteGATTDescriptor[]> getDescriptors(String descriptor);
    
    @JsMethod(name = "getDescriptors")
    public native Promise<BluetoothRemoteGATTDescriptor[]> getDescriptors(long descriptor);
    
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

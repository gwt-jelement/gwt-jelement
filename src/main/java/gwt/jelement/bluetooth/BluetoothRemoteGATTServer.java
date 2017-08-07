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

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="BluetoothRemoteGATTServer", isNative = true)
public class BluetoothRemoteGATTServer implements IsObject {
    @JsProperty(name="device")
    public native BluetoothDevice getDevice();
    
    @JsProperty(name="connected")
    public native boolean getConnected();
    
    @JsMethod(name = "connect")
    public native Promise<BluetoothRemoteGATTServer> connect();
    
    @JsMethod(name = "disconnect")
    public native void disconnect();
    
    @JsMethod(name = "getPrimaryService")
    public native Promise<BluetoothRemoteGATTService> getPrimaryService(String service);
    
    @JsMethod(name = "getPrimaryService")
    public native Promise<BluetoothRemoteGATTService> getPrimaryService(double service);
    
    @JsMethod(name = "getPrimaryServices")
    public native Promise<BluetoothRemoteGATTService[]> getPrimaryServices();
    
    @JsMethod(name = "getPrimaryServices")
    public native Promise<BluetoothRemoteGATTService[]> getPrimaryServices(String service);
    
    @JsMethod(name = "getPrimaryServices")
    public native Promise<BluetoothRemoteGATTService[]> getPrimaryServices(double service);
    
}

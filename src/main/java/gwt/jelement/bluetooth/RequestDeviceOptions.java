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

import gwt.jelement.bluetooth.BluetoothLEScanFilterInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class RequestDeviceOptions{

    @JsProperty(name="filters")
    public BluetoothLEScanFilterInit[] filters;

    @JsProperty(name="optionalServices")
    public BluetoothLEScanFilterInit.BluetoothServiceUUID[] optionalServices = new BluetoothLEScanFilterInit.BluetoothServiceUUID[0];

    @JsProperty(name="acceptAllDevices")
    public boolean acceptAllDevices = false;


}

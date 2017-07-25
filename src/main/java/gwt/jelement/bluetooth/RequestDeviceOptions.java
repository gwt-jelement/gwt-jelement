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

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RequestDeviceOptions{

    public RequestDeviceOptions(){
    }

    @JsProperty(name="filters")
    public BluetoothLEScanFilterInit[] filters;

    @JsOverlay
    public final BluetoothLEScanFilterInit[] getFilters(){
        return this.filters;
    }

    @JsOverlay
    public final void setFilters(BluetoothLEScanFilterInit[] filters){
        this.filters = filters;
    }

    @JsProperty(name="optionalServices")
    public BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] optionalServices;

    @JsOverlay
    public final BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] getOptionalServices(){
        return this.optionalServices;
    }

    @JsOverlay
    public final void setOptionalServices(BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] optionalServices){
        this.optionalServices = optionalServices;
    }

    @JsProperty(name="acceptAllDevices")
    public boolean acceptAllDevices;

    @JsOverlay
    public final boolean getAcceptAllDevices(){
        return this.acceptAllDevices;
    }

    @JsOverlay
    public final void setAcceptAllDevices(boolean acceptAllDevices){
        this.acceptAllDevices = acceptAllDevices;
    }


}

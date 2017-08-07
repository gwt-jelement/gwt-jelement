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

import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RequestDeviceOptions extends JsObject{

    @JsProperty(name="filters")
    private BluetoothLEScanFilterInit[] filters;

    @JsProperty(name="optionalServices")
    private BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] optionalServices;

    @JsProperty(name="acceptAllDevices")
    private boolean acceptAllDevices;

    public RequestDeviceOptions(){
    }

    @JsOverlay
    public final BluetoothLEScanFilterInit[] getFilters(){
        return this.filters;
    }

    @JsOverlay
    public final void setFilters(BluetoothLEScanFilterInit[] filters){
        this.filters = filters;
    }

    @JsOverlay
    public final BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] getOptionalServices(){
        return this.optionalServices;
    }

    @JsOverlay
    public final void setOptionalServices(BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] optionalServices){
        this.optionalServices = optionalServices;
    }

    @JsOverlay
    public final boolean isAcceptAllDevices(){
        return this.acceptAllDevices;
    }

    @JsOverlay
    public final void setAcceptAllDevices(boolean acceptAllDevices){
        this.acceptAllDevices = acceptAllDevices;
    }


}

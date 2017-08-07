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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="BluetoothUUID", isNative = true)
public class BluetoothUUID implements IsObject {
    @JsMethod(name = "canonicalUUID")
    public static native String canonicalUUID(double alias);
    
    @JsMethod(name = "getCharacteristic")
    public static native String getCharacteristic(String name);
    
    @JsMethod(name = "getCharacteristic")
    public static native String getCharacteristic(double name);
    
    @JsMethod(name = "getDescriptor")
    public static native String getDescriptor(String name);
    
    @JsMethod(name = "getDescriptor")
    public static native String getDescriptor(double name);
    
    @JsMethod(name = "getService")
    public static native String getService(String name);
    
    @JsMethod(name = "getService")
    public static native String getService(double name);
    
}

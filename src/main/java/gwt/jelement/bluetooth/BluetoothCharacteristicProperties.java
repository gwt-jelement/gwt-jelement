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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="BluetoothCharacteristicProperties", isNative = true)
public class BluetoothCharacteristicProperties implements IsObject {
    @JsProperty(name="broadcast")
    public native boolean isBroadcast();
    
    @JsProperty(name="read")
    public native boolean isRead();
    
    @JsProperty(name="writeWithoutResponse")
    public native boolean isWriteWithoutResponse();
    
    @JsProperty(name="write")
    public native boolean isWrite();
    
    @JsProperty(name="notify")
    public native boolean isNotify();
    
    @JsProperty(name="indicate")
    public native boolean isIndicate();
    
    @JsProperty(name="authenticatedSignedWrites")
    public native boolean isAuthenticatedSignedWrites();
    
    @JsProperty(name="reliableWrite")
    public native boolean isReliableWrite();
    
    @JsProperty(name="writableAuxiliaries")
    public native boolean isWritableAuxiliaries();
    
}

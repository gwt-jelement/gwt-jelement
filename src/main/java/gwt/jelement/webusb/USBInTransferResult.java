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

import gwt.jelement.core.DataView;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="USBInTransferResult", isNative = true)
public class USBInTransferResult extends IsObject{
    @JsProperty(name="status")
    private String status;
    
    @JsConstructor
    public USBInTransferResult(USBTransferStatus status){
        super();
    }
    
    @JsConstructor
    public USBInTransferResult(USBTransferStatus status, DataView data){
        super();
    }
    
    @JsProperty(name="data")
    public native DataView getData();
    
    @JsOverlay
    public final USBTransferStatus getStatus(){
       return USBTransferStatus.of(status);
    }
    
}

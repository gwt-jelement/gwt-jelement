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

import gwt.jelement.webusb.USBConfiguration;
import gwt.jelement.webusb.USBControlTransferParameters;
import gwt.jelement.webusb.USBDirection;
import gwt.jelement.webusb.USBInTransferResult;
import gwt.jelement.webusb.USBIsochronousInTransferResult;
import gwt.jelement.webusb.USBIsochronousOutTransferResult;
import gwt.jelement.webusb.USBOutTransferResult;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class USBDevice{
    
    @JsProperty(name="usbVersionMajor")
    public byte usbVersionMajor;
    
    @JsProperty(name="usbVersionMinor")
    public byte usbVersionMinor;
    
    @JsProperty(name="usbVersionSubminor")
    public byte usbVersionSubminor;
    
    @JsProperty(name="deviceClass")
    public byte deviceClass;
    
    @JsProperty(name="deviceSubclass")
    public byte deviceSubclass;
    
    @JsProperty(name="deviceProtocol")
    public byte deviceProtocol;
    
    @JsProperty(name="vendorId")
    public short vendorId;
    
    @JsProperty(name="productId")
    public short productId;
    
    @JsProperty(name="deviceVersionMajor")
    public byte deviceVersionMajor;
    
    @JsProperty(name="deviceVersionMinor")
    public byte deviceVersionMinor;
    
    @JsProperty(name="deviceVersionSubminor")
    public byte deviceVersionSubminor;
    
    @JsProperty(name="manufacturerName")
    public String manufacturerName;
    
    @JsProperty(name="productName")
    public String productName;
    
    @JsProperty(name="serialNumber")
    public String serialNumber;
    
    @JsProperty(name="configuration")
    public USBConfiguration configuration;
    
    @JsProperty(name="configurations")
    public USBConfiguration[] configurations;
    
    @JsProperty(name="opened")
    public boolean opened;
    
    @JsMethod(name = "claimInterface")
    public native Promise<Void> claimInterface(byte interfaceNumber);
    
    @JsOverlay
    public final Promise<Void> clearHalt(USBDirection direction, byte endpointNumber){
        return clearHalt(direction.getInternalValue(), endpointNumber);
    }
    
    @JsMethod(name = "clearHalt")
    public native Promise<Void> clearHalt(String direction, byte endpointNumber);
    
    @JsMethod(name = "close")
    public native Promise<Void> close();
    
    @JsMethod(name = "controlTransferIn")
    public native Promise<USBInTransferResult> controlTransferIn(USBControlTransferParameters setup, short length);
    
    @JsMethod(name = "controlTransferOut")
    public native Promise<USBOutTransferResult> controlTransferOut(USBControlTransferParameters setup);
    
    @JsMethod(name = "controlTransferOut")
    public native Promise<USBOutTransferResult> controlTransferOut(USBControlTransferParameters setup, ArrayBuffer data);
    
    @JsMethod(name = "controlTransferOut")
    public native Promise<USBOutTransferResult> controlTransferOut(USBControlTransferParameters setup, ArrayBufferView data);
    
    @JsMethod(name = "isochronousTransferIn")
    public native Promise<USBIsochronousInTransferResult> isochronousTransferIn(byte endpointNumber, double[] packetLengths);
    
    @JsMethod(name = "isochronousTransferOut")
    public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(byte endpointNumber, ArrayBuffer data, double[] packetLengths);
    
    @JsMethod(name = "isochronousTransferOut")
    public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(byte endpointNumber, ArrayBufferView data, double[] packetLengths);
    
    @JsMethod(name = "open")
    public native Promise<Void> open();
    
    @JsMethod(name = "releaseInterface")
    public native Promise<Void> releaseInterface(byte interfaceNumber);
    
    @JsMethod(name = "reset")
    public native Promise<Void> reset();
    
    @JsMethod(name = "selectAlternateInterface")
    public native Promise<Void> selectAlternateInterface(byte interfaceNumber, byte alternateSetting);
    
    @JsMethod(name = "selectConfiguration")
    public native Promise<Void> selectConfiguration(byte configurationValue);
    
    @JsMethod(name = "transferIn")
    public native Promise<USBInTransferResult> transferIn(byte endpointNumber, double length);
    
    @JsMethod(name = "transferOut")
    public native Promise<USBOutTransferResult> transferOut(byte endpointNumber, ArrayBuffer data);
    
    @JsMethod(name = "transferOut")
    public native Promise<USBOutTransferResult> transferOut(byte endpointNumber, ArrayBufferView data);
    
}

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

import gwt.jelement.core.Array;
import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="USBDevice", isNative = true)
public class USBDevice implements IsObject {
    @JsProperty(name="usbVersionMajor")
    public native byte getUsbVersionMajor();
    
    @JsProperty(name="usbVersionMinor")
    public native byte getUsbVersionMinor();
    
    @JsProperty(name="usbVersionSubminor")
    public native byte getUsbVersionSubminor();
    
    @JsProperty(name="deviceClass")
    public native byte getDeviceClass();
    
    @JsProperty(name="deviceSubclass")
    public native byte getDeviceSubclass();
    
    @JsProperty(name="deviceProtocol")
    public native byte getDeviceProtocol();
    
    @JsProperty(name="vendorId")
    public native short getVendorId();
    
    @JsProperty(name="productId")
    public native short getProductId();
    
    @JsProperty(name="deviceVersionMajor")
    public native byte getDeviceVersionMajor();
    
    @JsProperty(name="deviceVersionMinor")
    public native byte getDeviceVersionMinor();
    
    @JsProperty(name="deviceVersionSubminor")
    public native byte getDeviceVersionSubminor();
    
    @JsProperty(name="manufacturerName")
    public native String getManufacturerName();
    
    @JsProperty(name="productName")
    public native String getProductName();
    
    @JsProperty(name="serialNumber")
    public native String getSerialNumber();
    
    @JsProperty(name="configuration")
    public native USBConfiguration getConfiguration();
    
    @JsProperty(name="configurations")
    public native USBConfiguration[] getConfigurations();
    
    @JsProperty(name="opened")
    public native boolean getOpened();
    
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
    
    @JsMethod(name = "isochronousTransferIn")
    public native Promise<USBIsochronousInTransferResult> isochronousTransferIn(byte endpointNumber, Array packetLengths);
    
    @JsMethod(name = "isochronousTransferOut")
    public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(byte endpointNumber, ArrayBuffer data, double[] packetLengths);
    
    @JsMethod(name = "isochronousTransferOut")
    public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(byte endpointNumber, ArrayBufferView data, double[] packetLengths);
    
    @JsMethod(name = "isochronousTransferOut")
    public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(byte endpointNumber, ArrayBuffer data, Array packetLengths);
    
    @JsMethod(name = "isochronousTransferOut")
    public native Promise<USBIsochronousOutTransferResult> isochronousTransferOut(byte endpointNumber, ArrayBufferView data, Array packetLengths);
    
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

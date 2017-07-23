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

import gwt.jelement.webusb.USBEndpoint;
import gwt.jelement.webusb.USBInterface;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class USBAlternateInterface{
    
    @JsConstructor
    public USBAlternateInterface(USBInterface deviceInterface, byte alternateSetting){
    }
    
    @JsProperty(name="alternateSetting")
    public byte alternateSetting;
    
    @JsProperty(name="interfaceClass")
    public byte interfaceClass;
    
    @JsProperty(name="interfaceSubclass")
    public byte interfaceSubclass;
    
    @JsProperty(name="interfaceProtocol")
    public byte interfaceProtocol;
    
    @JsProperty(name="interfaceName")
    public String interfaceName;
    
    @JsProperty(name="endpoints")
    public USBEndpoint[] endpoints;
    
    
}

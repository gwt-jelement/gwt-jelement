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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="USBAlternateInterface", isNative = true)
public class USBAlternateInterface implements IsObject {
    @JsConstructor
    public USBAlternateInterface(USBInterface deviceInterface, byte alternateSetting){
    }
    
    @JsProperty(name="alternateSetting")
    public native byte getAlternateSetting();
    
    @JsProperty(name="interfaceClass")
    public native byte getInterfaceClass();
    
    @JsProperty(name="interfaceSubclass")
    public native byte getInterfaceSubclass();
    
    @JsProperty(name="interfaceProtocol")
    public native byte getInterfaceProtocol();
    
    @JsProperty(name="interfaceName")
    public native String getInterfaceName();
    
    @JsProperty(name="endpoints")
    public native USBEndpoint[] getEndpoints();
    
}

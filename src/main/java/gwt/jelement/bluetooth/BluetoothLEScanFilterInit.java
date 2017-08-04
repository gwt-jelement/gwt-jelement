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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class BluetoothLEScanFilterInit extends JsObject{

    @JsProperty(name="services")
    private BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] services;

    @JsProperty(name="name")
    private String name;

    @JsProperty(name="namePrefix")
    private String namePrefix;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface BluetoothDescriptorUUID {
        @JsOverlay
        static BluetoothDescriptorUUID of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static BluetoothDescriptorUUID of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
    }
    
    public BluetoothLEScanFilterInit(){
    }

    @JsOverlay
    public final BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] getServices(){
        return this.services;
    }

    @JsOverlay
    public final void setServices(BluetoothLEScanFilterInit.BluetoothDescriptorUUID[] services){
        this.services = services;
    }

    @JsOverlay
    public final String getName(){
        return this.name;
    }

    @JsOverlay
    public final void setName(String name){
        this.name = name;
    }

    @JsOverlay
    public final String getNamePrefix(){
        return this.namePrefix;
    }

    @JsOverlay
    public final void setNamePrefix(String namePrefix){
        this.namePrefix = namePrefix;
    }

}

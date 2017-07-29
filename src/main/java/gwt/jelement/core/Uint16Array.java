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
package gwt.jelement.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Uint16Array", isNative = true)
public class Uint16Array extends JsObject{
    public static double BYTES_PER_ELEMENT;
    
    @JsConstructor
    public Uint16Array(double length){
        super();
    }
    
    @JsConstructor
    public Uint16Array(Uint16Array array){
        super();
    }
    
    @JsConstructor
    public Uint16Array(short[] array){
        super();
    }
    
    @JsConstructor
    public Uint16Array(ArrayBuffer buffer){
        super();
    }
    
    @JsConstructor
    public Uint16Array(ArrayBuffer buffer, double byteOffset){
        super();
    }
    
    @JsConstructor
    public Uint16Array(ArrayBuffer buffer, double byteOffset, double length){
        super();
    }
    
    @JsProperty(name="buffer")
    public native ArrayBuffer getBuffer();
    
    @JsProperty(name="byteOffset")
    public native double getByteOffset();
    
    @JsProperty(name="byteLength")
    public native double getByteLength();
    
    @JsMethod(name = "set")
    public native void set(Uint16Array array);
    
    @JsMethod(name = "set")
    public native void set(short[] array);
    
    @JsMethod(name = "set")
    public native void set(Uint16Array array, double offset);
    
    @JsMethod(name = "set")
    public native void set(short[] array, double offset);
    
    @JsMethod(name = "subarray")
    public native Uint16Array subarray(double begin);
    
    @JsMethod(name = "subarray")
    public native Uint16Array subarray(double begin, double end);
    
}

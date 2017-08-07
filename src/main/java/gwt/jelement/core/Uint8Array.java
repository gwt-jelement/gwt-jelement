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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Uint8Array", isNative = true)
public class Uint8Array extends ArrayBufferView {
    public static double BYTES_PER_ELEMENT; /* 1 */
    
    @JsConstructor
    public Uint8Array(double length){
        super();
    }
    
    @JsConstructor
    public Uint8Array(Uint8Array array){
        super();
    }
    
    @JsConstructor
    public Uint8Array(byte[] array){
        super();
    }
    
    @JsConstructor
    public Uint8Array(ArrayBuffer buffer){
        super();
    }
    
    @JsConstructor
    public Uint8Array(ArrayBuffer buffer, double byteOffset){
        super();
    }
    
    @JsConstructor
    public Uint8Array(ArrayBuffer buffer, double byteOffset, double length){
        super();
    }
    
    @JsConstructor
    public Uint8Array(Array array){
        super();
    }
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsOverlay
    public final byte get(double index){
        return Js.getByte(this.object(), index);
    }
    
    @JsMethod(name = "set")
    public native void set(Uint8Array array);
    
    @JsMethod(name = "set")
    public native void set(byte[] array);
    
    @JsMethod(name = "set")
    public native void set(Array array);
    
    @JsMethod(name = "set")
    public native void set(Uint8Array array, double offset);
    
    @JsMethod(name = "set")
    public native void set(byte[] array, double offset);
    
    @JsOverlay
    public final void set(double index, byte value){
        Js.set(this.object(), index, value);
    }
    
    @JsMethod(name = "set")
    public native void set(Array array, double offset);
    
    @JsMethod(name = "subarray")
    public native Uint8Array subarray(double begin);
    
    @JsMethod(name = "subarray")
    public native Uint8Array subarray(double begin, double end);
    
}

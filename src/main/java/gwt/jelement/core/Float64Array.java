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

@JsType(namespace = JsPackage.GLOBAL, name="Float64Array", isNative = true)
public class Float64Array extends ArrayBufferView {
    public static double BYTES_PER_ELEMENT; /* 8 */
    
    @JsConstructor
    public Float64Array(double length){
        super();
    }
    
    @JsConstructor
    public Float64Array(Float64Array array){
        super();
    }
    
    @JsConstructor
    public Float64Array(double[] array){
        super();
    }
    
    @JsConstructor
    public Float64Array(ArrayBuffer buffer){
        super();
    }
    
    @JsConstructor
    public Float64Array(ArrayBuffer buffer, double byteOffset){
        super();
    }
    
    @JsConstructor
    public Float64Array(ArrayBuffer buffer, double byteOffset, double length){
        super();
    }
    
    @JsConstructor
    public Float64Array(Array array){
        super();
    }
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsOverlay
    public final double get(double index){
        return Js.getDouble(this.object(), index);
    }
    
    @JsMethod(name = "set")
    public native void set(Float64Array array);
    
    @JsMethod(name = "set")
    public native void set(double[] array);
    
    @JsMethod(name = "set")
    public native void set(Array array);
    
    @JsMethod(name = "set")
    public native void set(Float64Array array, double offset);
    
    @JsMethod(name = "set")
    public native void set(double[] array, double offset);
    
    @JsOverlay
    public final void set(double index, double value){
        Js.set(this.object(), index, value);
    }
    
    @JsMethod(name = "set")
    public native void set(Array array, double offset);
    
    @JsMethod(name = "subarray")
    public native Float64Array subarray(double begin);
    
    @JsMethod(name = "subarray")
    public native Float64Array subarray(double begin, double end);
    
}

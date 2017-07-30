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
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DataView", isNative = true)
public class DataView extends ArrayBufferView{
    @JsConstructor
    public DataView(ArrayBuffer buffer){
        super();
    }
    
    @JsConstructor
    public DataView(ArrayBuffer buffer, double byteOffset){
        super();
    }
    
    @JsConstructor
    public DataView(ArrayBuffer buffer, double byteOffset, double byteLength){
        super();
    }
    
    @JsMethod(name = "getFloat32")
    public native float getFloat32(double byteOffset);
    
    @JsMethod(name = "getFloat32")
    public native float getFloat32(double byteOffset, boolean littleEndian);
    
    @JsMethod(name = "getFloat64")
    public native double getFloat64(double byteOffset);
    
    @JsMethod(name = "getFloat64")
    public native double getFloat64(double byteOffset, boolean littleEndian);
    
    @JsMethod(name = "getInt16")
    public native short getInt16(double byteOffset);
    
    @JsMethod(name = "getInt16")
    public native short getInt16(double byteOffset, boolean littleEndian);
    
    @JsMethod(name = "getInt32")
    public native double getInt32(double byteOffset);
    
    @JsMethod(name = "getInt32")
    public native double getInt32(double byteOffset, boolean littleEndian);
    
    @JsMethod(name = "getInt8")
    public native byte getInt8(double byteOffset);
    
    @JsMethod(name = "getUint16")
    public native short getUint16(double byteOffset);
    
    @JsMethod(name = "getUint16")
    public native short getUint16(double byteOffset, boolean littleEndian);
    
    @JsMethod(name = "getUint32")
    public native double getUint32(double byteOffset);
    
    @JsMethod(name = "getUint32")
    public native double getUint32(double byteOffset, boolean littleEndian);
    
    @JsMethod(name = "getUint8")
    public native byte getUint8(double byteOffset);
    
    @JsMethod(name = "setFloat32")
    public native void setFloat32(double byteOffset, float value);
    
    @JsMethod(name = "setFloat32")
    public native void setFloat32(double byteOffset, float value, boolean littleEndian);
    
    @JsMethod(name = "setFloat64")
    public native void setFloat64(double byteOffset, double value);
    
    @JsMethod(name = "setFloat64")
    public native void setFloat64(double byteOffset, double value, boolean littleEndian);
    
    @JsMethod(name = "setInt16")
    public native void setInt16(double byteOffset, short value);
    
    @JsMethod(name = "setInt16")
    public native void setInt16(double byteOffset, short value, boolean littleEndian);
    
    @JsMethod(name = "setInt32")
    public native void setInt32(double byteOffset, double value);
    
    @JsMethod(name = "setInt32")
    public native void setInt32(double byteOffset, double value, boolean littleEndian);
    
    @JsMethod(name = "setInt8")
    public native void setInt8(double byteOffset, byte value);
    
    @JsMethod(name = "setUint16")
    public native void setUint16(double byteOffset, short value);
    
    @JsMethod(name = "setUint16")
    public native void setUint16(double byteOffset, short value, boolean littleEndian);
    
    @JsMethod(name = "setUint32")
    public native void setUint32(double byteOffset, double value);
    
    @JsMethod(name = "setUint32")
    public native void setUint32(double byteOffset, double value, boolean littleEndian);
    
    @JsMethod(name = "setUint8")
    public native void setUint8(double byteOffset, byte value);
    
}

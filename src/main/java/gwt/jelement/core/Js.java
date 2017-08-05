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

public class Js {

    public static final String TYPE_STRING = "String";
    public static final String TYPE_DATE = "Date";
    public static final String TYPE_NUMBER = "Number";
    public static final String TYPE_OBJECT = "Object";
    public static final String TYPE_BOOLEAN = "Boolean";
    public static final String TYPE_ARRAY = "Array";
    public static final String TYPE_NULL = "Null";
    public static final String TYPE_UNDEFINED = "Undefined";
    public static final String TYPE_SYMBOL = "Symbol";
    public static final String TYPE_FUNCTION = "Function";
    public static final String TYPE_ERROR = "Error";
    public static final String TYPE_REGEXP = "RegExp";
    public static final String TYPE_PROMISE = "Promise";
    public static final String TYPE_ARRAY_BUFFER = "ArrayBuffer";
    public static final String TYPE_INT8_ARRAY = "Int8Array";
    public static final String TYPE_UINT8_ARRAY = "Uint8Array";
    public static final String TYPE_UINT8_CLAMPED_ARRAY = "Uint8ClampedArray";
    public static final String TYPE_INT16_ARRAY = "Int16Array";
    public static final String TYPE_UINT16_ARRAY = "Uint16Array";
    public static final String TYPE_INT32_ARRAY = "Int32Array";
    public static final String TYPE_UINT32_ARRAY = "Uint32Array";
    public static final String TYPE_FLOAT32_ARRAY = "Float32Array";
    public static final String TYPE_FLOAT64_ARRAY = "Float64Array";

    public static native <T> JsObject<T> with(JsObject<T> object, String key, T value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, boolean value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, char value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, byte value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, short value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, int value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, float value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static native <T> JsObject<T> with(JsObject<T> object, String key, double value)/*-{
        object[key] = value;
        return object;
    }-*/;

    public static <T> JsObject<T> with(JsObject<T> object, String key, long value) {
        return with(object, key, (double) value);
    }

    public static native <T> T set(JsObject<T> object, String propertyName, T value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> T set(JsObject<T> object, double index, T value) /*-{
        return object[index] = value;
    }-*/;

    public static native boolean set(JsObject object, String propertyName, boolean value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> boolean set(JsObject<T> object, double index, boolean value) /*-{
        return object[index] = value;
    }-*/;

    public static native char set(JsObject object, String propertyName, char value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> char set(JsObject<T> object, double index, char value) /*-{
        return object[index] = value;
    }-*/;

    public static native byte set(JsObject object, String propertyName, byte value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> byte set(JsObject<T> object, double index, byte value) /*-{
        return object[index] = value;
    }-*/;

    public static native short set(JsObject object, String propertyName, short value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> short set(JsObject<T> object, double index, short value) /*-{
        return object[index] = value;
    }-*/;

    public static native int set(JsObject object, String propertyName, int value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> int set(JsObject<T> object, double index, int value) /*-{
        return object[index] = value;
    }-*/;

    public static native float set(JsObject object, String propertyName, float value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> float set(JsObject<T> object, double index, float value) /*-{
        return object[index] = value;
    }-*/;

    public static native double set(JsObject object, String propertyName, double value) /*-{
        return object[propertyName] = value;
    }-*/;

    public static native <T> double set(JsObject<T> object, double index, double value) /*-{
        return object[index] = value;
    }-*/;

    public static long set(JsObject object, String propertyName, long value) {
        return (long) set(object, propertyName, (double) value);
    }

    public static long set(JsObject object, double index, long value) {
        return (long) set(object, index, (double) value);
    }


    public static native <T> T get(JsObject<T> object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native <T> T get(JsObject<T> object, double index) /*-{
        return object[index];
    }-*/;

    public static native boolean getBoolean(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native boolean getBoolean(JsObject object, double index) /*-{
        return object[index];
    }-*/;

    public static native char getChar(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native char getChar(JsObject object, double index) /*-{
        return object[index];
    }-*/;

    public static native byte getByte(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native byte getByte(JsObject object, double index) /*-{
        return object[index];
    }-*/;

    public static native short getShort(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native short getShort(JsObject object, double index) /*-{
        return object[index];
    }-*/;

    public static native int getInt(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native int getInt(JsObject object, double index) /*-{
        return object[index];
    }-*/;

    public static native float getFloat(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native float getFloat(JsObject object, double index) /*-{
        return object[index];
    }-*/;

    public static native double getDouble(JsObject object, String propertyName) /*-{
        return object[propertyName];
    }-*/;

    public static native double getDouble(JsObject object, double index) /*-{
        return object[index];
    }-*/;


    public static long getLong(JsObject object, String propertyName) {
        return (long) getDouble(object, propertyName);
    }

    public static long getLong(JsObject object, double index) {
        return (long) getDouble(object, index);
    }

    public static native <T> boolean has(JsObject<T> object, String propertyName) /*-{
        return propertyName in object;
    }-*/;

    public static native <T> boolean has(JsObject<T> object, double index) /*-{
        return index in object;
    }-*/;

    public static native <T> boolean delete(JsObject<T> object, String propertyName) /*-{
        return delete object[propertyName];
    }-*/;

    public static native <T> boolean delete(JsObject<T> object, double index) /*-{
        return delete object[index];
    }-*/;

    public static native boolean isTrue(Object object)/*-{
        return !!object;
    }-*/;

    public static native boolean exists(Object object)/*-{
        return !!object;
    }-*/;

    public static native boolean isFalse(Object object)/*-{
        return !object;
    }-*/;

    public static native boolean isEqual(Object object1, Object object2)/*-{
        return object1 == object2;
    }-*/;

    public static native boolean isStrictlyEqual(Object object1, Object object2)/*-{
        return object1 === object2;
    }-*/;

    public static final <T> T cast(Object object){
        return (T) object;
    }

    public static native boolean isUndefined(JsObject object, double index) /*-{
        return object[index] === undefined;
    }-*/;

    public static native void call(JsObject object, Object value) /*-{
        object(value);
    }-*/;

    public static native void call(JsObject object, double value) /*-{
        object(value);
    }-*/;

    public static native String typeName(Object object) /*-{
        return Object.prototype.toString.call(object).replace(/(?:\[object |])/g, '');
    }-*/;

    public static native boolean isTypeName(Object object, String typeName) /*-{
        return Object.prototype.toString.call(object).replace(/(?:\[object |])/g,'') === typeName;
    }-*/;

    public static native Object symbol() /*-{
        return Symbol();
    }-*/;

}


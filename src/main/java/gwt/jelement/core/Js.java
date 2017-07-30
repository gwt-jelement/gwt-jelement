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

    public static <T> JsObject<T> with(JsObject<T> object, String key, long value){
        return with(object, key, (double) value);
    };

    public static native <T> void set(JsObject<T> object, String propertyName, T value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, boolean value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, char value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, byte value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, short value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, int value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, float value) /*-{
        object[propertyName] = value;
    }-*/;

    public static native void set(JsObject object, String propertyName, double value) /*-{
        object[propertyName] = value;
    }-*/;

    public static void set(JsObject object, String propertyName, long value) {
        set(object, propertyName, (double) value);
    }

    public static native <T> void set(JsObject<T> object, double index, T value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, boolean value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, char value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, byte value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, short value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, int value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, float value) /*-{
        object[index] = value;
    }-*/;

    public static native <T> void set(JsObject<T> object, double index, double value) /*-{
        object[index] = value;
    }-*/;

    public static void set(JsObject object, double index, long value) {
        set(object, index, (double) value);
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

    public static native <T> void delete(JsObject<T> object, String propertyName) /*-{
        delete object[propertyName];
    }-*/;

    public static native <T> void delete(JsObject<T> object, double index) /*-{
        delete object[index];
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

}

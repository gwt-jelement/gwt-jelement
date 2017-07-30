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

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class JsObject<T>{
    @JsProperty(name="length")
    public static int length;
    
    @JsProperty(name="prototype")
    public static JsObject prototype;
    
    @JsProperty(name="name")
    public static String name;
    
    @JsProperty(name="caller")
    public static Function caller;
    
    @JsConstructor
    public JsObject(){
    }
    
    @JsConstructor
    public JsObject(Object value){
    }
    
    @JsProperty(name="__proto__")
    public native JsObject get__proto__();
    
    @JsProperty(name="__proto__")
    public native void set__proto__(JsObject __proto__);
    
    @JsProperty(name="constructor")
    public native Function getConstructor();
    
    @JsProperty(name="constructor")
    public native void setConstructor(Function constructor);
    
    @JsMethod(name = "__defineGetter__")
    public native void __defineGetter__(String propertyName, ObjectPropertyGetterFunction func);
    
    @JsMethod(name = "__defineSetter__")
    public native void __defineSetter__(String propertyName, ObjectPropertySetterFunction func);
    
    @JsMethod(name = "__lookupGetter__")
    public native ObjectPropertyGetterFunction __lookupGetter__(String propertyName);
    
    @JsMethod(name = "__lookupSetter__")
    public native ObjectPropertySetterFunction __lookupSetter__(String propertyName);
    
    @JsMethod(name = "apply")
    public static native Object apply_(Object thisArg);
    
    @JsMethod(name = "apply")
    public static native Object apply_(Object thisArg, Object[] arguments);
    
    @JsMethod(name = "assign")
    public static native JsObject assign(JsObject target, JsObject... sources);
    
    @JsMethod(name = "call")
    public static native Object call_(Object thisArg, Object... arguments);
    
    @JsMethod(name = "create")
    public static native JsObject create(JsObject proto);
    
    @JsMethod(name = "create")
    public static native JsObject create(JsObject proto, JsObject propertiesObject);
    
    @JsMethod(name = "defineProperties")
    public native <T extends JsObject> T defineProperties(T obj, JsObject<ObjectPropertyDescriptor> properties);
    
    @JsMethod(name = "defineProperty")
    public static native <T extends JsObject> T defineProperty(T obj, String propertyName, ObjectPropertyDescriptor<?> descriptor);
    
    @JsMethod(name = "entries")
    public static native Object[][] entries(JsObject obj);
    
    @JsMethod(name = "freeze")
    public static native <T extends JsObject> T freeze(T obj);
    
    @JsMethod(name = "getOwnPropertyDescriptor")
    public static native ObjectPropertyDescriptor getOwnPropertyDescriptor(JsObject obj, String propertyName);
    
    @JsMethod(name = "getOwnPropertyDescriptors")
    public static native JsObject getOwnPropertyDescriptors(JsObject obj);
    
    @JsMethod(name = "getOwnPropertyNames")
    public static native String[] getOwnPropertyNames(JsObject obj);
    
    @JsMethod(name = "getOwnPropertySymbols")
    public static native Object[] getOwnPropertySymbols(JsObject obj);
    
    @JsMethod(name = "getPrototypeOf")
    public static native JsObject getPrototypeOf(JsObject obj);
    
    @JsMethod(name = "hasOwnProperty")
    public native boolean hasOwnProperty(String propertyName);
    
    @JsMethod(name = "is")
    public static native boolean is(Object value1, Object value2);
    
    @JsMethod(name = "isExtensible")
    public static native boolean isExtensible(JsObject obj);
    
    @JsMethod(name = "isFrozen")
    public static native boolean isFrozen(JsObject obj);
    
    @JsMethod(name = "isPrototypeOf")
    public native boolean isPrototypeOf(JsObject obj);
    
    @JsMethod(name = "isSealed")
    public static native boolean isSealed(JsObject obj);
    
    @JsMethod(name = "keys")
    public static native String[] keys(JsObject obj);
    
    @JsMethod(name = "preventExtensions")
    public static native JsObject preventExtensions(JsObject obj);
    
    @JsMethod(name = "propertyIsEnumerable")
    public native boolean propertyIsEnumerable(String propertyName);
    
    @JsMethod(name = "seal")
    public static native <T extends JsObject> T seal(T seal);
    
    @JsMethod(name = "setPrototypeOf")
    public static native JsObject setPrototypeOf(JsObject obj, Object proto);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString();
    
    @JsMethod(name = "toSource")
    public native String toSource();
    
    @JsMethod(name = "valueOf")
    public native Object valueOf();
    
    @JsMethod(name = "values")
    public static native <T> T values(JsObject<T> obj);
    
    @JsOverlay
    public final T get(String propertyName){
        return Js.<T>get(this, propertyName);
    }

    @JsOverlay
    public final T get(double index){
        return Js.<T>get(this, index);
    }

    @JsOverlay
    public final boolean getBoolean(String propertyName){
        return Js.getBoolean(this, propertyName);
    }

    @JsOverlay
    public final boolean getBoolean(double index){
        return Js.getBoolean(this, index);
    }

    @JsOverlay
    public final char getChar(String propertyName){
        return Js.getChar(this, propertyName);
    }

    @JsOverlay
    public final char getChar(double index){
        return Js.getChar(this, index);
    }

    @JsOverlay
    public final byte getByte(String propertyName){
        return Js.getByte(this, propertyName);
    }

    @JsOverlay
    public final byte getByte(double index){
        return Js.getByte(this, index);
    }

    @JsOverlay
    public final short getShort(String propertyName){
        return Js.getShort(this, propertyName);
    }

    @JsOverlay
    public final short getShort(double index){
        return Js.getShort(this, index);
    }

    @JsOverlay
    public final int getInt(String propertyName){
        return Js.getInt(this, propertyName);
    }

    @JsOverlay
    public final int getInt(double index){
        return Js.getInt(this, index);
    }

    @JsOverlay
    public final float getFloat(String propertyName){
        return Js.getFloat(this, propertyName);
    }

    @JsOverlay
    public final float getFloat(double index){
        return Js.getFloat(this, index);
    }

    @JsOverlay
    public final double getDouble(String propertyName){
        return Js.getDouble(this, propertyName);
    }

    @JsOverlay
    public final double getDouble(double index){
        return Js.getDouble(this, index);
    }

    @JsOverlay
    public final long getLong(String propertyName){
        return Js.getLong(this, propertyName);
    }

    @JsOverlay
    public final long getLong(double index){
        return Js.getLong(this, index);
    }

    @JsOverlay
    public final void set(String propertyName, T value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , T value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, boolean value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , boolean value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, char value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , char value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, byte value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , byte value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, short value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , short value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, int value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , int value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, float value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , float value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, double value){
        Js.<T>set(this, propertyName, value);
    }

    @JsOverlay
    public final void set(double index , double value){
        Js.<T>set(this, index, value);
    }

    @JsOverlay
    public final void set(String propertyName, long value){
        Js.set(this, propertyName, (double) value);
    }

    @JsOverlay
    public final void set(double index, long value){
        Js.set(this, index, (double) value);
    }

    @JsOverlay
    public final void delete(String propertyName){
        Js.<T>delete(this, propertyName);
    }

    @JsOverlay
    public final void delete(double index){
        Js.<T>delete(this, index);
    }

    @JsOverlay
    public final boolean has(String propertyName){
        return Js.<T>has(this, propertyName);
    }

    @JsOverlay
    public final boolean has(double index){
         return Js.<T>has(this, index);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, T value){
        return Js.<T>with(this, propertyName, value);
    }
    
    @JsOverlay
    public JsObject<T> with(String propertyName, boolean value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, char value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, byte value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, short value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, int value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, float value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, double value){
        return Js.<T>with(this, propertyName, value);
    }

    @JsOverlay
    public JsObject<T> with(String propertyName, long value){
        return Js.<T>with(this, propertyName, (double)value);
    }

    @JsOverlay
    public boolean isEqualTo(Object object){
        return Js.isEqual(this, object);
    }

    @JsOverlay
    public boolean isStrictlyEqualTo(Object object){
        return Js.isStrictlyEqual(this, object);
    }

}

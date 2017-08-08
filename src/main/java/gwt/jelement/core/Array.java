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

@JsType(namespace = JsPackage.GLOBAL, name="Array", isNative = true)
public class Array<T> implements IsObject, ArrayLike<T> {
    @JsConstructor
    public Array(){
    }
    
    @SafeVarargs
    @JsConstructor
    public Array(T... value){
    }
    
    @SafeVarargs
    @JsMethod(name = "concat")
    public final native Array<T> concat(T... value);
    
    @JsMethod(name = "copyWithin")
    public native Array<T> copyWithin(double target);
    
    @JsMethod(name = "copyWithin")
    public native Array<T> copyWithin(double target, double start);
    
    @JsMethod(name = "copyWithin")
    public native Array<T> copyWithin(double target, double start, double end);
    
    @JsMethod(name = "entries")
    public native Iterator<ArrayEntryIteratorValue <T>, Array> entries();
    
    @JsMethod(name = "every")
    public native boolean every(PredicateFunction<T> callback);
    
    @JsMethod(name = "every")
    public native boolean every(PredicateFunction<T> callback, Object thisArg);
    
    @JsMethod(name = "fill")
    public native Array fill(T value);
    
    @JsMethod(name = "fill")
    public native Array fill(T value, double start);
    
    @JsMethod(name = "fill")
    public native Array fill(T value, double start, double end);
    
    @JsMethod(name = "filter")
    public native Array filter(PredicateFunction<T> predicate);
    
    @JsMethod(name = "filter")
    public native Array filter(PredicateFunction<T> predicate, Object thisArg);
    
    @JsMethod(name = "find")
    public native T find(PredicateFunction<T> predicate);
    
    @JsMethod(name = "find")
    public native T find(PredicateFunction<T> predicate, Object thisArg);
    
    @JsMethod(name = "findIndex")
    public native double findIndex(PredicateFunction<T> predicate);
    
    @JsMethod(name = "findIndex")
    public native double findIndex(PredicateFunction<T> predicate, Object thisArg);
    
    @JsMethod(name = "forEach")
    public native void forEach(ArrayProc<T> callback);
    
    @JsMethod(name = "forEach")
    public native void forEach(ArrayProc<T> callback, Object thisArg);
    
    @JsMethod(name = "from")
    public static native <T, U> Array<U> from(ArrayLike<T> arrayLike);
    
    @JsMethod(name = "from")
    public static native <T, U> Array<U> from(ArrayLike<T> arrayLike, MapFunction<T, U> mapFunction);
    
    @JsMethod(name = "from")
    public static native <T, U> Array<U> from(ArrayLike<T> arrayLike, MapFunction<T, U> mapFunction, Object thisArg);
    
    @JsMethod(name = "includes")
    public native boolean includes(T value);
    
    @JsMethod(name = "includes")
    public native boolean includes(T value, double fromIndex);
    
    @JsMethod(name = "indexOf")
    public native double indexOf(T value);
    
    @JsMethod(name = "indexOf")
    public native double indexOf(T value, double fromIndex);
    
    @JsMethod(name = "isArray")
    public static native boolean isArray(Object value);
    
    @JsMethod(name = "join")
    public native String join();
    
    @JsMethod(name = "join")
    public native String join(String separator);
    
    @JsMethod(name = "keys")
    public native Iterator<IteratorValue <Integer>, Integer> keys();
    
    @JsMethod(name = "lastIndexOf")
    public native double lastIndexOf(T value);
    
    @JsMethod(name = "lastIndexOf")
    public native double lastIndexOf(T value, double fromIndex);
    
    @JsMethod(name = "map")
    public native <U> Array<U> map(MappingFunction<T, U> mappingFunction);
    
    @JsMethod(name = "map")
    public native <U> Array<U> map(MappingFunction<T, U> mappingFunction, Object thisArg);
    
    @JsMethod(name = "of")
    public static native <T> Array<T> of(Object... value);
    
    @JsMethod(name = "pop")
    public native Object pop();
    
    @SafeVarargs
    @JsMethod(name = "push")
    public final native double push(T... value);
    
    @JsMethod(name = "reduce")
    public native <U> U reduce(ReducingFunction<T, U> reducingFunction);
    
    @JsMethod(name = "reduce")
    public native <U> U reduce(ReducingFunction<T, U> reducingFunction, Object initialValue);
    
    @JsMethod(name = "reduceRight")
    public native <U> U reduceRight(ReducingFunction<T, U> reducingFunction);
    
    @JsMethod(name = "reduceRight")
    public native <U> U reduceRight(ReducingFunction<T, U> reducingFunction, Object initialValue);
    
    @JsMethod(name = "reverse")
    public native Array reverse();
    
    @JsOverlay
    public final void set(double index, T value){
        Js.set(this.object(), index, value);
    }
    
    @JsMethod(name = "shift")
    public native Object shift();
    
    @JsMethod(name = "slice")
    public native Array slice();
    
    @JsMethod(name = "slice")
    public native Array slice(double start);
    
    @JsMethod(name = "slice")
    public native Array slice(double start, double end);
    
    @JsMethod(name = "some")
    public native boolean some(PredicateFunction<T> predicate);
    
    @JsMethod(name = "some")
    public native boolean some(PredicateFunction<T> predicate, Object thisArg);
    
    @JsMethod(name = "sort")
    public native Array sort();
    
    @JsMethod(name = "sort")
    public native Array sort(CompareFunction<T> compareFunction);
    
    @JsMethod(name = "splice")
    public native Array splice(double start);
    
    @SafeVarargs
    @JsMethod(name = "splice")
    public final native Array splice(double start, double end, T... value);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString();
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String locales);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String[] locales);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(Array locales);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String[] locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(Array locales, LocaleOptions options);
    
    @JsMethod(name = "toSource")
    public native String toSource();
    
    @JsMethod(name = "toString")
    public native String toString();
    
    @SafeVarargs
    @JsMethod(name = "unshift")
    public final native double unshift(T... value);
    
    @JsMethod(name = "values")
    public native Iterator<IteratorValue <T>, T> values();
    
    @JsOverlay
    public final boolean getBoolean(double index) {
        return Js.getBoolean(this.object(), index);
    }
    
    @JsOverlay
    public final char getChar(double index) {
        return Js.getChar(this.object(), index);
    }
    
    @JsOverlay
    public final byte getByte(double index) {
        return Js.getByte(this.object(), index);
    }
    
    @JsOverlay
    public final short getShort(double index) {
        return Js.getShort(this.object(), index);
    }
    
    @JsOverlay
    public final int getInt(double index) {
        return Js.getInt(this.object(), index);
    }
    
    @JsOverlay
    public final float getFloat(double index) {
        return Js.getFloat(this.object(), index);
    }
    
    @JsOverlay
    public final double getDouble(double index) {
        return Js.getDouble(this.object(), index);
    }
    
    @JsOverlay
    public final long getLong(double index) {
        return Js.getLong(this.object(), index);
    }
    
    @JsOverlay
    public final void set(double index, boolean value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, char value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, byte value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, short value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, int value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, float value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, double value) {
        Js.set(this.object(), index, value);
    }
    
    @JsOverlay
    public final void set(double index, long value) {
        Js.set(this.object(), index, (double) value);
    }
}

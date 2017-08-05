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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.user.client.Command;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

import java.util.Date;
import java.util.function.Consumer;

@JsType(isNative = true, name = "*", namespace = JsPackage.GLOBAL)
public interface Any {

    @JsOverlay
    public static Any of(double value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(float value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(long value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(int value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(short value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(byte value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(char value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(boolean value) {
        return Js.cast(value);
    }

    @JsOverlay
    public static Any of(Object value) {
        return Js.cast(value);
    }

    @JsOverlay
    default <T> AnyHandler asObject(Consumer<T> objectConsumer) {
        return new DefaultAnyHandler(this).asObject(objectConsumer);
    }

    @JsOverlay
    default <T> AnyHandler asArray(Consumer<Array<T>> consumer) {
        return new DefaultAnyHandler(this).asArray(consumer);
    }

    @JsOverlay
    default <T> AnyHandler asPromise(Consumer<Promise<T>> consumer) {
        return new DefaultAnyHandler(this).asPromise(consumer);
    }

    @JsOverlay
    default AnyHandler asDate(Consumer<Date> consumer) {
        return new DefaultAnyHandler(this).asDate(consumer);
    }

    @JsOverlay
    default AnyHandler asString(Consumer<String> consumer) {
        return new DefaultAnyHandler(this).asString(consumer);
    }

    @JsOverlay
    default AnyHandler asNumber(Consumer<Number> consumer) {
        return new DefaultAnyHandler(this).asNumber(consumer);
    }

    @JsOverlay
    default AnyHandler asBoolean(Consumer<Boolean> consumer) {
        return new DefaultAnyHandler(this).asBoolean(consumer);
    }

    @JsOverlay
    default AnyHandler asFunction(Consumer<Function> consumer) {
        return new DefaultAnyHandler(this).asFunction(consumer);
    }

    @JsOverlay
    default AnyHandler asArrayBuffer(Consumer<ArrayBuffer> consumer) {
        return new DefaultAnyHandler(this).asArrayBuffer(consumer);
    }

    @JsOverlay
    default AnyHandler asInt8Array(Consumer<Int8Array> consumer) {
        return new DefaultAnyHandler(this).asInt8Array(consumer);
    }

    @JsOverlay
    default AnyHandler asUint8Array(Consumer<Uint8Array> consumer) {
        return new DefaultAnyHandler(this).asUint8Array(consumer);
    }

    @JsOverlay
    default AnyHandler asUint8ClampedArray(Consumer<Uint8ClampedArray> consumer) {
        return new DefaultAnyHandler(this).asUint8ClampedArray(consumer);
    }

    @JsOverlay
    default AnyHandler asInt16Array(Consumer<Int16Array> consumer) {
        return new DefaultAnyHandler(this).asInt16Array(consumer);
    }

    @JsOverlay
    default AnyHandler asUint16Array(Consumer<Uint16Array> consumer) {
        return new DefaultAnyHandler(this).asUint16Array(consumer);
    }

    @JsOverlay
    default AnyHandler asInt32Array(Consumer<Int32Array> consumer) {
        return new DefaultAnyHandler(this).asInt32Array(consumer);
    }

    @JsOverlay
    default AnyHandler asUint32Array(Consumer<Uint32Array> consumer) {
        return new DefaultAnyHandler(this).asUint32Array(consumer);
    }

    @JsOverlay
    default AnyHandler asFloat32Array(Consumer<Float32Array> consumer) {
        return new DefaultAnyHandler(this).asFloat32Array(consumer);
    }

    @JsOverlay
    default AnyHandler asFloat64Array(Consumer<Float64Array> consumer) {
        return new DefaultAnyHandler(this).asFloat64Array(consumer);
    }


    @JsOverlay
    default AnyHandler ifNullOrUndefined(Command command) {
        return new DefaultAnyHandler(this).ifNullOrUndefined(command);
    }

    @JsOverlay
    default void otherwise(Consumer<Any> consumer) {
        new DefaultAnyHandler(this).otherwise(consumer);
    }

    class DefaultAnyHandler implements AnyHandler {

        private Any anyValue;

        DefaultAnyHandler(Any anyValue) {
            this.anyValue = anyValue;
        }

        @Override
        public <T> AnyHandler asObject(Consumer<T> objectConsumer) {
            return dispatchIf(Js.TYPE_OBJECT, objectConsumer);
        }

        @Override
        public <T> AnyHandler asArray(Consumer<Array<T>> consumer) {
            return dispatchIf(Js.TYPE_ARRAY, consumer);
        }

        @Override
        public <T> AnyHandler asPromise(Consumer<Promise<T>> consumer) {
            return dispatchIf(Js.TYPE_PROMISE, consumer);
        }

        @Override
        public AnyHandler asDate(Consumer<Date> consumer) {
            if (Js.isTypeName(anyValue, Js.TYPE_DATE)) {
                JsDate date = Js.cast(anyValue);
                consumer.accept(new Date((long) date.getTime()));
                return new CompletedAnyHandler();
            }
            return this;
        }

        @Override
        public AnyHandler asString(Consumer<String> consumer) {
            return dispatchIf("String", consumer);
        }

        @Override
        public AnyHandler asNumber(Consumer<Number> consumer) {
            return dispatchIf("Number", consumer);
        }

        @Override
        public AnyHandler asBoolean(Consumer<Boolean> consumer) {
            return dispatchIf("Boolean", consumer);
        }

        @Override
        public AnyHandler asFunction(Consumer<Function> consumer) {
            return dispatchIf("Function", consumer);
        }

        @Override
        public AnyHandler asArrayBuffer(Consumer<ArrayBuffer> consumer) {
            return dispatchIf("ArrayBuffer", consumer);
        }

        @Override
        public AnyHandler asInt8Array(Consumer<Int8Array> consumer) {
            return dispatchIf("Int8Array", consumer);
        }

        @Override
        public AnyHandler asUint8Array(Consumer<Uint8Array> consumer) {
            return dispatchIf("Uint8Array", consumer);
        }

        @Override
        public AnyHandler asUint8ClampedArray(Consumer<Uint8ClampedArray> consumer) {
            return dispatchIf("Uint8ClampedArray", consumer);
        }

        @Override
        public AnyHandler asInt16Array(Consumer<Int16Array> consumer) {
            return dispatchIf("Int16Array", consumer);
        }

        @Override
        public AnyHandler asUint16Array(Consumer<Uint16Array> consumer) {
            return dispatchIf("Uint16Array", consumer);
        }

        @Override
        public AnyHandler asInt32Array(Consumer<Int32Array> consumer) {
            return dispatchIf("Int32Array", consumer);
        }

        @Override
        public AnyHandler asUint32Array(Consumer<Uint32Array> consumer) {
            return dispatchIf("Uint32Array", consumer);
        }

        @Override
        public AnyHandler asFloat32Array(Consumer<Float32Array> consumer) {
            return dispatchIf("Float32Array", consumer);
        }

        @Override
        public AnyHandler asFloat64Array(Consumer<Float64Array> consumer) {
            return dispatchIf("Float64Array", consumer);
        }

        @Override
        public AnyHandler ifNullOrUndefined(Command command) {
            if (anyValue == null){
                command.execute();
                return new CompletedAnyHandler();
            }
            return this;
        }

        @Override
        public void otherwise(Consumer<Any> consumer) {
            consumer.accept(anyValue);
        }

        @SuppressWarnings("unchecked")
        private <T> AnyHandler dispatchIf(String typeName, Consumer<T> consumer) {
            if (Js.isTypeName(anyValue, typeName)) {
                consumer.accept((T) anyValue);
                return new CompletedAnyHandler();
            }
            return this;
        }

    }

    class CompletedAnyHandler implements AnyHandler {

        @Override
        public <T> AnyHandler asObject(Consumer<T> objectConsumer) {
            return this;
        }

        @Override
        public <T> AnyHandler asArray(Consumer<Array<T>> consumer) {
            return this;
        }

        @Override
        public <T> AnyHandler asPromise(Consumer<Promise<T>> consumer) {
            return this;
        }

        @Override
        public AnyHandler asDate(Consumer<Date> consumer) {
            return this;
        }

        @Override
        public AnyHandler asString(Consumer<String> consumer) {
            return this;
        }

        @Override
        public AnyHandler asNumber(Consumer<Number> consumer) {
            return this;
        }

        @Override
        public AnyHandler asBoolean(Consumer<Boolean> consumer) {
            return this;
        }

        @Override
        public AnyHandler asFunction(Consumer<Function> consumer) {
            return this;
        }

        @Override
        public AnyHandler asArrayBuffer(Consumer<ArrayBuffer> consumer) {
            return this;
        }

        @Override
        public AnyHandler asInt8Array(Consumer<Int8Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asUint8Array(Consumer<Uint8Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asUint8ClampedArray(Consumer<Uint8ClampedArray> consumer) {
            return this;
        }

        @Override
        public AnyHandler asInt16Array(Consumer<Int16Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asUint16Array(Consumer<Uint16Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asInt32Array(Consumer<Int32Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asUint32Array(Consumer<Uint32Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asFloat32Array(Consumer<Float32Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler asFloat64Array(Consumer<Float64Array> consumer) {
            return this;
        }

        @Override
        public AnyHandler ifNullOrUndefined(Command command) {
            return this;
        }

        @Override
        public void otherwise(Consumer<Any> consumer) {
            // no implementation
        }
    }
}
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
import com.google.gwt.user.client.Command;

import java.util.Date;
import java.util.function.Consumer;

public interface AnyHandler {
    <T> AnyHandler asObject(Consumer<T> objectConsumer);

    <T> AnyHandler asArray(Consumer<Array<T>> consumer);

    <T> AnyHandler asPromise(Consumer<Promise<T>> consumer);

    AnyHandler asString(Consumer<String> consumer);

    AnyHandler asDate(Consumer<Date> consumer);

    AnyHandler asNumber(Consumer<Number> consumer);

    AnyHandler asBoolean(Consumer<Boolean> consumer);

    AnyHandler asFunction(Consumer<Function> consumer);

    AnyHandler asArrayBuffer(Consumer<ArrayBuffer> consumer);

    AnyHandler asInt8Array(Consumer<Int8Array> consumer);

    AnyHandler asUint8Array(Consumer<Uint8Array> consumer);

    AnyHandler asUint8ClampedArray(Consumer<Uint8ClampedArray> consumer);

    AnyHandler asInt16Array(Consumer<Int16Array> consumer);

    AnyHandler asUint16Array(Consumer<Uint16Array> consumer);

    AnyHandler asInt32Array(Consumer<Int32Array> consumer);

    AnyHandler asUint32Array(Consumer<Uint32Array> consumer);

    AnyHandler asFloat32Array(Consumer<Float32Array> consumer);

    AnyHandler asFloat64Array(Consumer<Float64Array> consumer);

    AnyHandler ifNullOrUndefined(Command command);

    void otherwise(Consumer<Any> consumer);
}

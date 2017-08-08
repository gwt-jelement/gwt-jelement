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
package gwt.jelement.webgl;

import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class WebGLGetBufferSubDataAsync implements IsObject {
    @JsMethod(name = "getBufferSubDataAsync")
    public native Promise<ArrayBufferView> getBufferSubDataAsync(double target, double srcByteOffset, ArrayBufferView dstData);
    
    @JsMethod(name = "getBufferSubDataAsync")
    public native Promise<ArrayBufferView> getBufferSubDataAsync(double target, double srcByteOffset, ArrayBufferView dstData, double dstOffset);
    
    @JsMethod(name = "getBufferSubDataAsync")
    public native Promise<ArrayBufferView> getBufferSubDataAsync(double target, double srcByteOffset, ArrayBufferView dstData, double dstOffset, double length);
    
}

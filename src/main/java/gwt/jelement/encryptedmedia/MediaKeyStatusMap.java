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
package gwt.jelement.encryptedmedia;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="MediaKeyStatusMap", isNative = true)
public class MediaKeyStatusMap implements IsObject {
    @JsProperty(name="size")
    public native double getSize();
    
    @JsMethod(name = "get")
    public native Object get(ArrayBuffer keyId);
    
    @JsMethod(name = "get")
    public native Object get(ArrayBufferView keyId);
    
    @JsMethod(name = "has")
    public native boolean has(ArrayBuffer keyId);
    
    @JsMethod(name = "has")
    public native boolean has(ArrayBufferView keyId);
    
}

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
package gwt.jelement.fileapi;

import gwt.jelement.fileapi.Blob;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Blob", isNative = true)
public class Blob{
    @JsProperty(name="size")
    public native double getSize();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="isClosed")
    public native boolean getIsClosed();
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "slice")
    public native Blob slice();
    
    @JsMethod(name = "slice")
    public native Blob slice(double start);
    
    @JsMethod(name = "slice")
    public native Blob slice(double start, double end);
    
    @JsMethod(name = "slice")
    public native Blob slice(double start, double end, String contentType);
    
}

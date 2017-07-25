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
import elemental2.core.ArrayBuffer;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FileReaderSync{
    
    @JsConstructor
    public FileReaderSync(){
    }
    
    @JsMethod(name = "readAsArrayBuffer")
    public native ArrayBuffer readAsArrayBuffer(Blob blob);
    
    
    @JsMethod(name = "readAsBinaryString")
    public native String readAsBinaryString(Blob blob);
    
    
    @JsMethod(name = "readAsDataURL")
    public native String readAsDataURL(Blob blob);
    
    
    @JsMethod(name = "readAsText")
    public native String readAsText(Blob blob);
    
    
    @JsMethod(name = "readAsText")
    public native String readAsText(Blob blob, String label);
    
    
}

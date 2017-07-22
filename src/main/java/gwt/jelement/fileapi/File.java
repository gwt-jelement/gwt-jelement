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
import gwt.jelement.fileapi.FilePropertyBag;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import elemental2.core.Date;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class File extends Blob{
    
    @JsConstructor
    public File(ArrayBuffer[] fileBits, String fileName){
        super();
    }
    
    @JsConstructor
    public File(ArrayBuffer[] fileBits, String fileName, FilePropertyBag options){
        super();
    }
    
    @JsConstructor
    public File(ArrayBufferView[] fileBits, String fileName){
        super();
    }
    
    @JsConstructor
    public File(ArrayBufferView[] fileBits, String fileName, FilePropertyBag options){
        super();
    }
    
    @JsConstructor
    public File(Blob[] fileBits, String fileName){
        super();
    }
    
    @JsConstructor
    public File(Blob[] fileBits, String fileName, FilePropertyBag options){
        super();
    }
    
    @JsConstructor
    public File(String[] fileBits, String fileName){
        super();
    }
    
    @JsConstructor
    public File(String[] fileBits, String fileName, FilePropertyBag options){
        super();
    }
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="lastModified")
    public native double getLastModified();
    
    @JsProperty(name="lastModifiedDate")
    public native Date getLastModifiedDate();
    
    @JsProperty(name="webkitRelativePath")
    public native String getWebkitRelativePath();
    
    
}

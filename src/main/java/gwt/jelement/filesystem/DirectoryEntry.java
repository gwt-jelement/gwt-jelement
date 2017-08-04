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
package gwt.jelement.filesystem;

import gwt.jelement.html.VoidCallback;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DirectoryEntry", isNative = true)
public class DirectoryEntry extends Entry{
    @JsMethod(name = "createReader")
    public native DirectoryReader createReader();
    
    @JsMethod(name = "getDirectory")
    public native void getDirectory(String path);
    
    @JsMethod(name = "getDirectory")
    public native void getDirectory(String path, FileSystemFlags options);
    
    @JsMethod(name = "getDirectory")
    public native void getDirectory(String path, FileSystemFlags options, EntryCallback successCallback);
    
    @JsMethod(name = "getDirectory")
    public native void getDirectory(String path, FileSystemFlags options, EntryCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "getFile")
    public native void getFile(String path);
    
    @JsMethod(name = "getFile")
    public native void getFile(String path, FileSystemFlags options);
    
    @JsMethod(name = "getFile")
    public native void getFile(String path, FileSystemFlags options, EntryCallback successCallback);
    
    @JsMethod(name = "getFile")
    public native void getFile(String path, FileSystemFlags options, EntryCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "removeRecursively")
    public native void removeRecursively(VoidCallback successCallback);
    
    @JsMethod(name = "removeRecursively")
    public native void removeRecursively(VoidCallback successCallback, ErrorCallback errorCallback);
    
}

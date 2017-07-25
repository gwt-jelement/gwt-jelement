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

import gwt.jelement.filesystem.DOMFileSystemSync;
import gwt.jelement.filesystem.DirectoryEntrySync;
import gwt.jelement.filesystem.EntrySync;
import gwt.jelement.filesystem.Metadata;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class EntrySync{
    
    @JsProperty(name="isFile")
    public native boolean getIsFile();
    
    @JsProperty(name="isDirectory")
    public native boolean getIsDirectory();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="fullPath")
    public native String getFullPath();
    
    @JsProperty(name="filesystem")
    public native DOMFileSystemSync getFilesystem();
    
    @JsMethod(name = "copyTo")
    public native EntrySync copyTo(DirectoryEntrySync parent, String name);
    
    
    @JsMethod(name = "getMetadata")
    public native Metadata getMetadata();
    
    
    @JsMethod(name = "getParent")
    public native DirectoryEntrySync getParent();
    
    
    @JsMethod(name = "moveTo")
    public native EntrySync moveTo(DirectoryEntrySync parent, String name);
    
    
    @JsMethod(name = "remove")
    public native void remove();
    
    
    @JsMethod(name = "toURL")
    public native String toURL();
    
    
}

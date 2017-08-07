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
package gwt.jelement.workers;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.filesystem.DOMFileSystemSync;
import gwt.jelement.filesystem.EntryCallback;
import gwt.jelement.filesystem.EntrySync;
import gwt.jelement.filesystem.ErrorCallback;
import gwt.jelement.filesystem.FileSystemCallback;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SharedWorkerGlobalScope", isNative = true)
public class SharedWorkerGlobalScope extends WorkerGlobalScope {
    public static short TEMPORARY; /* 0 */
    public static short PERSISTENT; /* 1 */
    
    @JsProperty(name="onconnect")
    private EventHandlerNonNull onconnect;
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsOverlay
    public final EventHandlerNonNull getOnConnect(){
        return this.onconnect;
    }
    
    @JsOverlay
    public final void setOnConnect(EventHandlerNonNull onconnect){
        this.onconnect = onconnect;
    }
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "webkitRequestFileSystem")
    public native void webkitRequestFileSystem(short type, double size);
    
    @JsMethod(name = "webkitRequestFileSystem")
    public native void webkitRequestFileSystem(short type, double size, FileSystemCallback successCallback);
    
    @JsMethod(name = "webkitRequestFileSystem")
    public native void webkitRequestFileSystem(short type, double size, FileSystemCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "webkitRequestFileSystemSync")
    public native DOMFileSystemSync webkitRequestFileSystemSync(short type, double size);
    
    @JsMethod(name = "webkitResolveLocalFileSystemSyncURL")
    public native EntrySync webkitResolveLocalFileSystemSyncURL(String url);
    
    @JsMethod(name = "webkitResolveLocalFileSystemURL")
    public native void webkitResolveLocalFileSystemURL(String url, EntryCallback successCallback);
    
    @JsMethod(name = "webkitResolveLocalFileSystemURL")
    public native void webkitResolveLocalFileSystemURL(String url, EntryCallback successCallback, ErrorCallback errorCallback);
    
}

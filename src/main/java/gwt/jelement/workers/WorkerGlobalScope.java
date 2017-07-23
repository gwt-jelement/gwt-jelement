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

import gwt.jelement.cachestorage.CacheStorage;
import gwt.jelement.crypto.Crypto;
import gwt.jelement.dom.AddressSpace;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.frame.Console;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.imagebitmap.ImageBitmapOptions;
import gwt.jelement.indexeddb.IDBFactory;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.svg.SVGImageElement;
import gwt.jelement.timing.WorkerPerformance;
import gwt.jelement.workers.WorkerGlobalScope;
import gwt.jelement.workers.WorkerLocation;
import gwt.jelement.workers.WorkerNavigator;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WorkerGlobalScope extends EventTarget{
    
    @JsConstructor
    public WorkerGlobalScope(){
        super();
    }
    
    @JsProperty(name="self")
    public WorkerGlobalScope self;
    
    @JsProperty(name="location")
    public WorkerLocation location;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="navigator")
    public WorkerNavigator navigator;
    
    @JsProperty(name="console")
    public Console console;
    
    @JsProperty(name="addressSpace")
    public String addressSpace;
    
    @JsOverlay
    public final AddressSpace getAddressSpace(){
       return AddressSpace.of(addressSpace);
    }
    
    @JsProperty(name="onrejectionhandled")
    public EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onunhandledrejection")
    public EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="isSecureContext")
    public boolean isSecureContext;
    
    @JsProperty(name="origin")
    public String origin;
    
    @JsProperty(name="caches")
    public CacheStorage caches;
    
    @JsProperty(name="crypto")
    public Crypto crypto;
    
    @JsProperty(name="indexedDB")
    public IDBFactory indexedDB;
    
    @JsProperty(name="performance")
    public WorkerPerformance performance;
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input, Object init);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, Object init);
    
    @JsMethod(name = "importScripts")
    public native void importScripts();
    
    @JsMethod(name = "importScripts")
    public native void importScripts(String... urls);
    
}

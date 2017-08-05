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
import gwt.jelement.core.CallbackFunction;
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Promise;
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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="WorkerGlobalScope", isNative = true)
public class WorkerGlobalScope extends EventTarget{
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onrejectionhandled")
    private EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onunhandledrejection")
    private EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="addressSpace")
    private String addressSpace;
    
    @JsProperty(name="self")
    public native WorkerGlobalScope getSelf();
    
    @JsProperty(name="location")
    public native WorkerLocation getLocation();
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsProperty(name="navigator")
    public native WorkerNavigator getNavigator();
    
    @JsProperty(name="console")
    public native Console getConsole();
    
    @JsOverlay
    public final EventHandlerNonNull getOnRejectionhandled(){
        return this.onrejectionhandled;
    }
    
    @JsOverlay
    public final void setOnRejectionhandled(EventHandlerNonNull onrejectionhandled){
        this.onrejectionhandled = onrejectionhandled;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUnhandledrejection(){
        return this.onunhandledrejection;
    }
    
    @JsOverlay
    public final void setOnUnhandledrejection(EventHandlerNonNull onunhandledrejection){
        this.onunhandledrejection = onunhandledrejection;
    }
    
    @JsProperty(name="isSecureContext")
    public native boolean getIsSecureContext();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="caches")
    public native CacheStorage getCaches();
    
    @JsProperty(name="crypto")
    public native Crypto getCrypto();
    
    @JsProperty(name="indexedDB")
    public native IDBFactory getIndexedDB();
    
    @JsProperty(name="performance")
    public native WorkerPerformance getPerformance();
    
    @JsOverlay
    public final AddressSpace getAddressSpace(){
       return AddressSpace.of(addressSpace);
    }
    
    @JsMethod(name = "atob")
    public native String atob(String atob);
    
    @JsMethod(name = "btoa")
    public native String btoa(String btoa);
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval();
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval(double handle);
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout();
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout(double handle);
    
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
    public native Promise<Response> fetch(Request input, JsObject init);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, JsObject init);
    
    @SafeVarargs
    @JsMethod(name = "importScripts")
    public final native void importScripts(String... urls);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(CallbackFunction handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(CallbackFunction handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(CallbackFunction handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(CallbackFunction handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler, double timeout, Object... arguments);
    
}

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
package gwt.jelement.fetch;

import gwt.jelement.fetch.Headers;
import gwt.jelement.fetch.ReferrerPolicy;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.RequestCache;
import gwt.jelement.fetch.RequestMode;
import gwt.jelement.fetch.RequestRedirect;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.FormData;
import gwt.jelement.workers.RequestCredentials;
import elemental2.core.ArrayBuffer;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Request{
    
    @JsProperty(name="method")
    public String method;
    
    @JsProperty(name="url")
    public String url;
    
    @JsProperty(name="headers")
    public Headers headers;
    
    @JsProperty(name="referrer")
    public String referrer;
    
    @JsProperty(name="referrerPolicy")
    public String referrerPolicy;
    
    @JsOverlay
    public final ReferrerPolicy getReferrerPolicy(){
       return ReferrerPolicy.of(referrerPolicy);
    }
    
    @JsProperty(name="mode")
    public String mode;
    
    @JsOverlay
    public final RequestMode getMode(){
       return RequestMode.of(mode);
    }
    
    @JsProperty(name="credentials")
    public String credentials;
    
    @JsOverlay
    public final RequestCredentials getCredentials(){
       return RequestCredentials.of(credentials);
    }
    
    @JsProperty(name="cache")
    public String cache;
    
    @JsOverlay
    public final RequestCache getCache(){
       return RequestCache.of(cache);
    }
    
    @JsProperty(name="redirect")
    public String redirect;
    
    @JsOverlay
    public final RequestRedirect getRedirect(){
       return RequestRedirect.of(redirect);
    }
    
    @JsProperty(name="integrity")
    public String integrity;
    
    @JsProperty(name="bodyUsed")
    public boolean bodyUsed;
    
    @JsMethod(name = "arrayBuffer")
    public native Promise<ArrayBuffer> arrayBuffer();
    
    @JsMethod(name = "blob")
    public native Promise<Blob> blob();
    
    @JsMethod(name = "clone")
    public native Request clone();
    
    @JsMethod(name = "formData")
    public native Promise<FormData> formData();
    
    @JsMethod(name = "json")
    public native Promise<Object> json();
    
    @JsMethod(name = "text")
    public native Promise<String> text();
    
}

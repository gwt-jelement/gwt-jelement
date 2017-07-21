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

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.fetch.Headers;
import gwt.jelement.fetch.ReferrerPolicy;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.RequestCache;
import gwt.jelement.fetch.RequestMode;
import gwt.jelement.fetch.RequestRedirect;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.FormData;
import gwt.jelement.workers.RequestCredentials;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Request{
    
    @JsProperty(name="method")
    public native String getMethod();
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="headers")
    public native Headers getHeaders();
    
    @JsProperty(name="referrer")
    public native String getReferrer();
    
    @JsOverlay
    public  ReferrerPolicy getReferrerPolicyAsReferrerPolicy(){
        return ReferrerPolicy.of(getReferrerPolicy());
    }
    
    @JsProperty(name="referrerPolicy")
    public native String getReferrerPolicy();
    
    @JsOverlay
    public  RequestMode getModeAsRequestMode(){
        return RequestMode.of(getMode());
    }
    
    @JsProperty(name="mode")
    public native String getMode();
    
    @JsOverlay
    public  RequestCredentials getCredentialsAsRequestCredentials(){
        return RequestCredentials.of(getCredentials());
    }
    
    @JsProperty(name="credentials")
    public native String getCredentials();
    
    @JsOverlay
    public  RequestCache getCacheAsRequestCache(){
        return RequestCache.of(getCache());
    }
    
    @JsProperty(name="cache")
    public native String getCache();
    
    @JsOverlay
    public  RequestRedirect getRedirectAsRequestRedirect(){
        return RequestRedirect.of(getRedirect());
    }
    
    @JsProperty(name="redirect")
    public native String getRedirect();
    
    @JsProperty(name="integrity")
    public native String getIntegrity();
    
    @JsProperty(name="bodyUsed")
    public native boolean getBodyUsed();
    
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

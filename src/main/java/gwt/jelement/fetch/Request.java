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

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.FormData;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Request", isNative = true)
public class Request implements IsObject {
    @JsProperty(name="referrerPolicy")
    private String referrerPolicy;
    
    @JsProperty(name="mode")
    private String mode;
    
    @JsProperty(name="credentials")
    private String credentials;
    
    @JsProperty(name="cache")
    private String cache;
    
    @JsProperty(name="redirect")
    private String redirect;
    
    @JsConstructor
    public Request(Request input){
    }
    
    @JsConstructor
    public Request(Request input, JsObject requestInitDict){
    }
    
    @JsConstructor
    public Request(String input){
    }
    
    @JsConstructor
    public Request(String input, JsObject requestInitDict){
    }
    
    @JsProperty(name="method")
    public native String getMethod();
    
    @JsProperty(name="url")
    public native String getUrl();
    
    @JsProperty(name="headers")
    public native Headers getHeaders();
    
    @JsProperty(name="referrer")
    public native String getReferrer();
    
    @JsProperty(name="integrity")
    public native String getIntegrity();
    
    @JsProperty(name="bodyUsed")
    public native boolean isBodyUsed();
    
    @JsOverlay
    public final ReferrerPolicy getReferrerPolicy(){
       return ReferrerPolicy.of(referrerPolicy);
    }
    
    @JsOverlay
    public final RequestMode getMode(){
       return RequestMode.of(mode);
    }
    
    @JsOverlay
    public final RequestCredentials getCredentials(){
       return RequestCredentials.of(credentials);
    }
    
    @JsOverlay
    public final RequestCache getCache(){
       return RequestCache.of(cache);
    }
    
    @JsOverlay
    public final RequestRedirect getRedirect(){
       return RequestRedirect.of(redirect);
    }
    
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

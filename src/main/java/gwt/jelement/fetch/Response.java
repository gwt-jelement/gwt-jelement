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
import gwt.jelement.fetch.Response;
import gwt.jelement.fetch.ResponseType;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.FormData;
import elemental2.core.ArrayBuffer;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Response{
    
    @JsProperty(name="type")
    public String type;
    @JsOverlay
    public final ResponseType getType(){
       return ResponseType.of(type);
    }
    
    @JsProperty(name="url")
    public String url;
    
    @JsProperty(name="redirected")
    public boolean redirected;
    
    @JsProperty(name="status")
    public short status;
    
    @JsProperty(name="ok")
    public boolean ok;
    
    @JsProperty(name="statusText")
    public String statusText;
    
    @JsProperty(name="headers")
    public Headers headers;
    
    @JsProperty(name="body")
    public Object body;
    
    @JsProperty(name="bodyUsed")
    public boolean bodyUsed;
    
    @JsMethod(name = "arrayBuffer")
    public native Promise<ArrayBuffer> arrayBuffer();
    
    @JsMethod(name = "blob")
    public native Promise<Blob> blob();
    
    @JsMethod(name = "clone")
    public native Response clone();
    
    @JsMethod(name = "error")
    public native Response error();
    
    @JsMethod(name = "formData")
    public native Promise<FormData> formData();
    
    @JsMethod(name = "json")
    public native Promise<Object> json();
    
    @JsMethod(name = "redirect")
    public native Response redirect(String url);
    
    @JsMethod(name = "redirect")
    public native Response redirect(String url, short status);
    
    @JsMethod(name = "text")
    public native Promise<String> text();
    
}

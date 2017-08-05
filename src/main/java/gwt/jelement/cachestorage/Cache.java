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
package gwt.jelement.cachestorage;

import gwt.jelement.core.Array;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, name="Cache", isNative = true)
public class Cache extends IsObject{
    @JsMethod(name = "add")
    public native Promise<Void> add(Request request);
    
    @JsMethod(name = "add")
    public native Promise<Void> add(String request);
    
    @JsMethod(name = "addAll")
    public native Promise<Void> addAll(Request[] requests);
    
    @JsMethod(name = "addAll")
    public native Promise<Void> addAll(String[] requests);
    
    @JsMethod(name = "addAll")
    public native Promise<Void> addAll(Array requests);
    
    @JsMethod(name = "delete")
    public native Promise<Boolean> delete(Request request);
    
    @JsMethod(name = "delete")
    public native Promise<Boolean> delete(String request);
    
    @JsMethod(name = "delete")
    public native Promise<Boolean> delete(Request request, CacheQueryOptions options);
    
    @JsMethod(name = "delete")
    public native Promise<Boolean> delete(String request, CacheQueryOptions options);
    
    @JsMethod(name = "keys")
    public native Promise<Request[]> keys();
    
    @JsMethod(name = "keys")
    public native Promise<Request[]> keys(Request request);
    
    @JsMethod(name = "keys")
    public native Promise<Request[]> keys(String request);
    
    @JsMethod(name = "keys")
    public native Promise<Request[]> keys(Request request, CacheQueryOptions options);
    
    @JsMethod(name = "keys")
    public native Promise<Request[]> keys(String request, CacheQueryOptions options);
    
    @JsMethod(name = "match")
    public native Promise<Any> match(Request request);
    
    @JsMethod(name = "match")
    public native Promise<Any> match(String request);
    
    @JsMethod(name = "match")
    public native Promise<Any> match(Request request, CacheQueryOptions options);
    
    @JsMethod(name = "match")
    public native Promise<Any> match(String request, CacheQueryOptions options);
    
    @JsMethod(name = "matchAll")
    public native Promise<Response[]> matchAll();
    
    @JsMethod(name = "matchAll")
    public native Promise<Response[]> matchAll(Request request);
    
    @JsMethod(name = "matchAll")
    public native Promise<Response[]> matchAll(String request);
    
    @JsMethod(name = "matchAll")
    public native Promise<Response[]> matchAll(Request request, CacheQueryOptions options);
    
    @JsMethod(name = "matchAll")
    public native Promise<Response[]> matchAll(String request, CacheQueryOptions options);
    
    @JsMethod(name = "put")
    public native Promise<Void> put(Request request, Response response);
    
    @JsMethod(name = "put")
    public native Promise<Void> put(String request, Response response);
    
}

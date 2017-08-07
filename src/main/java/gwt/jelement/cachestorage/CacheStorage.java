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

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.fetch.Request;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CacheStorage", isNative = true)
public class CacheStorage implements IsObject {
    @JsMethod(name = "delete")
    public native Promise<Boolean> delete(String cacheName);
    
    @JsMethod(name = "has")
    public native Promise<Boolean> has(String cacheName);
    
    @JsMethod(name = "keys")
    public native Promise<String[]> keys();
    
    @JsMethod(name = "match")
    public native Promise<Object> match(Request request);
    
    @JsMethod(name = "match")
    public native Promise<Object> match(String request);
    
    @JsMethod(name = "match")
    public native Promise<Object> match(Request request, CacheQueryOptions options);
    
    @JsMethod(name = "match")
    public native Promise<Object> match(String request, CacheQueryOptions options);
    
    @JsMethod(name = "open")
    public native Promise<Cache> open(String cacheName);
    
}

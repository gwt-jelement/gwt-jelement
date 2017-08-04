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
package gwt.jelement.background_fetch;

import gwt.jelement.core.Array;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.fetch.Request;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="BackgroundFetchManager", isNative = true)
public class BackgroundFetchManager extends IsObject{
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, Request requests);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, String requests);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, Request[] requests);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, String[] requests);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, Array requests);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, Request requests, BackgroundFetchOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, String requests, BackgroundFetchOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, Request[] requests, BackgroundFetchOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, String[] requests, BackgroundFetchOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<BackgroundFetchRegistration> fetch(String tag, Array requests, BackgroundFetchOptions options);
    
    @JsMethod(name = "get")
    public native Promise<BackgroundFetchRegistration> get(String tag);
    
    @JsMethod(name = "getTags")
    public native Promise<String[]> getTags();
    
}

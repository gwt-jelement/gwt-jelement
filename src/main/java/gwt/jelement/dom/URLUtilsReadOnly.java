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
package gwt.jelement.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="URLUtilsReadOnly", isNative = true)
public class URLUtilsReadOnly{
    @JsProperty(name="href")
    public native String getHref();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="protocol")
    public native String getProtocol();
    
    @JsProperty(name="host")
    public native String getHost();
    
    @JsProperty(name="hostname")
    public native String getHostname();
    
    @JsProperty(name="port")
    public native String getPort();
    
    @JsProperty(name="pathname")
    public native String getPathname();
    
    @JsProperty(name="search")
    public native String getSearch();
    
    @JsProperty(name="hash")
    public native String getHash();
    
}

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
package gwt.jelement.frame;

import gwt.jelement.dom.DOMStringList;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Location{
    
    @JsProperty(name="ancestorOrigins")
    public DOMStringList ancestorOrigins;
    
    @JsProperty(name="href")
    public String href;
    
    @JsProperty(name="origin")
    public String origin;
    
    @JsProperty(name="protocol")
    public String protocol;
    
    @JsProperty(name="host")
    public String host;
    
    @JsProperty(name="hostname")
    public String hostname;
    
    @JsProperty(name="port")
    public String port;
    
    @JsProperty(name="pathname")
    public String pathname;
    
    @JsProperty(name="search")
    public String search;
    
    @JsProperty(name="hash")
    public String hash;
    
    @JsMethod(name = "assign")
    public native void assign(String url);
    
    @JsMethod(name = "reload")
    public native void reload();
    
    @JsMethod(name = "replace")
    public native void replace(String url);
    
    @JsMethod(name = "toString")
    public native String toString();
    
    @JsMethod(name = "valueOf")
    public native Object valueOf();
    
}

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

import gwt.jelement.dom.URLSearchParams;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.mediasource.MediaSource;
import gwt.jelement.mediastream.MediaStream;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class URL{
    
    @JsConstructor
    public URL(String url){
    }
    
    @JsConstructor
    public URL(String url, String base){
    }
    
    @JsProperty(name="href")
    public String href;
    
    @JsProperty(name="protocol")
    public String protocol;
    
    @JsProperty(name="username")
    public String username;
    
    @JsProperty(name="password")
    public String password;
    
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
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="searchParams")
    public native URLSearchParams getSearchParams();
    
    @JsMethod(name = "createObjectURL")
    public native String createObjectURL(Blob blob);
    
    @JsMethod(name = "createObjectURL")
    public native String createObjectURL(MediaSource source);
    
    @JsMethod(name = "createObjectURL")
    public native String createObjectURL(MediaStream stream);
    
    @JsMethod(name = "revokeObjectURL")
    public native void revokeObjectURL(String url);
    
}

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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="URL", isNative = true)
public class URL{
    @JsConstructor
    public URL(String url){
    }
    
    @JsConstructor
    public URL(String url, String base){
    }
    
    @JsProperty(name="href")
    public native String getHref();
    
    @JsProperty(name="href")
    public native void setHref(String href);
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="protocol")
    public native String getProtocol();
    
    @JsProperty(name="protocol")
    public native void setProtocol(String protocol);
    
    @JsProperty(name="username")
    public native String getUsername();
    
    @JsProperty(name="username")
    public native void setUsername(String username);
    
    @JsProperty(name="password")
    public native String getPassword();
    
    @JsProperty(name="password")
    public native void setPassword(String password);
    
    @JsProperty(name="host")
    public native String getHost();
    
    @JsProperty(name="host")
    public native void setHost(String host);
    
    @JsProperty(name="hostname")
    public native String getHostname();
    
    @JsProperty(name="hostname")
    public native void setHostname(String hostname);
    
    @JsProperty(name="port")
    public native String getPort();
    
    @JsProperty(name="port")
    public native void setPort(String port);
    
    @JsProperty(name="pathname")
    public native String getPathname();
    
    @JsProperty(name="pathname")
    public native void setPathname(String pathname);
    
    @JsProperty(name="search")
    public native String getSearch();
    
    @JsProperty(name="search")
    public native void setSearch(String search);
    
    @JsProperty(name="searchParams")
    public native URLSearchParams getSearchParams();
    
    @JsProperty(name="hash")
    public native String getHash();
    
    @JsProperty(name="hash")
    public native void setHash(String hash);
    
    @JsMethod(name = "createObjectURL")
    public static native String createObjectURL(Blob blob);
    
    @JsMethod(name = "createObjectURL")
    public static native String createObjectURL(MediaSource source);
    
    @JsMethod(name = "createObjectURL")
    public static native String createObjectURL(MediaStream stream);
    
    @JsMethod(name = "revokeObjectURL")
    public static native void revokeObjectURL(String url);
    
}

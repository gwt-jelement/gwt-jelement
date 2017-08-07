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
package gwt.jelement.html;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLAnchorElement", isNative = true)
public class HTMLAnchorElement extends HTMLElement {
    @JsProperty(name="target")
    public native String getTarget();
    
    @JsProperty(name="target")
    public native void setTarget(String target);
    
    @JsProperty(name="download")
    public native String getDownload();
    
    @JsProperty(name="download")
    public native void setDownload(String download);
    
    @JsProperty(name="ping")
    public native String getPing();
    
    @JsProperty(name="ping")
    public native void setPing(String ping);
    
    @JsProperty(name="rel")
    public native String getRel();
    
    @JsProperty(name="rel")
    public native void setRel(String rel);
    
    @JsProperty(name="hreflang")
    public native String getHreflang();
    
    @JsProperty(name="hreflang")
    public native void setHreflang(String hreflang);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="referrerPolicy")
    public native String getReferrerPolicy();
    
    @JsProperty(name="referrerPolicy")
    public native void setReferrerPolicy(String referrerPolicy);
    
    @JsProperty(name="text")
    public native String getText();
    
    @JsProperty(name="text")
    public native void setText(String text);
    
    @JsProperty(name="coords")
    public native String getCoords();
    
    @JsProperty(name="coords")
    public native void setCoords(String coords);
    
    @JsProperty(name="charset")
    public native String getCharset();
    
    @JsProperty(name="charset")
    public native void setCharset(String charset);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="rev")
    public native String getRev();
    
    @JsProperty(name="rev")
    public native void setRev(String rev);
    
    @JsProperty(name="shape")
    public native String getShape();
    
    @JsProperty(name="shape")
    public native void setShape(String shape);
    
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
    
    @JsProperty(name="hash")
    public native String getHash();
    
    @JsProperty(name="hash")
    public native void setHash(String hash);
    
}

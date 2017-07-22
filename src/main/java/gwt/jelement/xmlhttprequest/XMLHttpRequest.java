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
package gwt.jelement.xmlhttprequest;

import gwt.jelement.dom.Document;
import gwt.jelement.dom.URLSearchParams;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.FormData;
import gwt.jelement.xmlhttprequest.XMLHttpRequestEventTarget;
import gwt.jelement.xmlhttprequest.XMLHttpRequestResponseType;
import gwt.jelement.xmlhttprequest.XMLHttpRequestUpload;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class XMLHttpRequest extends XMLHttpRequestEventTarget{
    public static int UNSENT;
    public static int OPENED;
    public static int HEADERS_RECEIVED;
    public static int LOADING;
    public static int DONE;
    
    
    @JsConstructor
    public XMLHttpRequest(){
        super();
    }
    
    @JsProperty(name="onreadystatechange")
    public EventHandlerNonNull onreadystatechange;
    
    @JsProperty(name="timeout")
    public double timeout;
    
    @JsProperty(name="withCredentials")
    public boolean withCredentials;
    
    @JsProperty(name="responseType")
    public XMLHttpRequestResponseType responseType;
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="upload")
    public native XMLHttpRequestUpload getUpload();
    
    @JsProperty(name="responseURL")
    public native String getResponseURL();
    
    @JsProperty(name="status")
    public native short getStatus();
    
    @JsProperty(name="statusText")
    public native String getStatusText();
    
    @JsProperty(name="response")
    public native Any getResponse();
    
    @JsProperty(name="responseText")
    public native String getResponseText();
    
    @JsProperty(name="responseXML")
    public native Document getResponseXML();
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "getAllResponseHeaders")
    public native String getAllResponseHeaders();
    
    @JsMethod(name = "getResponseHeader")
    public native String getResponseHeader(String name);
    
    @JsMethod(name = "open")
    public native void open(String method, String url);
    
    @JsMethod(name = "open")
    public native void open(String method, String url, boolean async);
    
    @JsMethod(name = "open")
    public native void open(String method, String url, boolean async, String username);
    
    @JsMethod(name = "open")
    public native void open(String method, String url, boolean async, String username, String password);
    
    @JsMethod(name = "overrideMimeType")
    public native void overrideMimeType(String mime);
    
    @JsMethod(name = "send")
    public native void send();
    
    @JsMethod(name = "send")
    public native void send(ArrayBuffer body);
    
    @JsMethod(name = "send")
    public native void send(ArrayBufferView body);
    
    @JsMethod(name = "send")
    public native void send(Blob body);
    
    @JsMethod(name = "send")
    public native void send(Document body);
    
    @JsMethod(name = "send")
    public native void send(String body);
    
    @JsMethod(name = "send")
    public native void send(FormData body);
    
    @JsMethod(name = "send")
    public native void send(URLSearchParams body);
    
    @JsMethod(name = "setRequestHeader")
    public native void setRequestHeader(String name, String value);
    
}

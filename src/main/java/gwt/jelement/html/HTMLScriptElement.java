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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLScriptElement", isNative = true)
public class HTMLScriptElement extends HTMLElement{
    @JsConstructor
    public HTMLScriptElement(){
        super();
    }
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="noModule")
    public native boolean getNoModule();
    
    @JsProperty(name="noModule")
    public native void setNoModule(boolean noModule);
    
    @JsProperty(name="charset")
    public native String getCharset();
    
    @JsProperty(name="charset")
    public native void setCharset(String charset);
    
    @JsProperty(name="async")
    public native boolean getAsync();
    
    @JsProperty(name="async")
    public native void setAsync(boolean async);
    
    @JsProperty(name="defer")
    public native boolean getDefer();
    
    @JsProperty(name="defer")
    public native void setDefer(boolean defer);
    
    @JsProperty(name="crossOrigin")
    public native String getCrossOrigin();
    
    @JsProperty(name="crossOrigin")
    public native void setCrossOrigin(String crossOrigin);
    
    @JsProperty(name="text")
    public native String getText();
    
    @JsProperty(name="text")
    public native void setText(String text);
    
    @JsProperty(name="event")
    public native String getEvent();
    
    @JsProperty(name="event")
    public native void setEvent(String event);
    
    @JsProperty(name="htmlFor")
    public native String getHtmlFor();
    
    @JsProperty(name="htmlFor")
    public native void setHtmlFor(String htmlFor);
    
    @JsProperty(name="integrity")
    public native String getIntegrity();
    
    @JsProperty(name="integrity")
    public native void setIntegrity(String integrity);
    
}

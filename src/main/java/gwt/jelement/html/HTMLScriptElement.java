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

import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLScriptElement extends HTMLElement{
    
    @JsConstructor
    public HTMLScriptElement(){
        super();
    }
    
    @JsProperty(name="src")
    public String src;
    
    @JsProperty(name="type")
    public String type;
    
    @JsProperty(name="noModule")
    public boolean noModule;
    
    @JsProperty(name="charset")
    public String charset;
    
    @JsProperty(name="async")
    public boolean async;
    
    @JsProperty(name="defer")
    public boolean defer;
    
    @JsProperty(name="crossOrigin")
    public String crossOrigin;
    
    @JsProperty(name="text")
    public String text;
    
    @JsProperty(name="event")
    public String event;
    
    @JsProperty(name="htmlFor")
    public String htmlFor;
    
    @JsProperty(name="integrity")
    public String integrity;
    
    
}

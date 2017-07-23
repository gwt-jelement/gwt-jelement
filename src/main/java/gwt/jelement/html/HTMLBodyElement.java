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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.html.HTMLElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLBodyElement extends HTMLElement{
    
    @JsConstructor
    public HTMLBodyElement(){
        super();
    }
    
    @JsProperty(name="text")
    public String text;
    
    @JsProperty(name="link")
    public String link;
    
    @JsProperty(name="vLink")
    public String vLink;
    
    @JsProperty(name="aLink")
    public String aLink;
    
    @JsProperty(name="bgColor")
    public String bgColor;
    
    @JsProperty(name="background")
    public String background;
    
    @JsProperty(name="onblur")
    public EventHandlerNonNull onblur;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onfocus")
    public EventHandlerNonNull onfocus;
    
    @JsProperty(name="onload")
    public EventHandlerNonNull onload;
    
    @JsProperty(name="onresize")
    public EventHandlerNonNull onresize;
    
    @JsProperty(name="onscroll")
    public EventHandlerNonNull onscroll;
    
    @JsProperty(name="onorientationchange")
    public EventHandlerNonNull onorientationchange;
    
    
}

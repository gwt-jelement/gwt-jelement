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
public class HTMLTableColElement extends HTMLElement{
    
    @JsConstructor
    public HTMLTableColElement(){
        super();
    }
    
    @JsProperty(name="span")
    public double span;
    
    @JsProperty(name="align")
    public String align;
    
    @JsProperty(name="ch")
    public String ch;
    
    @JsProperty(name="chOff")
    public String chOff;
    
    @JsProperty(name="vAlign")
    public String vAlign;
    
    @JsProperty(name="width")
    public String width;
    
    
}

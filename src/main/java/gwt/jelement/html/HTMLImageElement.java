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
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLImageElement extends HTMLElement{
    
    @JsConstructor
    public HTMLImageElement(){
        super();
    }
    
    @JsProperty(name="alt")
    public String alt;
    
    @JsProperty(name="src")
    public String src;
    
    @JsProperty(name="srcset")
    public String srcset;
    
    @JsProperty(name="sizes")
    public String sizes;
    
    @JsProperty(name="crossOrigin")
    public String crossOrigin;
    
    @JsProperty(name="useMap")
    public String useMap;
    
    @JsProperty(name="isMap")
    public boolean isMap;
    
    @JsProperty(name="width")
    public double width;
    
    @JsProperty(name="height")
    public double height;
    
    @JsProperty(name="referrerPolicy")
    public String referrerPolicy;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="lowsrc")
    public String lowsrc;
    
    @JsProperty(name="align")
    public String align;
    
    @JsProperty(name="hspace")
    public double hspace;
    
    @JsProperty(name="vspace")
    public double vspace;
    
    @JsProperty(name="longDesc")
    public String longDesc;
    
    @JsProperty(name="border")
    public String border;
    
    @JsProperty(name="naturalWidth")
    public native double getNaturalWidth();
    
    @JsProperty(name="naturalHeight")
    public native double getNaturalHeight();
    
    @JsProperty(name="complete")
    public native boolean getComplete();
    
    @JsProperty(name="currentSrc")
    public native String getCurrentSrc();
    
    @JsProperty(name="x")
    public native double getX();
    
    @JsProperty(name="y")
    public native double getY();
    
    @JsMethod(name = "decode")
    public native Promise decode();
    
}

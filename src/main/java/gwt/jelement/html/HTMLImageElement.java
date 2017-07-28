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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLImageElement", isNative = true)
public class HTMLImageElement extends HTMLElement{
    @JsConstructor
    public HTMLImageElement(){
        super();
    }
    
    @JsProperty(name="alt")
    public native String getAlt();
    
    @JsProperty(name="alt")
    public native void setAlt(String alt);
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="srcset")
    public native String getSrcset();
    
    @JsProperty(name="srcset")
    public native void setSrcset(String srcset);
    
    @JsProperty(name="sizes")
    public native String getSizes();
    
    @JsProperty(name="sizes")
    public native void setSizes(String sizes);
    
    @JsProperty(name="crossOrigin")
    public native String getCrossOrigin();
    
    @JsProperty(name="crossOrigin")
    public native void setCrossOrigin(String crossOrigin);
    
    @JsProperty(name="useMap")
    public native String getUseMap();
    
    @JsProperty(name="useMap")
    public native void setUseMap(String useMap);
    
    @JsProperty(name="isMap")
    public native boolean getIsMap();
    
    @JsProperty(name="isMap")
    public native void setIsMap(boolean isMap);
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(double width);
    
    @JsProperty(name="height")
    public native double getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(double height);
    
    @JsProperty(name="naturalWidth")
    public native double getNaturalWidth();
    
    @JsProperty(name="naturalHeight")
    public native double getNaturalHeight();
    
    @JsProperty(name="complete")
    public native boolean getComplete();
    
    @JsProperty(name="currentSrc")
    public native String getCurrentSrc();
    
    @JsProperty(name="referrerPolicy")
    public native String getReferrerPolicy();
    
    @JsProperty(name="referrerPolicy")
    public native void setReferrerPolicy(String referrerPolicy);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="lowsrc")
    public native String getLowsrc();
    
    @JsProperty(name="lowsrc")
    public native void setLowsrc(String lowsrc);
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="hspace")
    public native double getHspace();
    
    @JsProperty(name="hspace")
    public native void setHspace(double hspace);
    
    @JsProperty(name="vspace")
    public native double getVspace();
    
    @JsProperty(name="vspace")
    public native void setVspace(double vspace);
    
    @JsProperty(name="longDesc")
    public native String getLongDesc();
    
    @JsProperty(name="longDesc")
    public native void setLongDesc(String longDesc);
    
    @JsProperty(name="border")
    public native String getBorder();
    
    @JsProperty(name="border")
    public native void setBorder(String border);
    
    @JsProperty(name="x")
    public native double getX();
    
    @JsProperty(name="y")
    public native double getY();
    
    @JsMethod(name = "decode")
    public native Promise decode();
    
}

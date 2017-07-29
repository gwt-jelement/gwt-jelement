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

import gwt.jelement.dom.Document;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLDocument", isNative = true)
public class HTMLDocument extends Document{
    @JsConstructor
    public HTMLDocument(){
        super();
    }
    
    @JsProperty(name="fgColor")
    public native String getFgColor();
    
    @JsProperty(name="fgColor")
    public native void setFgColor(String fgColor);
    
    @JsProperty(name="linkColor")
    public native String getLinkColor();
    
    @JsProperty(name="linkColor")
    public native void setLinkColor(String linkColor);
    
    @JsProperty(name="vlinkColor")
    public native String getVlinkColor();
    
    @JsProperty(name="vlinkColor")
    public native void setVlinkColor(String vlinkColor);
    
    @JsProperty(name="alinkColor")
    public native String getAlinkColor();
    
    @JsProperty(name="alinkColor")
    public native void setAlinkColor(String alinkColor);
    
    @JsProperty(name="bgColor")
    public native String getBgColor();
    
    @JsProperty(name="bgColor")
    public native void setBgColor(String bgColor);
    
    @JsProperty(name="all")
    public native HTMLAllCollection getAll();
    
    @JsMethod(name = "captureEvents")
    public native void captureEvents();
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "releaseEvents")
    public native void releaseEvents();
    
}

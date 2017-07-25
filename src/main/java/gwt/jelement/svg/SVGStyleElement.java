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
package gwt.jelement.svg;

import gwt.jelement.css.StyleSheet;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGStyleElement extends SVGElement{
    
    @JsConstructor
    public SVGStyleElement(){
        super();
    }
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="media")
    public native String getMedia();
    
    @JsProperty(name="media")
    public native void setMedia(String media);
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsProperty(name="title")
    public native void setTitle(String title);
    
    @JsProperty(name="sheet")
    public native StyleSheet getSheet();
    
    @JsProperty(name="disabled")
    public native boolean getDisabled();
    
    @JsProperty(name="disabled")
    public native void setDisabled(boolean disabled);
    
    
}

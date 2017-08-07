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

@JsType(namespace = JsPackage.GLOBAL, name="HTMLFontElement", isNative = true)
public class HTMLFontElement extends HTMLElement {
    @JsProperty(name="color")
    public native String getColor();
    
    @JsProperty(name="color")
    public native void setColor(String color);
    
    @JsProperty(name="face")
    public native String getFace();
    
    @JsProperty(name="face")
    public native void setFace(String face);
    
    @JsProperty(name="size")
    public native String getSize();
    
    @JsProperty(name="size")
    public native void setSize(String size);
    
}

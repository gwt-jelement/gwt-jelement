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

@JsType(namespace = JsPackage.GLOBAL, name="HTMLHRElement", isNative = true)
public class HTMLHRElement extends HTMLElement{
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="color")
    public native String getColor();
    
    @JsProperty(name="color")
    public native void setColor(String color);
    
    @JsProperty(name="noShade")
    public native boolean getNoShade();
    
    @JsProperty(name="noShade")
    public native void setNoShade(boolean noShade);
    
    @JsProperty(name="size")
    public native String getSize();
    
    @JsProperty(name="size")
    public native void setSize(String size);
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
}

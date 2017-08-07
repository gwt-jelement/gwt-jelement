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
package gwt.jelement.geometry;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DOMRectReadOnly", isNative = true)
public class DOMRectReadOnly implements IsObject {
    @JsConstructor
    public DOMRectReadOnly(){
    }
    
    @JsConstructor
    public DOMRectReadOnly(double x){
    }
    
    @JsConstructor
    public DOMRectReadOnly(double x, double y){
    }
    
    @JsConstructor
    public DOMRectReadOnly(double x, double y, double width){
    }
    
    @JsConstructor
    public DOMRectReadOnly(double x, double y, double width, double height){
    }
    
    @JsProperty(name="x")
    public native double getX();
    
    @JsProperty(name="y")
    public native double getY();
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="height")
    public native double getHeight();
    
    @JsProperty(name="top")
    public native double getTop();
    
    @JsProperty(name="right")
    public native double getRight();
    
    @JsProperty(name="bottom")
    public native double getBottom();
    
    @JsProperty(name="left")
    public native double getLeft();
    
    @JsMethod(name = "fromRect")
    public static native DOMRectReadOnly fromRect();
    
    @JsMethod(name = "fromRect")
    public static native DOMRectReadOnly fromRect(DOMRectInit other);
    
}

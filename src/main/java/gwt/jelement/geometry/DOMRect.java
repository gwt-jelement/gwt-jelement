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

import gwt.jelement.geometry.DOMRect;
import gwt.jelement.geometry.DOMRectInit;
import gwt.jelement.geometry.DOMRectReadOnly;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class DOMRect extends DOMRectReadOnly{
    
    @JsConstructor
    public DOMRect(){
        super();
    }
    
    @JsConstructor
    public DOMRect(double x){
        super();
    }
    
    @JsConstructor
    public DOMRect(double x, double y){
        super();
    }
    
    @JsConstructor
    public DOMRect(double x, double y, double width){
        super();
    }
    
    @JsConstructor
    public DOMRect(double x, double y, double width, double height){
        super();
    }
    
    @JsProperty(name="x")
    public double x;
    
    @JsProperty(name="y")
    public double y;
    
    @JsProperty(name="width")
    public double width;
    
    @JsProperty(name="height")
    public double height;
    
    @JsMethod(name = "fromRect")
    public native DOMRect fromRect();
    
    @JsMethod(name = "fromRect")
    public native DOMRect fromRect(DOMRectInit other);
    
}

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

import gwt.jelement.geometry.DOMPoint;
import gwt.jelement.geometry.DOMPointInit;
import gwt.jelement.geometry.DOMPointReadOnly;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class DOMPoint extends DOMPointReadOnly{
    
    @JsConstructor
    public DOMPoint(){
        super();
    }
    
    @JsConstructor
    public DOMPoint(double x){
        super();
    }
    
    @JsConstructor
    public DOMPoint(double x, double y){
        super();
    }
    
    @JsConstructor
    public DOMPoint(double x, double y, double z){
        super();
    }
    
    @JsConstructor
    public DOMPoint(double x, double y, double z, double w){
        super();
    }
    
    @JsProperty(name="x")
    public double x;
    
    @JsProperty(name="y")
    public double y;
    
    @JsProperty(name="z")
    public double z;
    
    @JsProperty(name="w")
    public double w;
    
    @JsMethod(name = "fromPoint")
    public native DOMPoint fromPoint();
    
    @JsMethod(name = "fromPoint")
    public native DOMPoint fromPoint(DOMPointInit other);
    
}

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

import gwt.jelement.geometry.DOMMatrixInit;
import gwt.jelement.geometry.DOMPoint;
import gwt.jelement.geometry.DOMPointInit;
import gwt.jelement.geometry.DOMPointReadOnly;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class DOMPointReadOnly{
    
    @JsConstructor
    public DOMPointReadOnly(){
    }
    
    @JsConstructor
    public DOMPointReadOnly(double x){
    }
    
    @JsConstructor
    public DOMPointReadOnly(double x, double y){
    }
    
    @JsConstructor
    public DOMPointReadOnly(double x, double y, double z){
    }
    
    @JsConstructor
    public DOMPointReadOnly(double x, double y, double z, double w){
    }
    
    @JsProperty(name="x")
    public native double getX();
    
    @JsProperty(name="y")
    public native double getY();
    
    @JsProperty(name="z")
    public native double getZ();
    
    @JsProperty(name="w")
    public native double getW();
    
    @JsMethod(name = "fromPoint")
    public native DOMPointReadOnly fromPoint();
    
    @JsMethod(name = "fromPoint")
    public native DOMPointReadOnly fromPoint(DOMPointInit other);
    
    @JsMethod(name = "matrixTransform")
    public native DOMPoint matrixTransform();
    
    @JsMethod(name = "matrixTransform")
    public native DOMPoint matrixTransform(DOMMatrixInit matrix);
    
    @JsMethod(name = "toJSON")
    public native Object toJSON();
    
}

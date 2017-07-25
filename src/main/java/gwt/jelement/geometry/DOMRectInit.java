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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class DOMRectInit{

    public DOMRectInit(){
    }

    @JsProperty(name="x")
    public double x;

    @JsOverlay
    public final double getX(){
        return this.x;
    }

    @JsOverlay
    public final void setX(double x){
        this.x = x;
    }

    @JsProperty(name="y")
    public double y;

    @JsOverlay
    public final double getY(){
        return this.y;
    }

    @JsOverlay
    public final void setY(double y){
        this.y = y;
    }

    @JsProperty(name="width")
    public double width;

    @JsOverlay
    public final double getWidth(){
        return this.width;
    }

    @JsOverlay
    public final void setWidth(double width){
        this.width = width;
    }

    @JsProperty(name="height")
    public double height;

    @JsOverlay
    public final double getHeight(){
        return this.height;
    }

    @JsOverlay
    public final void setHeight(double height){
        this.height = height;
    }


}

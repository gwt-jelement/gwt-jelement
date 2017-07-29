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
package gwt.jelement.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class WheelEventInit extends MouseEventInit{

    @JsProperty(name="deltaX")
    private double deltaX;

    @JsProperty(name="deltaY")
    private double deltaY;

    @JsProperty(name="deltaZ")
    private double deltaZ;

    @JsProperty(name="deltaMode")
    private double deltaMode;

    @JsProperty(name="wheelDeltaX")
    private double wheelDeltaX;

    @JsProperty(name="wheelDeltaY")
    private double wheelDeltaY;

    public WheelEventInit(){
    }

    @JsOverlay
    public final double getDeltaX(){
        return this.deltaX;
    }

    @JsOverlay
    public final void setDeltaX(double deltaX){
        this.deltaX = deltaX;
    }

    @JsOverlay
    public final double getDeltaY(){
        return this.deltaY;
    }

    @JsOverlay
    public final void setDeltaY(double deltaY){
        this.deltaY = deltaY;
    }

    @JsOverlay
    public final double getDeltaZ(){
        return this.deltaZ;
    }

    @JsOverlay
    public final void setDeltaZ(double deltaZ){
        this.deltaZ = deltaZ;
    }

    @JsOverlay
    public final double getDeltaMode(){
        return this.deltaMode;
    }

    @JsOverlay
    public final void setDeltaMode(double deltaMode){
        this.deltaMode = deltaMode;
    }

    @JsOverlay
    public final double getWheelDeltaX(){
        return this.wheelDeltaX;
    }

    @JsOverlay
    public final void setWheelDeltaX(double wheelDeltaX){
        this.wheelDeltaX = wheelDeltaX;
    }

    @JsOverlay
    public final double getWheelDeltaY(){
        return this.wheelDeltaY;
    }

    @JsOverlay
    public final void setWheelDeltaY(double wheelDeltaY){
        this.wheelDeltaY = wheelDeltaY;
    }

}

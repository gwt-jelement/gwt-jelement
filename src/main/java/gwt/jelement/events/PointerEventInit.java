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

import gwt.jelement.events.MouseEventInit;
import gwt.jelement.events.PointerEvent;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PointerEventInit extends MouseEventInit{

    public PointerEventInit(){
    }

    @JsProperty(name="pointerId")
    public double pointerId;

    @JsOverlay
    public final double getPointerId(){
        return this.pointerId;
    }

    @JsOverlay
    public final void setPointerId(double pointerId){
        this.pointerId = pointerId;
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

    @JsProperty(name="pressure")
    public float pressure;

    @JsOverlay
    public final float getPressure(){
        return this.pressure;
    }

    @JsOverlay
    public final void setPressure(float pressure){
        this.pressure = pressure;
    }

    @JsProperty(name="tiltX")
    public double tiltX;

    @JsOverlay
    public final double getTiltX(){
        return this.tiltX;
    }

    @JsOverlay
    public final void setTiltX(double tiltX){
        this.tiltX = tiltX;
    }

    @JsProperty(name="tiltY")
    public double tiltY;

    @JsOverlay
    public final double getTiltY(){
        return this.tiltY;
    }

    @JsOverlay
    public final void setTiltY(double tiltY){
        this.tiltY = tiltY;
    }

    @JsProperty(name="tangentialPressure")
    public float tangentialPressure;

    @JsOverlay
    public final float getTangentialPressure(){
        return this.tangentialPressure;
    }

    @JsOverlay
    public final void setTangentialPressure(float tangentialPressure){
        this.tangentialPressure = tangentialPressure;
    }

    @JsProperty(name="twist")
    public double twist;

    @JsOverlay
    public final double getTwist(){
        return this.twist;
    }

    @JsOverlay
    public final void setTwist(double twist){
        this.twist = twist;
    }

    @JsProperty(name="pointerType")
    public String pointerType;

    @JsOverlay
    public final String getPointerType(){
        return this.pointerType;
    }

    @JsOverlay
    public final void setPointerType(String pointerType){
        this.pointerType = pointerType;
    }

    @JsProperty(name="isPrimary")
    public boolean isPrimary;

    @JsOverlay
    public final boolean getIsPrimary(){
        return this.isPrimary;
    }

    @JsOverlay
    public final void setIsPrimary(boolean isPrimary){
        this.isPrimary = isPrimary;
    }

    @JsProperty(name="coalescedEvents")
    public PointerEvent[] coalescedEvents;

    @JsOverlay
    public final PointerEvent[] getCoalescedEvents(){
        return this.coalescedEvents;
    }

    @JsOverlay
    public final void setCoalescedEvents(PointerEvent[] coalescedEvents){
        this.coalescedEvents = coalescedEvents;
    }


}

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
public class PointerEventInit extends MouseEventInit{

    @JsProperty(name="pointerId")
    private double pointerId;

    @JsProperty(name="width")
    private double width;

    @JsProperty(name="height")
    private double height;

    @JsProperty(name="pressure")
    private double pressure;

    @JsProperty(name="tiltX")
    private double tiltX;

    @JsProperty(name="tiltY")
    private double tiltY;

    @JsProperty(name="tangentialPressure")
    private double tangentialPressure;

    @JsProperty(name="twist")
    private double twist;

    @JsProperty(name="pointerType")
    private String pointerType;

    @JsProperty(name="isPrimary")
    private boolean isPrimary;

    @JsProperty(name="coalescedEvents")
    private PointerEvent[] coalescedEvents;

    public PointerEventInit(){
    }

    @JsOverlay
    public final double getPointerId(){
        return this.pointerId;
    }

    @JsOverlay
    public final void setPointerId(double pointerId){
        this.pointerId = pointerId;
    }

    @JsOverlay
    public final double getWidth(){
        return this.width;
    }

    @JsOverlay
    public final void setWidth(double width){
        this.width = width;
    }

    @JsOverlay
    public final double getHeight(){
        return this.height;
    }

    @JsOverlay
    public final void setHeight(double height){
        this.height = height;
    }

    @JsOverlay
    public final double getPressure(){
        return this.pressure;
    }

    @JsOverlay
    public final void setPressure(double pressure){
        this.pressure = pressure;
    }

    @JsOverlay
    public final double getTiltX(){
        return this.tiltX;
    }

    @JsOverlay
    public final void setTiltX(double tiltX){
        this.tiltX = tiltX;
    }

    @JsOverlay
    public final double getTiltY(){
        return this.tiltY;
    }

    @JsOverlay
    public final void setTiltY(double tiltY){
        this.tiltY = tiltY;
    }

    @JsOverlay
    public final double getTangentialPressure(){
        return this.tangentialPressure;
    }

    @JsOverlay
    public final void setTangentialPressure(double tangentialPressure){
        this.tangentialPressure = tangentialPressure;
    }

    @JsOverlay
    public final double getTwist(){
        return this.twist;
    }

    @JsOverlay
    public final void setTwist(double twist){
        this.twist = twist;
    }

    @JsOverlay
    public final String getPointerType(){
        return this.pointerType;
    }

    @JsOverlay
    public final void setPointerType(String pointerType){
        this.pointerType = pointerType;
    }

    @JsOverlay
    public final boolean isIsPrimary(){
        return this.isPrimary;
    }

    @JsOverlay
    public final void setIsPrimary(boolean isPrimary){
        this.isPrimary = isPrimary;
    }

    @JsOverlay
    public final PointerEvent[] getCoalescedEvents(){
        return this.coalescedEvents;
    }

    @JsOverlay
    public final void setCoalescedEvents(PointerEvent[] coalescedEvents){
        this.coalescedEvents = coalescedEvents;
    }


}

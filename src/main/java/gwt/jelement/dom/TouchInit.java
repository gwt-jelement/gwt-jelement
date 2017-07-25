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
package gwt.jelement.dom;

import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class TouchInit{

    public TouchInit(){
    }

    @JsProperty(name="identifier")
    public double identifier;

    @JsOverlay
    public final double getIdentifier(){
        return this.identifier;
    }

    @JsOverlay
    public final void setIdentifier(double identifier){
        this.identifier = identifier;
    }

    @JsProperty(name="target")
    public EventTarget target;

    @JsOverlay
    public final EventTarget getTarget(){
        return this.target;
    }

    @JsOverlay
    public final void setTarget(EventTarget target){
        this.target = target;
    }

    @JsProperty(name="clientX")
    public double clientX;

    @JsOverlay
    public final double getClientX(){
        return this.clientX;
    }

    @JsOverlay
    public final void setClientX(double clientX){
        this.clientX = clientX;
    }

    @JsProperty(name="clientY")
    public double clientY;

    @JsOverlay
    public final double getClientY(){
        return this.clientY;
    }

    @JsOverlay
    public final void setClientY(double clientY){
        this.clientY = clientY;
    }

    @JsProperty(name="screenX")
    public double screenX;

    @JsOverlay
    public final double getScreenX(){
        return this.screenX;
    }

    @JsOverlay
    public final void setScreenX(double screenX){
        this.screenX = screenX;
    }

    @JsProperty(name="screenY")
    public double screenY;

    @JsOverlay
    public final double getScreenY(){
        return this.screenY;
    }

    @JsOverlay
    public final void setScreenY(double screenY){
        this.screenY = screenY;
    }

    @JsProperty(name="pageX")
    public double pageX;

    @JsOverlay
    public final double getPageX(){
        return this.pageX;
    }

    @JsOverlay
    public final void setPageX(double pageX){
        this.pageX = pageX;
    }

    @JsProperty(name="pageY")
    public double pageY;

    @JsOverlay
    public final double getPageY(){
        return this.pageY;
    }

    @JsOverlay
    public final void setPageY(double pageY){
        this.pageY = pageY;
    }

    @JsProperty(name="radiusX")
    public float radiusX;

    @JsOverlay
    public final float getRadiusX(){
        return this.radiusX;
    }

    @JsOverlay
    public final void setRadiusX(float radiusX){
        this.radiusX = radiusX;
    }

    @JsProperty(name="radiusY")
    public float radiusY;

    @JsOverlay
    public final float getRadiusY(){
        return this.radiusY;
    }

    @JsOverlay
    public final void setRadiusY(float radiusY){
        this.radiusY = radiusY;
    }

    @JsProperty(name="rotationAngle")
    public float rotationAngle;

    @JsOverlay
    public final float getRotationAngle(){
        return this.rotationAngle;
    }

    @JsOverlay
    public final void setRotationAngle(float rotationAngle){
        this.rotationAngle = rotationAngle;
    }

    @JsProperty(name="force")
    public float force;

    @JsOverlay
    public final float getForce(){
        return this.force;
    }

    @JsOverlay
    public final void setForce(float force){
        this.force = force;
    }

    @JsProperty(name="region")
    public String region;

    @JsOverlay
    public final String getRegion(){
        return this.region;
    }

    @JsOverlay
    public final void setRegion(String region){
        this.region = region;
    }


}

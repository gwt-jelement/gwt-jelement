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

import gwt.jelement.core.JsObject;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class TouchInit extends JsObject{

    @JsProperty(name="identifier")
    private double identifier;

    @JsProperty(name="target")
    private EventTarget target;

    @JsProperty(name="clientX")
    private double clientX;

    @JsProperty(name="clientY")
    private double clientY;

    @JsProperty(name="screenX")
    private double screenX;

    @JsProperty(name="screenY")
    private double screenY;

    @JsProperty(name="pageX")
    private double pageX;

    @JsProperty(name="pageY")
    private double pageY;

    @JsProperty(name="radiusX")
    private double radiusX;

    @JsProperty(name="radiusY")
    private double radiusY;

    @JsProperty(name="rotationAngle")
    private double rotationAngle;

    @JsProperty(name="force")
    private double force;

    @JsProperty(name="region")
    private String region;

    public TouchInit(){
    }

    @JsOverlay
    public final double getIdentifier(){
        return this.identifier;
    }

    @JsOverlay
    public final void setIdentifier(double identifier){
        this.identifier = identifier;
    }

    @JsOverlay
    public final EventTarget getTarget(){
        return this.target;
    }

    @JsOverlay
    public final void setTarget(EventTarget target){
        this.target = target;
    }

    @JsOverlay
    public final double getClientX(){
        return this.clientX;
    }

    @JsOverlay
    public final void setClientX(double clientX){
        this.clientX = clientX;
    }

    @JsOverlay
    public final double getClientY(){
        return this.clientY;
    }

    @JsOverlay
    public final void setClientY(double clientY){
        this.clientY = clientY;
    }

    @JsOverlay
    public final double getScreenX(){
        return this.screenX;
    }

    @JsOverlay
    public final void setScreenX(double screenX){
        this.screenX = screenX;
    }

    @JsOverlay
    public final double getScreenY(){
        return this.screenY;
    }

    @JsOverlay
    public final void setScreenY(double screenY){
        this.screenY = screenY;
    }

    @JsOverlay
    public final double getPageX(){
        return this.pageX;
    }

    @JsOverlay
    public final void setPageX(double pageX){
        this.pageX = pageX;
    }

    @JsOverlay
    public final double getPageY(){
        return this.pageY;
    }

    @JsOverlay
    public final void setPageY(double pageY){
        this.pageY = pageY;
    }

    @JsOverlay
    public final double getRadiusX(){
        return this.radiusX;
    }

    @JsOverlay
    public final void setRadiusX(double radiusX){
        this.radiusX = radiusX;
    }

    @JsOverlay
    public final double getRadiusY(){
        return this.radiusY;
    }

    @JsOverlay
    public final void setRadiusY(double radiusY){
        this.radiusY = radiusY;
    }

    @JsOverlay
    public final double getRotationAngle(){
        return this.rotationAngle;
    }

    @JsOverlay
    public final void setRotationAngle(double rotationAngle){
        this.rotationAngle = rotationAngle;
    }

    @JsOverlay
    public final double getForce(){
        return this.force;
    }

    @JsOverlay
    public final void setForce(double force){
        this.force = force;
    }

    @JsOverlay
    public final String getRegion(){
        return this.region;
    }

    @JsOverlay
    public final void setRegion(String region){
        this.region = region;
    }


}

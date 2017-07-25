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

import gwt.jelement.events.EventModifierInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MouseEventInit extends EventModifierInit{

    @JsProperty(name="screenX")
    private double screenX;

    @JsProperty(name="screenY")
    private double screenY;

    @JsProperty(name="clientX")
    private double clientX;

    @JsProperty(name="clientY")
    private double clientY;

    @JsProperty(name="button")
    private short button;

    @JsProperty(name="buttons")
    private short buttons;

    @JsProperty(name="relatedTarget")
    private EventTarget relatedTarget;

    @JsProperty(name="movementX")
    private double movementX;

    @JsProperty(name="movementY")
    private double movementY;

    @JsProperty(name="region")
    private String region;

    public MouseEventInit(){
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
    public final short getButton(){
        return this.button;
    }

    @JsOverlay
    public final void setButton(short button){
        this.button = button;
    }

    @JsOverlay
    public final short getButtons(){
        return this.buttons;
    }

    @JsOverlay
    public final void setButtons(short buttons){
        this.buttons = buttons;
    }

    @JsOverlay
    public final EventTarget getRelatedTarget(){
        return this.relatedTarget;
    }

    @JsOverlay
    public final void setRelatedTarget(EventTarget relatedTarget){
        this.relatedTarget = relatedTarget;
    }

    @JsOverlay
    public final double getMovementX(){
        return this.movementX;
    }

    @JsOverlay
    public final void setMovementX(double movementX){
        this.movementX = movementX;
    }

    @JsOverlay
    public final double getMovementY(){
        return this.movementY;
    }

    @JsOverlay
    public final void setMovementY(double movementY){
        this.movementY = movementY;
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

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

    public MouseEventInit(){
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

    @JsProperty(name="button")
    public short button;

    @JsOverlay
    public final short getButton(){
        return this.button;
    }

    @JsOverlay
    public final void setButton(short button){
        this.button = button;
    }

    @JsProperty(name="buttons")
    public short buttons;

    @JsOverlay
    public final short getButtons(){
        return this.buttons;
    }

    @JsOverlay
    public final void setButtons(short buttons){
        this.buttons = buttons;
    }

    @JsProperty(name="relatedTarget")
    public EventTarget relatedTarget;

    @JsOverlay
    public final EventTarget getRelatedTarget(){
        return this.relatedTarget;
    }

    @JsOverlay
    public final void setRelatedTarget(EventTarget relatedTarget){
        this.relatedTarget = relatedTarget;
    }

    @JsProperty(name="movementX")
    public double movementX;

    @JsOverlay
    public final double getMovementX(){
        return this.movementX;
    }

    @JsOverlay
    public final void setMovementX(double movementX){
        this.movementX = movementX;
    }

    @JsProperty(name="movementY")
    public double movementY;

    @JsOverlay
    public final double getMovementY(){
        return this.movementY;
    }

    @JsOverlay
    public final void setMovementY(double movementY){
        this.movementY = movementY;
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

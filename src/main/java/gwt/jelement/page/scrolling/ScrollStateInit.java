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
package gwt.jelement.page.scrolling;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollStateInit extends JsObject{

    @JsProperty(name="deltaX")
    private double deltaX;

    @JsProperty(name="deltaY")
    private double deltaY;

    @JsProperty(name="deltaXHint")
    private double deltaXHint;

    @JsProperty(name="deltaYHint")
    private double deltaYHint;

    @JsProperty(name="positionX")
    private double positionX;

    @JsProperty(name="positionY")
    private double positionY;

    @JsProperty(name="velocityX")
    private double velocityX;

    @JsProperty(name="velocityY")
    private double velocityY;

    @JsProperty(name="isBeginning")
    private boolean isBeginning;

    @JsProperty(name="isInInertialPhase")
    private boolean isInInertialPhase;

    @JsProperty(name="isEnding")
    private boolean isEnding;

    @JsProperty(name="shouldPropagate")
    private boolean shouldPropagate;

    @JsProperty(name="fromUserInput")
    private boolean fromUserInput;

    @JsProperty(name="isDirectManipulation")
    private boolean isDirectManipulation;

    @JsProperty(name="deltaGranularity")
    private double deltaGranularity;

    public ScrollStateInit(){
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
    public final double getDeltaXHint(){
        return this.deltaXHint;
    }

    @JsOverlay
    public final void setDeltaXHint(double deltaXHint){
        this.deltaXHint = deltaXHint;
    }

    @JsOverlay
    public final double getDeltaYHint(){
        return this.deltaYHint;
    }

    @JsOverlay
    public final void setDeltaYHint(double deltaYHint){
        this.deltaYHint = deltaYHint;
    }

    @JsOverlay
    public final double getPositionX(){
        return this.positionX;
    }

    @JsOverlay
    public final void setPositionX(double positionX){
        this.positionX = positionX;
    }

    @JsOverlay
    public final double getPositionY(){
        return this.positionY;
    }

    @JsOverlay
    public final void setPositionY(double positionY){
        this.positionY = positionY;
    }

    @JsOverlay
    public final double getVelocityX(){
        return this.velocityX;
    }

    @JsOverlay
    public final void setVelocityX(double velocityX){
        this.velocityX = velocityX;
    }

    @JsOverlay
    public final double getVelocityY(){
        return this.velocityY;
    }

    @JsOverlay
    public final void setVelocityY(double velocityY){
        this.velocityY = velocityY;
    }

    @JsOverlay
    public final boolean isIsBeginning(){
        return this.isBeginning;
    }

    @JsOverlay
    public final void setIsBeginning(boolean isBeginning){
        this.isBeginning = isBeginning;
    }

    @JsOverlay
    public final boolean isIsInInertialPhase(){
        return this.isInInertialPhase;
    }

    @JsOverlay
    public final void setIsInInertialPhase(boolean isInInertialPhase){
        this.isInInertialPhase = isInInertialPhase;
    }

    @JsOverlay
    public final boolean isIsEnding(){
        return this.isEnding;
    }

    @JsOverlay
    public final void setIsEnding(boolean isEnding){
        this.isEnding = isEnding;
    }

    @JsOverlay
    public final boolean isShouldPropagate(){
        return this.shouldPropagate;
    }

    @JsOverlay
    public final void setShouldPropagate(boolean shouldPropagate){
        this.shouldPropagate = shouldPropagate;
    }

    @JsOverlay
    public final boolean isFromUserInput(){
        return this.fromUserInput;
    }

    @JsOverlay
    public final void setFromUserInput(boolean fromUserInput){
        this.fromUserInput = fromUserInput;
    }

    @JsOverlay
    public final boolean isIsDirectManipulation(){
        return this.isDirectManipulation;
    }

    @JsOverlay
    public final void setIsDirectManipulation(boolean isDirectManipulation){
        this.isDirectManipulation = isDirectManipulation;
    }

    @JsOverlay
    public final double getDeltaGranularity(){
        return this.deltaGranularity;
    }

    @JsOverlay
    public final void setDeltaGranularity(double deltaGranularity){
        this.deltaGranularity = deltaGranularity;
    }


}

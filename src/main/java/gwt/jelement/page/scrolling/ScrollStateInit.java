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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollStateInit{

    public ScrollStateInit(){
    }

    @JsProperty(name="deltaX")
    public double deltaX;

    @JsOverlay
    public final double getDeltaX(){
        return this.deltaX;
    }

    @JsOverlay
    public final void setDeltaX(double deltaX){
        this.deltaX = deltaX;
    }

    @JsProperty(name="deltaY")
    public double deltaY;

    @JsOverlay
    public final double getDeltaY(){
        return this.deltaY;
    }

    @JsOverlay
    public final void setDeltaY(double deltaY){
        this.deltaY = deltaY;
    }

    @JsProperty(name="deltaXHint")
    public double deltaXHint;

    @JsOverlay
    public final double getDeltaXHint(){
        return this.deltaXHint;
    }

    @JsOverlay
    public final void setDeltaXHint(double deltaXHint){
        this.deltaXHint = deltaXHint;
    }

    @JsProperty(name="deltaYHint")
    public double deltaYHint;

    @JsOverlay
    public final double getDeltaYHint(){
        return this.deltaYHint;
    }

    @JsOverlay
    public final void setDeltaYHint(double deltaYHint){
        this.deltaYHint = deltaYHint;
    }

    @JsProperty(name="positionX")
    public double positionX;

    @JsOverlay
    public final double getPositionX(){
        return this.positionX;
    }

    @JsOverlay
    public final void setPositionX(double positionX){
        this.positionX = positionX;
    }

    @JsProperty(name="positionY")
    public double positionY;

    @JsOverlay
    public final double getPositionY(){
        return this.positionY;
    }

    @JsOverlay
    public final void setPositionY(double positionY){
        this.positionY = positionY;
    }

    @JsProperty(name="velocityX")
    public double velocityX;

    @JsOverlay
    public final double getVelocityX(){
        return this.velocityX;
    }

    @JsOverlay
    public final void setVelocityX(double velocityX){
        this.velocityX = velocityX;
    }

    @JsProperty(name="velocityY")
    public double velocityY;

    @JsOverlay
    public final double getVelocityY(){
        return this.velocityY;
    }

    @JsOverlay
    public final void setVelocityY(double velocityY){
        this.velocityY = velocityY;
    }

    @JsProperty(name="isBeginning")
    public boolean isBeginning;

    @JsOverlay
    public final boolean getIsBeginning(){
        return this.isBeginning;
    }

    @JsOverlay
    public final void setIsBeginning(boolean isBeginning){
        this.isBeginning = isBeginning;
    }

    @JsProperty(name="isInInertialPhase")
    public boolean isInInertialPhase;

    @JsOverlay
    public final boolean getIsInInertialPhase(){
        return this.isInInertialPhase;
    }

    @JsOverlay
    public final void setIsInInertialPhase(boolean isInInertialPhase){
        this.isInInertialPhase = isInInertialPhase;
    }

    @JsProperty(name="isEnding")
    public boolean isEnding;

    @JsOverlay
    public final boolean getIsEnding(){
        return this.isEnding;
    }

    @JsOverlay
    public final void setIsEnding(boolean isEnding){
        this.isEnding = isEnding;
    }

    @JsProperty(name="shouldPropagate")
    public boolean shouldPropagate;

    @JsOverlay
    public final boolean getShouldPropagate(){
        return this.shouldPropagate;
    }

    @JsOverlay
    public final void setShouldPropagate(boolean shouldPropagate){
        this.shouldPropagate = shouldPropagate;
    }

    @JsProperty(name="fromUserInput")
    public boolean fromUserInput;

    @JsOverlay
    public final boolean getFromUserInput(){
        return this.fromUserInput;
    }

    @JsOverlay
    public final void setFromUserInput(boolean fromUserInput){
        this.fromUserInput = fromUserInput;
    }

    @JsProperty(name="isDirectManipulation")
    public boolean isDirectManipulation;

    @JsOverlay
    public final boolean getIsDirectManipulation(){
        return this.isDirectManipulation;
    }

    @JsOverlay
    public final void setIsDirectManipulation(boolean isDirectManipulation){
        this.isDirectManipulation = isDirectManipulation;
    }

    @JsProperty(name="deltaGranularity")
    public double deltaGranularity;

    @JsOverlay
    public final double getDeltaGranularity(){
        return this.deltaGranularity;
    }

    @JsOverlay
    public final void setDeltaGranularity(double deltaGranularity){
        this.deltaGranularity = deltaGranularity;
    }


}

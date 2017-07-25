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
package gwt.jelement.webaudio;

import gwt.jelement.webaudio.AudioNodeOptions;
import gwt.jelement.webaudio.DistanceModelType;
import gwt.jelement.webaudio.PanningModelType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PannerOptions extends AudioNodeOptions{

    public PannerOptions(){
    }

    @JsProperty(name="panningModel")
    public String panningModel;

    @JsOverlay
    public final PanningModelType getPanningModel(){
        return PanningModelType.of(this.panningModel);
    }

    @JsOverlay
    public final void setPanningModel(PanningModelType panningModel){
        this.panningModel = panningModel.getInternalValue();
    }

    @JsProperty(name="distanceModel")
    public String distanceModel;

    @JsOverlay
    public final DistanceModelType getDistanceModel(){
        return DistanceModelType.of(this.distanceModel);
    }

    @JsOverlay
    public final void setDistanceModel(DistanceModelType distanceModel){
        this.distanceModel = distanceModel.getInternalValue();
    }

    @JsProperty(name="positionX")
    public float positionX;

    @JsOverlay
    public final float getPositionX(){
        return this.positionX;
    }

    @JsOverlay
    public final void setPositionX(float positionX){
        this.positionX = positionX;
    }

    @JsProperty(name="positionY")
    public float positionY;

    @JsOverlay
    public final float getPositionY(){
        return this.positionY;
    }

    @JsOverlay
    public final void setPositionY(float positionY){
        this.positionY = positionY;
    }

    @JsProperty(name="positionZ")
    public float positionZ;

    @JsOverlay
    public final float getPositionZ(){
        return this.positionZ;
    }

    @JsOverlay
    public final void setPositionZ(float positionZ){
        this.positionZ = positionZ;
    }

    @JsProperty(name="orientationX")
    public float orientationX;

    @JsOverlay
    public final float getOrientationX(){
        return this.orientationX;
    }

    @JsOverlay
    public final void setOrientationX(float orientationX){
        this.orientationX = orientationX;
    }

    @JsProperty(name="orientationY")
    public float orientationY;

    @JsOverlay
    public final float getOrientationY(){
        return this.orientationY;
    }

    @JsOverlay
    public final void setOrientationY(float orientationY){
        this.orientationY = orientationY;
    }

    @JsProperty(name="orientationZ")
    public float orientationZ;

    @JsOverlay
    public final float getOrientationZ(){
        return this.orientationZ;
    }

    @JsOverlay
    public final void setOrientationZ(float orientationZ){
        this.orientationZ = orientationZ;
    }

    @JsProperty(name="refDistance")
    public double refDistance;

    @JsOverlay
    public final double getRefDistance(){
        return this.refDistance;
    }

    @JsOverlay
    public final void setRefDistance(double refDistance){
        this.refDistance = refDistance;
    }

    @JsProperty(name="maxDistance")
    public double maxDistance;

    @JsOverlay
    public final double getMaxDistance(){
        return this.maxDistance;
    }

    @JsOverlay
    public final void setMaxDistance(double maxDistance){
        this.maxDistance = maxDistance;
    }

    @JsProperty(name="rolloffFactor")
    public double rolloffFactor;

    @JsOverlay
    public final double getRolloffFactor(){
        return this.rolloffFactor;
    }

    @JsOverlay
    public final void setRolloffFactor(double rolloffFactor){
        this.rolloffFactor = rolloffFactor;
    }

    @JsProperty(name="coneInnerAngle")
    public double coneInnerAngle;

    @JsOverlay
    public final double getConeInnerAngle(){
        return this.coneInnerAngle;
    }

    @JsOverlay
    public final void setConeInnerAngle(double coneInnerAngle){
        this.coneInnerAngle = coneInnerAngle;
    }

    @JsProperty(name="coneOuterAngle")
    public double coneOuterAngle;

    @JsOverlay
    public final double getConeOuterAngle(){
        return this.coneOuterAngle;
    }

    @JsOverlay
    public final void setConeOuterAngle(double coneOuterAngle){
        this.coneOuterAngle = coneOuterAngle;
    }

    @JsProperty(name="coneOuterGain")
    public double coneOuterGain;

    @JsOverlay
    public final double getConeOuterGain(){
        return this.coneOuterGain;
    }

    @JsOverlay
    public final void setConeOuterGain(double coneOuterGain){
        this.coneOuterGain = coneOuterGain;
    }


}

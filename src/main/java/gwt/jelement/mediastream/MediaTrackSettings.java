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
package gwt.jelement.mediastream;

import gwt.jelement.imagecapture.Point2D;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackSettings{

    public MediaTrackSettings(){
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

    @JsProperty(name="aspectRatio")
    public double aspectRatio;

    @JsOverlay
    public final double getAspectRatio(){
        return this.aspectRatio;
    }

    @JsOverlay
    public final void setAspectRatio(double aspectRatio){
        this.aspectRatio = aspectRatio;
    }

    @JsProperty(name="frameRate")
    public double frameRate;

    @JsOverlay
    public final double getFrameRate(){
        return this.frameRate;
    }

    @JsOverlay
    public final void setFrameRate(double frameRate){
        this.frameRate = frameRate;
    }

    @JsProperty(name="facingMode")
    public String facingMode;

    @JsOverlay
    public final String getFacingMode(){
        return this.facingMode;
    }

    @JsOverlay
    public final void setFacingMode(String facingMode){
        this.facingMode = facingMode;
    }

    @JsProperty(name="echoCancellation")
    public boolean echoCancellation;

    @JsOverlay
    public final boolean getEchoCancellation(){
        return this.echoCancellation;
    }

    @JsOverlay
    public final void setEchoCancellation(boolean echoCancellation){
        this.echoCancellation = echoCancellation;
    }

    @JsProperty(name="deviceId")
    public String deviceId;

    @JsOverlay
    public final String getDeviceId(){
        return this.deviceId;
    }

    @JsOverlay
    public final void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }

    @JsProperty(name="videoKind")
    public String videoKind;

    @JsOverlay
    public final String getVideoKind(){
        return this.videoKind;
    }

    @JsOverlay
    public final void setVideoKind(String videoKind){
        this.videoKind = videoKind;
    }

    @JsProperty(name="depthNear")
    public double depthNear;

    @JsOverlay
    public final double getDepthNear(){
        return this.depthNear;
    }

    @JsOverlay
    public final void setDepthNear(double depthNear){
        this.depthNear = depthNear;
    }

    @JsProperty(name="depthFar")
    public double depthFar;

    @JsOverlay
    public final double getDepthFar(){
        return this.depthFar;
    }

    @JsOverlay
    public final void setDepthFar(double depthFar){
        this.depthFar = depthFar;
    }

    @JsProperty(name="focalLengthX")
    public double focalLengthX;

    @JsOverlay
    public final double getFocalLengthX(){
        return this.focalLengthX;
    }

    @JsOverlay
    public final void setFocalLengthX(double focalLengthX){
        this.focalLengthX = focalLengthX;
    }

    @JsProperty(name="focalLengthY")
    public double focalLengthY;

    @JsOverlay
    public final double getFocalLengthY(){
        return this.focalLengthY;
    }

    @JsOverlay
    public final void setFocalLengthY(double focalLengthY){
        this.focalLengthY = focalLengthY;
    }

    @JsProperty(name="whiteBalanceMode")
    public String whiteBalanceMode;

    @JsOverlay
    public final String getWhiteBalanceMode(){
        return this.whiteBalanceMode;
    }

    @JsOverlay
    public final void setWhiteBalanceMode(String whiteBalanceMode){
        this.whiteBalanceMode = whiteBalanceMode;
    }

    @JsProperty(name="exposureMode")
    public String exposureMode;

    @JsOverlay
    public final String getExposureMode(){
        return this.exposureMode;
    }

    @JsOverlay
    public final void setExposureMode(String exposureMode){
        this.exposureMode = exposureMode;
    }

    @JsProperty(name="focusMode")
    public String focusMode;

    @JsOverlay
    public final String getFocusMode(){
        return this.focusMode;
    }

    @JsOverlay
    public final void setFocusMode(String focusMode){
        this.focusMode = focusMode;
    }

    @JsProperty(name="pointsOfInterest")
    public Point2D[] pointsOfInterest;

    @JsOverlay
    public final Point2D[] getPointsOfInterest(){
        return this.pointsOfInterest;
    }

    @JsOverlay
    public final void setPointsOfInterest(Point2D[] pointsOfInterest){
        this.pointsOfInterest = pointsOfInterest;
    }

    @JsProperty(name="exposureCompensation")
    public double exposureCompensation;

    @JsOverlay
    public final double getExposureCompensation(){
        return this.exposureCompensation;
    }

    @JsOverlay
    public final void setExposureCompensation(double exposureCompensation){
        this.exposureCompensation = exposureCompensation;
    }

    @JsProperty(name="colorTemperature")
    public double colorTemperature;

    @JsOverlay
    public final double getColorTemperature(){
        return this.colorTemperature;
    }

    @JsOverlay
    public final void setColorTemperature(double colorTemperature){
        this.colorTemperature = colorTemperature;
    }

    @JsProperty(name="iso")
    public double iso;

    @JsOverlay
    public final double getIso(){
        return this.iso;
    }

    @JsOverlay
    public final void setIso(double iso){
        this.iso = iso;
    }

    @JsProperty(name="brightness")
    public double brightness;

    @JsOverlay
    public final double getBrightness(){
        return this.brightness;
    }

    @JsOverlay
    public final void setBrightness(double brightness){
        this.brightness = brightness;
    }

    @JsProperty(name="contrast")
    public double contrast;

    @JsOverlay
    public final double getContrast(){
        return this.contrast;
    }

    @JsOverlay
    public final void setContrast(double contrast){
        this.contrast = contrast;
    }

    @JsProperty(name="saturation")
    public double saturation;

    @JsOverlay
    public final double getSaturation(){
        return this.saturation;
    }

    @JsOverlay
    public final void setSaturation(double saturation){
        this.saturation = saturation;
    }

    @JsProperty(name="sharpness")
    public double sharpness;

    @JsOverlay
    public final double getSharpness(){
        return this.sharpness;
    }

    @JsOverlay
    public final void setSharpness(double sharpness){
        this.sharpness = sharpness;
    }

    @JsProperty(name="zoom")
    public double zoom;

    @JsOverlay
    public final double getZoom(){
        return this.zoom;
    }

    @JsOverlay
    public final void setZoom(double zoom){
        this.zoom = zoom;
    }

    @JsProperty(name="torch")
    public boolean torch;

    @JsOverlay
    public final boolean getTorch(){
        return this.torch;
    }

    @JsOverlay
    public final void setTorch(boolean torch){
        this.torch = torch;
    }


}

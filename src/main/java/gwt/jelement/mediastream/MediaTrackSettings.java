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

import gwt.jelement.core.JsObject;
import gwt.jelement.imagecapture.Point2D;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackSettings extends JsObject{

    @JsProperty(name="width")
    private double width;

    @JsProperty(name="height")
    private double height;

    @JsProperty(name="aspectRatio")
    private double aspectRatio;

    @JsProperty(name="frameRate")
    private double frameRate;

    @JsProperty(name="facingMode")
    private String facingMode;

    @JsProperty(name="echoCancellation")
    private boolean echoCancellation;

    @JsProperty(name="deviceId")
    private String deviceId;

    @JsProperty(name="videoKind")
    private String videoKind;

    @JsProperty(name="depthNear")
    private double depthNear;

    @JsProperty(name="depthFar")
    private double depthFar;

    @JsProperty(name="focalLengthX")
    private double focalLengthX;

    @JsProperty(name="focalLengthY")
    private double focalLengthY;

    @JsProperty(name="whiteBalanceMode")
    private String whiteBalanceMode;

    @JsProperty(name="exposureMode")
    private String exposureMode;

    @JsProperty(name="focusMode")
    private String focusMode;

    @JsProperty(name="pointsOfInterest")
    private Point2D[] pointsOfInterest;

    @JsProperty(name="exposureCompensation")
    private double exposureCompensation;

    @JsProperty(name="colorTemperature")
    private double colorTemperature;

    @JsProperty(name="iso")
    private double iso;

    @JsProperty(name="brightness")
    private double brightness;

    @JsProperty(name="contrast")
    private double contrast;

    @JsProperty(name="saturation")
    private double saturation;

    @JsProperty(name="sharpness")
    private double sharpness;

    @JsProperty(name="zoom")
    private double zoom;

    @JsProperty(name="torch")
    private boolean torch;

    public MediaTrackSettings(){
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
    public final double getAspectRatio(){
        return this.aspectRatio;
    }

    @JsOverlay
    public final void setAspectRatio(double aspectRatio){
        this.aspectRatio = aspectRatio;
    }

    @JsOverlay
    public final double getFrameRate(){
        return this.frameRate;
    }

    @JsOverlay
    public final void setFrameRate(double frameRate){
        this.frameRate = frameRate;
    }

    @JsOverlay
    public final String getFacingMode(){
        return this.facingMode;
    }

    @JsOverlay
    public final void setFacingMode(String facingMode){
        this.facingMode = facingMode;
    }

    @JsOverlay
    public final boolean getEchoCancellation(){
        return this.echoCancellation;
    }

    @JsOverlay
    public final void setEchoCancellation(boolean echoCancellation){
        this.echoCancellation = echoCancellation;
    }

    @JsOverlay
    public final String getDeviceId(){
        return this.deviceId;
    }

    @JsOverlay
    public final void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }

    @JsOverlay
    public final String getVideoKind(){
        return this.videoKind;
    }

    @JsOverlay
    public final void setVideoKind(String videoKind){
        this.videoKind = videoKind;
    }

    @JsOverlay
    public final double getDepthNear(){
        return this.depthNear;
    }

    @JsOverlay
    public final void setDepthNear(double depthNear){
        this.depthNear = depthNear;
    }

    @JsOverlay
    public final double getDepthFar(){
        return this.depthFar;
    }

    @JsOverlay
    public final void setDepthFar(double depthFar){
        this.depthFar = depthFar;
    }

    @JsOverlay
    public final double getFocalLengthX(){
        return this.focalLengthX;
    }

    @JsOverlay
    public final void setFocalLengthX(double focalLengthX){
        this.focalLengthX = focalLengthX;
    }

    @JsOverlay
    public final double getFocalLengthY(){
        return this.focalLengthY;
    }

    @JsOverlay
    public final void setFocalLengthY(double focalLengthY){
        this.focalLengthY = focalLengthY;
    }

    @JsOverlay
    public final String getWhiteBalanceMode(){
        return this.whiteBalanceMode;
    }

    @JsOverlay
    public final void setWhiteBalanceMode(String whiteBalanceMode){
        this.whiteBalanceMode = whiteBalanceMode;
    }

    @JsOverlay
    public final String getExposureMode(){
        return this.exposureMode;
    }

    @JsOverlay
    public final void setExposureMode(String exposureMode){
        this.exposureMode = exposureMode;
    }

    @JsOverlay
    public final String getFocusMode(){
        return this.focusMode;
    }

    @JsOverlay
    public final void setFocusMode(String focusMode){
        this.focusMode = focusMode;
    }

    @JsOverlay
    public final Point2D[] getPointsOfInterest(){
        return this.pointsOfInterest;
    }

    @JsOverlay
    public final void setPointsOfInterest(Point2D[] pointsOfInterest){
        this.pointsOfInterest = pointsOfInterest;
    }

    @JsOverlay
    public final double getExposureCompensation(){
        return this.exposureCompensation;
    }

    @JsOverlay
    public final void setExposureCompensation(double exposureCompensation){
        this.exposureCompensation = exposureCompensation;
    }

    @JsOverlay
    public final double getColorTemperature(){
        return this.colorTemperature;
    }

    @JsOverlay
    public final void setColorTemperature(double colorTemperature){
        this.colorTemperature = colorTemperature;
    }

    @JsOverlay
    public final double getIso(){
        return this.iso;
    }

    @JsOverlay
    public final void setIso(double iso){
        this.iso = iso;
    }

    @JsOverlay
    public final double getBrightness(){
        return this.brightness;
    }

    @JsOverlay
    public final void setBrightness(double brightness){
        this.brightness = brightness;
    }

    @JsOverlay
    public final double getContrast(){
        return this.contrast;
    }

    @JsOverlay
    public final void setContrast(double contrast){
        this.contrast = contrast;
    }

    @JsOverlay
    public final double getSaturation(){
        return this.saturation;
    }

    @JsOverlay
    public final void setSaturation(double saturation){
        this.saturation = saturation;
    }

    @JsOverlay
    public final double getSharpness(){
        return this.sharpness;
    }

    @JsOverlay
    public final void setSharpness(double sharpness){
        this.sharpness = sharpness;
    }

    @JsOverlay
    public final double getZoom(){
        return this.zoom;
    }

    @JsOverlay
    public final void setZoom(double zoom){
        this.zoom = zoom;
    }

    @JsOverlay
    public final boolean getTorch(){
        return this.torch;
    }

    @JsOverlay
    public final void setTorch(boolean torch){
        this.torch = torch;
    }

}

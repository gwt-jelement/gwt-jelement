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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackSupportedConstraints{

    @JsProperty(name="width")
    private boolean width;

    @JsProperty(name="height")
    private boolean height;

    @JsProperty(name="aspectRatio")
    private boolean aspectRatio;

    @JsProperty(name="frameRate")
    private boolean frameRate;

    @JsProperty(name="facingMode")
    private boolean facingMode;

    @JsProperty(name="volume")
    private boolean volume;

    @JsProperty(name="sampleRate")
    private boolean sampleRate;

    @JsProperty(name="sampleSize")
    private boolean sampleSize;

    @JsProperty(name="echoCancellation")
    private boolean echoCancellation;

    @JsProperty(name="latency")
    private boolean latency;

    @JsProperty(name="channelCount")
    private boolean channelCount;

    @JsProperty(name="deviceId")
    private boolean deviceId;

    @JsProperty(name="groupId")
    private boolean groupId;

    @JsProperty(name="videoKind")
    private boolean videoKind;

    @JsProperty(name="depthNear")
    private boolean depthNear;

    @JsProperty(name="depthFar")
    private boolean depthFar;

    @JsProperty(name="focalLengthX")
    private boolean focalLengthX;

    @JsProperty(name="focalLengthY")
    private boolean focalLengthY;

    @JsProperty(name="whiteBalanceMode")
    private boolean whiteBalanceMode;

    @JsProperty(name="exposureMode")
    private boolean exposureMode;

    @JsProperty(name="focusMode")
    private boolean focusMode;

    @JsProperty(name="pointsOfInterest")
    private boolean pointsOfInterest;

    @JsProperty(name="exposureCompensation")
    private boolean exposureCompensation;

    @JsProperty(name="colorTemperature")
    private boolean colorTemperature;

    @JsProperty(name="iso")
    private boolean iso;

    @JsProperty(name="brightness")
    private boolean brightness;

    @JsProperty(name="contrast")
    private boolean contrast;

    @JsProperty(name="saturation")
    private boolean saturation;

    @JsProperty(name="sharpness")
    private boolean sharpness;

    @JsProperty(name="zoom")
    private boolean zoom;

    @JsProperty(name="torch")
    private boolean torch;

    public MediaTrackSupportedConstraints(){
    }

    @JsOverlay
    public final boolean getWidth(){
        return this.width;
    }

    @JsOverlay
    public final void setWidth(boolean width){
        this.width = width;
    }

    @JsOverlay
    public final boolean getHeight(){
        return this.height;
    }

    @JsOverlay
    public final void setHeight(boolean height){
        this.height = height;
    }

    @JsOverlay
    public final boolean getAspectRatio(){
        return this.aspectRatio;
    }

    @JsOverlay
    public final void setAspectRatio(boolean aspectRatio){
        this.aspectRatio = aspectRatio;
    }

    @JsOverlay
    public final boolean getFrameRate(){
        return this.frameRate;
    }

    @JsOverlay
    public final void setFrameRate(boolean frameRate){
        this.frameRate = frameRate;
    }

    @JsOverlay
    public final boolean getFacingMode(){
        return this.facingMode;
    }

    @JsOverlay
    public final void setFacingMode(boolean facingMode){
        this.facingMode = facingMode;
    }

    @JsOverlay
    public final boolean getVolume(){
        return this.volume;
    }

    @JsOverlay
    public final void setVolume(boolean volume){
        this.volume = volume;
    }

    @JsOverlay
    public final boolean getSampleRate(){
        return this.sampleRate;
    }

    @JsOverlay
    public final void setSampleRate(boolean sampleRate){
        this.sampleRate = sampleRate;
    }

    @JsOverlay
    public final boolean getSampleSize(){
        return this.sampleSize;
    }

    @JsOverlay
    public final void setSampleSize(boolean sampleSize){
        this.sampleSize = sampleSize;
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
    public final boolean getLatency(){
        return this.latency;
    }

    @JsOverlay
    public final void setLatency(boolean latency){
        this.latency = latency;
    }

    @JsOverlay
    public final boolean getChannelCount(){
        return this.channelCount;
    }

    @JsOverlay
    public final void setChannelCount(boolean channelCount){
        this.channelCount = channelCount;
    }

    @JsOverlay
    public final boolean getDeviceId(){
        return this.deviceId;
    }

    @JsOverlay
    public final void setDeviceId(boolean deviceId){
        this.deviceId = deviceId;
    }

    @JsOverlay
    public final boolean getGroupId(){
        return this.groupId;
    }

    @JsOverlay
    public final void setGroupId(boolean groupId){
        this.groupId = groupId;
    }

    @JsOverlay
    public final boolean getVideoKind(){
        return this.videoKind;
    }

    @JsOverlay
    public final void setVideoKind(boolean videoKind){
        this.videoKind = videoKind;
    }

    @JsOverlay
    public final boolean getDepthNear(){
        return this.depthNear;
    }

    @JsOverlay
    public final void setDepthNear(boolean depthNear){
        this.depthNear = depthNear;
    }

    @JsOverlay
    public final boolean getDepthFar(){
        return this.depthFar;
    }

    @JsOverlay
    public final void setDepthFar(boolean depthFar){
        this.depthFar = depthFar;
    }

    @JsOverlay
    public final boolean getFocalLengthX(){
        return this.focalLengthX;
    }

    @JsOverlay
    public final void setFocalLengthX(boolean focalLengthX){
        this.focalLengthX = focalLengthX;
    }

    @JsOverlay
    public final boolean getFocalLengthY(){
        return this.focalLengthY;
    }

    @JsOverlay
    public final void setFocalLengthY(boolean focalLengthY){
        this.focalLengthY = focalLengthY;
    }

    @JsOverlay
    public final boolean getWhiteBalanceMode(){
        return this.whiteBalanceMode;
    }

    @JsOverlay
    public final void setWhiteBalanceMode(boolean whiteBalanceMode){
        this.whiteBalanceMode = whiteBalanceMode;
    }

    @JsOverlay
    public final boolean getExposureMode(){
        return this.exposureMode;
    }

    @JsOverlay
    public final void setExposureMode(boolean exposureMode){
        this.exposureMode = exposureMode;
    }

    @JsOverlay
    public final boolean getFocusMode(){
        return this.focusMode;
    }

    @JsOverlay
    public final void setFocusMode(boolean focusMode){
        this.focusMode = focusMode;
    }

    @JsOverlay
    public final boolean getPointsOfInterest(){
        return this.pointsOfInterest;
    }

    @JsOverlay
    public final void setPointsOfInterest(boolean pointsOfInterest){
        this.pointsOfInterest = pointsOfInterest;
    }

    @JsOverlay
    public final boolean getExposureCompensation(){
        return this.exposureCompensation;
    }

    @JsOverlay
    public final void setExposureCompensation(boolean exposureCompensation){
        this.exposureCompensation = exposureCompensation;
    }

    @JsOverlay
    public final boolean getColorTemperature(){
        return this.colorTemperature;
    }

    @JsOverlay
    public final void setColorTemperature(boolean colorTemperature){
        this.colorTemperature = colorTemperature;
    }

    @JsOverlay
    public final boolean getIso(){
        return this.iso;
    }

    @JsOverlay
    public final void setIso(boolean iso){
        this.iso = iso;
    }

    @JsOverlay
    public final boolean getBrightness(){
        return this.brightness;
    }

    @JsOverlay
    public final void setBrightness(boolean brightness){
        this.brightness = brightness;
    }

    @JsOverlay
    public final boolean getContrast(){
        return this.contrast;
    }

    @JsOverlay
    public final void setContrast(boolean contrast){
        this.contrast = contrast;
    }

    @JsOverlay
    public final boolean getSaturation(){
        return this.saturation;
    }

    @JsOverlay
    public final void setSaturation(boolean saturation){
        this.saturation = saturation;
    }

    @JsOverlay
    public final boolean getSharpness(){
        return this.sharpness;
    }

    @JsOverlay
    public final void setSharpness(boolean sharpness){
        this.sharpness = sharpness;
    }

    @JsOverlay
    public final boolean getZoom(){
        return this.zoom;
    }

    @JsOverlay
    public final void setZoom(boolean zoom){
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

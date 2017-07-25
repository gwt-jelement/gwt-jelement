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

    public MediaTrackSupportedConstraints(){
    }

    @JsProperty(name="width")
    public boolean width;

    @JsOverlay
    public final boolean getWidth(){
        return this.width;
    }

    @JsOverlay
    public final void setWidth(boolean width){
        this.width = width;
    }

    @JsProperty(name="height")
    public boolean height;

    @JsOverlay
    public final boolean getHeight(){
        return this.height;
    }

    @JsOverlay
    public final void setHeight(boolean height){
        this.height = height;
    }

    @JsProperty(name="aspectRatio")
    public boolean aspectRatio;

    @JsOverlay
    public final boolean getAspectRatio(){
        return this.aspectRatio;
    }

    @JsOverlay
    public final void setAspectRatio(boolean aspectRatio){
        this.aspectRatio = aspectRatio;
    }

    @JsProperty(name="frameRate")
    public boolean frameRate;

    @JsOverlay
    public final boolean getFrameRate(){
        return this.frameRate;
    }

    @JsOverlay
    public final void setFrameRate(boolean frameRate){
        this.frameRate = frameRate;
    }

    @JsProperty(name="facingMode")
    public boolean facingMode;

    @JsOverlay
    public final boolean getFacingMode(){
        return this.facingMode;
    }

    @JsOverlay
    public final void setFacingMode(boolean facingMode){
        this.facingMode = facingMode;
    }

    @JsProperty(name="volume")
    public boolean volume;

    @JsOverlay
    public final boolean getVolume(){
        return this.volume;
    }

    @JsOverlay
    public final void setVolume(boolean volume){
        this.volume = volume;
    }

    @JsProperty(name="sampleRate")
    public boolean sampleRate;

    @JsOverlay
    public final boolean getSampleRate(){
        return this.sampleRate;
    }

    @JsOverlay
    public final void setSampleRate(boolean sampleRate){
        this.sampleRate = sampleRate;
    }

    @JsProperty(name="sampleSize")
    public boolean sampleSize;

    @JsOverlay
    public final boolean getSampleSize(){
        return this.sampleSize;
    }

    @JsOverlay
    public final void setSampleSize(boolean sampleSize){
        this.sampleSize = sampleSize;
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

    @JsProperty(name="latency")
    public boolean latency;

    @JsOverlay
    public final boolean getLatency(){
        return this.latency;
    }

    @JsOverlay
    public final void setLatency(boolean latency){
        this.latency = latency;
    }

    @JsProperty(name="channelCount")
    public boolean channelCount;

    @JsOverlay
    public final boolean getChannelCount(){
        return this.channelCount;
    }

    @JsOverlay
    public final void setChannelCount(boolean channelCount){
        this.channelCount = channelCount;
    }

    @JsProperty(name="deviceId")
    public boolean deviceId;

    @JsOverlay
    public final boolean getDeviceId(){
        return this.deviceId;
    }

    @JsOverlay
    public final void setDeviceId(boolean deviceId){
        this.deviceId = deviceId;
    }

    @JsProperty(name="groupId")
    public boolean groupId;

    @JsOverlay
    public final boolean getGroupId(){
        return this.groupId;
    }

    @JsOverlay
    public final void setGroupId(boolean groupId){
        this.groupId = groupId;
    }

    @JsProperty(name="videoKind")
    public boolean videoKind;

    @JsOverlay
    public final boolean getVideoKind(){
        return this.videoKind;
    }

    @JsOverlay
    public final void setVideoKind(boolean videoKind){
        this.videoKind = videoKind;
    }

    @JsProperty(name="depthNear")
    public boolean depthNear;

    @JsOverlay
    public final boolean getDepthNear(){
        return this.depthNear;
    }

    @JsOverlay
    public final void setDepthNear(boolean depthNear){
        this.depthNear = depthNear;
    }

    @JsProperty(name="depthFar")
    public boolean depthFar;

    @JsOverlay
    public final boolean getDepthFar(){
        return this.depthFar;
    }

    @JsOverlay
    public final void setDepthFar(boolean depthFar){
        this.depthFar = depthFar;
    }

    @JsProperty(name="focalLengthX")
    public boolean focalLengthX;

    @JsOverlay
    public final boolean getFocalLengthX(){
        return this.focalLengthX;
    }

    @JsOverlay
    public final void setFocalLengthX(boolean focalLengthX){
        this.focalLengthX = focalLengthX;
    }

    @JsProperty(name="focalLengthY")
    public boolean focalLengthY;

    @JsOverlay
    public final boolean getFocalLengthY(){
        return this.focalLengthY;
    }

    @JsOverlay
    public final void setFocalLengthY(boolean focalLengthY){
        this.focalLengthY = focalLengthY;
    }

    @JsProperty(name="whiteBalanceMode")
    public boolean whiteBalanceMode;

    @JsOverlay
    public final boolean getWhiteBalanceMode(){
        return this.whiteBalanceMode;
    }

    @JsOverlay
    public final void setWhiteBalanceMode(boolean whiteBalanceMode){
        this.whiteBalanceMode = whiteBalanceMode;
    }

    @JsProperty(name="exposureMode")
    public boolean exposureMode;

    @JsOverlay
    public final boolean getExposureMode(){
        return this.exposureMode;
    }

    @JsOverlay
    public final void setExposureMode(boolean exposureMode){
        this.exposureMode = exposureMode;
    }

    @JsProperty(name="focusMode")
    public boolean focusMode;

    @JsOverlay
    public final boolean getFocusMode(){
        return this.focusMode;
    }

    @JsOverlay
    public final void setFocusMode(boolean focusMode){
        this.focusMode = focusMode;
    }

    @JsProperty(name="pointsOfInterest")
    public boolean pointsOfInterest;

    @JsOverlay
    public final boolean getPointsOfInterest(){
        return this.pointsOfInterest;
    }

    @JsOverlay
    public final void setPointsOfInterest(boolean pointsOfInterest){
        this.pointsOfInterest = pointsOfInterest;
    }

    @JsProperty(name="exposureCompensation")
    public boolean exposureCompensation;

    @JsOverlay
    public final boolean getExposureCompensation(){
        return this.exposureCompensation;
    }

    @JsOverlay
    public final void setExposureCompensation(boolean exposureCompensation){
        this.exposureCompensation = exposureCompensation;
    }

    @JsProperty(name="colorTemperature")
    public boolean colorTemperature;

    @JsOverlay
    public final boolean getColorTemperature(){
        return this.colorTemperature;
    }

    @JsOverlay
    public final void setColorTemperature(boolean colorTemperature){
        this.colorTemperature = colorTemperature;
    }

    @JsProperty(name="iso")
    public boolean iso;

    @JsOverlay
    public final boolean getIso(){
        return this.iso;
    }

    @JsOverlay
    public final void setIso(boolean iso){
        this.iso = iso;
    }

    @JsProperty(name="brightness")
    public boolean brightness;

    @JsOverlay
    public final boolean getBrightness(){
        return this.brightness;
    }

    @JsOverlay
    public final void setBrightness(boolean brightness){
        this.brightness = brightness;
    }

    @JsProperty(name="contrast")
    public boolean contrast;

    @JsOverlay
    public final boolean getContrast(){
        return this.contrast;
    }

    @JsOverlay
    public final void setContrast(boolean contrast){
        this.contrast = contrast;
    }

    @JsProperty(name="saturation")
    public boolean saturation;

    @JsOverlay
    public final boolean getSaturation(){
        return this.saturation;
    }

    @JsOverlay
    public final void setSaturation(boolean saturation){
        this.saturation = saturation;
    }

    @JsProperty(name="sharpness")
    public boolean sharpness;

    @JsOverlay
    public final boolean getSharpness(){
        return this.sharpness;
    }

    @JsOverlay
    public final void setSharpness(boolean sharpness){
        this.sharpness = sharpness;
    }

    @JsProperty(name="zoom")
    public boolean zoom;

    @JsOverlay
    public final boolean getZoom(){
        return this.zoom;
    }

    @JsOverlay
    public final void setZoom(boolean zoom){
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

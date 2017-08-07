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

import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import gwt.jelement.imagecapture.ConstrainPoint2DParameters;
import gwt.jelement.imagecapture.Point2D;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackConstraintSet extends JsObject{

    @JsProperty(name="width")
    private ConstrainLong width;

    @JsProperty(name="height")
    private ConstrainLong height;

    @JsProperty(name="aspectRatio")
    private ConstrainDouble aspectRatio;

    @JsProperty(name="frameRate")
    private ConstrainDouble frameRate;

    @JsProperty(name="facingMode")
    private ConstrainDOMString facingMode;

    @JsProperty(name="volume")
    private ConstrainDouble volume;

    @JsProperty(name="sampleRate")
    private ConstrainLong sampleRate;

    @JsProperty(name="sampleSize")
    private ConstrainLong sampleSize;

    @JsProperty(name="echoCancellation")
    private ConstrainBoolean echoCancellation;

    @JsProperty(name="latency")
    private ConstrainDouble latency;

    @JsProperty(name="channelCount")
    private ConstrainLong channelCount;

    @JsProperty(name="deviceId")
    private ConstrainDOMString deviceId;

    @JsProperty(name="groupId")
    private ConstrainDOMString groupId;

    @JsProperty(name="videoKind")
    private ConstrainDOMString videoKind;

    @JsProperty(name="depthNear")
    private ConstrainDouble depthNear;

    @JsProperty(name="depthFar")
    private ConstrainDouble depthFar;

    @JsProperty(name="focalLengthX")
    private ConstrainDouble focalLengthX;

    @JsProperty(name="focalLengthY")
    private ConstrainDouble focalLengthY;

    @JsProperty(name="whiteBalanceMode")
    private ConstrainDOMString whiteBalanceMode;

    @JsProperty(name="exposureMode")
    private ConstrainDOMString exposureMode;

    @JsProperty(name="focusMode")
    private ConstrainDOMString focusMode;

    @JsProperty(name="pointsOfInterest")
    private ConstrainPoint2D pointsOfInterest;

    @JsProperty(name="exposureCompensation")
    private ConstrainDouble exposureCompensation;

    @JsProperty(name="colorTemperature")
    private ConstrainDouble colorTemperature;

    @JsProperty(name="iso")
    private ConstrainDouble iso;

    @JsProperty(name="brightness")
    private ConstrainDouble brightness;

    @JsProperty(name="contrast")
    private ConstrainDouble contrast;

    @JsProperty(name="saturation")
    private ConstrainDouble saturation;

    @JsProperty(name="sharpness")
    private ConstrainDouble sharpness;

    @JsProperty(name="zoom")
    private ConstrainDouble zoom;

    @JsProperty(name="torch")
    private ConstrainBoolean torch;

    @JsProperty(name="mandatory")
    private JsObject mandatory;

    @JsProperty(name="_optional")
    private JsObject[] _optional;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainLong {
        @JsOverlay
        static ConstrainLong of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainLong of(ConstrainLongRange value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainLongRange asConstrainLongRange(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isConstrainLongRange(){
            return (Object) this instanceof ConstrainLongRange;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainDouble {
        @JsOverlay
        static ConstrainDouble of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainDouble of(ConstrainDoubleRange value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainDoubleRange asConstrainDoubleRange(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isConstrainDoubleRange(){
            return (Object) this instanceof ConstrainDoubleRange;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainDOMString {
        @JsOverlay
        static ConstrainDOMString of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainDOMString of(String[] value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainDOMString of(ConstrainDOMStringParameters value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String[] asStringArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainDOMStringParameters asConstrainDOMStringParameters(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isStringArray(){
            return (Object) this instanceof String[];
        }
    
        @JsOverlay
        default boolean isConstrainDOMStringParameters(){
            return (Object) this instanceof ConstrainDOMStringParameters;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainBoolean {
        @JsOverlay
        static ConstrainBoolean of(boolean value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainBoolean of(ConstrainBooleanParameters value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default boolean asBoolean(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainBooleanParameters asConstrainBooleanParameters(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isBoolean(){
            return (Object) this instanceof Boolean;
        }
    
        @JsOverlay
        default boolean isConstrainBooleanParameters(){
            return (Object) this instanceof ConstrainBooleanParameters;
        }
    
    }
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainPoint2D {
        @JsOverlay
        static ConstrainPoint2D of(Point2D[] value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ConstrainPoint2D of(ConstrainPoint2DParameters value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default Point2D[] asPoint2DArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ConstrainPoint2DParameters asConstrainPoint2DParameters(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isPoint2DArray(){
            return (Object) this instanceof Point2D[];
        }
    
        @JsOverlay
        default boolean isConstrainPoint2DParameters(){
            return (Object) this instanceof ConstrainPoint2DParameters;
        }
    
    }
    
    public MediaTrackConstraintSet(){
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainLong getWidth(){
        return this.width;
    }

    @JsOverlay
    public final void setWidth(double width){
        this.width = MediaTrackConstraintSet.ConstrainLong.of(width);
    }

    @JsOverlay
    public final void setWidth(ConstrainLongRange width){
        this.width = MediaTrackConstraintSet.ConstrainLong.of(width);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainLong getHeight(){
        return this.height;
    }

    @JsOverlay
    public final void setHeight(double height){
        this.height = MediaTrackConstraintSet.ConstrainLong.of(height);
    }

    @JsOverlay
    public final void setHeight(ConstrainLongRange height){
        this.height = MediaTrackConstraintSet.ConstrainLong.of(height);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getAspectRatio(){
        return this.aspectRatio;
    }

    @JsOverlay
    public final void setAspectRatio(double aspectRatio){
        this.aspectRatio = MediaTrackConstraintSet.ConstrainDouble.of(aspectRatio);
    }

    @JsOverlay
    public final void setAspectRatio(ConstrainDoubleRange aspectRatio){
        this.aspectRatio = MediaTrackConstraintSet.ConstrainDouble.of(aspectRatio);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getFrameRate(){
        return this.frameRate;
    }

    @JsOverlay
    public final void setFrameRate(double frameRate){
        this.frameRate = MediaTrackConstraintSet.ConstrainDouble.of(frameRate);
    }

    @JsOverlay
    public final void setFrameRate(ConstrainDoubleRange frameRate){
        this.frameRate = MediaTrackConstraintSet.ConstrainDouble.of(frameRate);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getFacingMode(){
        return this.facingMode;
    }

    @JsOverlay
    public final void setFacingMode(String facingMode){
        this.facingMode = MediaTrackConstraintSet.ConstrainDOMString.of(facingMode);
    }

    @JsOverlay
    public final void setFacingMode(String[] facingMode){
        this.facingMode = MediaTrackConstraintSet.ConstrainDOMString.of(facingMode);
    }

    @JsOverlay
    public final void setFacingMode(ConstrainDOMStringParameters facingMode){
        this.facingMode = MediaTrackConstraintSet.ConstrainDOMString.of(facingMode);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getVolume(){
        return this.volume;
    }

    @JsOverlay
    public final void setVolume(double volume){
        this.volume = MediaTrackConstraintSet.ConstrainDouble.of(volume);
    }

    @JsOverlay
    public final void setVolume(ConstrainDoubleRange volume){
        this.volume = MediaTrackConstraintSet.ConstrainDouble.of(volume);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainLong getSampleRate(){
        return this.sampleRate;
    }

    @JsOverlay
    public final void setSampleRate(double sampleRate){
        this.sampleRate = MediaTrackConstraintSet.ConstrainLong.of(sampleRate);
    }

    @JsOverlay
    public final void setSampleRate(ConstrainLongRange sampleRate){
        this.sampleRate = MediaTrackConstraintSet.ConstrainLong.of(sampleRate);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainLong getSampleSize(){
        return this.sampleSize;
    }

    @JsOverlay
    public final void setSampleSize(double sampleSize){
        this.sampleSize = MediaTrackConstraintSet.ConstrainLong.of(sampleSize);
    }

    @JsOverlay
    public final void setSampleSize(ConstrainLongRange sampleSize){
        this.sampleSize = MediaTrackConstraintSet.ConstrainLong.of(sampleSize);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainBoolean getEchoCancellation(){
        return this.echoCancellation;
    }

    @JsOverlay
    public final void setEchoCancellation(boolean echoCancellation){
        this.echoCancellation = MediaTrackConstraintSet.ConstrainBoolean.of(echoCancellation);
    }

    @JsOverlay
    public final void setEchoCancellation(ConstrainBooleanParameters echoCancellation){
        this.echoCancellation = MediaTrackConstraintSet.ConstrainBoolean.of(echoCancellation);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getLatency(){
        return this.latency;
    }

    @JsOverlay
    public final void setLatency(double latency){
        this.latency = MediaTrackConstraintSet.ConstrainDouble.of(latency);
    }

    @JsOverlay
    public final void setLatency(ConstrainDoubleRange latency){
        this.latency = MediaTrackConstraintSet.ConstrainDouble.of(latency);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainLong getChannelCount(){
        return this.channelCount;
    }

    @JsOverlay
    public final void setChannelCount(double channelCount){
        this.channelCount = MediaTrackConstraintSet.ConstrainLong.of(channelCount);
    }

    @JsOverlay
    public final void setChannelCount(ConstrainLongRange channelCount){
        this.channelCount = MediaTrackConstraintSet.ConstrainLong.of(channelCount);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getDeviceId(){
        return this.deviceId;
    }

    @JsOverlay
    public final void setDeviceId(String deviceId){
        this.deviceId = MediaTrackConstraintSet.ConstrainDOMString.of(deviceId);
    }

    @JsOverlay
    public final void setDeviceId(String[] deviceId){
        this.deviceId = MediaTrackConstraintSet.ConstrainDOMString.of(deviceId);
    }

    @JsOverlay
    public final void setDeviceId(ConstrainDOMStringParameters deviceId){
        this.deviceId = MediaTrackConstraintSet.ConstrainDOMString.of(deviceId);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getGroupId(){
        return this.groupId;
    }

    @JsOverlay
    public final void setGroupId(String groupId){
        this.groupId = MediaTrackConstraintSet.ConstrainDOMString.of(groupId);
    }

    @JsOverlay
    public final void setGroupId(String[] groupId){
        this.groupId = MediaTrackConstraintSet.ConstrainDOMString.of(groupId);
    }

    @JsOverlay
    public final void setGroupId(ConstrainDOMStringParameters groupId){
        this.groupId = MediaTrackConstraintSet.ConstrainDOMString.of(groupId);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getVideoKind(){
        return this.videoKind;
    }

    @JsOverlay
    public final void setVideoKind(String videoKind){
        this.videoKind = MediaTrackConstraintSet.ConstrainDOMString.of(videoKind);
    }

    @JsOverlay
    public final void setVideoKind(String[] videoKind){
        this.videoKind = MediaTrackConstraintSet.ConstrainDOMString.of(videoKind);
    }

    @JsOverlay
    public final void setVideoKind(ConstrainDOMStringParameters videoKind){
        this.videoKind = MediaTrackConstraintSet.ConstrainDOMString.of(videoKind);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getDepthNear(){
        return this.depthNear;
    }

    @JsOverlay
    public final void setDepthNear(double depthNear){
        this.depthNear = MediaTrackConstraintSet.ConstrainDouble.of(depthNear);
    }

    @JsOverlay
    public final void setDepthNear(ConstrainDoubleRange depthNear){
        this.depthNear = MediaTrackConstraintSet.ConstrainDouble.of(depthNear);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getDepthFar(){
        return this.depthFar;
    }

    @JsOverlay
    public final void setDepthFar(double depthFar){
        this.depthFar = MediaTrackConstraintSet.ConstrainDouble.of(depthFar);
    }

    @JsOverlay
    public final void setDepthFar(ConstrainDoubleRange depthFar){
        this.depthFar = MediaTrackConstraintSet.ConstrainDouble.of(depthFar);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getFocalLengthX(){
        return this.focalLengthX;
    }

    @JsOverlay
    public final void setFocalLengthX(double focalLengthX){
        this.focalLengthX = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthX);
    }

    @JsOverlay
    public final void setFocalLengthX(ConstrainDoubleRange focalLengthX){
        this.focalLengthX = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthX);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getFocalLengthY(){
        return this.focalLengthY;
    }

    @JsOverlay
    public final void setFocalLengthY(double focalLengthY){
        this.focalLengthY = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthY);
    }

    @JsOverlay
    public final void setFocalLengthY(ConstrainDoubleRange focalLengthY){
        this.focalLengthY = MediaTrackConstraintSet.ConstrainDouble.of(focalLengthY);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getWhiteBalanceMode(){
        return this.whiteBalanceMode;
    }

    @JsOverlay
    public final void setWhiteBalanceMode(String whiteBalanceMode){
        this.whiteBalanceMode = MediaTrackConstraintSet.ConstrainDOMString.of(whiteBalanceMode);
    }

    @JsOverlay
    public final void setWhiteBalanceMode(String[] whiteBalanceMode){
        this.whiteBalanceMode = MediaTrackConstraintSet.ConstrainDOMString.of(whiteBalanceMode);
    }

    @JsOverlay
    public final void setWhiteBalanceMode(ConstrainDOMStringParameters whiteBalanceMode){
        this.whiteBalanceMode = MediaTrackConstraintSet.ConstrainDOMString.of(whiteBalanceMode);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getExposureMode(){
        return this.exposureMode;
    }

    @JsOverlay
    public final void setExposureMode(String exposureMode){
        this.exposureMode = MediaTrackConstraintSet.ConstrainDOMString.of(exposureMode);
    }

    @JsOverlay
    public final void setExposureMode(String[] exposureMode){
        this.exposureMode = MediaTrackConstraintSet.ConstrainDOMString.of(exposureMode);
    }

    @JsOverlay
    public final void setExposureMode(ConstrainDOMStringParameters exposureMode){
        this.exposureMode = MediaTrackConstraintSet.ConstrainDOMString.of(exposureMode);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDOMString getFocusMode(){
        return this.focusMode;
    }

    @JsOverlay
    public final void setFocusMode(String focusMode){
        this.focusMode = MediaTrackConstraintSet.ConstrainDOMString.of(focusMode);
    }

    @JsOverlay
    public final void setFocusMode(String[] focusMode){
        this.focusMode = MediaTrackConstraintSet.ConstrainDOMString.of(focusMode);
    }

    @JsOverlay
    public final void setFocusMode(ConstrainDOMStringParameters focusMode){
        this.focusMode = MediaTrackConstraintSet.ConstrainDOMString.of(focusMode);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainPoint2D getPointsOfInterest(){
        return this.pointsOfInterest;
    }

    @JsOverlay
    public final void setPointsOfInterest(Point2D[] pointsOfInterest){
        this.pointsOfInterest = MediaTrackConstraintSet.ConstrainPoint2D.of(pointsOfInterest);
    }

    @JsOverlay
    public final void setPointsOfInterest(ConstrainPoint2DParameters pointsOfInterest){
        this.pointsOfInterest = MediaTrackConstraintSet.ConstrainPoint2D.of(pointsOfInterest);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getExposureCompensation(){
        return this.exposureCompensation;
    }

    @JsOverlay
    public final void setExposureCompensation(double exposureCompensation){
        this.exposureCompensation = MediaTrackConstraintSet.ConstrainDouble.of(exposureCompensation);
    }

    @JsOverlay
    public final void setExposureCompensation(ConstrainDoubleRange exposureCompensation){
        this.exposureCompensation = MediaTrackConstraintSet.ConstrainDouble.of(exposureCompensation);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getColorTemperature(){
        return this.colorTemperature;
    }

    @JsOverlay
    public final void setColorTemperature(double colorTemperature){
        this.colorTemperature = MediaTrackConstraintSet.ConstrainDouble.of(colorTemperature);
    }

    @JsOverlay
    public final void setColorTemperature(ConstrainDoubleRange colorTemperature){
        this.colorTemperature = MediaTrackConstraintSet.ConstrainDouble.of(colorTemperature);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getIso(){
        return this.iso;
    }

    @JsOverlay
    public final void setIso(double iso){
        this.iso = MediaTrackConstraintSet.ConstrainDouble.of(iso);
    }

    @JsOverlay
    public final void setIso(ConstrainDoubleRange iso){
        this.iso = MediaTrackConstraintSet.ConstrainDouble.of(iso);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getBrightness(){
        return this.brightness;
    }

    @JsOverlay
    public final void setBrightness(double brightness){
        this.brightness = MediaTrackConstraintSet.ConstrainDouble.of(brightness);
    }

    @JsOverlay
    public final void setBrightness(ConstrainDoubleRange brightness){
        this.brightness = MediaTrackConstraintSet.ConstrainDouble.of(brightness);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getContrast(){
        return this.contrast;
    }

    @JsOverlay
    public final void setContrast(double contrast){
        this.contrast = MediaTrackConstraintSet.ConstrainDouble.of(contrast);
    }

    @JsOverlay
    public final void setContrast(ConstrainDoubleRange contrast){
        this.contrast = MediaTrackConstraintSet.ConstrainDouble.of(contrast);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getSaturation(){
        return this.saturation;
    }

    @JsOverlay
    public final void setSaturation(double saturation){
        this.saturation = MediaTrackConstraintSet.ConstrainDouble.of(saturation);
    }

    @JsOverlay
    public final void setSaturation(ConstrainDoubleRange saturation){
        this.saturation = MediaTrackConstraintSet.ConstrainDouble.of(saturation);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getSharpness(){
        return this.sharpness;
    }

    @JsOverlay
    public final void setSharpness(double sharpness){
        this.sharpness = MediaTrackConstraintSet.ConstrainDouble.of(sharpness);
    }

    @JsOverlay
    public final void setSharpness(ConstrainDoubleRange sharpness){
        this.sharpness = MediaTrackConstraintSet.ConstrainDouble.of(sharpness);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainDouble getZoom(){
        return this.zoom;
    }

    @JsOverlay
    public final void setZoom(double zoom){
        this.zoom = MediaTrackConstraintSet.ConstrainDouble.of(zoom);
    }

    @JsOverlay
    public final void setZoom(ConstrainDoubleRange zoom){
        this.zoom = MediaTrackConstraintSet.ConstrainDouble.of(zoom);
    }

    @JsOverlay
    public final MediaTrackConstraintSet.ConstrainBoolean getTorch(){
        return this.torch;
    }

    @JsOverlay
    public final void setTorch(boolean torch){
        this.torch = MediaTrackConstraintSet.ConstrainBoolean.of(torch);
    }

    @JsOverlay
    public final void setTorch(ConstrainBooleanParameters torch){
        this.torch = MediaTrackConstraintSet.ConstrainBoolean.of(torch);
    }

    @JsOverlay
    public final JsObject getMandatory(){
        return this.mandatory;
    }

    @JsOverlay
    public final void setMandatory(JsObject mandatory){
        this.mandatory = mandatory;
    }

    @JsOverlay
    public final JsObject[] get_optional(){
        return this._optional;
    }

    @JsOverlay
    public final void set_optional(JsObject[] _optional){
        this._optional = _optional;
    }


}

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

import gwt.jelement.imagecapture.ConstrainPoint2DParameters;
import gwt.jelement.imagecapture.Point2D;
import gwt.jelement.mediastream.ConstrainBooleanParameters;
import gwt.jelement.mediastream.ConstrainDOMStringParameters;
import gwt.jelement.mediastream.ConstrainDoubleRange;
import gwt.jelement.mediastream.ConstrainLongRange;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackConstraintSet{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ConstrainLong {
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
    
    @JsProperty(name="width")
    public MediaTrackConstraintSet.ConstrainLong width;

    @JsProperty(name="height")
    public MediaTrackConstraintSet.ConstrainLong height;

    @JsProperty(name="aspectRatio")
    public MediaTrackConstraintSet.ConstrainDouble aspectRatio;

    @JsProperty(name="frameRate")
    public MediaTrackConstraintSet.ConstrainDouble frameRate;

    @JsProperty(name="facingMode")
    public MediaTrackConstraintSet.ConstrainDOMString facingMode;

    @JsProperty(name="volume")
    public MediaTrackConstraintSet.ConstrainDouble volume;

    @JsProperty(name="sampleRate")
    public MediaTrackConstraintSet.ConstrainLong sampleRate;

    @JsProperty(name="sampleSize")
    public MediaTrackConstraintSet.ConstrainLong sampleSize;

    @JsProperty(name="echoCancellation")
    public MediaTrackConstraintSet.ConstrainBoolean echoCancellation;

    @JsProperty(name="latency")
    public MediaTrackConstraintSet.ConstrainDouble latency;

    @JsProperty(name="channelCount")
    public MediaTrackConstraintSet.ConstrainLong channelCount;

    @JsProperty(name="deviceId")
    public MediaTrackConstraintSet.ConstrainDOMString deviceId;

    @JsProperty(name="groupId")
    public MediaTrackConstraintSet.ConstrainDOMString groupId;

    @JsProperty(name="videoKind")
    public MediaTrackConstraintSet.ConstrainDOMString videoKind;

    @JsProperty(name="depthNear")
    public MediaTrackConstraintSet.ConstrainDouble depthNear;

    @JsProperty(name="depthFar")
    public MediaTrackConstraintSet.ConstrainDouble depthFar;

    @JsProperty(name="focalLengthX")
    public MediaTrackConstraintSet.ConstrainDouble focalLengthX;

    @JsProperty(name="focalLengthY")
    public MediaTrackConstraintSet.ConstrainDouble focalLengthY;

    @JsProperty(name="whiteBalanceMode")
    public MediaTrackConstraintSet.ConstrainDOMString whiteBalanceMode;

    @JsProperty(name="exposureMode")
    public MediaTrackConstraintSet.ConstrainDOMString exposureMode;

    @JsProperty(name="focusMode")
    public MediaTrackConstraintSet.ConstrainDOMString focusMode;

    @JsProperty(name="pointsOfInterest")
    public MediaTrackConstraintSet.ConstrainPoint2D pointsOfInterest;

    @JsProperty(name="exposureCompensation")
    public MediaTrackConstraintSet.ConstrainDouble exposureCompensation;

    @JsProperty(name="colorTemperature")
    public MediaTrackConstraintSet.ConstrainDouble colorTemperature;

    @JsProperty(name="iso")
    public MediaTrackConstraintSet.ConstrainDouble iso;

    @JsProperty(name="brightness")
    public MediaTrackConstraintSet.ConstrainDouble brightness;

    @JsProperty(name="contrast")
    public MediaTrackConstraintSet.ConstrainDouble contrast;

    @JsProperty(name="saturation")
    public MediaTrackConstraintSet.ConstrainDouble saturation;

    @JsProperty(name="sharpness")
    public MediaTrackConstraintSet.ConstrainDouble sharpness;

    @JsProperty(name="zoom")
    public MediaTrackConstraintSet.ConstrainDouble zoom;

    @JsProperty(name="torch")
    public MediaTrackConstraintSet.ConstrainBoolean torch;

    @JsProperty(name="mandatory")
    public Object mandatory;

    @JsProperty(name="_optional")
    public Object[] _optional;


}

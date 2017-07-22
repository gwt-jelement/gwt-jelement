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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackSettings{

    @JsProperty(name="width")
    public double width;

    @JsProperty(name="height")
    public double height;

    @JsProperty(name="aspectRatio")
    public double aspectRatio;

    @JsProperty(name="frameRate")
    public double frameRate;

    @JsProperty(name="facingMode")
    public String facingMode;

    @JsProperty(name="echoCancellation")
    public boolean echoCancellation;

    @JsProperty(name="deviceId")
    public String deviceId;

    @JsProperty(name="videoKind")
    public String videoKind;

    @JsProperty(name="depthNear")
    public double depthNear;

    @JsProperty(name="depthFar")
    public double depthFar;

    @JsProperty(name="focalLengthX")
    public double focalLengthX;

    @JsProperty(name="focalLengthY")
    public double focalLengthY;

    @JsProperty(name="whiteBalanceMode")
    public String whiteBalanceMode;

    @JsProperty(name="exposureMode")
    public String exposureMode;

    @JsProperty(name="focusMode")
    public String focusMode;

    @JsProperty(name="pointsOfInterest")
    public Point2D[] pointsOfInterest;

    @JsProperty(name="exposureCompensation")
    public double exposureCompensation;

    @JsProperty(name="colorTemperature")
    public double colorTemperature;

    @JsProperty(name="iso")
    public double iso;

    @JsProperty(name="brightness")
    public double brightness;

    @JsProperty(name="contrast")
    public double contrast;

    @JsProperty(name="saturation")
    public double saturation;

    @JsProperty(name="sharpness")
    public double sharpness;

    @JsProperty(name="zoom")
    public double zoom;

    @JsProperty(name="torch")
    public boolean torch;


}

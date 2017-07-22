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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackSupportedConstraints{

    @JsProperty(name="width")
    public boolean width;

    @JsProperty(name="height")
    public boolean height;

    @JsProperty(name="aspectRatio")
    public boolean aspectRatio;

    @JsProperty(name="frameRate")
    public boolean frameRate;

    @JsProperty(name="facingMode")
    public boolean facingMode;

    @JsProperty(name="volume")
    public boolean volume;

    @JsProperty(name="sampleRate")
    public boolean sampleRate;

    @JsProperty(name="sampleSize")
    public boolean sampleSize;

    @JsProperty(name="echoCancellation")
    public boolean echoCancellation;

    @JsProperty(name="latency")
    public boolean latency;

    @JsProperty(name="channelCount")
    public boolean channelCount;

    @JsProperty(name="deviceId")
    public boolean deviceId;

    @JsProperty(name="groupId")
    public boolean groupId;

    @JsProperty(name="videoKind")
    public boolean videoKind;

    @JsProperty(name="depthNear")
    public boolean depthNear;

    @JsProperty(name="depthFar")
    public boolean depthFar;

    @JsProperty(name="focalLengthX")
    public boolean focalLengthX;

    @JsProperty(name="focalLengthY")
    public boolean focalLengthY;

    @JsProperty(name="whiteBalanceMode")
    public boolean whiteBalanceMode;

    @JsProperty(name="exposureMode")
    public boolean exposureMode;

    @JsProperty(name="focusMode")
    public boolean focusMode;

    @JsProperty(name="pointsOfInterest")
    public boolean pointsOfInterest;

    @JsProperty(name="exposureCompensation")
    public boolean exposureCompensation;

    @JsProperty(name="colorTemperature")
    public boolean colorTemperature;

    @JsProperty(name="iso")
    public boolean iso;

    @JsProperty(name="brightness")
    public boolean brightness;

    @JsProperty(name="contrast")
    public boolean contrast;

    @JsProperty(name="saturation")
    public boolean saturation;

    @JsProperty(name="sharpness")
    public boolean sharpness;

    @JsProperty(name="zoom")
    public boolean zoom;

    @JsProperty(name="torch")
    public boolean torch;


}

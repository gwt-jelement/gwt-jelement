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
    public boolean width = true;

    @JsProperty(name="height")
    public boolean height = true;

    @JsProperty(name="aspectRatio")
    public boolean aspectRatio = true;

    @JsProperty(name="frameRate")
    public boolean frameRate = true;

    @JsProperty(name="facingMode")
    public boolean facingMode = true;

    @JsProperty(name="volume")
    public boolean volume = true;

    @JsProperty(name="sampleRate")
    public boolean sampleRate = true;

    @JsProperty(name="sampleSize")
    public boolean sampleSize = true;

    @JsProperty(name="echoCancellation")
    public boolean echoCancellation = true;

    @JsProperty(name="latency")
    public boolean latency = true;

    @JsProperty(name="channelCount")
    public boolean channelCount = true;

    @JsProperty(name="deviceId")
    public boolean deviceId = true;

    @JsProperty(name="groupId")
    public boolean groupId = true;

    @JsProperty(name="videoKind")
    public boolean videoKind = true;

    @JsProperty(name="depthNear")
    public boolean depthNear = true;

    @JsProperty(name="depthFar")
    public boolean depthFar = true;

    @JsProperty(name="focalLengthX")
    public boolean focalLengthX = true;

    @JsProperty(name="focalLengthY")
    public boolean focalLengthY = true;

    @JsProperty(name="whiteBalanceMode")
    public boolean whiteBalanceMode = true;

    @JsProperty(name="exposureMode")
    public boolean exposureMode = true;

    @JsProperty(name="focusMode")
    public boolean focusMode = true;

    @JsProperty(name="pointsOfInterest")
    public boolean pointsOfInterest = true;

    @JsProperty(name="exposureCompensation")
    public boolean exposureCompensation = true;

    @JsProperty(name="colorTemperature")
    public boolean colorTemperature = true;

    @JsProperty(name="iso")
    public boolean iso = true;

    @JsProperty(name="brightness")
    public boolean brightness = true;

    @JsProperty(name="contrast")
    public boolean contrast = true;

    @JsProperty(name="saturation")
    public boolean saturation = true;

    @JsProperty(name="sharpness")
    public boolean sharpness = true;

    @JsProperty(name="zoom")
    public boolean zoom = true;

    @JsProperty(name="torch")
    public boolean torch = true;


}

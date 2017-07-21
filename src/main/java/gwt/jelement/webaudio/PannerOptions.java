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

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PannerOptions extends AudioNodeOptions{

    @JsProperty(name="panningModel")
    public PanningModelType panningModel = PanningModelType.of("equalpower");

    @JsProperty(name="distanceModel")
    public DistanceModelType distanceModel = DistanceModelType.of("inverse");

    @JsProperty(name="positionX")
    public float positionX = 0;

    @JsProperty(name="positionY")
    public float positionY = 0;

    @JsProperty(name="positionZ")
    public float positionZ = 0;

    @JsProperty(name="orientationX")
    public float orientationX = 1;

    @JsProperty(name="orientationY")
    public float orientationY = 0;

    @JsProperty(name="orientationZ")
    public float orientationZ = 0;

    @JsProperty(name="refDistance")
    public double refDistance = 1;

    @JsProperty(name="maxDistance")
    public double maxDistance = 10000;

    @JsProperty(name="rolloffFactor")
    public double rolloffFactor = 1;

    @JsProperty(name="coneInnerAngle")
    public double coneInnerAngle = 360;

    @JsProperty(name="coneOuterAngle")
    public double coneOuterAngle = 360;

    @JsProperty(name="coneOuterGain")
    public double coneOuterGain = 0;


}

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
package gwt.jelement.device_orientation;

import gwt.jelement.device_orientation.DeviceAccelerationInit;
import gwt.jelement.device_orientation.DeviceRotationRateInit;
import gwt.jelement.events.EventInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class DeviceMotionEventInit extends EventInit{

    @JsProperty(name="acceleration")
    private DeviceAccelerationInit acceleration;

    @JsProperty(name="accelerationIncludingGravity")
    private DeviceAccelerationInit accelerationIncludingGravity;

    @JsProperty(name="rotationRate")
    private DeviceRotationRateInit rotationRate;

    @JsProperty(name="interval")
    private double interval;

    public DeviceMotionEventInit(){
    }

    @JsOverlay
    public final DeviceAccelerationInit getAcceleration(){
        return this.acceleration;
    }

    @JsOverlay
    public final void setAcceleration(DeviceAccelerationInit acceleration){
        this.acceleration = acceleration;
    }

    @JsOverlay
    public final DeviceAccelerationInit getAccelerationIncludingGravity(){
        return this.accelerationIncludingGravity;
    }

    @JsOverlay
    public final void setAccelerationIncludingGravity(DeviceAccelerationInit accelerationIncludingGravity){
        this.accelerationIncludingGravity = accelerationIncludingGravity;
    }

    @JsOverlay
    public final DeviceRotationRateInit getRotationRate(){
        return this.rotationRate;
    }

    @JsOverlay
    public final void setRotationRate(DeviceRotationRateInit rotationRate){
        this.rotationRate = rotationRate;
    }

    @JsOverlay
    public final double getInterval(){
        return this.interval;
    }

    @JsOverlay
    public final void setInterval(double interval){
        this.interval = interval;
    }

}

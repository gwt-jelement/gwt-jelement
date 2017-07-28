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

import gwt.jelement.webaudio.AudioParam;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AudioParam", isNative = true)
public class AudioParam{
    @JsProperty(name="value")
    public native float getValue();
    
    @JsProperty(name="value")
    public native void setValue(float value);
    
    @JsProperty(name="defaultValue")
    public native float getDefaultValue();
    
    @JsProperty(name="minValue")
    public native float getMinValue();
    
    @JsProperty(name="maxValue")
    public native float getMaxValue();
    
    @JsMethod(name = "cancelAndHoldAtTime")
    public native AudioParam cancelAndHoldAtTime(double startTime);
    
    @JsMethod(name = "cancelScheduledValues")
    public native AudioParam cancelScheduledValues(double startTime);
    
    @JsMethod(name = "exponentialRampToValueAtTime")
    public native AudioParam exponentialRampToValueAtTime(float value, double time);
    
    @JsMethod(name = "linearRampToValueAtTime")
    public native AudioParam linearRampToValueAtTime(float value, double time);
    
    @JsMethod(name = "setTargetAtTime")
    public native AudioParam setTargetAtTime(float target, double time, double timeConstant);
    
    @JsMethod(name = "setValueAtTime")
    public native AudioParam setValueAtTime(float value, double time);
    
    @JsMethod(name = "setValueCurveAtTime")
    public native AudioParam setValueCurveAtTime(float[] values, double time, double duration);
    
}

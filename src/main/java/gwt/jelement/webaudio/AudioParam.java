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

import gwt.jelement.core.Array;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="AudioParam", isNative = true)
public class AudioParam implements IsObject {
    @JsProperty(name="value")
    public native double getValue();
    
    @JsProperty(name="value")
    public native void setValue(double value);
    
    @JsProperty(name="defaultValue")
    public native double getDefaultValue();
    
    @JsProperty(name="minValue")
    public native double getMinValue();
    
    @JsProperty(name="maxValue")
    public native double getMaxValue();
    
    @JsMethod(name = "cancelAndHoldAtTime")
    public native AudioParam cancelAndHoldAtTime(double startTime);
    
    @JsMethod(name = "cancelScheduledValues")
    public native AudioParam cancelScheduledValues(double startTime);
    
    @JsMethod(name = "exponentialRampToValueAtTime")
    public native AudioParam exponentialRampToValueAtTime(double value, double time);
    
    @JsMethod(name = "linearRampToValueAtTime")
    public native AudioParam linearRampToValueAtTime(double value, double time);
    
    @JsMethod(name = "setTargetAtTime")
    public native AudioParam setTargetAtTime(double target, double time, double timeConstant);
    
    @JsMethod(name = "setValueAtTime")
    public native AudioParam setValueAtTime(double value, double time);
    
    @JsMethod(name = "setValueCurveAtTime")
    public native AudioParam setValueCurveAtTime(double[] values, double time, double duration);
    
    @JsMethod(name = "setValueCurveAtTime")
    public native AudioParam setValueCurveAtTime(Array values, double time, double duration);
    
}

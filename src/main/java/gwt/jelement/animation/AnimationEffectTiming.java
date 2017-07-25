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
package gwt.jelement.animation;

import gwt.jelement.animation.AnimationEffectTimingReadOnly;
import gwt.jelement.animation.PlaybackDirection;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AnimationEffectTiming extends AnimationEffectTimingReadOnly{
    
    @JsConstructor
    public AnimationEffectTiming(){
        super();
    }
    
    @JsProperty(name="delay")
    public double delay;
    
    @JsProperty(name="endDelay")
    public double endDelay;
    
    @JsProperty(name="fill")
    public String fill;
    
    @JsProperty(name="iterationStart")
    public double iterationStart;
    
    @JsProperty(name="iterations")
    public double iterations;
    
    @JsProperty(name="duration")
    public AnimationEffectTimingReadOnly.DurationUnion duration;
    
    @JsOverlay
    public final void setDuration(double duration){
        this.duration = AnimationEffectTimingReadOnly.DurationUnion.of(duration);
    }
    
    @JsOverlay
    public final void setDuration(String duration){
        this.duration = AnimationEffectTimingReadOnly.DurationUnion.of(duration);
    }
    
    @JsProperty(name="direction")
    public String direction;
    
    @JsOverlay
    public final void setDirection(PlaybackDirection direction){
       this.direction = direction.getInternalValue();
    }
    
    @JsProperty(name="easing")
    public String easing;
    
    
}

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
import gwt.jelement.animation.FillMode;
import gwt.jelement.animation.PlaybackDirection;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AnimationEffectTimingProperties{

    public AnimationEffectTimingProperties(){
    }

    @JsProperty(name="delay")
    public double delay;

    @JsOverlay
    public final double getDelay(){
        return this.delay;
    }

    @JsOverlay
    public final void setDelay(double delay){
        this.delay = delay;
    }

    @JsProperty(name="endDelay")
    public double endDelay;

    @JsOverlay
    public final double getEndDelay(){
        return this.endDelay;
    }

    @JsOverlay
    public final void setEndDelay(double endDelay){
        this.endDelay = endDelay;
    }

    @JsProperty(name="fill")
    public String fill;

    @JsOverlay
    public final FillMode getFill(){
        return FillMode.of(this.fill);
    }

    @JsOverlay
    public final void setFill(FillMode fill){
        this.fill = fill.getInternalValue();
    }

    @JsProperty(name="iterationStart")
    public double iterationStart;

    @JsOverlay
    public final double getIterationStart(){
        return this.iterationStart;
    }

    @JsOverlay
    public final void setIterationStart(double iterationStart){
        this.iterationStart = iterationStart;
    }

    @JsProperty(name="iterations")
    public double iterations;

    @JsOverlay
    public final double getIterations(){
        return this.iterations;
    }

    @JsOverlay
    public final void setIterations(double iterations){
        this.iterations = iterations;
    }

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
    public final PlaybackDirection getDirection(){
        return PlaybackDirection.of(this.direction);
    }

    @JsOverlay
    public final void setDirection(PlaybackDirection direction){
        this.direction = direction.getInternalValue();
    }

    @JsProperty(name="easing")
    public String easing;

    @JsOverlay
    public final String getEasing(){
        return this.easing;
    }

    @JsOverlay
    public final void setEasing(String easing){
        this.easing = easing;
    }


}

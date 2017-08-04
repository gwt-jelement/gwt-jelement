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

import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AnimationEffectTimingProperties extends JsObject{

    @JsProperty(name="delay")
    private double delay;

    @JsProperty(name="endDelay")
    private double endDelay;

    @JsProperty(name="fill")
    private String fill;

    @JsProperty(name="iterationStart")
    private double iterationStart;

    @JsProperty(name="iterations")
    private double iterations;

    @JsProperty(name="duration")
    private AnimationEffectTimingReadOnly.DurationUnion duration;

    @JsProperty(name="direction")
    private String direction;

    @JsProperty(name="easing")
    private String easing;

    public AnimationEffectTimingProperties(){
    }

    @JsOverlay
    public final double getDelay(){
        return this.delay;
    }

    @JsOverlay
    public final void setDelay(double delay){
        this.delay = delay;
    }

    @JsOverlay
    public final double getEndDelay(){
        return this.endDelay;
    }

    @JsOverlay
    public final void setEndDelay(double endDelay){
        this.endDelay = endDelay;
    }

    @JsOverlay
    public final FillMode getFill(){
        return FillMode.of(this.fill);
    }

    @JsOverlay
    public final void setFill(FillMode fill){
        this.fill = fill.getInternalValue();
    }

    @JsOverlay
    public final double getIterationStart(){
        return this.iterationStart;
    }

    @JsOverlay
    public final void setIterationStart(double iterationStart){
        this.iterationStart = iterationStart;
    }

    @JsOverlay
    public final double getIterations(){
        return this.iterations;
    }

    @JsOverlay
    public final void setIterations(double iterations){
        this.iterations = iterations;
    }

    @JsOverlay
    public final void setDuration(double duration){
        this.duration = AnimationEffectTimingReadOnly.DurationUnion.of(duration);
    }

    @JsOverlay
    public final void setDuration(String duration){
        this.duration = AnimationEffectTimingReadOnly.DurationUnion.of(duration);
    }

    @JsOverlay
    public final PlaybackDirection getDirection(){
        return PlaybackDirection.of(this.direction);
    }

    @JsOverlay
    public final void setDirection(PlaybackDirection direction){
        this.direction = direction.getInternalValue();
    }

    @JsOverlay
    public final String getEasing(){
        return this.easing;
    }

    @JsOverlay
    public final void setEasing(String easing){
        this.easing = easing;
    }

}

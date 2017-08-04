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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ComputedTimingProperties extends AnimationEffectTimingProperties{

    @JsProperty(name="endTime")
    private double endTime;

    @JsProperty(name="activeDuration")
    private double activeDuration;

    @JsProperty(name="localTime")
    private double localTime;

    @JsProperty(name="progress")
    private double progress;

    @JsProperty(name="currentIteration")
    private double currentIteration;

    public ComputedTimingProperties(){
    }

    @JsOverlay
    public final double getEndTime(){
        return this.endTime;
    }

    @JsOverlay
    public final void setEndTime(double endTime){
        this.endTime = endTime;
    }

    @JsOverlay
    public final double getActiveDuration(){
        return this.activeDuration;
    }

    @JsOverlay
    public final void setActiveDuration(double activeDuration){
        this.activeDuration = activeDuration;
    }

    @JsOverlay
    public final double getLocalTime(){
        return this.localTime;
    }

    @JsOverlay
    public final void setLocalTime(double localTime){
        this.localTime = localTime;
    }

    @JsOverlay
    public final double getProgress(){
        return this.progress;
    }

    @JsOverlay
    public final void setProgress(double progress){
        this.progress = progress;
    }

    @JsOverlay
    public final double getCurrentIteration(){
        return this.currentIteration;
    }

    @JsOverlay
    public final void setCurrentIteration(double currentIteration){
        this.currentIteration = currentIteration;
    }


}

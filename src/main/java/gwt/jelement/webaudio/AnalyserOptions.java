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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AnalyserOptions extends AudioNodeOptions{

    @JsProperty(name="fftSize")
    private double fftSize;

    @JsProperty(name="maxDecibels")
    private float maxDecibels;

    @JsProperty(name="minDecibels")
    private float minDecibels;

    @JsProperty(name="smoothingTimeConstant")
    private float smoothingTimeConstant;

    public AnalyserOptions(){
    }

    @JsOverlay
    public final double getFftSize(){
        return this.fftSize;
    }

    @JsOverlay
    public final void setFftSize(double fftSize){
        this.fftSize = fftSize;
    }

    @JsOverlay
    public final float getMaxDecibels(){
        return this.maxDecibels;
    }

    @JsOverlay
    public final void setMaxDecibels(float maxDecibels){
        this.maxDecibels = maxDecibels;
    }

    @JsOverlay
    public final float getMinDecibels(){
        return this.minDecibels;
    }

    @JsOverlay
    public final void setMinDecibels(float minDecibels){
        this.minDecibels = minDecibels;
    }

    @JsOverlay
    public final float getSmoothingTimeConstant(){
        return this.smoothingTimeConstant;
    }

    @JsOverlay
    public final void setSmoothingTimeConstant(float smoothingTimeConstant){
        this.smoothingTimeConstant = smoothingTimeConstant;
    }

}

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

import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class OscillatorOptions extends AudioNodeOptions{

    @JsProperty(name="type")
    private String type;

    @JsProperty(name="detune")
    private double detune;

    @JsProperty(name="frequency")
    private double frequency;

    @JsProperty(name="periodicWave")
    private PeriodicWave periodicWave;

    public OscillatorOptions(){
    }

    @JsOverlay
    public final OscillatorType getType(){
        return OscillatorType.of(this.type);
    }

    @JsOverlay
    public final void setType(OscillatorType type){
        this.type = type.getInternalValue();
    }

    @JsOverlay
    public final double getDetune(){
        return this.detune;
    }

    @JsOverlay
    public final void setDetune(double detune){
        this.detune = detune;
    }

    @JsOverlay
    public final double getFrequency(){
        return this.frequency;
    }

    @JsOverlay
    public final void setFrequency(double frequency){
        this.frequency = frequency;
    }

    @JsOverlay
    public final PeriodicWave getPeriodicWave(){
        return this.periodicWave;
    }

    @JsOverlay
    public final void setPeriodicWave(PeriodicWave periodicWave){
        this.periodicWave = periodicWave;
    }


}

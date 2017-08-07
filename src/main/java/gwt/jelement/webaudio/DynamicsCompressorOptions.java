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
public class DynamicsCompressorOptions extends AudioNodeOptions{

    @JsProperty(name="attack")
    private double attack;

    @JsProperty(name="knee")
    private double knee;

    @JsProperty(name="ratio")
    private double ratio;

    @JsProperty(name="release")
    private double release;

    @JsProperty(name="threshold")
    private double threshold;

    public DynamicsCompressorOptions(){
    }

    @JsOverlay
    public final double getAttack(){
        return this.attack;
    }

    @JsOverlay
    public final void setAttack(double attack){
        this.attack = attack;
    }

    @JsOverlay
    public final double getKnee(){
        return this.knee;
    }

    @JsOverlay
    public final void setKnee(double knee){
        this.knee = knee;
    }

    @JsOverlay
    public final double getRatio(){
        return this.ratio;
    }

    @JsOverlay
    public final void setRatio(double ratio){
        this.ratio = ratio;
    }

    @JsOverlay
    public final double getRelease(){
        return this.release;
    }

    @JsOverlay
    public final void setRelease(double release){
        this.release = release;
    }

    @JsOverlay
    public final double getThreshold(){
        return this.threshold;
    }

    @JsOverlay
    public final void setThreshold(double threshold){
        this.threshold = threshold;
    }


}

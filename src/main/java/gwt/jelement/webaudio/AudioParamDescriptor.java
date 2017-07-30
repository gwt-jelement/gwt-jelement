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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioParamDescriptor extends JsObject{

    @JsProperty(name="name")
    private String name;

    @JsProperty(name="defaultValue")
    private double defaultValue;

    @JsProperty(name="minValue")
    private double minValue;

    @JsProperty(name="maxValue")
    private double maxValue;

    public AudioParamDescriptor(){
    }

    @JsOverlay
    public final String getName(){
        return this.name;
    }

    @JsOverlay
    public final void setName(String name){
        this.name = name;
    }

    @JsOverlay
    public final double getDefaultValue(){
        return this.defaultValue;
    }

    @JsOverlay
    public final void setDefaultValue(double defaultValue){
        this.defaultValue = defaultValue;
    }

    @JsOverlay
    public final double getMinValue(){
        return this.minValue;
    }

    @JsOverlay
    public final void setMinValue(double minValue){
        this.minValue = minValue;
    }

    @JsOverlay
    public final double getMaxValue(){
        return this.maxValue;
    }

    @JsOverlay
    public final void setMaxValue(double maxValue){
        this.maxValue = maxValue;
    }

}

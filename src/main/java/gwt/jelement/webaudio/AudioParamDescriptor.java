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
public class AudioParamDescriptor{

    public AudioParamDescriptor(){
    }

    @JsProperty(name="name")
    public String name;

    @JsOverlay
    public final String getName(){
        return this.name;
    }

    @JsOverlay
    public final void setName(String name){
        this.name = name;
    }

    @JsProperty(name="defaultValue")
    public float defaultValue;

    @JsOverlay
    public final float getDefaultValue(){
        return this.defaultValue;
    }

    @JsOverlay
    public final void setDefaultValue(float defaultValue){
        this.defaultValue = defaultValue;
    }

    @JsProperty(name="minValue")
    public float minValue;

    @JsOverlay
    public final float getMinValue(){
        return this.minValue;
    }

    @JsOverlay
    public final void setMinValue(float minValue){
        this.minValue = minValue;
    }

    @JsProperty(name="maxValue")
    public float maxValue;

    @JsOverlay
    public final float getMaxValue(){
        return this.maxValue;
    }

    @JsOverlay
    public final void setMaxValue(float maxValue){
        this.maxValue = maxValue;
    }


}

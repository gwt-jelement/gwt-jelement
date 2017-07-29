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
package gwt.jelement.events;

import gwt.jelement.clipboard.DataTransfer;
import gwt.jelement.dom.StaticRange;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class InputEventInit extends UIEventInit{

    @JsProperty(name="data")
    private String data;

    @JsProperty(name="isComposing")
    private boolean isComposing;

    @JsProperty(name="inputType")
    private String inputType;

    @JsProperty(name="dataTransfer")
    private DataTransfer dataTransfer;

    @JsProperty(name="targetRanges")
    private StaticRange[] targetRanges;

    public InputEventInit(){
    }

    @JsOverlay
    public final String getData(){
        return this.data;
    }

    @JsOverlay
    public final void setData(String data){
        this.data = data;
    }

    @JsOverlay
    public final boolean getIsComposing(){
        return this.isComposing;
    }

    @JsOverlay
    public final void setIsComposing(boolean isComposing){
        this.isComposing = isComposing;
    }

    @JsOverlay
    public final String getInputType(){
        return this.inputType;
    }

    @JsOverlay
    public final void setInputType(String inputType){
        this.inputType = inputType;
    }

    @JsOverlay
    public final DataTransfer getDataTransfer(){
        return this.dataTransfer;
    }

    @JsOverlay
    public final void setDataTransfer(DataTransfer dataTransfer){
        this.dataTransfer = dataTransfer;
    }

    @JsOverlay
    public final StaticRange[] getTargetRanges(){
        return this.targetRanges;
    }

    @JsOverlay
    public final void setTargetRanges(StaticRange[] targetRanges){
        this.targetRanges = targetRanges;
    }

}

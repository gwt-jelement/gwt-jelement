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
package gwt.jelement.imagecapture;

import gwt.jelement.imagecapture.FillLightMode;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PhotoSettings{

    public PhotoSettings(){
    }

    @JsProperty(name="redEyeReduction")
    public boolean redEyeReduction;

    @JsOverlay
    public final boolean getRedEyeReduction(){
        return this.redEyeReduction;
    }

    @JsOverlay
    public final void setRedEyeReduction(boolean redEyeReduction){
        this.redEyeReduction = redEyeReduction;
    }

    @JsProperty(name="imageHeight")
    public double imageHeight;

    @JsOverlay
    public final double getImageHeight(){
        return this.imageHeight;
    }

    @JsOverlay
    public final void setImageHeight(double imageHeight){
        this.imageHeight = imageHeight;
    }

    @JsProperty(name="imageWidth")
    public double imageWidth;

    @JsOverlay
    public final double getImageWidth(){
        return this.imageWidth;
    }

    @JsOverlay
    public final void setImageWidth(double imageWidth){
        this.imageWidth = imageWidth;
    }

    @JsProperty(name="fillLightMode")
    public String fillLightMode;

    @JsOverlay
    public final FillLightMode getFillLightMode(){
        return FillLightMode.of(this.fillLightMode);
    }

    @JsOverlay
    public final void setFillLightMode(FillLightMode fillLightMode){
        this.fillLightMode = fillLightMode.getInternalValue();
    }


}

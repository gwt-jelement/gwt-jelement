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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PhotoSettings extends JsObject{

    @JsProperty(name="redEyeReduction")
    private boolean redEyeReduction;

    @JsProperty(name="imageHeight")
    private double imageHeight;

    @JsProperty(name="imageWidth")
    private double imageWidth;

    @JsProperty(name="fillLightMode")
    private String fillLightMode;

    public PhotoSettings(){
    }

    @JsOverlay
    public final boolean isRedEyeReduction(){
        return this.redEyeReduction;
    }

    @JsOverlay
    public final void setRedEyeReduction(boolean redEyeReduction){
        this.redEyeReduction = redEyeReduction;
    }

    @JsOverlay
    public final double getImageHeight(){
        return this.imageHeight;
    }

    @JsOverlay
    public final void setImageHeight(double imageHeight){
        this.imageHeight = imageHeight;
    }

    @JsOverlay
    public final double getImageWidth(){
        return this.imageWidth;
    }

    @JsOverlay
    public final void setImageWidth(double imageWidth){
        this.imageWidth = imageWidth;
    }

    @JsOverlay
    public final FillLightMode getFillLightMode(){
        return FillLightMode.of(this.fillLightMode);
    }

    @JsOverlay
    public final void setFillLightMode(FillLightMode fillLightMode){
        this.fillLightMode = fillLightMode.getInternalValue();
    }


}

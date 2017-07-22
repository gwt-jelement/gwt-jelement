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
import gwt.jelement.imagecapture.MediaSettingsRange;
import gwt.jelement.imagecapture.RedEyeReduction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PhotoCapabilities{
    
    @JsOverlay
    public final RedEyeReduction getRedEyeReductionAsRedEyeReduction(){
        return RedEyeReduction.of(getRedEyeReduction());
    }
    
    @JsProperty(name="redEyeReduction")
    public native String getRedEyeReduction();
    
    @JsProperty(name="imageHeight")
    public native MediaSettingsRange getImageHeight();
    
    @JsProperty(name="imageWidth")
    public native MediaSettingsRange getImageWidth();
    
    @JsOverlay
    public final FillLightMode[] getFillLightModeAsFillLightModeArray    (){
        return FillLightMode.ofArray(getFillLightMode());
    }
    
    @JsProperty(name="fillLightMode")
    public native String[] getFillLightMode();
    
    
}

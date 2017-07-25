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
package gwt.jelement.mediastream;

import gwt.jelement.imagecapture.MediaSettingsRange;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackCapabilities{

    public MediaTrackCapabilities(){
    }

    @JsProperty(name="whiteBalanceMode")
    public String[] whiteBalanceMode;

    @JsOverlay
    public final String[] getWhiteBalanceMode(){
        return this.whiteBalanceMode;
    }

    @JsOverlay
    public final void setWhiteBalanceMode(String[] whiteBalanceMode){
        this.whiteBalanceMode = whiteBalanceMode;
    }

    @JsProperty(name="exposureMode")
    public String[] exposureMode;

    @JsOverlay
    public final String[] getExposureMode(){
        return this.exposureMode;
    }

    @JsOverlay
    public final void setExposureMode(String[] exposureMode){
        this.exposureMode = exposureMode;
    }

    @JsProperty(name="focusMode")
    public String[] focusMode;

    @JsOverlay
    public final String[] getFocusMode(){
        return this.focusMode;
    }

    @JsOverlay
    public final void setFocusMode(String[] focusMode){
        this.focusMode = focusMode;
    }

    @JsProperty(name="exposureCompensation")
    public MediaSettingsRange exposureCompensation;

    @JsOverlay
    public final MediaSettingsRange getExposureCompensation(){
        return this.exposureCompensation;
    }

    @JsOverlay
    public final void setExposureCompensation(MediaSettingsRange exposureCompensation){
        this.exposureCompensation = exposureCompensation;
    }

    @JsProperty(name="colorTemperature")
    public MediaSettingsRange colorTemperature;

    @JsOverlay
    public final MediaSettingsRange getColorTemperature(){
        return this.colorTemperature;
    }

    @JsOverlay
    public final void setColorTemperature(MediaSettingsRange colorTemperature){
        this.colorTemperature = colorTemperature;
    }

    @JsProperty(name="iso")
    public MediaSettingsRange iso;

    @JsOverlay
    public final MediaSettingsRange getIso(){
        return this.iso;
    }

    @JsOverlay
    public final void setIso(MediaSettingsRange iso){
        this.iso = iso;
    }

    @JsProperty(name="brightness")
    public MediaSettingsRange brightness;

    @JsOverlay
    public final MediaSettingsRange getBrightness(){
        return this.brightness;
    }

    @JsOverlay
    public final void setBrightness(MediaSettingsRange brightness){
        this.brightness = brightness;
    }

    @JsProperty(name="contrast")
    public MediaSettingsRange contrast;

    @JsOverlay
    public final MediaSettingsRange getContrast(){
        return this.contrast;
    }

    @JsOverlay
    public final void setContrast(MediaSettingsRange contrast){
        this.contrast = contrast;
    }

    @JsProperty(name="saturation")
    public MediaSettingsRange saturation;

    @JsOverlay
    public final MediaSettingsRange getSaturation(){
        return this.saturation;
    }

    @JsOverlay
    public final void setSaturation(MediaSettingsRange saturation){
        this.saturation = saturation;
    }

    @JsProperty(name="sharpness")
    public MediaSettingsRange sharpness;

    @JsOverlay
    public final MediaSettingsRange getSharpness(){
        return this.sharpness;
    }

    @JsOverlay
    public final void setSharpness(MediaSettingsRange sharpness){
        this.sharpness = sharpness;
    }

    @JsProperty(name="zoom")
    public MediaSettingsRange zoom;

    @JsOverlay
    public final MediaSettingsRange getZoom(){
        return this.zoom;
    }

    @JsOverlay
    public final void setZoom(MediaSettingsRange zoom){
        this.zoom = zoom;
    }

    @JsProperty(name="torch")
    public boolean torch;

    @JsOverlay
    public final boolean getTorch(){
        return this.torch;
    }

    @JsOverlay
    public final void setTorch(boolean torch){
        this.torch = torch;
    }


}

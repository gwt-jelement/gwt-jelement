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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaTrackCapabilities{

    @JsProperty(name="whiteBalanceMode")
    public String[] whiteBalanceMode;

    @JsProperty(name="exposureMode")
    public String[] exposureMode;

    @JsProperty(name="focusMode")
    public String[] focusMode;

    @JsProperty(name="exposureCompensation")
    public MediaSettingsRange exposureCompensation;

    @JsProperty(name="colorTemperature")
    public MediaSettingsRange colorTemperature;

    @JsProperty(name="iso")
    public MediaSettingsRange iso;

    @JsProperty(name="brightness")
    public MediaSettingsRange brightness;

    @JsProperty(name="contrast")
    public MediaSettingsRange contrast;

    @JsProperty(name="saturation")
    public MediaSettingsRange saturation;

    @JsProperty(name="sharpness")
    public MediaSettingsRange sharpness;

    @JsProperty(name="zoom")
    public MediaSettingsRange zoom;

    @JsProperty(name="torch")
    public boolean torch;


}

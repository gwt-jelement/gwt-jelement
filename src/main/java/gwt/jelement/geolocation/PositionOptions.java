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
package gwt.jelement.geolocation;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PositionOptions extends JsObject{

    @JsProperty(name="enableHighAccuracy")
    private boolean enableHighAccuracy;

    @JsProperty(name="timeout")
    private double timeout;

    @JsProperty(name="maximumAge")
    private double maximumAge;

    public PositionOptions(){
    }

    @JsOverlay
    public final boolean isEnableHighAccuracy(){
        return this.enableHighAccuracy;
    }

    @JsOverlay
    public final void setEnableHighAccuracy(boolean enableHighAccuracy){
        this.enableHighAccuracy = enableHighAccuracy;
    }

    @JsOverlay
    public final double getTimeout(){
        return this.timeout;
    }

    @JsOverlay
    public final void setTimeout(double timeout){
        this.timeout = timeout;
    }

    @JsOverlay
    public final double getMaximumAge(){
        return this.maximumAge;
    }

    @JsOverlay
    public final void setMaximumAge(double maximumAge){
        this.maximumAge = maximumAge;
    }


}

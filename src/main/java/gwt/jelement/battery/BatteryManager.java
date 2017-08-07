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
package gwt.jelement.battery;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="BatteryManager", isNative = true)
public class BatteryManager extends EventTarget {
    @JsProperty(name="onchargingchange")
    private EventHandlerNonNull onchargingchange;
    
    @JsProperty(name="onchargingtimechange")
    private EventHandlerNonNull onchargingtimechange;
    
    @JsProperty(name="ondischargingtimechange")
    private EventHandlerNonNull ondischargingtimechange;
    
    @JsProperty(name="onlevelchange")
    private EventHandlerNonNull onlevelchange;
    
    @JsProperty(name="charging")
    public native boolean getCharging();
    
    @JsProperty(name="chargingTime")
    public native double getChargingTime();
    
    @JsProperty(name="dischargingTime")
    public native double getDischargingTime();
    
    @JsProperty(name="level")
    public native double getLevel();
    
    @JsOverlay
    public final EventHandlerNonNull getOnChargingchange(){
        return this.onchargingchange;
    }
    
    @JsOverlay
    public final void setOnChargingchange(EventHandlerNonNull onchargingchange){
        this.onchargingchange = onchargingchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnChargingtimechange(){
        return this.onchargingtimechange;
    }
    
    @JsOverlay
    public final void setOnChargingtimechange(EventHandlerNonNull onchargingtimechange){
        this.onchargingtimechange = onchargingtimechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDischargingtimechange(){
        return this.ondischargingtimechange;
    }
    
    @JsOverlay
    public final void setOnDischargingtimechange(EventHandlerNonNull ondischargingtimechange){
        this.ondischargingtimechange = ondischargingtimechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLevelchange(){
        return this.onlevelchange;
    }
    
    @JsOverlay
    public final void setOnLevelchange(EventHandlerNonNull onlevelchange){
        this.onlevelchange = onlevelchange;
    }
    
}

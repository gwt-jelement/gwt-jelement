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
package gwt.jelement.sensor;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Sensor", isNative = true)
public class Sensor extends EventTarget {
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onreading")
    private EventHandlerNonNull onreading;
    
    @JsProperty(name="onactivate")
    private EventHandlerNonNull onactivate;
    
    @JsProperty(name="activated")
    public native boolean isActivated();
    
    @JsProperty(name="timestamp")
    public native double getTimestamp();
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnReading(){
        return this.onreading;
    }
    
    @JsOverlay
    public final void setOnReading(EventHandlerNonNull onreading){
        this.onreading = onreading;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnActivate(){
        return this.onactivate;
    }
    
    @JsOverlay
    public final void setOnActivate(EventHandlerNonNull onactivate){
        this.onactivate = onactivate;
    }
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "stop")
    public native void stop();
    
}

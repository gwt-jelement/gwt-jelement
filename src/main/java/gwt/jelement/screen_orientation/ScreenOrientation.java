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
package gwt.jelement.screen_orientation;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, name="ScreenOrientation", isNative = true)
public class ScreenOrientation extends EventTarget{
    @JsProperty(name="onchange")
    private EventHandlerNonNull onchange;
    
    @JsConstructor
    public ScreenOrientation(){
        super();
    }
    
    @JsProperty(name="angle")
    public native short getAngle();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsOverlay
    public final EventHandlerNonNull getOnChange(){
        return this.onchange;
    }
    
    @JsOverlay
    public final void setOnChange(EventHandlerNonNull onchange){
        this.onchange = onchange;
    }
    
    @JsOverlay
    public final Promise lock(OrientationLockType orientation){
        return lock(orientation.getInternalValue());
    }
    
    @JsMethod(name = "lock")
    public native Promise lock(String orientation);
    
    @JsMethod(name = "unlock")
    public native void unlock();
    
}

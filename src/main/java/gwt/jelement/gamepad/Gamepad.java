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
package gwt.jelement.gamepad;

import gwt.jelement.gamepad.GamepadButton;
import gwt.jelement.gamepad.GamepadHand;
import gwt.jelement.gamepad.GamepadPose;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Gamepad{
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="index")
    public native double getIndex();
    
    @JsProperty(name="connected")
    public native boolean getConnected();
    
    @JsProperty(name="timestamp")
    public native double getTimestamp();
    
    @JsProperty(name="mapping")
    public native String getMapping();
    
    @JsProperty(name="axes")
    public native double[] getAxes();
    
    @JsProperty(name="buttons")
    public native GamepadButton[] getButtons();
    
    @JsProperty(name="pose")
    public native GamepadPose getPose();
    
    @JsOverlay
    public final GamepadHand getHandAsGamepadHand(){
        return GamepadHand.of(getHand());
    }
    
    @JsProperty(name="hand")
    public native String getHand();
    
    @JsProperty(name="displayId")
    public native double getDisplayId();
    
    
}

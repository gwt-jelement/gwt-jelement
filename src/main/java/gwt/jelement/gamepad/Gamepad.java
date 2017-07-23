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
    public String id;
    
    @JsProperty(name="index")
    public double index;
    
    @JsProperty(name="connected")
    public boolean connected;
    
    @JsProperty(name="timestamp")
    public double timestamp;
    
    @JsProperty(name="mapping")
    public String mapping;
    
    @JsProperty(name="axes")
    public double[] axes;
    
    @JsProperty(name="buttons")
    public GamepadButton[] buttons;
    
    @JsProperty(name="pose")
    public GamepadPose pose;
    
    @JsProperty(name="hand")
    public String hand;
    
    @JsOverlay
    public final GamepadHand getHand(){
       return GamepadHand.of(hand);
    }
    
    @JsProperty(name="displayId")
    public double displayId;
    
    
}

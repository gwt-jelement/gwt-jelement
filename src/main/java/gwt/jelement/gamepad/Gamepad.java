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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Gamepad", isNative = true)
public class Gamepad implements IsObject {
    @JsProperty(name="hand")
    private String hand;
    
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
    
    @JsProperty(name="displayId")
    public native double getDisplayId();
    
    @JsOverlay
    public final GamepadHand getHand(){
       return GamepadHand.of(hand);
    }
    
}

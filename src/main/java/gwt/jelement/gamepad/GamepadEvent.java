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

import gwt.jelement.events.Event;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="GamepadEvent", isNative = true)
public class GamepadEvent extends Event {
    @JsConstructor
    public GamepadEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public GamepadEvent(String type, GamepadEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="gamepad")
    public native Gamepad getGamepad();
    
}

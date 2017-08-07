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
package gwt.jelement.events;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="WheelEvent", isNative = true)
public class WheelEvent extends MouseEvent {
    public static double DOM_DELTA_PIXEL; /* 0x00 */
    public static double DOM_DELTA_LINE; /* 0x01 */
    public static double DOM_DELTA_PAGE; /* 0x02 */
    
    @JsConstructor
    public WheelEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public WheelEvent(String type, WheelEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="deltaX")
    public native double getDeltaX();
    
    @JsProperty(name="deltaY")
    public native double getDeltaY();
    
    @JsProperty(name="deltaZ")
    public native double getDeltaZ();
    
    @JsProperty(name="deltaMode")
    public native double getDeltaMode();
    
    @JsProperty(name="wheelDeltaX")
    public native double getWheelDeltaX();
    
    @JsProperty(name="wheelDeltaY")
    public native double getWheelDeltaY();
    
    @JsProperty(name="wheelDelta")
    public native double getWheelDelta();
    
}

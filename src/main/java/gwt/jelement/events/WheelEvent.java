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

import gwt.jelement.events.MouseEvent;
import gwt.jelement.events.WheelEventInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WheelEvent extends MouseEvent{
    public static int DOM_DELTA_PIXEL;
    public static int DOM_DELTA_LINE;
    public static int DOM_DELTA_PAGE;
    
    
    @JsConstructor
    public WheelEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public WheelEvent(String type, WheelEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="deltaX")
    public double deltaX;
    
    @JsProperty(name="deltaY")
    public double deltaY;
    
    @JsProperty(name="deltaZ")
    public double deltaZ;
    
    @JsProperty(name="deltaMode")
    public double deltaMode;
    
    @JsProperty(name="wheelDeltaX")
    public double wheelDeltaX;
    
    @JsProperty(name="wheelDeltaY")
    public double wheelDeltaY;
    
    @JsProperty(name="wheelDelta")
    public double wheelDelta;
    
    
}

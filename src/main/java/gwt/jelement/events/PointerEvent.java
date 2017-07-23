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
import gwt.jelement.events.PointerEvent;
import gwt.jelement.events.PointerEventInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PointerEvent extends MouseEvent{
    
    @JsConstructor
    public PointerEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public PointerEvent(String type, PointerEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="pointerId")
    public double pointerId;
    
    @JsProperty(name="width")
    public double width;
    
    @JsProperty(name="height")
    public double height;
    
    @JsProperty(name="pressure")
    public float pressure;
    
    @JsProperty(name="tiltX")
    public double tiltX;
    
    @JsProperty(name="tiltY")
    public double tiltY;
    
    @JsProperty(name="tangentialPressure")
    public float tangentialPressure;
    
    @JsProperty(name="twist")
    public double twist;
    
    @JsProperty(name="pointerType")
    public String pointerType;
    
    @JsProperty(name="isPrimary")
    public boolean isPrimary;
    
    @JsMethod(name = "getCoalescedEvents")
    public native PointerEvent[] getCoalescedEvents();
    
}

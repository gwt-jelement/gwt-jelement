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

import gwt.jelement.events.MouseEventInit;
import gwt.jelement.events.PointerEvent;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PointerEventInit extends MouseEventInit{

    @JsProperty(name="pointerId")
    public long pointerId = 0;

    @JsProperty(name="width")
    public double width = 1;

    @JsProperty(name="height")
    public double height = 1;

    @JsProperty(name="pressure")
    public float pressure = 0;

    @JsProperty(name="tiltX")
    public long tiltX = 0;

    @JsProperty(name="tiltY")
    public long tiltY = 0;

    @JsProperty(name="tangentialPressure")
    public float tangentialPressure = 0;

    @JsProperty(name="twist")
    public long twist = 0;

    @JsProperty(name="pointerType")
    public String pointerType = "";

    @JsProperty(name="isPrimary")
    public boolean isPrimary = false;

    @JsProperty(name="coalescedEvents")
    public PointerEvent[] coalescedEvents = new PointerEvent[0];


}

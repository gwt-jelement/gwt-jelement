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

import gwt.jelement.events.EventModifierInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MouseEventInit extends EventModifierInit{

    @JsProperty(name="screenX")
    public double screenX;

    @JsProperty(name="screenY")
    public double screenY;

    @JsProperty(name="clientX")
    public double clientX;

    @JsProperty(name="clientY")
    public double clientY;

    @JsProperty(name="button")
    public short button;

    @JsProperty(name="buttons")
    public short buttons;

    @JsProperty(name="relatedTarget")
    public EventTarget relatedTarget;

    @JsProperty(name="movementX")
    public double movementX;

    @JsProperty(name="movementY")
    public double movementY;

    @JsProperty(name="region")
    public String region;


}

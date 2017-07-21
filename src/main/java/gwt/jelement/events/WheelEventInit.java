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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WheelEventInit extends MouseEventInit{

    @JsProperty(name="deltaX")
    public double deltaX = 0.0;

    @JsProperty(name="deltaY")
    public double deltaY = 0.0;

    @JsProperty(name="deltaZ")
    public double deltaZ = 0.0;

    @JsProperty(name="deltaMode")
    public long deltaMode = 0;

    @JsProperty(name="wheelDeltaX")
    public long wheelDeltaX = 0;

    @JsProperty(name="wheelDeltaY")
    public long wheelDeltaY = 0;


}

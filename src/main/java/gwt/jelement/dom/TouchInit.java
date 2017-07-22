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
package gwt.jelement.dom;

import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TouchInit{

    @JsProperty(name="identifier")
    public double identifier;

    @JsProperty(name="target")
    public EventTarget target;

    @JsProperty(name="clientX")
    public double clientX;

    @JsProperty(name="clientY")
    public double clientY;

    @JsProperty(name="screenX")
    public double screenX;

    @JsProperty(name="screenY")
    public double screenY;

    @JsProperty(name="pageX")
    public double pageX;

    @JsProperty(name="pageY")
    public double pageY;

    @JsProperty(name="radiusX")
    public float radiusX;

    @JsProperty(name="radiusY")
    public float radiusY;

    @JsProperty(name="rotationAngle")
    public float rotationAngle;

    @JsProperty(name="force")
    public float force;

    @JsProperty(name="region")
    public String region;


}

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
    public long identifier;

    @JsProperty(name="target")
    public EventTarget target;

    @JsProperty(name="clientX")
    public double clientX = 0;

    @JsProperty(name="clientY")
    public double clientY = 0;

    @JsProperty(name="screenX")
    public double screenX = 0;

    @JsProperty(name="screenY")
    public double screenY = 0;

    @JsProperty(name="pageX")
    public double pageX = 0;

    @JsProperty(name="pageY")
    public double pageY = 0;

    @JsProperty(name="radiusX")
    public float radiusX = 0;

    @JsProperty(name="radiusY")
    public float radiusY = 0;

    @JsProperty(name="rotationAngle")
    public float rotationAngle = 0;

    @JsProperty(name="force")
    public float force = 0;

    @JsProperty(name="region")
    public String region = null;


}

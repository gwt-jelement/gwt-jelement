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

import gwt.jelement.clipboard.DataTransfer;
import gwt.jelement.dom.StaticRange;
import gwt.jelement.events.UIEventInit;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class InputEventInit extends UIEventInit{

    @JsProperty(name="data")
    public String data;

    @JsProperty(name="isComposing")
    public boolean isComposing = false;

    @JsProperty(name="inputType")
    public String inputType = "";

    @JsProperty(name="dataTransfer")
    public DataTransfer dataTransfer;

    @JsProperty(name="targetRanges")
    public StaticRange[] targetRanges = new StaticRange[0];


}

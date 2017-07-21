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
package gwt.jelement.page.scrolling;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollStateInit{

    @JsProperty(name="deltaX")
    public double deltaX = 0;

    @JsProperty(name="deltaY")
    public double deltaY = 0;

    @JsProperty(name="deltaXHint")
    public double deltaXHint = 0;

    @JsProperty(name="deltaYHint")
    public double deltaYHint = 0;

    @JsProperty(name="positionX")
    public long positionX = 0;

    @JsProperty(name="positionY")
    public long positionY = 0;

    @JsProperty(name="velocityX")
    public double velocityX = 0;

    @JsProperty(name="velocityY")
    public double velocityY = 0;

    @JsProperty(name="isBeginning")
    public boolean isBeginning = false;

    @JsProperty(name="isInInertialPhase")
    public boolean isInInertialPhase = false;

    @JsProperty(name="isEnding")
    public boolean isEnding = false;

    @JsProperty(name="shouldPropagate")
    public boolean shouldPropagate = true;

    @JsProperty(name="fromUserInput")
    public boolean fromUserInput = false;

    @JsProperty(name="isDirectManipulation")
    public boolean isDirectManipulation = false;

    @JsProperty(name="deltaGranularity")
    public double deltaGranularity = 0;


}

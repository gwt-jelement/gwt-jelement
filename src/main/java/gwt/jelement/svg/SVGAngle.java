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
package gwt.jelement.svg;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGAngle{
    public static final int SVG_ANGLETYPE_UNKNOWN = 0;
    public static final int SVG_ANGLETYPE_UNSPECIFIED = 1;
    public static final int SVG_ANGLETYPE_DEG = 2;
    public static final int SVG_ANGLETYPE_RAD = 3;
    public static final int SVG_ANGLETYPE_GRAD = 4;
    
    
    @JsProperty(name="value")
    public float value;
    
    @JsProperty(name="valueInSpecifiedUnits")
    public float valueInSpecifiedUnits;
    
    @JsProperty(name="valueAsString")
    public String valueAsString;
    
    @JsProperty(name="unitType")
    public native short getUnitType();
    
    @JsMethod(name = "convertToSpecifiedUnits")
    public native void convertToSpecifiedUnits(short unitType);
    
    @JsMethod(name = "newValueSpecifiedUnits")
    public native void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits);
    
}

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
public class SVGLength{
    public static int SVG_LENGTHTYPE_UNKNOWN;
    public static int SVG_LENGTHTYPE_NUMBER;
    public static int SVG_LENGTHTYPE_PERCENTAGE;
    public static int SVG_LENGTHTYPE_EMS;
    public static int SVG_LENGTHTYPE_EXS;
    public static int SVG_LENGTHTYPE_PX;
    public static int SVG_LENGTHTYPE_CM;
    public static int SVG_LENGTHTYPE_MM;
    public static int SVG_LENGTHTYPE_IN;
    public static int SVG_LENGTHTYPE_PT;
    public static int SVG_LENGTHTYPE_PC;
    
    
    @JsProperty(name="unitType")
    public short unitType;
    
    @JsProperty(name="value")
    public float value;
    
    @JsProperty(name="valueInSpecifiedUnits")
    public float valueInSpecifiedUnits;
    
    @JsProperty(name="valueAsString")
    public String valueAsString;
    
    @JsMethod(name = "convertToSpecifiedUnits")
    public native void convertToSpecifiedUnits(short unitType);
    
    @JsMethod(name = "newValueSpecifiedUnits")
    public native void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits);
    
}

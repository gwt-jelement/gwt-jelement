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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SVGLength", isNative = true)
public class SVGLength implements IsObject {
    public static short SVG_LENGTHTYPE_UNKNOWN; /* 0 */
    public static short SVG_LENGTHTYPE_NUMBER; /* 1 */
    public static short SVG_LENGTHTYPE_PERCENTAGE; /* 2 */
    public static short SVG_LENGTHTYPE_EMS; /* 3 */
    public static short SVG_LENGTHTYPE_EXS; /* 4 */
    public static short SVG_LENGTHTYPE_PX; /* 5 */
    public static short SVG_LENGTHTYPE_CM; /* 6 */
    public static short SVG_LENGTHTYPE_MM; /* 7 */
    public static short SVG_LENGTHTYPE_IN; /* 8 */
    public static short SVG_LENGTHTYPE_PT; /* 9 */
    public static short SVG_LENGTHTYPE_PC; /* 10 */
    
    @JsProperty(name="unitType")
    public native short getUnitType();
    
    @JsProperty(name="value")
    public native double getValue();
    
    @JsProperty(name="value")
    public native void setValue(double value);
    
    @JsProperty(name="valueInSpecifiedUnits")
    public native double getValueInSpecifiedUnits();
    
    @JsProperty(name="valueInSpecifiedUnits")
    public native void setValueInSpecifiedUnits(double valueInSpecifiedUnits);
    
    @JsProperty(name="valueAsString")
    public native String getValueAsString();
    
    @JsProperty(name="valueAsString")
    public native void setValueAsString(String valueAsString);
    
    @JsMethod(name = "convertToSpecifiedUnits")
    public native void convertToSpecifiedUnits(short unitType);
    
    @JsMethod(name = "newValueSpecifiedUnits")
    public native void newValueSpecifiedUnits(short unitType, double valueInSpecifiedUnits);
    
}

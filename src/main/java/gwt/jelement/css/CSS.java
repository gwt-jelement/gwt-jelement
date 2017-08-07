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
package gwt.jelement.css;

import gwt.jelement.core.IsObject;
import gwt.jelement.css.cssom.CSSUnitValue;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CSS", isNative = true)
public class CSS implements IsObject {
    @JsMethod(name = "Hz")
    public static native CSSUnitValue Hz(double value);
    
    @JsMethod(name = "ch")
    public static native CSSUnitValue ch(double value);
    
    @JsMethod(name = "cm")
    public static native CSSUnitValue cm(double value);
    
    @JsMethod(name = "deg")
    public static native CSSUnitValue deg(double value);
    
    @JsMethod(name = "dpcm")
    public static native CSSUnitValue dpcm(double value);
    
    @JsMethod(name = "dpi")
    public static native CSSUnitValue dpi(double value);
    
    @JsMethod(name = "dppx")
    public static native CSSUnitValue dppx(double value);
    
    @JsMethod(name = "em")
    public static native CSSUnitValue em(double value);
    
    @JsMethod(name = "escape")
    public static native String escape(String ident);
    
    @JsMethod(name = "ex")
    public static native CSSUnitValue ex(double value);
    
    @JsMethod(name = "fr")
    public static native CSSUnitValue fr(double value);
    
    @JsMethod(name = "grad")
    public static native CSSUnitValue grad(double value);
    
    @JsMethod(name = "in")
    public static native CSSUnitValue in(double value);
    
    @JsMethod(name = "kHz")
    public static native CSSUnitValue kHz(double value);
    
    @JsMethod(name = "mm")
    public static native CSSUnitValue mm(double value);
    
    @JsMethod(name = "ms")
    public static native CSSUnitValue ms(double value);
    
    @JsMethod(name = "number")
    public static native CSSUnitValue number(double value);
    
    @JsMethod(name = "pc")
    public static native CSSUnitValue pc(double value);
    
    @JsMethod(name = "percent")
    public static native CSSUnitValue percent(double value);
    
    @JsMethod(name = "pt")
    public static native CSSUnitValue pt(double value);
    
    @JsMethod(name = "px")
    public static native CSSUnitValue px(double value);
    
    @JsMethod(name = "rad")
    public static native CSSUnitValue rad(double value);
    
    @JsMethod(name = "registerProperty")
    public static native void registerProperty(PropertyDescriptor descriptor);
    
    @JsMethod(name = "rem")
    public static native CSSUnitValue rem(double value);
    
    @JsMethod(name = "s")
    public static native CSSUnitValue s(double value);
    
    @JsMethod(name = "supports")
    public static native boolean supports(String conditionText);
    
    @JsMethod(name = "supports")
    public static native boolean supports(String property, String value);
    
    @JsMethod(name = "turn")
    public static native CSSUnitValue turn(double value);
    
    @JsMethod(name = "vh")
    public static native CSSUnitValue vh(double value);
    
    @JsMethod(name = "vmax")
    public static native CSSUnitValue vmax(double value);
    
    @JsMethod(name = "vmin")
    public static native CSSUnitValue vmin(double value);
    
    @JsMethod(name = "vw")
    public static native CSSUnitValue vw(double value);
    
}

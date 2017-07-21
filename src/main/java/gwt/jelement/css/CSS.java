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

import gwt.jelement.css.PropertyDescriptor;
import gwt.jelement.css.cssom.CSSUnitValue;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CSS{
    
    @JsMethod(name = "Hz")
    public native CSSUnitValue Hz(double value);
    
    @JsMethod(name = "ch")
    public native CSSUnitValue ch(double value);
    
    @JsMethod(name = "cm")
    public native CSSUnitValue cm(double value);
    
    @JsMethod(name = "deg")
    public native CSSUnitValue deg(double value);
    
    @JsMethod(name = "dpcm")
    public native CSSUnitValue dpcm(double value);
    
    @JsMethod(name = "dpi")
    public native CSSUnitValue dpi(double value);
    
    @JsMethod(name = "dppx")
    public native CSSUnitValue dppx(double value);
    
    @JsMethod(name = "em")
    public native CSSUnitValue em(double value);
    
    @JsMethod(name = "escape")
    public native String escape(String ident);
    
    @JsMethod(name = "ex")
    public native CSSUnitValue ex(double value);
    
    @JsMethod(name = "fr")
    public native CSSUnitValue fr(double value);
    
    @JsMethod(name = "grad")
    public native CSSUnitValue grad(double value);
    
    @JsMethod(name = "in")
    public native CSSUnitValue in(double value);
    
    @JsMethod(name = "kHz")
    public native CSSUnitValue kHz(double value);
    
    @JsMethod(name = "mm")
    public native CSSUnitValue mm(double value);
    
    @JsMethod(name = "ms")
    public native CSSUnitValue ms(double value);
    
    @JsMethod(name = "number")
    public native CSSUnitValue number(double value);
    
    @JsMethod(name = "pc")
    public native CSSUnitValue pc(double value);
    
    @JsMethod(name = "percent")
    public native CSSUnitValue percent(double value);
    
    @JsMethod(name = "pt")
    public native CSSUnitValue pt(double value);
    
    @JsMethod(name = "px")
    public native CSSUnitValue px(double value);
    
    @JsMethod(name = "rad")
    public native CSSUnitValue rad(double value);
    
    @JsMethod(name = "registerProperty")
    public native void registerProperty(PropertyDescriptor descriptor);
    
    @JsMethod(name = "rem")
    public native CSSUnitValue rem(double value);
    
    @JsMethod(name = "s")
    public native CSSUnitValue s(double value);
    
    @JsMethod(name = "supports")
    public native boolean supports(String conditionText);
    
    @JsMethod(name = "supports")
    public native boolean supports(String property, String value);
    
    @JsMethod(name = "turn")
    public native CSSUnitValue turn(double value);
    
    @JsMethod(name = "vh")
    public native CSSUnitValue vh(double value);
    
    @JsMethod(name = "vmax")
    public native CSSUnitValue vmax(double value);
    
    @JsMethod(name = "vmin")
    public native CSSUnitValue vmin(double value);
    
    @JsMethod(name = "vw")
    public native CSSUnitValue vw(double value);
    
}

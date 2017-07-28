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

import gwt.jelement.css.CSSRule;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="CSSStyleDeclaration", isNative = true)
public class CSSStyleDeclaration{
    @JsProperty(name="cssText")
    public native String getCssText();
    
    @JsProperty(name="cssText")
    public native void setCssText(String cssText);
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsProperty(name="parentRule")
    public native CSSRule getParentRule();
    
    @JsProperty(name="cssFloat")
    public native String getCssFloat();
    
    @JsProperty(name="cssFloat")
    public native void setCssFloat(String cssFloat);
    
    @JsMethod(name = "getPropertyPriority")
    public native String getPropertyPriority(String property);
    
    @JsMethod(name = "getPropertyValue")
    public native String getPropertyValue(String property);
    
    @JsMethod(name = "removeProperty")
    public native String removeProperty(String property);
    
    @JsMethod(name = "setProperty")
    public native void setProperty(String property, String value);
    
    @JsMethod(name = "setProperty")
    public native void setProperty(String property, String value, String priority);
    
}

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
import gwt.jelement.css.CSSRuleList;
import gwt.jelement.css.StyleSheet;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CSSStyleSheet extends StyleSheet{
    
    @JsConstructor
    public CSSStyleSheet(){
        super();
    }
    
    @JsProperty(name="ownerRule")
    public native CSSRule getOwnerRule();
    
    @JsProperty(name="cssRules")
    public native CSSRuleList getCssRules();
    
    @JsProperty(name="rules")
    public native CSSRuleList getRules();
    
    @JsMethod(name = "addRule")
    public native double addRule();
    
    
    @JsMethod(name = "addRule")
    public native double addRule(String selector);
    
    
    @JsMethod(name = "addRule")
    public native double addRule(String selector, String style);
    
    
    @JsMethod(name = "addRule")
    public native double addRule(String selector, String style, double index);
    
    
    @JsMethod(name = "deleteRule")
    public native void deleteRule(double index);
    
    
    @JsMethod(name = "insertRule")
    public native double insertRule(String rule);
    
    
    @JsMethod(name = "insertRule")
    public native double insertRule(String rule, double index);
    
    
    @JsMethod(name = "removeRule")
    public native void removeRule();
    
    
    @JsMethod(name = "removeRule")
    public native void removeRule(double index);
    
    
}

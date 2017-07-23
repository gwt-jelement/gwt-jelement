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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.svg.SVGElement;
import gwt.jelement.svg.SVGStringList;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGAnimationElement extends SVGElement{
    
    @JsConstructor
    public SVGAnimationElement(){
        super();
    }
    
    @JsProperty(name="targetElement")
    public SVGElement targetElement;
    
    @JsProperty(name="onbegin")
    public EventHandlerNonNull onbegin;
    
    @JsProperty(name="onend")
    public EventHandlerNonNull onend;
    
    @JsProperty(name="onrepeat")
    public EventHandlerNonNull onrepeat;
    
    @JsProperty(name="requiredExtensions")
    public SVGStringList requiredExtensions;
    
    @JsProperty(name="systemLanguage")
    public SVGStringList systemLanguage;
    
    @JsMethod(name = "beginElement")
    public native void beginElement();
    
    @JsMethod(name = "beginElementAt")
    public native void beginElementAt(float offset);
    
    @JsMethod(name = "endElement")
    public native void endElement();
    
    @JsMethod(name = "endElementAt")
    public native void endElementAt(float offset);
    
    @JsMethod(name = "getCurrentTime")
    public native float getCurrentTime();
    
    @JsMethod(name = "getSimpleDuration")
    public native float getSimpleDuration();
    
    @JsMethod(name = "getStartTime")
    public native float getStartTime();
    
}

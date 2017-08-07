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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SVGAnimationElement", isNative = true)
public class SVGAnimationElement extends SVGElement {
    @JsProperty(name="onbegin")
    private EventHandlerNonNull onbegin;
    
    @JsProperty(name="onend")
    private EventHandlerNonNull onend;
    
    @JsProperty(name="onrepeat")
    private EventHandlerNonNull onrepeat;
    
    @JsProperty(name="targetElement")
    public native SVGElement getTargetElement();
    
    @JsOverlay
    public final EventHandlerNonNull getOnBegin(){
        return this.onbegin;
    }
    
    @JsOverlay
    public final void setOnBegin(EventHandlerNonNull onbegin){
        this.onbegin = onbegin;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnd(){
        return this.onend;
    }
    
    @JsOverlay
    public final void setOnEnd(EventHandlerNonNull onend){
        this.onend = onend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRepeat(){
        return this.onrepeat;
    }
    
    @JsOverlay
    public final void setOnRepeat(EventHandlerNonNull onrepeat){
        this.onrepeat = onrepeat;
    }
    
    @JsProperty(name="requiredExtensions")
    public native SVGStringList getRequiredExtensions();
    
    @JsProperty(name="systemLanguage")
    public native SVGStringList getSystemLanguage();
    
    @JsMethod(name = "beginElement")
    public native void beginElement();
    
    @JsMethod(name = "beginElementAt")
    public native void beginElementAt(double offset);
    
    @JsMethod(name = "endElement")
    public native void endElement();
    
    @JsMethod(name = "endElementAt")
    public native void endElementAt(double offset);
    
    @JsMethod(name = "getCurrentTime")
    public native double getCurrentTime();
    
    @JsMethod(name = "getSimpleDuration")
    public native double getSimpleDuration();
    
    @JsMethod(name = "getStartTime")
    public native double getStartTime();
    
}

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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventListener;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaQueryList", isNative = true)
public class MediaQueryList extends EventTarget{
    @JsProperty(name="onchange")
    private EventHandlerNonNull onchange;
    
    @JsProperty(name="media")
    public native String getMedia();
    
    @JsProperty(name="matches")
    public native boolean getMatches();
    
    @JsOverlay
    public final EventHandlerNonNull getOnChange(){
        return this.onchange;
    }
    
    @JsOverlay
    public final void setOnChange(EventHandlerNonNull onchange){
        this.onchange = onchange;
    }
    
    @JsMethod(name = "addListener")
    public native void addListener(EventListener listener);
    
    @JsMethod(name = "removeListener")
    public native void removeListener(EventListener listener);
    
}

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
package gwt.jelement.html.track;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TextTrackList", isNative = true)
public class TextTrackList extends EventTarget{
    @JsProperty(name="onchange")
    private EventHandlerNonNull onchange;
    
    @JsProperty(name="onaddtrack")
    private EventHandlerNonNull onaddtrack;
    
    @JsProperty(name="onremovetrack")
    private EventHandlerNonNull onremovetrack;
    
    @JsConstructor
    public TextTrackList(){
        super();
    }
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsOverlay
    public final EventHandlerNonNull getOnChange(){
        return this.onchange;
    }
    
    @JsOverlay
    public final void setOnChange(EventHandlerNonNull onchange){
        this.onchange = onchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAddtrack(){
        return this.onaddtrack;
    }
    
    @JsOverlay
    public final void setOnAddtrack(EventHandlerNonNull onaddtrack){
        this.onaddtrack = onaddtrack;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRemovetrack(){
        return this.onremovetrack;
    }
    
    @JsOverlay
    public final void setOnRemovetrack(EventHandlerNonNull onremovetrack){
        this.onremovetrack = onremovetrack;
    }
    
    @JsMethod(name = "getTrackById")
    public native TextTrack getTrackById(String id);
    
}

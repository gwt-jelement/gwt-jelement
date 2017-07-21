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
import gwt.jelement.html.track.TextTrack;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TextTrackCue extends EventTarget{
    
    @JsConstructor
    public TextTrackCue(){
        super();
    }
    
    @JsProperty(name="id")
    public String id;
    
    @JsProperty(name="startTime")
    public double startTime;
    
    @JsProperty(name="endTime")
    public double endTime;
    
    @JsProperty(name="pauseOnExit")
    public boolean pauseOnExit;
    
    @JsProperty(name="onenter")
    public EventHandlerNonNull onenter;
    
    @JsProperty(name="onexit")
    public EventHandlerNonNull onexit;
    
    @JsProperty(name="track")
    public native TextTrack getTrack();
    
    
}

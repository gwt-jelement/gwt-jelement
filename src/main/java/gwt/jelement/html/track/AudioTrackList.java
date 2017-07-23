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
import gwt.jelement.html.track.AudioTrack;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AudioTrackList extends EventTarget{
    
    @JsConstructor
    public AudioTrackList(){
        super();
    }
    
    @JsProperty(name="length")
    public double length;
    
    @JsProperty(name="onchange")
    public EventHandlerNonNull onchange;
    
    @JsProperty(name="onaddtrack")
    public EventHandlerNonNull onaddtrack;
    
    @JsProperty(name="onremovetrack")
    public EventHandlerNonNull onremovetrack;
    
    @JsMethod(name = "getTrackById")
    public native AudioTrack getTrackById(String id);
    
}

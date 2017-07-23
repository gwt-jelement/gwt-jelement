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
package gwt.jelement.webmidi;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.webmidi.MIDIPortConnectionState;
import gwt.jelement.webmidi.MIDIPortDeviceState;
import gwt.jelement.webmidi.MIDIPortType;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MIDIPort extends EventTarget{
    
    @JsConstructor
    public MIDIPort(){
        super();
    }
    
    @JsProperty(name="connection")
    public String connection;
    @JsOverlay
    public final MIDIPortConnectionState getConnection(){
       return MIDIPortConnectionState.of(connection);
    }
    
    @JsProperty(name="id")
    public String id;
    
    @JsProperty(name="manufacturer")
    public String manufacturer;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="state")
    public String state;
    @JsOverlay
    public final MIDIPortDeviceState getState(){
       return MIDIPortDeviceState.of(state);
    }
    
    @JsProperty(name="type")
    public String type;
    @JsOverlay
    public final MIDIPortType getType(){
       return MIDIPortType.of(type);
    }
    
    @JsProperty(name="version")
    public String version;
    
    @JsProperty(name="onstatechange")
    public EventHandlerNonNull onstatechange;
    
    @JsMethod(name = "close")
    public native Promise close();
    
    @JsMethod(name = "open")
    public native Promise open();
    
}

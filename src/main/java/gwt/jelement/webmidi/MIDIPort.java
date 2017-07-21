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
    
    @JsProperty(name="onstatechange")
    public EventHandlerNonNull onstatechange;
    
    @JsOverlay
    public  MIDIPortConnectionState getConnectionAsMIDIPortConnectionState(){
        return MIDIPortConnectionState.of(getConnection());
    }
    
    @JsProperty(name="connection")
    public native String getConnection();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="manufacturer")
    public native String getManufacturer();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsOverlay
    public  MIDIPortDeviceState getStateAsMIDIPortDeviceState(){
        return MIDIPortDeviceState.of(getState());
    }
    
    @JsProperty(name="state")
    public native String getState();
    
    @JsOverlay
    public  MIDIPortType getTypeAsMIDIPortType(){
        return MIDIPortType.of(getType());
    }
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="version")
    public native String getVersion();
    
    @JsMethod(name = "close")
    public native Promise close();
    
    @JsMethod(name = "open")
    public native Promise open();
    
}

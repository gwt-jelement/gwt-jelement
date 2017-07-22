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
package gwt.jelement.netinfo;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.netinfo.ConnectionType;
import gwt.jelement.netinfo.EffectiveConnectionType;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class NetworkInformation extends EventTarget{
    
    @JsConstructor
    public NetworkInformation(){
        super();
    }
    
    @JsProperty(name="onchange")
    public EventHandlerNonNull onchange;
    
    @JsProperty(name="ontypechange")
    public EventHandlerNonNull ontypechange;
    
    @JsOverlay
    public final ConnectionType getTypeAsConnectionType(){
        return ConnectionType.of(getType());
    }
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="downlinkMax")
    public native double getDownlinkMax();
    
    @JsOverlay
    public final EffectiveConnectionType getEffectiveTypeAsEffectiveConnectionType(){
        return EffectiveConnectionType.of(getEffectiveType());
    }
    
    @JsProperty(name="effectiveType")
    public native String getEffectiveType();
    
    @JsProperty(name="rtt")
    public native double getRtt();
    
    @JsProperty(name="downlink")
    public native double getDownlink();
    
    
}

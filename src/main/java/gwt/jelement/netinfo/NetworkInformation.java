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
    
    @JsProperty(name="type")
    public String type;
    @JsOverlay
    public final ConnectionType getType(){
       return ConnectionType.of(type);
    }
    
    @JsProperty(name="downlinkMax")
    public double downlinkMax;
    
    @JsProperty(name="onchange")
    public EventHandlerNonNull onchange;
    
    @JsProperty(name="ontypechange")
    public EventHandlerNonNull ontypechange;
    
    @JsProperty(name="effectiveType")
    public String effectiveType;
    @JsOverlay
    public final EffectiveConnectionType getEffectiveType(){
       return EffectiveConnectionType.of(effectiveType);
    }
    
    @JsProperty(name="rtt")
    public double rtt;
    
    @JsProperty(name="downlink")
    public double downlink;
    
    
}

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
package gwt.jelement.remoteplayback;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.remoteplayback.RemotePlaybackAvailabilityCallback;
import gwt.jelement.remoteplayback.RemotePlaybackState;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class RemotePlayback extends EventTarget{
    
    @JsConstructor
    public RemotePlayback(){
        super();
    }
    
    @JsProperty(name="onconnecting")
    public EventHandlerNonNull onconnecting;
    
    @JsProperty(name="onconnect")
    public EventHandlerNonNull onconnect;
    
    @JsProperty(name="ondisconnect")
    public EventHandlerNonNull ondisconnect;
    
    @JsOverlay
    public  RemotePlaybackState getStateAsRemotePlaybackState(){
        return RemotePlaybackState.of(getState());
    }
    
    @JsProperty(name="state")
    public native String getState();
    
    @JsMethod(name = "cancelWatchAvailability")
    public native Promise<Void> cancelWatchAvailability();
    
    @JsMethod(name = "cancelWatchAvailability")
    public native Promise<Void> cancelWatchAvailability(long id);
    
    @JsMethod(name = "prompt")
    public native Promise<Void> prompt();
    
    @JsMethod(name = "watchAvailability")
    public native Promise<Long> watchAvailability(RemotePlaybackAvailabilityCallback callback);
    
}

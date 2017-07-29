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
package gwt.jelement.mediastream;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaDevices", isNative = true)
public class MediaDevices extends EventTarget{
    @JsProperty(name="ondevicechange")
    private EventHandlerNonNull ondevicechange;
    
    @JsConstructor
    public MediaDevices(){
        super();
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDevicechange(){
        return this.ondevicechange;
    }
    
    @JsOverlay
    public final void setOnDevicechange(EventHandlerNonNull ondevicechange){
        this.ondevicechange = ondevicechange;
    }
    
    @JsMethod(name = "enumerateDevices")
    public native Promise<MediaDeviceInfo[]> enumerateDevices();
    
    @JsMethod(name = "getSupportedConstraints")
    public native MediaTrackSupportedConstraints getSupportedConstraints();
    
    @JsMethod(name = "getUserMedia")
    public native Promise<MediaStream> getUserMedia();
    
    @JsMethod(name = "getUserMedia")
    public native Promise<MediaStream> getUserMedia(MediaStreamConstraints constraints);
    
}

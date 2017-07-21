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
package gwt.jelement.webaudio;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.webaudio.AudioBuffer;
import gwt.jelement.webaudio.BaseAudioContext;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class OfflineAudioContext extends BaseAudioContext{
    
    @JsConstructor
    public OfflineAudioContext(long numberOfChannels, long numberOfFrames, float sampleRate){
        super();
    }
    
    @JsProperty(name="oncomplete")
    public EventHandlerNonNull oncomplete;
    
    @JsProperty(name="length")
    public native long getLength();
    
    @JsMethod(name = "startRendering")
    public native Promise<AudioBuffer> startRendering();
    
    @JsMethod(name = "suspend")
    public native Promise<Void> suspend(double suspendTime);
    
}

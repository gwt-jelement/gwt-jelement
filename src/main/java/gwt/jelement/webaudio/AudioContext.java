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

import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AudioContext", isNative = true)
public class AudioContext extends BaseAudioContext{
    @JsConstructor
    public AudioContext(){
        super();
    }
    
    @JsConstructor
    public AudioContext(AudioContextOptions contextOptions){
        super();
    }
    
    @JsProperty(name="baseLatency")
    public native double getBaseLatency();
    
    @JsMethod(name = "close")
    public native Promise<Void> close();
    
    @JsMethod(name = "getOutputTimestamp")
    public native AudioTimestamp getOutputTimestamp();
    
    @JsMethod(name = "suspend")
    public native Promise<Void> suspend();
    
}

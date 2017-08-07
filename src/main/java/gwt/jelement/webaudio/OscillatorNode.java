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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="OscillatorNode", isNative = true)
public class OscillatorNode extends AudioScheduledSourceNode {
    @JsProperty(name="type")
    private String type;
    
    @JsConstructor
    public OscillatorNode(BaseAudioContext context){
        super();
    }
    
    @JsConstructor
    public OscillatorNode(BaseAudioContext context, OscillatorOptions options){
        super();
    }
    
    @JsProperty(name="frequency")
    public native AudioParam getFrequency();
    
    @JsProperty(name="detune")
    public native AudioParam getDetune();
    
    @JsOverlay
    public final OscillatorType getType(){
       return OscillatorType.of(type);
    }
    
    @JsOverlay
    public final void setType(OscillatorType type){
       this.type = type.getInternalValue();
    }
    
    @JsMethod(name = "setPeriodicWave")
    public native void setPeriodicWave(PeriodicWave periodicWave);
    
}

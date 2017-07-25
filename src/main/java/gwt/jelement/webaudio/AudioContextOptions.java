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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioContextOptions{

    public AudioContextOptions(){
    }

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface LatencyHintUnion {
        @JsOverlay
        static LatencyHintUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static LatencyHintUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
    }
    
    @JsProperty(name="latencyHint")
    public LatencyHintUnion latencyHint;

    @JsOverlay
    public final void setLatencyHint(String latencyHint){
        this.latencyHint = AudioContextOptions.LatencyHintUnion.of(latencyHint);
    }

    @JsOverlay
    public final void setLatencyHint(double latencyHint){
        this.latencyHint = AudioContextOptions.LatencyHintUnion.of(latencyHint);
    }


}

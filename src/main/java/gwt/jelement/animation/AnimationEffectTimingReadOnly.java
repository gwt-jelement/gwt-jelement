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
package gwt.jelement.animation;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Js;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AnimationEffectTimingReadOnly", isNative = true)
public class AnimationEffectTimingReadOnly extends IsObject{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface DurationUnion {
        @JsOverlay
        static DurationUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static DurationUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
    }
    
    @JsProperty(name="duration")
    private DurationUnion duration;
    
    @JsProperty(name="direction")
    private String direction;
    
    @JsProperty(name="delay")
    public native double getDelay();
    
    @JsProperty(name="endDelay")
    public native double getEndDelay();
    
    @JsProperty(name="fill")
    public native String getFill();
    
    @JsProperty(name="iterationStart")
    public native double getIterationStart();
    
    @JsProperty(name="iterations")
    public native double getIterations();
    
    @JsOverlay
    public final DurationUnion getDuration(){
        return this.duration;
    }
    
    @JsProperty(name="easing")
    public native String getEasing();
    
    @JsOverlay
    public final PlaybackDirection getDirection(){
       return PlaybackDirection.of(direction);
    }
    
}

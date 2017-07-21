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

import gwt.jelement.animation.FillMode;
import gwt.jelement.animation.PlaybackDirection;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AnimationEffectTimingProperties{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface DoubleOrStringUnionType {
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
    
    @JsProperty(name="delay")
    public double delay = 0;

    @JsProperty(name="endDelay")
    public double endDelay = 0;

    @JsProperty(name="fill")
    public FillMode fill = FillMode.of("auto");

    @JsProperty(name="iterationStart")
    public double iterationStart = 0.0;

    @JsProperty(name="iterations")
    public double iterations = 1.0;

    @JsProperty(name="duration")
    public AnimationEffectTimingProperties.DoubleOrStringUnionType duration = Js.cast("auto");

    @JsProperty(name="direction")
    public PlaybackDirection direction = PlaybackDirection.of("normal");

    @JsProperty(name="easing")
    public String easing = "linear";


}

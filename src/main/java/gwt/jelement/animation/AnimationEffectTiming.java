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

import gwt.jelement.animation.AnimationEffectTimingReadOnly;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class AnimationEffectTiming extends AnimationEffectTimingReadOnly{
    
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
    
    @JsConstructor
    public AnimationEffectTiming(){
        super();
    }
    
    @JsProperty(name="duration")
    public native double getDoubleDuration();
    
    @JsProperty(name="duration")
    public native String getStringDuration();
    
    @JsProperty(name="duration")
    public native void setDuration(double duration);
    
    @JsProperty(name="duration")
    public native void setDoubleDuration(double doubleDuration);
    
    @JsProperty(name="duration")
    public native void setDuration(String duration);
    
    @JsProperty(name="duration")
    public native void setStringDuration(String StringDuration);
    
    
}

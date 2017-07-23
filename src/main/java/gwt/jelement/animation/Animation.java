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

import gwt.jelement.animation.Animation;
import gwt.jelement.animation.AnimationEffectReadOnly;
import gwt.jelement.animation.AnimationPlayState;
import gwt.jelement.animation.AnimationTimeline;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Animation extends EventTarget{
    
    @JsConstructor
    public Animation(){
        super();
    }
    
    @JsProperty(name="effect")
    public AnimationEffectReadOnly effect;
    
    @JsProperty(name="timeline")
    public AnimationTimeline timeline;
    
    @JsProperty(name="startTime")
    public double startTime;
    
    @JsProperty(name="currentTime")
    public double currentTime;
    
    @JsProperty(name="playbackRate")
    public double playbackRate;
    
    @JsProperty(name="playState")
    public String playState;
    
    @JsOverlay
    public final AnimationPlayState getPlayState(){
       return AnimationPlayState.of(playState);
    }
    
    @JsProperty(name="id")
    public String id;
    
    @JsProperty(name="onfinish")
    public EventHandlerNonNull onfinish;
    
    @JsProperty(name="oncancel")
    public EventHandlerNonNull oncancel;
    
    @JsProperty(name="finished")
    public Promise<Animation> finished;
    
    @JsProperty(name="ready")
    public Promise<Animation> ready;
    
    @JsMethod(name = "cancel")
    public native void cancel();
    
    @JsMethod(name = "finish")
    public native void finish();
    
    @JsMethod(name = "pause")
    public native void pause();
    
    @JsMethod(name = "play")
    public native void play();
    
    @JsMethod(name = "reverse")
    public native void reverse();
    
}

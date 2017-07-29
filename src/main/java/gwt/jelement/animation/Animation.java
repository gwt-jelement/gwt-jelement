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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Animation", isNative = true)
public class Animation extends EventTarget{
    @JsProperty(name="onfinish")
    private EventHandlerNonNull onfinish;
    
    @JsProperty(name="oncancel")
    private EventHandlerNonNull oncancel;
    
    @JsProperty(name="playState")
    private String playState;
    
    @JsConstructor
    public Animation(){
        super();
    }
    
    @JsConstructor
    public Animation(AnimationEffectReadOnly effect){
        super();
    }
    
    @JsConstructor
    public Animation(AnimationEffectReadOnly effect, AnimationTimeline timeline){
        super();
    }
    
    @JsProperty(name="effect")
    public native AnimationEffectReadOnly getEffect();
    
    @JsProperty(name="effect")
    public native void setEffect(AnimationEffectReadOnly effect);
    
    @JsProperty(name="timeline")
    public native AnimationTimeline getTimeline();
    
    @JsProperty(name="startTime")
    public native double getStartTime();
    
    @JsProperty(name="startTime")
    public native void setStartTime(double startTime);
    
    @JsProperty(name="currentTime")
    public native double getCurrentTime();
    
    @JsProperty(name="currentTime")
    public native void setCurrentTime(double currentTime);
    
    @JsProperty(name="playbackRate")
    public native double getPlaybackRate();
    
    @JsProperty(name="playbackRate")
    public native void setPlaybackRate(double playbackRate);
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="id")
    public native void setId(String id);
    
    @JsOverlay
    public final EventHandlerNonNull getOnFinish(){
        return this.onfinish;
    }
    
    @JsOverlay
    public final void setOnFinish(EventHandlerNonNull onfinish){
        this.onfinish = onfinish;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCancel(){
        return this.oncancel;
    }
    
    @JsOverlay
    public final void setOnCancel(EventHandlerNonNull oncancel){
        this.oncancel = oncancel;
    }
    
    @JsProperty(name="finished")
    public native Promise<Animation> getFinished();
    
    @JsProperty(name="ready")
    public native Promise<Animation> getReady();
    
    @JsOverlay
    public final AnimationPlayState getPlayState(){
       return AnimationPlayState.of(playState);
    }
    
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

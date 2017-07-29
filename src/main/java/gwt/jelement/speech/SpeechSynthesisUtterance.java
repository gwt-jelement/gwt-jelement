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
package gwt.jelement.speech;

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SpeechSynthesisUtterance", isNative = true)
public class SpeechSynthesisUtterance extends EventTarget{
    @JsProperty(name="onstart")
    private EventHandlerNonNull onstart;
    
    @JsProperty(name="onend")
    private EventHandlerNonNull onend;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onpause")
    private EventHandlerNonNull onpause;
    
    @JsProperty(name="onresume")
    private EventHandlerNonNull onresume;
    
    @JsProperty(name="onmark")
    private EventHandlerNonNull onmark;
    
    @JsProperty(name="onboundary")
    private EventHandlerNonNull onboundary;
    
    @JsConstructor
    public SpeechSynthesisUtterance(){
        super();
    }
    
    @JsConstructor
    public SpeechSynthesisUtterance(String text){
        super();
    }
    
    @JsProperty(name="text")
    public native String getText();
    
    @JsProperty(name="text")
    public native void setText(String text);
    
    @JsProperty(name="lang")
    public native String getLang();
    
    @JsProperty(name="lang")
    public native void setLang(String lang);
    
    @JsProperty(name="voice")
    public native SpeechSynthesisVoice getVoice();
    
    @JsProperty(name="voice")
    public native void setVoice(SpeechSynthesisVoice voice);
    
    @JsProperty(name="volume")
    public native float getVolume();
    
    @JsProperty(name="volume")
    public native void setVolume(float volume);
    
    @JsProperty(name="rate")
    public native float getRate();
    
    @JsProperty(name="rate")
    public native void setRate(float rate);
    
    @JsProperty(name="pitch")
    public native float getPitch();
    
    @JsProperty(name="pitch")
    public native void setPitch(float pitch);
    
    @JsOverlay
    public final EventHandlerNonNull getOnStart(){
        return this.onstart;
    }
    
    @JsOverlay
    public final void setOnStart(EventHandlerNonNull onstart){
        this.onstart = onstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnd(){
        return this.onend;
    }
    
    @JsOverlay
    public final void setOnEnd(EventHandlerNonNull onend){
        this.onend = onend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPause(){
        return this.onpause;
    }
    
    @JsOverlay
    public final void setOnPause(EventHandlerNonNull onpause){
        this.onpause = onpause;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnResume(){
        return this.onresume;
    }
    
    @JsOverlay
    public final void setOnResume(EventHandlerNonNull onresume){
        this.onresume = onresume;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMark(){
        return this.onmark;
    }
    
    @JsOverlay
    public final void setOnMark(EventHandlerNonNull onmark){
        this.onmark = onmark;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBoundary(){
        return this.onboundary;
    }
    
    @JsOverlay
    public final void setOnBoundary(EventHandlerNonNull onboundary){
        this.onboundary = onboundary;
    }
    
}

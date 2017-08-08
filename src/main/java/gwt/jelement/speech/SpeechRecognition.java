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
import gwt.jelement.mediastream.MediaStreamTrack;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class SpeechRecognition extends EventTarget {
    @JsProperty(name="onaudiostart")
    private EventHandlerNonNull onaudiostart;
    
    @JsProperty(name="onsoundstart")
    private EventHandlerNonNull onsoundstart;
    
    @JsProperty(name="onspeechstart")
    private EventHandlerNonNull onspeechstart;
    
    @JsProperty(name="onspeechend")
    private EventHandlerNonNull onspeechend;
    
    @JsProperty(name="onsoundend")
    private EventHandlerNonNull onsoundend;
    
    @JsProperty(name="onaudioend")
    private EventHandlerNonNull onaudioend;
    
    @JsProperty(name="onresult")
    private EventHandlerNonNull onresult;
    
    @JsProperty(name="onnomatch")
    private EventHandlerNonNull onnomatch;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onstart")
    private EventHandlerNonNull onstart;
    
    @JsProperty(name="onend")
    private EventHandlerNonNull onend;
    
    @JsConstructor
    public SpeechRecognition(){
        super();
    }
    
    @JsProperty(name="grammars")
    public native SpeechGrammarList getGrammars();
    
    @JsProperty(name="grammars")
    public native void setGrammars(SpeechGrammarList grammars);
    
    @JsProperty(name="lang")
    public native String getLang();
    
    @JsProperty(name="lang")
    public native void setLang(String lang);
    
    @JsProperty(name="continuous")
    public native boolean getContinuous();
    
    @JsProperty(name="continuous")
    public native void setContinuous(boolean continuous);
    
    @JsProperty(name="interimResults")
    public native boolean getInterimResults();
    
    @JsProperty(name="interimResults")
    public native void setInterimResults(boolean interimResults);
    
    @JsProperty(name="maxAlternatives")
    public native double getMaxAlternatives();
    
    @JsProperty(name="maxAlternatives")
    public native void setMaxAlternatives(double maxAlternatives);
    
    @JsProperty(name="audioTrack")
    public native MediaStreamTrack getAudioTrack();
    
    @JsProperty(name="audioTrack")
    public native void setAudioTrack(MediaStreamTrack audioTrack);
    
    @JsOverlay
    public final EventHandlerNonNull getOnAudiostart(){
        return this.onaudiostart;
    }
    
    @JsOverlay
    public final void setOnAudiostart(EventHandlerNonNull onaudiostart){
        this.onaudiostart = onaudiostart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSoundstart(){
        return this.onsoundstart;
    }
    
    @JsOverlay
    public final void setOnSoundstart(EventHandlerNonNull onsoundstart){
        this.onsoundstart = onsoundstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSpeechstart(){
        return this.onspeechstart;
    }
    
    @JsOverlay
    public final void setOnSpeechstart(EventHandlerNonNull onspeechstart){
        this.onspeechstart = onspeechstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSpeechend(){
        return this.onspeechend;
    }
    
    @JsOverlay
    public final void setOnSpeechend(EventHandlerNonNull onspeechend){
        this.onspeechend = onspeechend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSoundend(){
        return this.onsoundend;
    }
    
    @JsOverlay
    public final void setOnSoundend(EventHandlerNonNull onsoundend){
        this.onsoundend = onsoundend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAudioend(){
        return this.onaudioend;
    }
    
    @JsOverlay
    public final void setOnAudioend(EventHandlerNonNull onaudioend){
        this.onaudioend = onaudioend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnResult(){
        return this.onresult;
    }
    
    @JsOverlay
    public final void setOnResult(EventHandlerNonNull onresult){
        this.onresult = onresult;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnNomatch(){
        return this.onnomatch;
    }
    
    @JsOverlay
    public final void setOnNomatch(EventHandlerNonNull onnomatch){
        this.onnomatch = onnomatch;
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
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "stop")
    public native void stop();
    
}

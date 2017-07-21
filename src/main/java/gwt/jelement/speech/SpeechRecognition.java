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
import gwt.jelement.speech.SpeechGrammarList;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SpeechRecognition extends EventTarget{
    
    @JsConstructor
    public SpeechRecognition(){
        super();
    }
    
    @JsProperty(name="grammars")
    public SpeechGrammarList grammars;
    
    @JsProperty(name="lang")
    public String lang;
    
    @JsProperty(name="continuous")
    public boolean continuous;
    
    @JsProperty(name="interimResults")
    public boolean interimResults;
    
    @JsProperty(name="maxAlternatives")
    public long maxAlternatives;
    
    @JsProperty(name="audioTrack")
    public MediaStreamTrack audioTrack;
    
    @JsProperty(name="onaudiostart")
    public EventHandlerNonNull onaudiostart;
    
    @JsProperty(name="onsoundstart")
    public EventHandlerNonNull onsoundstart;
    
    @JsProperty(name="onspeechstart")
    public EventHandlerNonNull onspeechstart;
    
    @JsProperty(name="onspeechend")
    public EventHandlerNonNull onspeechend;
    
    @JsProperty(name="onsoundend")
    public EventHandlerNonNull onsoundend;
    
    @JsProperty(name="onaudioend")
    public EventHandlerNonNull onaudioend;
    
    @JsProperty(name="onresult")
    public EventHandlerNonNull onresult;
    
    @JsProperty(name="onnomatch")
    public EventHandlerNonNull onnomatch;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onstart")
    public EventHandlerNonNull onstart;
    
    @JsProperty(name="onend")
    public EventHandlerNonNull onend;
    
    @JsMethod(name = "abort")
    public native void abort();
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "stop")
    public native void stop();
    
}

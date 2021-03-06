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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class SpeechSynthesis extends EventTarget {
    @JsProperty(name="onvoiceschanged")
    private EventHandlerNonNull onvoiceschanged;
    
    @JsProperty(name="pending")
    public native boolean isPending();
    
    @JsProperty(name="speaking")
    public native boolean isSpeaking();
    
    @JsProperty(name="paused")
    public native boolean isPaused();
    
    @JsOverlay
    public final EventHandlerNonNull getOnVoiceschanged(){
        return this.onvoiceschanged;
    }
    
    @JsOverlay
    public final void setOnVoiceschanged(EventHandlerNonNull onvoiceschanged){
        this.onvoiceschanged = onvoiceschanged;
    }
    
    @JsMethod(name = "cancel")
    public native void cancel();
    
    @JsMethod(name = "getVoices")
    public native SpeechSynthesisVoice[] getVoices();
    
    @JsMethod(name = "pause")
    public native void pause();
    
    @JsMethod(name = "resume")
    public native void resume();
    
    @JsMethod(name = "speak")
    public native void speak(SpeechSynthesisUtterance utterance);
    
}

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

import gwt.jelement.events.EventHandlerNonNull;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="AudioScheduledSourceNode", isNative = true)
public class AudioScheduledSourceNode extends AudioNode{
    @JsProperty(name="onended")
    private EventHandlerNonNull onended;
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnded(){
        return this.onended;
    }
    
    @JsOverlay
    public final void setOnEnded(EventHandlerNonNull onended){
        this.onended = onended;
    }
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "start")
    public native void start(double when);
    
    @JsMethod(name = "stop")
    public native void stop();
    
    @JsMethod(name = "stop")
    public native void stop(double when);
    
}

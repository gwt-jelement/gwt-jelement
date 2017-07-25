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

import gwt.jelement.webaudio.AudioBuffer;
import gwt.jelement.webaudio.AudioNodeOptions;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ConvolverOptions extends AudioNodeOptions{

    @JsProperty(name="buffer")
    private AudioBuffer buffer;

    @JsProperty(name="disableNormalization")
    private boolean disableNormalization;

    public ConvolverOptions(){
    }

    @JsOverlay
    public final AudioBuffer getBuffer(){
        return this.buffer;
    }

    @JsOverlay
    public final void setBuffer(AudioBuffer buffer){
        this.buffer = buffer;
    }

    @JsOverlay
    public final boolean getDisableNormalization(){
        return this.disableNormalization;
    }

    @JsOverlay
    public final void setDisableNormalization(boolean disableNormalization){
        this.disableNormalization = disableNormalization;
    }

}

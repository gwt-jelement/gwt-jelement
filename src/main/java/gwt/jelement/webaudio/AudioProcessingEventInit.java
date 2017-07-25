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

import gwt.jelement.events.EventInit;
import gwt.jelement.webaudio.AudioBuffer;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioProcessingEventInit extends EventInit{

    @JsProperty(name="playbackTime")
    private double playbackTime;

    @JsProperty(name="inputBuffer")
    private AudioBuffer inputBuffer;

    @JsProperty(name="outputBuffer")
    private AudioBuffer outputBuffer;

    public AudioProcessingEventInit(){
    }

    @JsOverlay
    public final double getPlaybackTime(){
        return this.playbackTime;
    }

    @JsOverlay
    public final void setPlaybackTime(double playbackTime){
        this.playbackTime = playbackTime;
    }

    @JsOverlay
    public final AudioBuffer getInputBuffer(){
        return this.inputBuffer;
    }

    @JsOverlay
    public final void setInputBuffer(AudioBuffer inputBuffer){
        this.inputBuffer = inputBuffer;
    }

    @JsOverlay
    public final AudioBuffer getOutputBuffer(){
        return this.outputBuffer;
    }

    @JsOverlay
    public final void setOutputBuffer(AudioBuffer outputBuffer){
        this.outputBuffer = outputBuffer;
    }

}

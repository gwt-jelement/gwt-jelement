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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioBufferSourceOptions extends JsObject{

    @JsProperty(name="buffer")
    private AudioBuffer buffer;

    @JsProperty(name="detune")
    private float detune;

    @JsProperty(name="loop")
    private boolean loop;

    @JsProperty(name="loopEnd")
    private double loopEnd;

    @JsProperty(name="loopStart")
    private double loopStart;

    @JsProperty(name="playbackRate")
    private float playbackRate;

    public AudioBufferSourceOptions(){
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
    public final float getDetune(){
        return this.detune;
    }

    @JsOverlay
    public final void setDetune(float detune){
        this.detune = detune;
    }

    @JsOverlay
    public final boolean getLoop(){
        return this.loop;
    }

    @JsOverlay
    public final void setLoop(boolean loop){
        this.loop = loop;
    }

    @JsOverlay
    public final double getLoopEnd(){
        return this.loopEnd;
    }

    @JsOverlay
    public final void setLoopEnd(double loopEnd){
        this.loopEnd = loopEnd;
    }

    @JsOverlay
    public final double getLoopStart(){
        return this.loopStart;
    }

    @JsOverlay
    public final void setLoopStart(double loopStart){
        this.loopStart = loopStart;
    }

    @JsOverlay
    public final float getPlaybackRate(){
        return this.playbackRate;
    }

    @JsOverlay
    public final void setPlaybackRate(float playbackRate){
        this.playbackRate = playbackRate;
    }

}

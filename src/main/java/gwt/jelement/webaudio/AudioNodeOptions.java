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
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class AudioNodeOptions extends JsObject{

    @JsProperty(name="channelCount")
    private double channelCount;

    @JsProperty(name="channelCountMode")
    private String channelCountMode;

    @JsProperty(name="channelInterpretation")
    private String channelInterpretation;

    public AudioNodeOptions(){
    }

    @JsOverlay
    public final double getChannelCount(){
        return this.channelCount;
    }

    @JsOverlay
    public final void setChannelCount(double channelCount){
        this.channelCount = channelCount;
    }

    @JsOverlay
    public final ChannelCountMode getChannelCountMode(){
        return ChannelCountMode.of(this.channelCountMode);
    }

    @JsOverlay
    public final void setChannelCountMode(ChannelCountMode channelCountMode){
        this.channelCountMode = channelCountMode.getInternalValue();
    }

    @JsOverlay
    public final ChannelInterpretation getChannelInterpretation(){
        return ChannelInterpretation.of(this.channelInterpretation);
    }

    @JsOverlay
    public final void setChannelInterpretation(ChannelInterpretation channelInterpretation){
        this.channelInterpretation = channelInterpretation.getInternalValue();
    }


}

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
package gwt.jelement.peerconnection;

import gwt.jelement.events.EventInit;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCDataChannelEventInit extends EventInit{

    @JsProperty(name="channel")
    private RTCDataChannel channel;

    public RTCDataChannelEventInit(){
    }

    @JsOverlay
    public final RTCDataChannel getChannel(){
        return this.channel;
    }

    @JsOverlay
    public final void setChannel(RTCDataChannel channel){
        this.channel = channel;
    }


}

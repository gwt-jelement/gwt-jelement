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
package gwt.jelement.events;

import gwt.jelement.dom.MessagePort;
import gwt.jelement.events.EventInit;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MessageEventInit extends EventInit{

    public MessageEventInit(){
    }

    @JsProperty(name="data")
    public Object data;

    @JsOverlay
    public final Object getData(){
        return this.data;
    }

    @JsOverlay
    public final void setData(Object data){
        this.data = data;
    }

    @JsProperty(name="origin")
    public String origin;

    @JsOverlay
    public final String getOrigin(){
        return this.origin;
    }

    @JsOverlay
    public final void setOrigin(String origin){
        this.origin = origin;
    }

    @JsProperty(name="lastEventId")
    public String lastEventId;

    @JsOverlay
    public final String getLastEventId(){
        return this.lastEventId;
    }

    @JsOverlay
    public final void setLastEventId(String lastEventId){
        this.lastEventId = lastEventId;
    }

    @JsProperty(name="source")
    public EventTarget source;

    @JsOverlay
    public final EventTarget getSource(){
        return this.source;
    }

    @JsOverlay
    public final void setSource(EventTarget source){
        this.source = source;
    }

    @JsProperty(name="ports")
    public MessagePort[] ports;

    @JsOverlay
    public final MessagePort[] getPorts(){
        return this.ports;
    }

    @JsOverlay
    public final void setPorts(MessagePort[] ports){
        this.ports = ports;
    }


}

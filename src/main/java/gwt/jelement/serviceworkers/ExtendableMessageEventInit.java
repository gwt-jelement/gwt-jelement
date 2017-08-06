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
package gwt.jelement.serviceworkers;

import gwt.jelement.core.Js;
import gwt.jelement.dom.MessagePort;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ExtendableMessageEventInit extends ExtendableEventInit{

    @JsProperty(name="data")
    private Object data;

    @JsProperty(name="origin")
    private String origin;

    @JsProperty(name="lastEventId")
    private String lastEventId;

    @JsProperty(name="source")
    private ExtendableMessageEvent.SourceUnion source;

    @JsProperty(name="ports")
    private MessagePort[] ports;

    public ExtendableMessageEventInit(){
    }

    @JsOverlay
    public final Object getData(){
        return this.data;
    }

    @JsOverlay
    public final void setData(Object data){
        this.data = data;
    }

    @JsOverlay
    public final String getOrigin(){
        return this.origin;
    }

    @JsOverlay
    public final void setOrigin(String origin){
        this.origin = origin;
    }

    @JsOverlay
    public final String getLastEventId(){
        return this.lastEventId;
    }

    @JsOverlay
    public final void setLastEventId(String lastEventId){
        this.lastEventId = lastEventId;
    }

    @JsOverlay
    public final ExtendableMessageEvent.SourceUnion getSource(){
        return this.source;
    }

    @JsOverlay
    public final void setSource(Client source){
        this.source = ExtendableMessageEvent.SourceUnion.of(source);
    }

    @JsOverlay
    public final void setSource(ServiceWorker source){
        this.source = ExtendableMessageEvent.SourceUnion.of(source);
    }

    @JsOverlay
    public final void setSource(MessagePort source){
        this.source = ExtendableMessageEvent.SourceUnion.of(source);
    }

    @JsOverlay
    public final MessagePort[] getPorts(){
        return this.ports;
    }

    @JsOverlay
    public final void setPorts(MessagePort[] ports){
        this.ports = ports;
    }


}

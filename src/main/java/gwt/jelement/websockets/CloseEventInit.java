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
package gwt.jelement.websockets;

import gwt.jelement.events.EventInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class CloseEventInit extends EventInit{

    @JsProperty(name="wasClean")
    private boolean wasClean;

    @JsProperty(name="code")
    private short code;

    @JsProperty(name="reason")
    private String reason;

    public CloseEventInit(){
    }

    @JsOverlay
    public final boolean isWasClean(){
        return this.wasClean;
    }

    @JsOverlay
    public final void setWasClean(boolean wasClean){
        this.wasClean = wasClean;
    }

    @JsOverlay
    public final short getCode(){
        return this.code;
    }

    @JsOverlay
    public final void setCode(short code){
        this.code = code;
    }

    @JsOverlay
    public final String getReason(){
        return this.reason;
    }

    @JsOverlay
    public final void setReason(String reason){
        this.reason = reason;
    }


}

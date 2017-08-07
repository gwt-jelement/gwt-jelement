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
package gwt.jelement.webusb;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class USBControlTransferParameters extends JsObject{

    @JsProperty(name="requestType")
    private String requestType;

    @JsProperty(name="recipient")
    private String recipient;

    @JsProperty(name="request")
    private byte request;

    @JsProperty(name="value")
    private short value;

    @JsProperty(name="index")
    private short index;

    public USBControlTransferParameters(){
    }

    @JsOverlay
    public final USBRequestType getRequestType(){
        return USBRequestType.of(this.requestType);
    }

    @JsOverlay
    public final void setRequestType(USBRequestType requestType){
        this.requestType = requestType.getInternalValue();
    }

    @JsOverlay
    public final USBRecipient getRecipient(){
        return USBRecipient.of(this.recipient);
    }

    @JsOverlay
    public final void setRecipient(USBRecipient recipient){
        this.recipient = recipient.getInternalValue();
    }

    @JsOverlay
    public final byte getRequest(){
        return this.request;
    }

    @JsOverlay
    public final void setRequest(byte request){
        this.request = request;
    }

    @JsOverlay
    public final short getValue(){
        return this.value;
    }

    @JsOverlay
    public final void setValue(short value){
        this.value = value;
    }

    @JsOverlay
    public final short getIndex(){
        return this.index;
    }

    @JsOverlay
    public final void setIndex(short index){
        this.index = index;
    }


}

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

import gwt.jelement.webusb.USBRecipient;
import gwt.jelement.webusb.USBRequestType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class USBControlTransferParameters{

    public USBControlTransferParameters(){
    }

    @JsProperty(name="requestType")
    public String requestType;

    @JsOverlay
    public final USBRequestType getRequestType(){
        return USBRequestType.of(this.requestType);
    }

    @JsOverlay
    public final void setRequestType(USBRequestType requestType){
        this.requestType = requestType.getInternalValue();
    }

    @JsProperty(name="recipient")
    public String recipient;

    @JsOverlay
    public final USBRecipient getRecipient(){
        return USBRecipient.of(this.recipient);
    }

    @JsOverlay
    public final void setRecipient(USBRecipient recipient){
        this.recipient = recipient.getInternalValue();
    }

    @JsProperty(name="request")
    public byte request;

    @JsOverlay
    public final byte getRequest(){
        return this.request;
    }

    @JsOverlay
    public final void setRequest(byte request){
        this.request = request;
    }

    @JsProperty(name="value")
    public short value;

    @JsOverlay
    public final short getValue(){
        return this.value;
    }

    @JsOverlay
    public final void setValue(short value){
        this.value = value;
    }

    @JsProperty(name="index")
    public short index;

    @JsOverlay
    public final short getIndex(){
        return this.index;
    }

    @JsOverlay
    public final void setIndex(short index){
        this.index = index;
    }


}

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

import gwt.jelement.events.EventInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ApplicationCacheErrorEventInit extends EventInit{

    @JsProperty(name="reason")
    private String reason;

    @JsProperty(name="url")
    private String url;

    @JsProperty(name="status")
    private short status;

    @JsProperty(name="message")
    private String message;

    public ApplicationCacheErrorEventInit(){
    }

    @JsOverlay
    public final String getReason(){
        return this.reason;
    }

    @JsOverlay
    public final void setReason(String reason){
        this.reason = reason;
    }

    @JsOverlay
    public final String getUrl(){
        return this.url;
    }

    @JsOverlay
    public final void setUrl(String url){
        this.url = url;
    }

    @JsOverlay
    public final short getStatus(){
        return this.status;
    }

    @JsOverlay
    public final void setStatus(short status){
        this.status = status;
    }

    @JsOverlay
    public final String getMessage(){
        return this.message;
    }

    @JsOverlay
    public final void setMessage(String message){
        this.message = message;
    }

}

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

import gwt.jelement.fetch.Request;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class FetchEventInit extends ExtendableEventInit{

    @JsProperty(name="request")
    private Request request;

    @JsProperty(name="clientId")
    private String clientId;

    @JsProperty(name="isReload")
    private boolean isReload;

    public FetchEventInit(){
    }

    @JsOverlay
    public final Request getRequest(){
        return this.request;
    }

    @JsOverlay
    public final void setRequest(Request request){
        this.request = request;
    }

    @JsOverlay
    public final String getClientId(){
        return this.clientId;
    }

    @JsOverlay
    public final void setClientId(String clientId){
        this.clientId = clientId;
    }

    @JsOverlay
    public final boolean getIsReload(){
        return this.isReload;
    }

    @JsOverlay
    public final void setIsReload(boolean isReload){
        this.isReload = isReload;
    }

}

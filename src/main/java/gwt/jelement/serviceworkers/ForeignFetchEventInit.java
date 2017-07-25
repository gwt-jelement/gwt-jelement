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
import gwt.jelement.serviceworkers.ExtendableEventInit;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ForeignFetchEventInit extends ExtendableEventInit{

    public ForeignFetchEventInit(){
    }

    @JsProperty(name="request")
    public Request request;

    @JsOverlay
    public final Request getRequest(){
        return this.request;
    }

    @JsOverlay
    public final void setRequest(Request request){
        this.request = request;
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


}

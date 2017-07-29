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

import elemental2.promise.Promise;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PromiseRejectionEventInit extends EventInit{

    @JsProperty(name="promise")
    private Promise<Object> promise;

    @JsProperty(name="reason")
    private Object reason;

    public PromiseRejectionEventInit(){
    }

    @JsOverlay
    public final Promise<Object> getPromise(){
        return this.promise;
    }

    @JsOverlay
    public final void setPromise(Promise<Object> promise){
        this.promise = promise;
    }

    @JsOverlay
    public final Object getReason(){
        return this.reason;
    }

    @JsOverlay
    public final void setReason(Object reason){
        this.reason = reason;
    }

}

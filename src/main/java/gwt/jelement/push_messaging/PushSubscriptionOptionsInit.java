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
package gwt.jelement.push_messaging;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PushSubscriptionOptionsInit extends JsObject{

    @JsProperty(name="userVisibleOnly")
    private boolean userVisibleOnly;

    @JsProperty(name="applicationServerKey")
    private BufferSource applicationServerKey;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface BufferSource {
        @JsOverlay
        static BufferSource of(ArrayBuffer value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static BufferSource of(ArrayBufferView value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default ArrayBuffer asArrayBuffer(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default ArrayBufferView asArrayBufferView(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isArrayBuffer(){
            return (Object) this instanceof ArrayBuffer;
        }
    
        @JsOverlay
        default boolean isArrayBufferView(){
            return (Object) this instanceof ArrayBufferView;
        }
    
    }
    
    public PushSubscriptionOptionsInit(){
    }

    @JsOverlay
    public final boolean getUserVisibleOnly(){
        return this.userVisibleOnly;
    }

    @JsOverlay
    public final void setUserVisibleOnly(boolean userVisibleOnly){
        this.userVisibleOnly = userVisibleOnly;
    }

    @JsOverlay
    public final void setApplicationServerKey(ArrayBuffer applicationServerKey){
        this.applicationServerKey = PushSubscriptionOptionsInit.BufferSource.of(applicationServerKey);
    }

    @JsOverlay
    public final void setApplicationServerKey(ArrayBufferView applicationServerKey){
        this.applicationServerKey = PushSubscriptionOptionsInit.BufferSource.of(applicationServerKey);
    }

}

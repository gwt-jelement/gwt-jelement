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
package gwt.jelement.peerconnection;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class RTCIceServer{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface StringOrStringArrayUnionType {
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String[] asStringArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
        @JsOverlay
        default boolean isStringArray(){
            return (Object) this instanceof String[];
        }
    
    }
    
    @JsProperty(name="urls")
    public RTCIceServer.StringOrStringArrayUnionType urls;

    @JsProperty(name="url")
    public String url;

    @JsProperty(name="username")
    public String username;

    @JsProperty(name="credential")
    public String credential;


}

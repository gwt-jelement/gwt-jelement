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
package gwt.jelement.fetch;

import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ResponseInit extends JsObject{

    @JsProperty(name="status")
    private short status;

    @JsProperty(name="statusText")
    private String statusText;

    @JsProperty(name="headers")
    private HeadersInit headers;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface HeadersInit {
        @JsOverlay
        static HeadersInit of(String[][] value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static HeadersInit of(JsObject<String> value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default String[][] asStringArrayArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default JsObject<String> asJsObject(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isStringArrayArray(){
            return (Object) this instanceof String[][];
        }
    
        @JsOverlay
        default boolean isJsObject(){
            return (Object) this instanceof JsObject;
        }
    
    }
    
    public ResponseInit(){
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
    public final String getStatusText(){
        return this.statusText;
    }

    @JsOverlay
    public final void setStatusText(String statusText){
        this.statusText = statusText;
    }

    @JsOverlay
    public final void setHeaders(String[][] headers){
        this.headers = ResponseInit.HeadersInit.of(headers);
    }

    @JsOverlay
    public final void setHeaders(JsObject<String> headers){
        this.headers = ResponseInit.HeadersInit.of(headers);
    }


}

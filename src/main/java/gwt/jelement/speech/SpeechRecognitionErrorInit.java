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
package gwt.jelement.speech;

import gwt.jelement.events.EventInit;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class SpeechRecognitionErrorInit extends EventInit{

    @JsProperty(name="error")
    private String error;

    @JsProperty(name="message")
    private String message;

    public SpeechRecognitionErrorInit(){
    }

    @JsOverlay
    public final String getError(){
        return this.error;
    }

    @JsOverlay
    public final void setError(String error){
        this.error = error;
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

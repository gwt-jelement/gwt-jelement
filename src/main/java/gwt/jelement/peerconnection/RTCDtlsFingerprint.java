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

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCDtlsFingerprint{

    public RTCDtlsFingerprint(){
    }

    @JsProperty(name="algorithm")
    public String algorithm;

    @JsOverlay
    public final String getAlgorithm(){
        return this.algorithm;
    }

    @JsOverlay
    public final void setAlgorithm(String algorithm){
        this.algorithm = algorithm;
    }

    @JsProperty(name="value")
    public String value;

    @JsOverlay
    public final String getValue(){
        return this.value;
    }

    @JsOverlay
    public final void setValue(String value){
        this.value = value;
    }


}

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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class RTCDtlsFingerprint extends JsObject{

    @JsProperty(name="algorithm")
    private String algorithm;

    @JsProperty(name="value")
    private String value;

    public RTCDtlsFingerprint(){
    }

    @JsOverlay
    public final String getAlgorithm(){
        return this.algorithm;
    }

    @JsOverlay
    public final void setAlgorithm(String algorithm){
        this.algorithm = algorithm;
    }

    @JsOverlay
    public final String getValue(){
        return this.value;
    }

    @JsOverlay
    public final void setValue(String value){
        this.value = value;
    }

}

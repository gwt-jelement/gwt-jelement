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
package gwt.jelement.encoding;

import gwt.jelement.encoding.TextDecodeOptions;
import gwt.jelement.encoding.TextDecoderOptions;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TextDecoder{
    
    @JsConstructor
    public TextDecoder(){
    }
    
    @JsConstructor
    public TextDecoder(String label){
    }
    
    @JsConstructor
    public TextDecoder(String label, TextDecoderOptions options){
    }
    
    @JsProperty(name="encoding")
    public String encoding;
    
    @JsProperty(name="fatal")
    public boolean fatal;
    
    @JsProperty(name="ignoreBOM")
    public boolean ignoreBOM;
    
    @JsMethod(name = "decode")
    public native String decode();
    
    @JsMethod(name = "decode")
    public native String decode(ArrayBuffer input);
    
    @JsMethod(name = "decode")
    public native String decode(ArrayBufferView input);
    
    @JsMethod(name = "decode")
    public native String decode(ArrayBuffer input, TextDecodeOptions options);
    
    @JsMethod(name = "decode")
    public native String decode(ArrayBufferView input, TextDecodeOptions options);
    
}

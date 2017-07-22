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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SpeechGrammarList{
    
    @JsConstructor
    public SpeechGrammarList(){
    }
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsMethod(name = "addFromString")
    public native void addFromString(String string);
    
    @JsMethod(name = "addFromString")
    public native void addFromString(String string, float weight);
    
    @JsMethod(name = "addFromUri")
    public native void addFromUri(String src);
    
    @JsMethod(name = "addFromUri")
    public native void addFromUri(String src, float weight);
    
}

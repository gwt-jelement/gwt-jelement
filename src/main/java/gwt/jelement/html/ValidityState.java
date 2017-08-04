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
package gwt.jelement.html;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ValidityState", isNative = true)
public class ValidityState extends IsObject{
    @JsProperty(name="valueMissing")
    public native boolean getValueMissing();
    
    @JsProperty(name="typeMismatch")
    public native boolean getTypeMismatch();
    
    @JsProperty(name="patternMismatch")
    public native boolean getPatternMismatch();
    
    @JsProperty(name="tooLong")
    public native boolean getTooLong();
    
    @JsProperty(name="tooShort")
    public native boolean getTooShort();
    
    @JsProperty(name="rangeUnderflow")
    public native boolean getRangeUnderflow();
    
    @JsProperty(name="rangeOverflow")
    public native boolean getRangeOverflow();
    
    @JsProperty(name="stepMismatch")
    public native boolean getStepMismatch();
    
    @JsProperty(name="badInput")
    public native boolean getBadInput();
    
    @JsProperty(name="customError")
    public native boolean getCustomError();
    
    @JsProperty(name="valid")
    public native boolean getValid();
    
}

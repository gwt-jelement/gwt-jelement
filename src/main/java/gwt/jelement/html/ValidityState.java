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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ValidityState", isNative = true)
public class ValidityState implements IsObject {
    @JsProperty(name="valueMissing")
    public native boolean isValueMissing();
    
    @JsProperty(name="typeMismatch")
    public native boolean isTypeMismatch();
    
    @JsProperty(name="patternMismatch")
    public native boolean isPatternMismatch();
    
    @JsProperty(name="tooLong")
    public native boolean isTooLong();
    
    @JsProperty(name="tooShort")
    public native boolean isTooShort();
    
    @JsProperty(name="rangeUnderflow")
    public native boolean isRangeUnderflow();
    
    @JsProperty(name="rangeOverflow")
    public native boolean isRangeOverflow();
    
    @JsProperty(name="stepMismatch")
    public native boolean isStepMismatch();
    
    @JsProperty(name="badInput")
    public native boolean isBadInput();
    
    @JsProperty(name="customError")
    public native boolean isCustomError();
    
    @JsProperty(name="valid")
    public native boolean isValid();
    
}

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
package gwt.jelement.webdatabase;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SQLError{
    public static final int UNKNOWN_ERR = 0;
    public static final int DATABASE_ERR = 1;
    public static final int VERSION_ERR = 2;
    public static final int TOO_LARGE_ERR = 3;
    public static final int QUOTA_ERR = 4;
    public static final int SYNTAX_ERR = 5;
    public static final int CONSTRAINT_ERR = 6;
    public static final int TIMEOUT_ERR = 7;
    
    
    @JsProperty(name="code")
    public native long getCode();
    
    @JsProperty(name="message")
    public native String getMessage();
    
    
}

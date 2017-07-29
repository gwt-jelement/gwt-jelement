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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SQLError", isNative = true)
public class SQLError extends JsObject{
    public static short UNKNOWN_ERR;
    public static short DATABASE_ERR;
    public static short VERSION_ERR;
    public static short TOO_LARGE_ERR;
    public static short QUOTA_ERR;
    public static short SYNTAX_ERR;
    public static short CONSTRAINT_ERR;
    public static short TIMEOUT_ERR;
    
    @JsConstructor
    public SQLError(){
        super();
    }
    
    @JsProperty(name="code")
    public native double getCode();
    
    @JsProperty(name="message")
    public native String getMessage();
    
}

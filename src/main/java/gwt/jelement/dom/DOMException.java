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
package gwt.jelement.dom;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class DOMException{
    public static final int INDEX_SIZE_ERR = 1;
    public static final int DOMSTRING_SIZE_ERR = 2;
    public static final int HIERARCHY_REQUEST_ERR = 3;
    public static final int WRONG_DOCUMENT_ERR = 4;
    public static final int INVALID_CHARACTER_ERR = 5;
    public static final int NO_DATA_ALLOWED_ERR = 6;
    public static final int NO_MODIFICATION_ALLOWED_ERR = 7;
    public static final int NOT_FOUND_ERR = 8;
    public static final int NOT_SUPPORTED_ERR = 9;
    public static final int INUSE_ATTRIBUTE_ERR = 10;
    public static final int INVALID_STATE_ERR = 11;
    public static final int SYNTAX_ERR = 12;
    public static final int INVALID_MODIFICATION_ERR = 13;
    public static final int NAMESPACE_ERR = 14;
    public static final int INVALID_ACCESS_ERR = 15;
    public static final int VALIDATION_ERR = 16;
    public static final int TYPE_MISMATCH_ERR = 17;
    public static final int SECURITY_ERR = 18;
    public static final int NETWORK_ERR = 19;
    public static final int ABORT_ERR = 20;
    public static final int URL_MISMATCH_ERR = 21;
    public static final int QUOTA_EXCEEDED_ERR = 22;
    public static final int TIMEOUT_ERR = 23;
    public static final int INVALID_NODE_TYPE_ERR = 24;
    public static final int DATA_CLONE_ERR = 25;
    
    
    @JsConstructor
    public DOMException(){
    }
    
    @JsConstructor
    public DOMException(String message){
    }
    
    @JsConstructor
    public DOMException(String message, String name){
    }
    
    @JsProperty(name="code")
    public native short getCode();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="message")
    public native String getMessage();
    
    @JsMethod(name = "toString")
    public native String toString();
    
}

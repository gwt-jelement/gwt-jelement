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
    public static int INDEX_SIZE_ERR;
    public static int DOMSTRING_SIZE_ERR;
    public static int HIERARCHY_REQUEST_ERR;
    public static int WRONG_DOCUMENT_ERR;
    public static int INVALID_CHARACTER_ERR;
    public static int NO_DATA_ALLOWED_ERR;
    public static int NO_MODIFICATION_ALLOWED_ERR;
    public static int NOT_FOUND_ERR;
    public static int NOT_SUPPORTED_ERR;
    public static int INUSE_ATTRIBUTE_ERR;
    public static int INVALID_STATE_ERR;
    public static int SYNTAX_ERR;
    public static int INVALID_MODIFICATION_ERR;
    public static int NAMESPACE_ERR;
    public static int INVALID_ACCESS_ERR;
    public static int VALIDATION_ERR;
    public static int TYPE_MISMATCH_ERR;
    public static int SECURITY_ERR;
    public static int NETWORK_ERR;
    public static int ABORT_ERR;
    public static int URL_MISMATCH_ERR;
    public static int QUOTA_EXCEEDED_ERR;
    public static int TIMEOUT_ERR;
    public static int INVALID_NODE_TYPE_ERR;
    public static int DATA_CLONE_ERR;
    
    
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

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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DOMException", isNative = true)
public class DOMException implements IsObject {
    public static short INDEX_SIZE_ERR; /* 1 */
    public static short DOMSTRING_SIZE_ERR; /* 2 */
    public static short HIERARCHY_REQUEST_ERR; /* 3 */
    public static short WRONG_DOCUMENT_ERR; /* 4 */
    public static short INVALID_CHARACTER_ERR; /* 5 */
    public static short NO_DATA_ALLOWED_ERR; /* 6 */
    public static short NO_MODIFICATION_ALLOWED_ERR; /* 7 */
    public static short NOT_FOUND_ERR; /* 8 */
    public static short NOT_SUPPORTED_ERR; /* 9 */
    public static short INUSE_ATTRIBUTE_ERR; /* 10 */
    public static short INVALID_STATE_ERR; /* 11 */
    public static short SYNTAX_ERR; /* 12 */
    public static short INVALID_MODIFICATION_ERR; /* 13 */
    public static short NAMESPACE_ERR; /* 14 */
    public static short INVALID_ACCESS_ERR; /* 15 */
    public static short VALIDATION_ERR; /* 16 */
    public static short TYPE_MISMATCH_ERR; /* 17 */
    public static short SECURITY_ERR; /* 18 */
    public static short NETWORK_ERR; /* 19 */
    public static short ABORT_ERR; /* 20 */
    public static short URL_MISMATCH_ERR; /* 21 */
    public static short QUOTA_EXCEEDED_ERR; /* 22 */
    public static short TIMEOUT_ERR; /* 23 */
    public static short INVALID_NODE_TYPE_ERR; /* 24 */
    public static short DATA_CLONE_ERR; /* 25 */
    
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

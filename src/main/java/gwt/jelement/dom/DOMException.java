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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="DOMException", isNative = true)
public class DOMException extends JsObject{
    public static short INDEX_SIZE_ERR;
    public static short DOMSTRING_SIZE_ERR;
    public static short HIERARCHY_REQUEST_ERR;
    public static short WRONG_DOCUMENT_ERR;
    public static short INVALID_CHARACTER_ERR;
    public static short NO_DATA_ALLOWED_ERR;
    public static short NO_MODIFICATION_ALLOWED_ERR;
    public static short NOT_FOUND_ERR;
    public static short NOT_SUPPORTED_ERR;
    public static short INUSE_ATTRIBUTE_ERR;
    public static short INVALID_STATE_ERR;
    public static short SYNTAX_ERR;
    public static short INVALID_MODIFICATION_ERR;
    public static short NAMESPACE_ERR;
    public static short INVALID_ACCESS_ERR;
    public static short VALIDATION_ERR;
    public static short TYPE_MISMATCH_ERR;
    public static short SECURITY_ERR;
    public static short NETWORK_ERR;
    public static short ABORT_ERR;
    public static short URL_MISMATCH_ERR;
    public static short QUOTA_EXCEEDED_ERR;
    public static short TIMEOUT_ERR;
    public static short INVALID_NODE_TYPE_ERR;
    public static short DATA_CLONE_ERR;
    
    @JsConstructor
    public DOMException(){
        super();
    }
    
    @JsConstructor
    public DOMException(String message){
        super();
    }
    
    @JsConstructor
    public DOMException(String message, String name){
        super();
    }
    
    @JsProperty(name="code")
    public native short getCode();
    
    @JsProperty(name="message")
    public native String getMessage();
    
    @JsMethod(name = "toString")
    public native String toString();
    
}

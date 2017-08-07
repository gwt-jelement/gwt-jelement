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
package gwt.jelement.credentialmanager;

import gwt.jelement.core.Js;
import gwt.jelement.dom.URLSearchParams;
import gwt.jelement.html.FormData;
import gwt.jelement.html.HTMLFormElement;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="PasswordCredential", isNative = true)
public class PasswordCredential extends Credential {
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface CredentialBodyType {
        @JsOverlay
        static CredentialBodyType of(FormData value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static CredentialBodyType of(URLSearchParams value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default FormData asFormData(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default URLSearchParams asURLSearchParams(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isFormData(){
            return (Object) this instanceof FormData;
        }
    
        @JsOverlay
        default boolean isURLSearchParams(){
            return (Object) this instanceof URLSearchParams;
        }
    
    }
    
    @JsProperty(name="additionalData")
    private CredentialBodyType additionalData;
    
    @JsConstructor
    public PasswordCredential(PasswordCredentialData data){
        super();
    }
    
    @JsConstructor
    public PasswordCredential(HTMLFormElement form){
        super();
    }
    
    @JsProperty(name="idName")
    public native String getIdName();
    
    @JsProperty(name="idName")
    public native void setIdName(String idName);
    
    @JsProperty(name="passwordName")
    public native String getPasswordName();
    
    @JsProperty(name="passwordName")
    public native void setPasswordName(String passwordName);
    
    @JsOverlay
    public final CredentialBodyType getAdditionalData(){
        return this.additionalData;
    }
    
    @JsOverlay
    public final void setAdditionalData(FormData additionalData){
        this.additionalData = PasswordCredential.CredentialBodyType.of(additionalData);
    }
    
    @JsOverlay
    public final void setAdditionalData(URLSearchParams additionalData){
        this.additionalData = PasswordCredential.CredentialBodyType.of(additionalData);
    }
    
    @JsProperty(name="password")
    public native String getPassword();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="iconURL")
    public native String getIconURL();
    
}

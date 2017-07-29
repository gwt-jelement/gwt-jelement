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

import gwt.jelement.core.JsObject;
import gwt.jelement.html.HTMLFormElement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class CredentialCreationOptions extends JsObject{

    @JsProperty(name="password")
    private PasswordCredentialInit password;

    @JsProperty(name="federated")
    private FederatedCredentialInit federated;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface PasswordCredentialInit {
        @JsOverlay
        static PasswordCredentialInit of(PasswordCredentialData value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static PasswordCredentialInit of(HTMLFormElement value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default PasswordCredentialData asPasswordCredentialData(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default HTMLFormElement asHTMLFormElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isPasswordCredentialData(){
            return (Object) this instanceof PasswordCredentialData;
        }
    
        @JsOverlay
        default boolean isHTMLFormElement(){
            return (Object) this instanceof HTMLFormElement;
        }
    
    }
    
    public CredentialCreationOptions(){
    }

    @JsOverlay
    public final void setPassword(PasswordCredentialData password){
        this.password = CredentialCreationOptions.PasswordCredentialInit.of(password);
    }

    @JsOverlay
    public final void setPassword(HTMLFormElement password){
        this.password = CredentialCreationOptions.PasswordCredentialInit.of(password);
    }

    @JsOverlay
    public final FederatedCredentialInit getFederated(){
        return this.federated;
    }

    @JsOverlay
    public final void setFederated(FederatedCredentialInit federated){
        this.federated = federated;
    }

}

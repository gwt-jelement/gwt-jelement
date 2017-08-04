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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class CredentialRequestOptions extends JsObject{

    @JsProperty(name="federated")
    private FederatedCredentialRequestOptions federated;

    @JsProperty(name="password")
    private boolean password;

    @JsProperty(name="unmediated")
    private boolean unmediated;

    @JsProperty(name="mediation")
    private String mediation;

    public CredentialRequestOptions(){
    }

    @JsOverlay
    public final FederatedCredentialRequestOptions getFederated(){
        return this.federated;
    }

    @JsOverlay
    public final void setFederated(FederatedCredentialRequestOptions federated){
        this.federated = federated;
    }

    @JsOverlay
    public final boolean isPassword(){
        return this.password;
    }

    @JsOverlay
    public final void setPassword(boolean password){
        this.password = password;
    }

    @JsOverlay
    public final boolean isUnmediated(){
        return this.unmediated;
    }

    @JsOverlay
    public final void setUnmediated(boolean unmediated){
        this.unmediated = unmediated;
    }

    @JsOverlay
    public final CredentialMediationRequirement getMediation(){
        return CredentialMediationRequirement.of(this.mediation);
    }

    @JsOverlay
    public final void setMediation(CredentialMediationRequirement mediation){
        this.mediation = mediation.getInternalValue();
    }


}

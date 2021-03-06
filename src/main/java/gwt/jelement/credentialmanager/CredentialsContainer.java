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

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CredentialsContainer", isNative = true)
public class CredentialsContainer implements IsObject {
    @JsMethod(name = "create")
    public native Promise create();
    
    @JsMethod(name = "create")
    public native Promise create(CredentialCreationOptions options);
    
    @JsMethod(name = "get")
    public native Promise get();
    
    @JsMethod(name = "get")
    public native Promise get(CredentialRequestOptions options);
    
    @JsMethod(name = "preventSilentAccess")
    public native Promise preventSilentAccess();
    
    @JsMethod(name = "requireUserMediation")
    public native Promise requireUserMediation();
    
    @JsMethod(name = "store")
    public native Promise store(Credential credential);
    
}

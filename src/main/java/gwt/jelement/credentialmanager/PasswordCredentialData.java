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

import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PasswordCredentialData extends CredentialData{

    @JsProperty(name="name")
    private String name;

    @JsProperty(name="iconURL")
    private String iconURL;

    @JsProperty(name="password")
    private String password;

    public PasswordCredentialData(){
    }

    @JsOverlay
    public final String getName(){
        return this.name;
    }

    @JsOverlay
    public final void setName(String name){
        this.name = name;
    }

    @JsOverlay
    public final String getIconURL(){
        return this.iconURL;
    }

    @JsOverlay
    public final void setIconURL(String iconURL){
        this.iconURL = iconURL;
    }

    @JsOverlay
    public final String getPassword(){
        return this.password;
    }

    @JsOverlay
    public final void setPassword(String password){
        this.password = password;
    }


}

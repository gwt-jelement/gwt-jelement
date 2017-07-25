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
package gwt.jelement.encryptedmedia;

import gwt.jelement.encryptedmedia.MediaKeySession;
import gwt.jelement.encryptedmedia.MediaKeySessionType;
import gwt.jelement.encryptedmedia.MediaKeysPolicy;
import elemental2.core.ArrayBuffer;
import elemental2.core.ArrayBufferView;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaKeys{
    
    @JsMethod(name = "createSession")
    public native MediaKeySession createSession();
    
    
    @JsOverlay
    public final MediaKeySession createSession(MediaKeySessionType sessionType){
        return createSession(sessionType.getInternalValue());
    }
    
    @JsMethod(name = "createSession")
    public native MediaKeySession createSession(String sessionType);
    
    
    @JsMethod(name = "getStatusForPolicy")
    public native Promise<String> getStatusForPolicy(MediaKeysPolicy policy);
    
    
    @JsMethod(name = "setServerCertificate")
    public native Promise<Boolean> setServerCertificate(ArrayBuffer serverCertificate);
    
    
    @JsMethod(name = "setServerCertificate")
    public native Promise<Boolean> setServerCertificate(ArrayBufferView serverCertificate);
    
    
}

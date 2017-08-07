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
package gwt.jelement.events;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SecurityPolicyViolationEvent", isNative = true)
public class SecurityPolicyViolationEvent extends Event {
    @JsProperty(name="disposition")
    private String disposition;
    
    @JsConstructor
    public SecurityPolicyViolationEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public SecurityPolicyViolationEvent(String type, SecurityPolicyViolationEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="documentURI")
    public native String getDocumentURI();
    
    @JsProperty(name="referrer")
    public native String getReferrer();
    
    @JsProperty(name="blockedURI")
    public native String getBlockedURI();
    
    @JsProperty(name="violatedDirective")
    public native String getViolatedDirective();
    
    @JsProperty(name="effectiveDirective")
    public native String getEffectiveDirective();
    
    @JsProperty(name="originalPolicy")
    public native String getOriginalPolicy();
    
    @JsProperty(name="sourceFile")
    public native String getSourceFile();
    
    @JsProperty(name="statusCode")
    public native short getStatusCode();
    
    @JsProperty(name="lineNumber")
    public native double getLineNumber();
    
    @JsProperty(name="columnNumber")
    public native double getColumnNumber();
    
    @JsProperty(name="sample")
    public native String getSample();
    
    @JsOverlay
    public final SecurityPolicyViolationEventDisposition getDisposition(){
       return SecurityPolicyViolationEventDisposition.of(disposition);
    }
    
}

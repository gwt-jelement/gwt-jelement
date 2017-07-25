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

import gwt.jelement.events.EventInit;
import gwt.jelement.events.SecurityPolicyViolationEventDisposition;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class SecurityPolicyViolationEventInit extends EventInit{

    public SecurityPolicyViolationEventInit(){
    }

    @JsProperty(name="documentURI")
    public String documentURI;

    @JsOverlay
    public final String getDocumentURI(){
        return this.documentURI;
    }

    @JsOverlay
    public final void setDocumentURI(String documentURI){
        this.documentURI = documentURI;
    }

    @JsProperty(name="referrer")
    public String referrer;

    @JsOverlay
    public final String getReferrer(){
        return this.referrer;
    }

    @JsOverlay
    public final void setReferrer(String referrer){
        this.referrer = referrer;
    }

    @JsProperty(name="blockedURI")
    public String blockedURI;

    @JsOverlay
    public final String getBlockedURI(){
        return this.blockedURI;
    }

    @JsOverlay
    public final void setBlockedURI(String blockedURI){
        this.blockedURI = blockedURI;
    }

    @JsProperty(name="violatedDirective")
    public String violatedDirective;

    @JsOverlay
    public final String getViolatedDirective(){
        return this.violatedDirective;
    }

    @JsOverlay
    public final void setViolatedDirective(String violatedDirective){
        this.violatedDirective = violatedDirective;
    }

    @JsProperty(name="effectiveDirective")
    public String effectiveDirective;

    @JsOverlay
    public final String getEffectiveDirective(){
        return this.effectiveDirective;
    }

    @JsOverlay
    public final void setEffectiveDirective(String effectiveDirective){
        this.effectiveDirective = effectiveDirective;
    }

    @JsProperty(name="originalPolicy")
    public String originalPolicy;

    @JsOverlay
    public final String getOriginalPolicy(){
        return this.originalPolicy;
    }

    @JsOverlay
    public final void setOriginalPolicy(String originalPolicy){
        this.originalPolicy = originalPolicy;
    }

    @JsProperty(name="disposition")
    public String disposition;

    @JsOverlay
    public final SecurityPolicyViolationEventDisposition getDisposition(){
        return SecurityPolicyViolationEventDisposition.of(this.disposition);
    }

    @JsOverlay
    public final void setDisposition(SecurityPolicyViolationEventDisposition disposition){
        this.disposition = disposition.getInternalValue();
    }

    @JsProperty(name="sourceFile")
    public String sourceFile;

    @JsOverlay
    public final String getSourceFile(){
        return this.sourceFile;
    }

    @JsOverlay
    public final void setSourceFile(String sourceFile){
        this.sourceFile = sourceFile;
    }

    @JsProperty(name="statusCode")
    public short statusCode;

    @JsOverlay
    public final short getStatusCode(){
        return this.statusCode;
    }

    @JsOverlay
    public final void setStatusCode(short statusCode){
        this.statusCode = statusCode;
    }

    @JsProperty(name="lineNumber")
    public double lineNumber;

    @JsOverlay
    public final double getLineNumber(){
        return this.lineNumber;
    }

    @JsOverlay
    public final void setLineNumber(double lineNumber){
        this.lineNumber = lineNumber;
    }

    @JsProperty(name="columnNumber")
    public double columnNumber;

    @JsOverlay
    public final double getColumnNumber(){
        return this.columnNumber;
    }

    @JsOverlay
    public final void setColumnNumber(double columnNumber){
        this.columnNumber = columnNumber;
    }

    @JsProperty(name="sample")
    public String sample;

    @JsOverlay
    public final String getSample(){
        return this.sample;
    }

    @JsOverlay
    public final void setSample(String sample){
        this.sample = sample;
    }


}

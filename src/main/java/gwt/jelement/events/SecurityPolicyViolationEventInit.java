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

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SecurityPolicyViolationEventInit extends EventInit{

    @JsProperty(name="documentURI")
    public String documentURI;

    @JsProperty(name="referrer")
    public String referrer;

    @JsProperty(name="blockedURI")
    public String blockedURI;

    @JsProperty(name="violatedDirective")
    public String violatedDirective;

    @JsProperty(name="effectiveDirective")
    public String effectiveDirective;

    @JsProperty(name="originalPolicy")
    public String originalPolicy;

    @JsProperty(name="disposition")
    public SecurityPolicyViolationEventDisposition disposition;

    @JsProperty(name="sourceFile")
    public String sourceFile;

    @JsProperty(name="statusCode")
    public short statusCode;

    @JsProperty(name="lineNumber")
    public double lineNumber;

    @JsProperty(name="columnNumber")
    public double columnNumber;

    @JsProperty(name="sample")
    public String sample;


}

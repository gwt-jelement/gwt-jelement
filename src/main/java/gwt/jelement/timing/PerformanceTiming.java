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
package gwt.jelement.timing;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PerformanceTiming{
    
    @JsProperty(name="navigationStart")
    public native double getNavigationStart();
    
    @JsProperty(name="unloadEventStart")
    public native double getUnloadEventStart();
    
    @JsProperty(name="unloadEventEnd")
    public native double getUnloadEventEnd();
    
    @JsProperty(name="redirectStart")
    public native double getRedirectStart();
    
    @JsProperty(name="redirectEnd")
    public native double getRedirectEnd();
    
    @JsProperty(name="fetchStart")
    public native double getFetchStart();
    
    @JsProperty(name="domainLookupStart")
    public native double getDomainLookupStart();
    
    @JsProperty(name="domainLookupEnd")
    public native double getDomainLookupEnd();
    
    @JsProperty(name="connectStart")
    public native double getConnectStart();
    
    @JsProperty(name="connectEnd")
    public native double getConnectEnd();
    
    @JsProperty(name="secureConnectionStart")
    public native double getSecureConnectionStart();
    
    @JsProperty(name="requestStart")
    public native double getRequestStart();
    
    @JsProperty(name="responseStart")
    public native double getResponseStart();
    
    @JsProperty(name="responseEnd")
    public native double getResponseEnd();
    
    @JsProperty(name="domLoading")
    public native double getDomLoading();
    
    @JsProperty(name="domInteractive")
    public native double getDomInteractive();
    
    @JsProperty(name="domContentLoadedEventStart")
    public native double getDomContentLoadedEventStart();
    
    @JsProperty(name="domContentLoadedEventEnd")
    public native double getDomContentLoadedEventEnd();
    
    @JsProperty(name="domComplete")
    public native double getDomComplete();
    
    @JsProperty(name="loadEventStart")
    public native double getLoadEventStart();
    
    @JsProperty(name="loadEventEnd")
    public native double getLoadEventEnd();
    
    @JsMethod(name = "toJSON")
    public native Object toJSON();
    
    
}

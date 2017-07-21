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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PerformanceTiming{
    
    @JsProperty(name="navigationStart")
    public native long getNavigationStart();
    
    @JsProperty(name="unloadEventStart")
    public native long getUnloadEventStart();
    
    @JsProperty(name="unloadEventEnd")
    public native long getUnloadEventEnd();
    
    @JsProperty(name="redirectStart")
    public native long getRedirectStart();
    
    @JsProperty(name="redirectEnd")
    public native long getRedirectEnd();
    
    @JsProperty(name="fetchStart")
    public native long getFetchStart();
    
    @JsProperty(name="domainLookupStart")
    public native long getDomainLookupStart();
    
    @JsProperty(name="domainLookupEnd")
    public native long getDomainLookupEnd();
    
    @JsProperty(name="connectStart")
    public native long getConnectStart();
    
    @JsProperty(name="connectEnd")
    public native long getConnectEnd();
    
    @JsProperty(name="secureConnectionStart")
    public native long getSecureConnectionStart();
    
    @JsProperty(name="requestStart")
    public native long getRequestStart();
    
    @JsProperty(name="responseStart")
    public native long getResponseStart();
    
    @JsProperty(name="responseEnd")
    public native long getResponseEnd();
    
    @JsProperty(name="domLoading")
    public native long getDomLoading();
    
    @JsProperty(name="domInteractive")
    public native long getDomInteractive();
    
    @JsProperty(name="domContentLoadedEventStart")
    public native long getDomContentLoadedEventStart();
    
    @JsProperty(name="domContentLoadedEventEnd")
    public native long getDomContentLoadedEventEnd();
    
    @JsProperty(name="domComplete")
    public native long getDomComplete();
    
    @JsProperty(name="loadEventStart")
    public native long getLoadEventStart();
    
    @JsProperty(name="loadEventEnd")
    public native long getLoadEventEnd();
    
    @JsMethod(name = "toJSON")
    public native Any toJSON();
    
}

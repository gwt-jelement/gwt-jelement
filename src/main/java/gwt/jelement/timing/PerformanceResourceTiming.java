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

import gwt.jelement.timing.PerformanceEntry;
import gwt.jelement.timing.PerformanceServerTiming;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PerformanceResourceTiming extends PerformanceEntry{
    
    @JsConstructor
    public PerformanceResourceTiming(){
        super();
    }
    
    @JsProperty(name="initiatorType")
    public String initiatorType;
    
    @JsProperty(name="nextHopProtocol")
    public String nextHopProtocol;
    
    @JsProperty(name="workerStart")
    public double workerStart;
    
    @JsProperty(name="redirectStart")
    public double redirectStart;
    
    @JsProperty(name="redirectEnd")
    public double redirectEnd;
    
    @JsProperty(name="fetchStart")
    public double fetchStart;
    
    @JsProperty(name="domainLookupStart")
    public double domainLookupStart;
    
    @JsProperty(name="domainLookupEnd")
    public double domainLookupEnd;
    
    @JsProperty(name="connectStart")
    public double connectStart;
    
    @JsProperty(name="connectEnd")
    public double connectEnd;
    
    @JsProperty(name="secureConnectionStart")
    public double secureConnectionStart;
    
    @JsProperty(name="requestStart")
    public double requestStart;
    
    @JsProperty(name="responseStart")
    public double responseStart;
    
    @JsProperty(name="responseEnd")
    public double responseEnd;
    
    @JsProperty(name="transferSize")
    public double transferSize;
    
    @JsProperty(name="encodedBodySize")
    public double encodedBodySize;
    
    @JsProperty(name="decodedBodySize")
    public double decodedBodySize;
    
    @JsProperty(name="serverTiming")
    public PerformanceServerTiming[] serverTiming;
    
    
}

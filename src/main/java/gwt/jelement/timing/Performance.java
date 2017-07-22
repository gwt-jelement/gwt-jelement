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

import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.timing.MemoryInfo;
import gwt.jelement.timing.PerformanceEntry;
import gwt.jelement.timing.PerformanceNavigation;
import gwt.jelement.timing.PerformanceTiming;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Performance extends EventTarget{
    
    @JsConstructor
    public Performance(){
        super();
    }
    
    @JsProperty(name="onresourcetimingbufferfull")
    public EventHandlerNonNull onresourcetimingbufferfull;
    
    @JsProperty(name="timing")
    public native PerformanceTiming getTiming();
    
    @JsProperty(name="navigation")
    public native PerformanceNavigation getNavigation();
    
    @JsProperty(name="memory")
    public native MemoryInfo getMemory();
    
    @JsMethod(name = "clearMarks")
    public native void clearMarks();
    
    @JsMethod(name = "clearMarks")
    public native void clearMarks(String markName);
    
    @JsMethod(name = "clearMeasures")
    public native void clearMeasures();
    
    @JsMethod(name = "clearMeasures")
    public native void clearMeasures(String measureName);
    
    @JsMethod(name = "clearResourceTimings")
    public native void clearResourceTimings();
    
    @JsMethod(name = "getEntries")
    public native PerformanceEntry[] getEntries();
    
    @JsMethod(name = "getEntriesByName")
    public native PerformanceEntry[] getEntriesByName(String name);
    
    @JsMethod(name = "getEntriesByName")
    public native PerformanceEntry[] getEntriesByName(String name, String entryType);
    
    @JsMethod(name = "getEntriesByType")
    public native PerformanceEntry[] getEntriesByType(String entryType);
    
    @JsMethod(name = "mark")
    public native void mark(String markName);
    
    @JsMethod(name = "measure")
    public native void measure(String measureName);
    
    @JsMethod(name = "measure")
    public native void measure(String measureName, String startMark);
    
    @JsMethod(name = "measure")
    public native void measure(String measureName, String startMark, String endMark);
    
    @JsMethod(name = "now")
    public native double now();
    
    @JsMethod(name = "setResourceTimingBufferSize")
    public native void setResourceTimingBufferSize(double maxSize);
    
    @JsMethod(name = "toJSON")
    public native Object toJSON();
    
}

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

import gwt.jelement.timing.NavigationType;
import gwt.jelement.timing.PerformanceResourceTiming;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class PerformanceNavigationTiming extends PerformanceResourceTiming{
    
    @JsConstructor
    public PerformanceNavigationTiming(){
        super();
    }
    
    @JsProperty(name="unloadEventStart")
    public double unloadEventStart;
    
    @JsProperty(name="unloadEventEnd")
    public double unloadEventEnd;
    
    @JsProperty(name="domInteractive")
    public double domInteractive;
    
    @JsProperty(name="domContentLoadedEventStart")
    public double domContentLoadedEventStart;
    
    @JsProperty(name="domContentLoadedEventEnd")
    public double domContentLoadedEventEnd;
    
    @JsProperty(name="domComplete")
    public double domComplete;
    
    @JsProperty(name="loadEventStart")
    public double loadEventStart;
    
    @JsProperty(name="loadEventEnd")
    public double loadEventEnd;
    
    @JsProperty(name="type")
    public String type;
    @JsOverlay
    public final NavigationType getType(){
       return NavigationType.of(type);
    }
    
    @JsProperty(name="redirectCount")
    public short redirectCount;
    
    @JsMethod(name = "toJSON")
    public native Object toJSON();
    
}

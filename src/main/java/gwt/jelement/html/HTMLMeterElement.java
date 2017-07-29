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
package gwt.jelement.html;

import gwt.jelement.dom.NodeList;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLMeterElement", isNative = true)
public class HTMLMeterElement extends HTMLElement{
    @JsConstructor
    public HTMLMeterElement(){
        super();
    }
    
    @JsProperty(name="value")
    public native double getValue();
    
    @JsProperty(name="value")
    public native void setValue(double value);
    
    @JsProperty(name="min")
    public native double getMin();
    
    @JsProperty(name="min")
    public native void setMin(double min);
    
    @JsProperty(name="max")
    public native double getMax();
    
    @JsProperty(name="max")
    public native void setMax(double max);
    
    @JsProperty(name="low")
    public native double getLow();
    
    @JsProperty(name="low")
    public native void setLow(double low);
    
    @JsProperty(name="high")
    public native double getHigh();
    
    @JsProperty(name="high")
    public native void setHigh(double high);
    
    @JsProperty(name="optimum")
    public native double getOptimum();
    
    @JsProperty(name="optimum")
    public native void setOptimum(double optimum);
    
    @JsProperty(name="labels")
    public native NodeList getLabels();
    
}

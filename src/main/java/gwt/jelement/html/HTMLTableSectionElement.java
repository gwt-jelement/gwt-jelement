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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLTableSectionElement", isNative = true)
public class HTMLTableSectionElement extends HTMLElement {
    @JsProperty(name="rows")
    public native HTMLCollection getRows();
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="ch")
    public native String getCh();
    
    @JsProperty(name="ch")
    public native void setCh(String ch);
    
    @JsProperty(name="chOff")
    public native String getChOff();
    
    @JsProperty(name="chOff")
    public native void setChOff(String chOff);
    
    @JsProperty(name="vAlign")
    public native String getVAlign();
    
    @JsProperty(name="vAlign")
    public native void setVAlign(String vAlign);
    
    @JsMethod(name = "deleteRow")
    public native void deleteRow(double index);
    
    @JsMethod(name = "insertRow")
    public native HTMLElement insertRow();
    
    @JsMethod(name = "insertRow")
    public native HTMLElement insertRow(double index);
    
}

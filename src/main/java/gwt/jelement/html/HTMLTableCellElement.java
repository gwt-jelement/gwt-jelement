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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLTableCellElement", isNative = true)
public class HTMLTableCellElement extends HTMLElement {
    @JsProperty(name="colSpan")
    public native double getColSpan();
    
    @JsProperty(name="colSpan")
    public native void setColSpan(double colSpan);
    
    @JsProperty(name="rowSpan")
    public native double getRowSpan();
    
    @JsProperty(name="rowSpan")
    public native void setRowSpan(double rowSpan);
    
    @JsProperty(name="headers")
    public native String getHeaders();
    
    @JsProperty(name="headers")
    public native void setHeaders(String headers);
    
    @JsProperty(name="cellIndex")
    public native double getCellIndex();
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="axis")
    public native String getAxis();
    
    @JsProperty(name="axis")
    public native void setAxis(String axis);
    
    @JsProperty(name="height")
    public native String getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(String height);
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
    @JsProperty(name="ch")
    public native String getCh();
    
    @JsProperty(name="ch")
    public native void setCh(String ch);
    
    @JsProperty(name="chOff")
    public native String getChOff();
    
    @JsProperty(name="chOff")
    public native void setChOff(String chOff);
    
    @JsProperty(name="noWrap")
    public native boolean isNoWrap();
    
    @JsProperty(name="noWrap")
    public native void setNoWrap(boolean noWrap);
    
    @JsProperty(name="vAlign")
    public native String getVAlign();
    
    @JsProperty(name="vAlign")
    public native void setVAlign(String vAlign);
    
    @JsProperty(name="bgColor")
    public native String getBgColor();
    
    @JsProperty(name="bgColor")
    public native void setBgColor(String bgColor);
    
    @JsProperty(name="abbr")
    public native String getAbbr();
    
    @JsProperty(name="abbr")
    public native void setAbbr(String abbr);
    
    @JsProperty(name="scope")
    public native String getScope();
    
    @JsProperty(name="scope")
    public native void setScope(String scope);
    
}

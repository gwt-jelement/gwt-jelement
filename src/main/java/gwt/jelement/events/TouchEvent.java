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

import gwt.jelement.dom.TouchList;
import gwt.jelement.events.TouchEventInit;
import gwt.jelement.events.UIEvent;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TouchEvent", isNative = true)
public class TouchEvent extends UIEvent{
    @JsConstructor
    public TouchEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public TouchEvent(String type, TouchEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="touches")
    public native TouchList getTouches();
    
    @JsProperty(name="targetTouches")
    public native TouchList getTargetTouches();
    
    @JsProperty(name="changedTouches")
    public native TouchList getChangedTouches();
    
    @JsProperty(name="altKey")
    public native boolean getAltKey();
    
    @JsProperty(name="metaKey")
    public native boolean getMetaKey();
    
    @JsProperty(name="ctrlKey")
    public native boolean getCtrlKey();
    
    @JsProperty(name="shiftKey")
    public native boolean getShiftKey();
    
}

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

import gwt.jelement.dom.Node;
import gwt.jelement.events.EventTarget;
import gwt.jelement.events.MouseEventInit;
import gwt.jelement.events.UIEvent;
import gwt.jelement.frame.Window;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MouseEvent extends UIEvent{
    
    @JsConstructor
    public MouseEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public MouseEvent(String type, MouseEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="screenX")
    public double screenX;
    
    @JsProperty(name="screenY")
    public double screenY;
    
    @JsProperty(name="clientX")
    public double clientX;
    
    @JsProperty(name="clientY")
    public double clientY;
    
    @JsProperty(name="ctrlKey")
    public boolean ctrlKey;
    
    @JsProperty(name="shiftKey")
    public boolean shiftKey;
    
    @JsProperty(name="altKey")
    public boolean altKey;
    
    @JsProperty(name="metaKey")
    public boolean metaKey;
    
    @JsProperty(name="button")
    public short button;
    
    @JsProperty(name="buttons")
    public short buttons;
    
    @JsProperty(name="relatedTarget")
    public EventTarget relatedTarget;
    
    @JsProperty(name="pageX")
    public double pageX;
    
    @JsProperty(name="pageY")
    public double pageY;
    
    @JsProperty(name="x")
    public double x;
    
    @JsProperty(name="y")
    public double y;
    
    @JsProperty(name="offsetX")
    public double offsetX;
    
    @JsProperty(name="offsetY")
    public double offsetY;
    
    @JsProperty(name="movementX")
    public double movementX;
    
    @JsProperty(name="movementY")
    public double movementY;
    
    @JsProperty(name="region")
    public String region;
    
    @JsProperty(name="fromElement")
    public Node fromElement;
    
    @JsProperty(name="toElement")
    public Node toElement;
    
    @JsProperty(name="layerX")
    public double layerX;
    
    @JsProperty(name="layerY")
    public double layerY;
    
    @JsMethod(name = "getModifierState")
    public native boolean getModifierState(String keyArg);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent();
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY, boolean ctrlKey);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY, boolean ctrlKey, boolean altKey);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY, boolean ctrlKey, boolean altKey, boolean shiftKey);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY, boolean ctrlKey, boolean altKey, boolean shiftKey, boolean metaKey);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY, boolean ctrlKey, boolean altKey, boolean shiftKey, boolean metaKey, short button);
    
    @JsMethod(name = "initMouseEvent")
    public native void initMouseEvent(String type, boolean bubbles, boolean cancelable, Window view, double detail, double screenX, double screenY, double clientX, double clientY, boolean ctrlKey, boolean altKey, boolean shiftKey, boolean metaKey, short button, EventTarget relatedTarget);
    
}

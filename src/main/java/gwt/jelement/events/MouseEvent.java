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
    public native double getScreenX();
    
    @JsProperty(name="screenY")
    public native double getScreenY();
    
    @JsProperty(name="clientX")
    public native double getClientX();
    
    @JsProperty(name="clientY")
    public native double getClientY();
    
    @JsProperty(name="ctrlKey")
    public native boolean getCtrlKey();
    
    @JsProperty(name="shiftKey")
    public native boolean getShiftKey();
    
    @JsProperty(name="altKey")
    public native boolean getAltKey();
    
    @JsProperty(name="metaKey")
    public native boolean getMetaKey();
    
    @JsProperty(name="button")
    public native short getButton();
    
    @JsProperty(name="buttons")
    public native short getButtons();
    
    @JsProperty(name="relatedTarget")
    public native EventTarget getRelatedTarget();
    
    @JsProperty(name="pageX")
    public native double getPageX();
    
    @JsProperty(name="pageY")
    public native double getPageY();
    
    @JsProperty(name="x")
    public native double getX();
    
    @JsProperty(name="y")
    public native double getY();
    
    @JsProperty(name="offsetX")
    public native double getOffsetX();
    
    @JsProperty(name="offsetY")
    public native double getOffsetY();
    
    @JsProperty(name="movementX")
    public native double getMovementX();
    
    @JsProperty(name="movementY")
    public native double getMovementY();
    
    @JsProperty(name="region")
    public native String getRegion();
    
    @JsProperty(name="fromElement")
    public native Node getFromElement();
    
    @JsProperty(name="toElement")
    public native Node getToElement();
    
    @JsProperty(name="layerX")
    public native double getLayerX();
    
    @JsProperty(name="layerY")
    public native double getLayerY();
    
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

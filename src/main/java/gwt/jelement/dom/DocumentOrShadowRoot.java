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
package gwt.jelement.dom;

import gwt.jelement.css.StyleSheetList;
import gwt.jelement.dom.Element;
import gwt.jelement.editing.Selection;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class DocumentOrShadowRoot{
    
    @JsProperty(name="activeElement")
    public native Element getActiveElement();
    
    @JsProperty(name="styleSheets")
    public native StyleSheetList getStyleSheets();
    
    @JsProperty(name="pointerLockElement")
    public native Element getPointerLockElement();
    
    @JsProperty(name="fullscreenElement")
    public native Element getFullscreenElement();
    
    @JsMethod(name = "elementFromPoint")
    public native Element elementFromPoint(long x, long y);
    
    @JsMethod(name = "elementsFromPoint")
    public native Element[] elementsFromPoint(long x, long y);
    
    @JsMethod(name = "getSelection")
    public native Selection getSelection();
    
}

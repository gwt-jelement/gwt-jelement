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
import gwt.jelement.dom.DocumentFragment;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.ShadowRoot;
import gwt.jelement.dom.ShadowRootMode;
import gwt.jelement.editing.Selection;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ShadowRoot extends DocumentFragment{
    
    @JsConstructor
    public ShadowRoot(){
        super();
    }
    
    @JsProperty(name="mode")
    public String mode;
    @JsOverlay
    public final ShadowRootMode getMode(){
       return ShadowRootMode.of(mode);
    }
    
    @JsProperty(name="host")
    public Element host;
    
    @JsProperty(name="olderShadowRoot")
    public ShadowRoot olderShadowRoot;
    
    @JsProperty(name="innerHTML")
    public String innerHTML;
    
    @JsProperty(name="delegatesFocus")
    public boolean delegatesFocus;
    
    @JsProperty(name="activeElement")
    public Element activeElement;
    
    @JsProperty(name="styleSheets")
    public StyleSheetList styleSheets;
    
    @JsProperty(name="pointerLockElement")
    public Element pointerLockElement;
    
    @JsProperty(name="fullscreenElement")
    public Element fullscreenElement;
    
    @JsMethod(name = "elementFromPoint")
    public native Element elementFromPoint(double x, double y);
    
    @JsMethod(name = "elementsFromPoint")
    public native Element[] elementsFromPoint(double x, double y);
    
    @JsMethod(name = "getSelection")
    public native Selection getSelection();
    
}

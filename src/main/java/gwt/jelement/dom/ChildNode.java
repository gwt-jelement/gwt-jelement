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

import gwt.jelement.dom.Node;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ChildNode{
    
    @JsMethod(name = "after")
    public native void after();
    
    
    @JsMethod(name = "after")
    public native void after(Node... nodes);
    
    
    @JsMethod(name = "after")
    public native void after(String... nodes);
    
    
    @JsMethod(name = "before")
    public native void before();
    
    
    @JsMethod(name = "before")
    public native void before(Node... nodes);
    
    
    @JsMethod(name = "before")
    public native void before(String... nodes);
    
    
    @JsMethod(name = "remove")
    public native void remove();
    
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith();
    
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith(Node... nodes);
    
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith(String... nodes);
    
    
}

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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ResizeObserver", isNative = true)
public class ResizeObserver extends JsObject{
    @JsConstructor
    public ResizeObserver(ResizeObserverCallback callback){
        super();
    }
    
    @JsMethod(name = "disconnect")
    public native void disconnect();
    
    @JsMethod(name = "observe")
    public native void observe(Element target);
    
    @JsMethod(name = "unobserve")
    public native void unobserve(Element target);
    
}

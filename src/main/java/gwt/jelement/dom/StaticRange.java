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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="StaticRange", isNative = true)
public class StaticRange implements IsObject {
    @JsProperty(name="startContainer")
    public native Node getStartContainer();
    
    @JsProperty(name="startOffset")
    public native double getStartOffset();
    
    @JsProperty(name="endContainer")
    public native Node getEndContainer();
    
    @JsProperty(name="endOffset")
    public native double getEndOffset();
    
    @JsProperty(name="collapsed")
    public native boolean getCollapsed();
    
}

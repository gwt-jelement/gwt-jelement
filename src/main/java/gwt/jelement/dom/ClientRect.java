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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ClientRect", isNative = true)
public class ClientRect{
    @JsProperty(name="top")
    public native float getTop();
    
    @JsProperty(name="right")
    public native float getRight();
    
    @JsProperty(name="bottom")
    public native float getBottom();
    
    @JsProperty(name="left")
    public native float getLeft();
    
    @JsProperty(name="width")
    public native float getWidth();
    
    @JsProperty(name="height")
    public native float getHeight();
    
}

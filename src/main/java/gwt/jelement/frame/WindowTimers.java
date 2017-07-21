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
package gwt.jelement.frame;

import elemental2.core.Function;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WindowTimers{
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval();
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval(long handle);
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout();
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout(long handle);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(Function handler);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(String handler);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(Function handler, long timeout, Any arguments);
    
    @JsMethod(name = "setInterval")
    public native long setInterval(String handler, long timeout, Any arguments);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(Function handler);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(String handler);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(Function handler, long timeout, Any arguments);
    
    @JsMethod(name = "setTimeout")
    public native long setTimeout(String handler, long timeout, Any arguments);
    
}

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

import gwt.jelement.frame.ScrollRestoration;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class History{
    
    @JsProperty(name="scrollRestoration")
    public ScrollRestoration scrollRestoration;
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsProperty(name="state")
    public native Object getState();
    
    @JsMethod(name = "back")
    public native void back();
    
    @JsMethod(name = "forward")
    public native void forward();
    
    @JsMethod(name = "go")
    public native void go();
    
    @JsMethod(name = "go")
    public native void go(double delta);
    
    @JsMethod(name = "pushState")
    public native void pushState(Object data, String title);
    
    @JsMethod(name = "pushState")
    public native void pushState(Object data, String title, String url);
    
    @JsMethod(name = "replaceState")
    public native void replaceState(Object data, String title);
    
    @JsMethod(name = "replaceState")
    public native void replaceState(Object data, String title, String url);
    
}

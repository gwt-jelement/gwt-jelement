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
package gwt.jelement;

import gwt.jelement.core.JsObject;
import gwt.jelement.core.Math;
import gwt.jelement.frame.Console;
import gwt.jelement.frame.Location;
import gwt.jelement.frame.Navigator;
import gwt.jelement.frame.Window;
import gwt.jelement.html.HTMLDocument;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="window", isNative = true)
public class Browser extends JsObject{
    @JsProperty(name="navigator")
    public static Navigator navigator;
    
    @JsProperty(name="window")
    public static Window window;
    
    @JsProperty(name="document")
    public static HTMLDocument document;
    
    @JsProperty(name="location")
    public static Location location;
    
    @JsProperty(name="self")
    public static Window self;
    
    @JsProperty(name="top")
    public static Window top;
    
    @JsProperty(name="console")
    public static Console console;
    
    @JsProperty(name="Infinity")
    public static double Infinity;
    
    @JsProperty(name="NaN")
    public static double NaN;
    
    @JsProperty(name="undefined")
    public static Object undefined;
    
    @JsProperty(name="Math")
    public static Math JsMath;
    
    @JsConstructor
    public Browser(){
        super();
    }
    
    @JsMethod(name = "decodeURI")
    public static native String decodeURI(String value);
    
    @JsMethod(name = "decodeURIComponent")
    public static native String decodeURIComponent(String component);
    
    @JsMethod(name = "encodeURI")
    public static native String encodeURI(String uri);
    
    @JsMethod(name = "encodeURIComponent")
    public static native String encodeURIComponent(String uriComponent);
    
    @Deprecated
    @JsMethod(name = "escape")
    public static native String escape(String value);
    
    @JsMethod(name = "eval")
    public static native Object eval(String code);
    
    @JsMethod(name = "isFinite")
    public static native boolean isFinite(Object value);
    
    @JsMethod(name = "isNaN")
    public static native boolean isNaN(Object value);
    
    @JsMethod(name = "parseFloat")
    public static native double parseFloat(Object value);
    
    @JsMethod(name = "parseInt")
    public static native int parseInt(String value, int radix);
    
    @Deprecated
    @JsMethod(name = "unescape")
    public static native String unescape(String value);
    
    @JsMethod(name = "uneval")
    public static native String uneval(Object value);
    
}

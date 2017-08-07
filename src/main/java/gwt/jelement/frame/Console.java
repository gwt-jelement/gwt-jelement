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

import gwt.jelement.core.Array;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Console", isNative = true)
public class Console implements IsObject {
    @JsMethod(name = "assert")
    public native void assert_();
    
    @JsMethod(name = "assert")
    public native void assert_(boolean condition, Object... data);
    
    @JsMethod(name = "clear")
    public native void clear();
    
    @JsMethod(name = "count")
    public native void count();
    
    @JsMethod(name = "count")
    public native void count(String label);
    
    @JsMethod(name = "debug")
    public native void debug(Object... data);
    
    @JsMethod(name = "dir")
    public native void dir(Object item);
    
    @JsMethod(name = "dir")
    public native void dir(Object item, Object options);
    
    @JsMethod(name = "dirxml")
    public native void dirxml(Object... data);
    
    @JsMethod(name = "error")
    public native void error(Object... data);
    
    @JsMethod(name = "group")
    public native void group(Object... data);
    
    @JsMethod(name = "groupCollapsed")
    public native void groupCollapsed(Object... data);
    
    @JsMethod(name = "groupEnd")
    public native void groupEnd();
    
    @JsMethod(name = "info")
    public native void info(Object... data);
    
    @JsMethod(name = "log")
    public native void log(Object... data);
    
    @JsMethod(name = "table")
    public native void table(Object tabularData);
    
    @JsMethod(name = "table")
    public native void table(Object tabularData, String[] properties);
    
    @JsMethod(name = "table")
    public native void table(Object tabularData, Array properties);
    
    @JsMethod(name = "time")
    public native void time();
    
    @JsMethod(name = "time")
    public native void time(String label);
    
    @JsMethod(name = "timeEnd")
    public native void timeEnd();
    
    @JsMethod(name = "timeEnd")
    public native void timeEnd(String label);
    
    @JsMethod(name = "trace")
    public native void trace(Object... data);
    
    @JsMethod(name = "warn")
    public native void warn(Object... data);
    
}

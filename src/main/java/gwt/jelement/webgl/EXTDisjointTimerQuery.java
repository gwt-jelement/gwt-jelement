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
package gwt.jelement.webgl;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="EXTDisjointTimerQuery", isNative = true)
public class EXTDisjointTimerQuery extends JsObject{
    public static double QUERY_COUNTER_BITS_EXT;
    public static double CURRENT_QUERY_EXT;
    public static double QUERY_RESULT_EXT;
    public static double QUERY_RESULT_AVAILABLE_EXT;
    public static double TIME_ELAPSED_EXT;
    public static double TIMESTAMP_EXT;
    public static double GPU_DISJOINT_EXT;
    
    @JsConstructor
    public EXTDisjointTimerQuery(){
        super();
    }
    
    @JsMethod(name = "beginQueryEXT")
    public native void beginQueryEXT(double target, WebGLTimerQueryEXT query);
    
    @JsMethod(name = "createQueryEXT")
    public native WebGLTimerQueryEXT createQueryEXT();
    
    @JsMethod(name = "deleteQueryEXT")
    public native void deleteQueryEXT(WebGLTimerQueryEXT query);
    
    @JsMethod(name = "endQueryEXT")
    public native void endQueryEXT(double target);
    
    @JsMethod(name = "getQueryEXT")
    public native Object getQueryEXT(double target, double pname);
    
    @JsMethod(name = "getQueryObjectEXT")
    public native Object getQueryObjectEXT(WebGLTimerQueryEXT query, double pname);
    
    @JsMethod(name = "isQueryEXT")
    public native boolean isQueryEXT(WebGLTimerQueryEXT query);
    
    @JsMethod(name = "queryCounterEXT")
    public native void queryCounterEXT(WebGLTimerQueryEXT query, double target);
    
}

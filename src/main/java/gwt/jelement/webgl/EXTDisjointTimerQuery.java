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

import gwt.jelement.webgl.WebGLTimerQueryEXT;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class EXTDisjointTimerQuery{
    public static final int QUERY_COUNTER_BITS_EXT = 0x8864;
    public static final int CURRENT_QUERY_EXT = 0x8865;
    public static final int QUERY_RESULT_EXT = 0x8866;
    public static final int QUERY_RESULT_AVAILABLE_EXT = 0x8867;
    public static final int TIME_ELAPSED_EXT = 0x88BF;
    public static final int TIMESTAMP_EXT = 0x8E28;
    public static final int GPU_DISJOINT_EXT = 0x8FBB;
    
    
    @JsMethod(name = "beginQueryEXT")
    public native void beginQueryEXT(long target, WebGLTimerQueryEXT query);
    
    @JsMethod(name = "createQueryEXT")
    public native WebGLTimerQueryEXT createQueryEXT();
    
    @JsMethod(name = "deleteQueryEXT")
    public native void deleteQueryEXT(WebGLTimerQueryEXT query);
    
    @JsMethod(name = "endQueryEXT")
    public native void endQueryEXT(long target);
    
    @JsMethod(name = "getQueryEXT")
    public native Any getQueryEXT(long target, long pname);
    
    @JsMethod(name = "getQueryObjectEXT")
    public native Any getQueryObjectEXT(WebGLTimerQueryEXT query, long pname);
    
    @JsMethod(name = "isQueryEXT")
    public native boolean isQueryEXT(WebGLTimerQueryEXT query);
    
    @JsMethod(name = "queryCounterEXT")
    public native void queryCounterEXT(WebGLTimerQueryEXT query, long target);
    
}

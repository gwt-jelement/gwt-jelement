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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ANGLEInstancedArrays{
    public static final int VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE = 0x88FE;
    
    
    @JsMethod(name = "drawArraysInstancedANGLE")
    public native void drawArraysInstancedANGLE(long mode, long first, long count, long primcount);
    
    @JsMethod(name = "drawElementsInstancedANGLE")
    public native void drawElementsInstancedANGLE(long mode, long count, long type, long offset, long primcount);
    
    @JsMethod(name = "vertexAttribDivisorANGLE")
    public native void vertexAttribDivisorANGLE(long index, long divisor);
    
}

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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="ANGLEInstancedArrays", isNative = true)
public class ANGLEInstancedArrays extends IsObject{
    public static double VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE; /* 0x88FE */
    
    @JsMethod(name = "drawArraysInstancedANGLE")
    public native void drawArraysInstancedANGLE(double mode, double first, double count, double primcount);
    
    @JsMethod(name = "drawElementsInstancedANGLE")
    public native void drawElementsInstancedANGLE(double mode, double count, double type, double offset, double primcount);
    
    @JsMethod(name = "vertexAttribDivisorANGLE")
    public native void vertexAttribDivisorANGLE(double index, double divisor);
    
}

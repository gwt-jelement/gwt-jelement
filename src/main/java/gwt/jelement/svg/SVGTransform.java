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
package gwt.jelement.svg;

import gwt.jelement.svg.SVGMatrix;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGTransform{
    public static int SVG_TRANSFORM_UNKNOWN;
    public static int SVG_TRANSFORM_MATRIX;
    public static int SVG_TRANSFORM_TRANSLATE;
    public static int SVG_TRANSFORM_SCALE;
    public static int SVG_TRANSFORM_ROTATE;
    public static int SVG_TRANSFORM_SKEWX;
    public static int SVG_TRANSFORM_SKEWY;
    
    
    @JsProperty(name="type")
    public short type;
    
    @JsProperty(name="matrix")
    public SVGMatrix matrix;
    
    @JsProperty(name="angle")
    public float angle;
    
    @JsMethod(name = "setMatrix")
    public native void setMatrix(SVGMatrix matrix);
    
    @JsMethod(name = "setRotate")
    public native void setRotate(float angle, float cx, float cy);
    
    @JsMethod(name = "setScale")
    public native void setScale(float sx, float sy);
    
    @JsMethod(name = "setSkewX")
    public native void setSkewX(float angle);
    
    @JsMethod(name = "setSkewY")
    public native void setSkewY(float angle);
    
    @JsMethod(name = "setTranslate")
    public native void setTranslate(float tx, float ty);
    
}

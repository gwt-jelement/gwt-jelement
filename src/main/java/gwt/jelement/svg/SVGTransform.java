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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="SVGTransform", isNative = true)
public class SVGTransform extends JsObject{
    public static short SVG_TRANSFORM_UNKNOWN; /* 0 */
    public static short SVG_TRANSFORM_MATRIX; /* 1 */
    public static short SVG_TRANSFORM_TRANSLATE; /* 2 */
    public static short SVG_TRANSFORM_SCALE; /* 3 */
    public static short SVG_TRANSFORM_ROTATE; /* 4 */
    public static short SVG_TRANSFORM_SKEWX; /* 5 */
    public static short SVG_TRANSFORM_SKEWY; /* 6 */
    
    @JsConstructor
    public SVGTransform(){
        super();
    }
    
    @JsProperty(name="type")
    public native short getType();
    
    @JsProperty(name="matrix")
    public native SVGMatrix getMatrix();
    
    @JsProperty(name="angle")
    public native double getAngle();
    
    @JsMethod(name = "setMatrix")
    public native void setMatrix(SVGMatrix matrix);
    
    @JsMethod(name = "setRotate")
    public native void setRotate(double angle, double cx, double cy);
    
    @JsMethod(name = "setScale")
    public native void setScale(double sx, double sy);
    
    @JsMethod(name = "setSkewX")
    public native void setSkewX(double angle);
    
    @JsMethod(name = "setSkewY")
    public native void setSkewY(double angle);
    
    @JsMethod(name = "setTranslate")
    public native void setTranslate(double tx, double ty);
    
}

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
package gwt.jelement.html;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TextMetrics", isNative = true)
public class TextMetrics extends IsObject{
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="actualBoundingBoxLeft")
    public native double getActualBoundingBoxLeft();
    
    @JsProperty(name="actualBoundingBoxRight")
    public native double getActualBoundingBoxRight();
    
    @JsProperty(name="fontBoundingBoxAscent")
    public native double getFontBoundingBoxAscent();
    
    @JsProperty(name="fontBoundingBoxDescent")
    public native double getFontBoundingBoxDescent();
    
    @JsProperty(name="actualBoundingBoxAscent")
    public native double getActualBoundingBoxAscent();
    
    @JsProperty(name="actualBoundingBoxDescent")
    public native double getActualBoundingBoxDescent();
    
    @JsProperty(name="emHeightAscent")
    public native double getEmHeightAscent();
    
    @JsProperty(name="emHeightDescent")
    public native double getEmHeightDescent();
    
    @JsProperty(name="hangingBaseline")
    public native double getHangingBaseline();
    
    @JsProperty(name="alphabeticBaseline")
    public native double getAlphabeticBaseline();
    
    @JsProperty(name="ideographicBaseline")
    public native double getIdeographicBaseline();
    
}

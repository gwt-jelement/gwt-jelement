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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TextMetrics", isNative = true)
public class TextMetrics{
    @JsProperty(name="width")
    public native float getWidth();
    
    @JsProperty(name="actualBoundingBoxLeft")
    public native float getActualBoundingBoxLeft();
    
    @JsProperty(name="actualBoundingBoxRight")
    public native float getActualBoundingBoxRight();
    
    @JsProperty(name="fontBoundingBoxAscent")
    public native float getFontBoundingBoxAscent();
    
    @JsProperty(name="fontBoundingBoxDescent")
    public native float getFontBoundingBoxDescent();
    
    @JsProperty(name="actualBoundingBoxAscent")
    public native float getActualBoundingBoxAscent();
    
    @JsProperty(name="actualBoundingBoxDescent")
    public native float getActualBoundingBoxDescent();
    
    @JsProperty(name="emHeightAscent")
    public native float getEmHeightAscent();
    
    @JsProperty(name="emHeightDescent")
    public native float getEmHeightDescent();
    
    @JsProperty(name="hangingBaseline")
    public native float getHangingBaseline();
    
    @JsProperty(name="alphabeticBaseline")
    public native float getAlphabeticBaseline();
    
    @JsProperty(name="ideographicBaseline")
    public native float getIdeographicBaseline();
    
}

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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class TextMetrics{
    
    @JsProperty(name="width")
    public float width;
    
    @JsProperty(name="actualBoundingBoxLeft")
    public float actualBoundingBoxLeft;
    
    @JsProperty(name="actualBoundingBoxRight")
    public float actualBoundingBoxRight;
    
    @JsProperty(name="fontBoundingBoxAscent")
    public float fontBoundingBoxAscent;
    
    @JsProperty(name="fontBoundingBoxDescent")
    public float fontBoundingBoxDescent;
    
    @JsProperty(name="actualBoundingBoxAscent")
    public float actualBoundingBoxAscent;
    
    @JsProperty(name="actualBoundingBoxDescent")
    public float actualBoundingBoxDescent;
    
    @JsProperty(name="emHeightAscent")
    public float emHeightAscent;
    
    @JsProperty(name="emHeightDescent")
    public float emHeightDescent;
    
    @JsProperty(name="hangingBaseline")
    public float hangingBaseline;
    
    @JsProperty(name="alphabeticBaseline")
    public float alphabeticBaseline;
    
    @JsProperty(name="ideographicBaseline")
    public float ideographicBaseline;
    
    
}

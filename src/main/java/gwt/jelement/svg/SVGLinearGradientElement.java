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

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="SVGLinearGradientElement", isNative = true)
public class SVGLinearGradientElement extends SVGGradientElement {
    @JsProperty(name="x1")
    public native SVGAnimatedLength getX1();
    
    @JsProperty(name="y1")
    public native SVGAnimatedLength getY1();
    
    @JsProperty(name="x2")
    public native SVGAnimatedLength getX2();
    
    @JsProperty(name="y2")
    public native SVGAnimatedLength getY2();
    
}

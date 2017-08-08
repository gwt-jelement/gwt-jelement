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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class SVGZoomAndPan implements IsObject {
    public static short SVG_ZOOMANDPAN_UNKNOWN; /* 0 */
    public static short SVG_ZOOMANDPAN_DISABLE; /* 1 */
    public static short SVG_ZOOMANDPAN_MAGNIFY; /* 2 */
    
    @JsProperty(name="zoomAndPan")
    public native short getZoomAndPan();
    
    @JsProperty(name="zoomAndPan")
    public native void setZoomAndPan(short zoomAndPan);
    
}

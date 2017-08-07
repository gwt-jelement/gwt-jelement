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

@JsType(namespace = JsPackage.GLOBAL, name="SVGPreserveAspectRatio", isNative = true)
public class SVGPreserveAspectRatio implements IsObject {
    public static short SVG_PRESERVEASPECTRATIO_UNKNOWN; /* 0 */
    public static short SVG_PRESERVEASPECTRATIO_NONE; /* 1 */
    public static short SVG_PRESERVEASPECTRATIO_XMINYMIN; /* 2 */
    public static short SVG_PRESERVEASPECTRATIO_XMIDYMIN; /* 3 */
    public static short SVG_PRESERVEASPECTRATIO_XMAXYMIN; /* 4 */
    public static short SVG_PRESERVEASPECTRATIO_XMINYMID; /* 5 */
    public static short SVG_PRESERVEASPECTRATIO_XMIDYMID; /* 6 */
    public static short SVG_PRESERVEASPECTRATIO_XMAXYMID; /* 7 */
    public static short SVG_PRESERVEASPECTRATIO_XMINYMAX; /* 8 */
    public static short SVG_PRESERVEASPECTRATIO_XMIDYMAX; /* 9 */
    public static short SVG_PRESERVEASPECTRATIO_XMAXYMAX; /* 10 */
    public static short SVG_MEETORSLICE_UNKNOWN; /* 0 */
    public static short SVG_MEETORSLICE_MEET; /* 1 */
    public static short SVG_MEETORSLICE_SLICE; /* 2 */
    
    @JsProperty(name="align")
    public native short getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(short align);
    
    @JsProperty(name="meetOrSlice")
    public native short getMeetOrSlice();
    
    @JsProperty(name="meetOrSlice")
    public native void setMeetOrSlice(short meetOrSlice);
    
}

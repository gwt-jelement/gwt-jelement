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
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class EXTsRGB implements IsObject {
    public static double SRGB_EXT; /* 0x8C40 */
    public static double SRGB_ALPHA_EXT; /* 0x8C42 */
    public static double SRGB8_ALPHA8_EXT; /* 0x8C43 */
    public static double FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING_EXT; /* 0x8210 */
    
}

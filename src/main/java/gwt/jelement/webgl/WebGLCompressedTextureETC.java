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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="WebGLCompressedTextureETC", isNative = true)
public class WebGLCompressedTextureETC extends JsObject{
    public static double COMPRESSED_R11_EAC; /* 0x9270 */
    public static double COMPRESSED_SIGNED_R11_EAC; /* 0x9271 */
    public static double COMPRESSED_RG11_EAC; /* 0x9272 */
    public static double COMPRESSED_SIGNED_RG11_EAC; /* 0x9273 */
    public static double COMPRESSED_RGB8_ETC2; /* 0x9274 */
    public static double COMPRESSED_SRGB8_ETC2; /* 0x9275 */
    public static double COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2; /* 0x9276 */
    public static double COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2; /* 0x9277 */
    public static double COMPRESSED_RGBA8_ETC2_EAC; /* 0x9278 */
    public static double COMPRESSED_SRGB8_ALPHA8_ETC2_EAC; /* 0x9279 */
    
    @JsConstructor
    public WebGLCompressedTextureETC(){
        super();
    }
    
}

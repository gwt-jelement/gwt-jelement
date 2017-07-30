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

@JsType(namespace = JsPackage.GLOBAL, name="WebGLCompressedTexturePVRTC", isNative = true)
public class WebGLCompressedTexturePVRTC extends JsObject{
    public static double COMPRESSED_RGB_PVRTC_4BPPV1_IMG; /* 0x8C00 */
    public static double COMPRESSED_RGB_PVRTC_2BPPV1_IMG; /* 0x8C01 */
    public static double COMPRESSED_RGBA_PVRTC_4BPPV1_IMG; /* 0x8C02 */
    public static double COMPRESSED_RGBA_PVRTC_2BPPV1_IMG; /* 0x8C03 */
    
    @JsConstructor
    public WebGLCompressedTexturePVRTC(){
        super();
    }
    
}

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

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WebGLDrawBuffers{
    public static final int COLOR_ATTACHMENT0_WEBGL = 0x8CE0;
    public static final int COLOR_ATTACHMENT1_WEBGL = 0x8CE1;
    public static final int COLOR_ATTACHMENT2_WEBGL = 0x8CE2;
    public static final int COLOR_ATTACHMENT3_WEBGL = 0x8CE3;
    public static final int COLOR_ATTACHMENT4_WEBGL = 0x8CE4;
    public static final int COLOR_ATTACHMENT5_WEBGL = 0x8CE5;
    public static final int COLOR_ATTACHMENT6_WEBGL = 0x8CE6;
    public static final int COLOR_ATTACHMENT7_WEBGL = 0x8CE7;
    public static final int COLOR_ATTACHMENT8_WEBGL = 0x8CE8;
    public static final int COLOR_ATTACHMENT9_WEBGL = 0x8CE9;
    public static final int COLOR_ATTACHMENT10_WEBGL = 0x8CEA;
    public static final int COLOR_ATTACHMENT11_WEBGL = 0x8CEB;
    public static final int COLOR_ATTACHMENT12_WEBGL = 0x8CEC;
    public static final int COLOR_ATTACHMENT13_WEBGL = 0x8CED;
    public static final int COLOR_ATTACHMENT14_WEBGL = 0x8CEE;
    public static final int COLOR_ATTACHMENT15_WEBGL = 0x8CEF;
    public static final int DRAW_BUFFER0_WEBGL = 0x8825;
    public static final int DRAW_BUFFER1_WEBGL = 0x8826;
    public static final int DRAW_BUFFER2_WEBGL = 0x8827;
    public static final int DRAW_BUFFER3_WEBGL = 0x8828;
    public static final int DRAW_BUFFER4_WEBGL = 0x8829;
    public static final int DRAW_BUFFER5_WEBGL = 0x882A;
    public static final int DRAW_BUFFER6_WEBGL = 0x882B;
    public static final int DRAW_BUFFER7_WEBGL = 0x882C;
    public static final int DRAW_BUFFER8_WEBGL = 0x882D;
    public static final int DRAW_BUFFER9_WEBGL = 0x882E;
    public static final int DRAW_BUFFER10_WEBGL = 0x882F;
    public static final int DRAW_BUFFER11_WEBGL = 0x8830;
    public static final int DRAW_BUFFER12_WEBGL = 0x8831;
    public static final int DRAW_BUFFER13_WEBGL = 0x8832;
    public static final int DRAW_BUFFER14_WEBGL = 0x8833;
    public static final int DRAW_BUFFER15_WEBGL = 0x8834;
    public static final int MAX_COLOR_ATTACHMENTS_WEBGL = 0x8CDF;
    public static final int MAX_DRAW_BUFFERS_WEBGL = 0x8824;
    
    
    @JsMethod(name = "drawBuffersWEBGL")
    public native void drawBuffersWEBGL(long[] buffers);
    
}

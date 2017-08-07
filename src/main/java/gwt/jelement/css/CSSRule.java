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
package gwt.jelement.css;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CSSRule", isNative = true)
public class CSSRule implements IsObject {
    public static short STYLE_RULE; /* 1 */
    public static short CHARSET_RULE; /* 2 */
    public static short IMPORT_RULE; /* 3 */
    public static short MEDIA_RULE; /* 4 */
    public static short FONT_FACE_RULE; /* 5 */
    public static short PAGE_RULE; /* 6 */
    public static short NAMESPACE_RULE; /* 10 */
    public static short KEYFRAMES_RULE; /* 7 */
    public static short KEYFRAME_RULE; /* 8 */
    public static short SUPPORTS_RULE; /* 12 */
    public static short VIEWPORT_RULE; /* 15 */
    
    @JsProperty(name="type")
    public native short getType();
    
    @JsProperty(name="cssText")
    public native String getCssText();
    
    @JsProperty(name="cssText")
    public native void setCssText(String cssText);
    
    @JsProperty(name="parentRule")
    public native CSSRule getParentRule();
    
    @JsProperty(name="parentStyleSheet")
    public native CSSStyleSheet getParentStyleSheet();
    
}

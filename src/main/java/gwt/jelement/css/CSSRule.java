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

import gwt.jelement.css.CSSRule;
import gwt.jelement.css.CSSStyleSheet;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="CSSRule", isNative = true)
public class CSSRule{
    public static short STYLE_RULE;
    public static short CHARSET_RULE;
    public static short IMPORT_RULE;
    public static short MEDIA_RULE;
    public static short FONT_FACE_RULE;
    public static short PAGE_RULE;
    public static short NAMESPACE_RULE;
    public static short KEYFRAMES_RULE;
    public static short KEYFRAME_RULE;
    public static short SUPPORTS_RULE;
    public static short VIEWPORT_RULE;
    
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

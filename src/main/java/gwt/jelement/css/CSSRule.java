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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class CSSRule{
    public static final int STYLE_RULE = 1;
    public static final int CHARSET_RULE = 2;
    public static final int IMPORT_RULE = 3;
    public static final int MEDIA_RULE = 4;
    public static final int FONT_FACE_RULE = 5;
    public static final int PAGE_RULE = 6;
    public static final int NAMESPACE_RULE = 10;
    public static final int KEYFRAMES_RULE = 7;
    public static final int KEYFRAME_RULE = 8;
    public static final int SUPPORTS_RULE = 12;
    public static final int VIEWPORT_RULE = 15;
    
    
    @JsProperty(name="cssText")
    public String cssText;
    
    @JsProperty(name="type")
    public native short getType();
    
    @JsProperty(name="parentRule")
    public native CSSRule getParentRule();
    
    @JsProperty(name="parentStyleSheet")
    public native CSSStyleSheet getParentStyleSheet();
    
    
}

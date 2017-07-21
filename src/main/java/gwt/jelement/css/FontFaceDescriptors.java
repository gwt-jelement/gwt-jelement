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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FontFaceDescriptors{

    @JsProperty(name="style")
    public String style = "normal";

    @JsProperty(name="weight")
    public String weight = "normal";

    @JsProperty(name="stretch")
    public String stretch = "normal";

    @JsProperty(name="unicodeRange")
    public String unicodeRange = "U+0-10FFFF";

    @JsProperty(name="variant")
    public String variant = "normal";

    @JsProperty(name="featureSettings")
    public String featureSettings = "normal";

    @JsProperty(name="display")
    public String display = "auto";


}

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
package gwt.jelement.plugins;

import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Js;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Plugin", isNative = true)
public class Plugin implements IsObject, ArrayLike<MimeType> {
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="filename")
    public native String getFilename();
    
    @JsProperty(name="description")
    public native String getDescription();
    
    @JsOverlay
    public final MimeType get(String name){
        return (MimeType) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "item")
    public native MimeType item(double index);
    
    @JsMethod(name = "namedItem")
    public native MimeType namedItem(String name);
    
}

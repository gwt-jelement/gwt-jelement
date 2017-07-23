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

import gwt.jelement.css.FontFace;
import gwt.jelement.css.FontFaceLoadStatus;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FontFace{
    
    @JsProperty(name="family")
    public String family;
    
    @JsProperty(name="style")
    public String style;
    
    @JsProperty(name="weight")
    public String weight;
    
    @JsProperty(name="stretch")
    public String stretch;
    
    @JsProperty(name="unicodeRange")
    public String unicodeRange;
    
    @JsProperty(name="variant")
    public String variant;
    
    @JsProperty(name="featureSettings")
    public String featureSettings;
    
    @JsProperty(name="display")
    public String display;
    
    @JsProperty(name="status")
    public String status;
    
    @JsOverlay
    public final FontFaceLoadStatus getStatus(){
       return FontFaceLoadStatus.of(status);
    }
    
    @JsProperty(name="loaded")
    public Promise<FontFace> loaded;
    
    @JsMethod(name = "load")
    public native Promise<FontFace> load();
    
}

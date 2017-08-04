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

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="FontFace", isNative = true)
public class FontFace extends IsObject{
    @JsProperty(name="status")
    private String status;
    
    @JsConstructor
    public FontFace(String family, String source){
        super();
    }
    
    @JsConstructor
    public FontFace(String family, String source, FontFaceDescriptors descriptors){
        super();
    }
    
    @JsConstructor
    public FontFace(String family, ArrayBuffer source){
        super();
    }
    
    @JsConstructor
    public FontFace(String family, ArrayBuffer source, FontFaceDescriptors descriptors){
        super();
    }
    
    @JsConstructor
    public FontFace(String family, ArrayBufferView source){
        super();
    }
    
    @JsConstructor
    public FontFace(String family, ArrayBufferView source, FontFaceDescriptors descriptors){
        super();
    }
    
    @JsProperty(name="family")
    public native String getFamily();
    
    @JsProperty(name="family")
    public native void setFamily(String family);
    
    @JsProperty(name="style")
    public native String getStyle();
    
    @JsProperty(name="style")
    public native void setStyle(String style);
    
    @JsProperty(name="weight")
    public native String getWeight();
    
    @JsProperty(name="weight")
    public native void setWeight(String weight);
    
    @JsProperty(name="stretch")
    public native String getStretch();
    
    @JsProperty(name="stretch")
    public native void setStretch(String stretch);
    
    @JsProperty(name="unicodeRange")
    public native String getUnicodeRange();
    
    @JsProperty(name="unicodeRange")
    public native void setUnicodeRange(String unicodeRange);
    
    @JsProperty(name="variant")
    public native String getVariant();
    
    @JsProperty(name="variant")
    public native void setVariant(String variant);
    
    @JsProperty(name="featureSettings")
    public native String getFeatureSettings();
    
    @JsProperty(name="featureSettings")
    public native void setFeatureSettings(String featureSettings);
    
    @JsProperty(name="display")
    public native String getDisplay();
    
    @JsProperty(name="display")
    public native void setDisplay(String display);
    
    @JsProperty(name="loaded")
    public native Promise<FontFace> getLoaded();
    
    @JsOverlay
    public final FontFaceLoadStatus getStatus(){
       return FontFaceLoadStatus.of(status);
    }
    
    @JsMethod(name = "load")
    public native Promise<FontFace> load();
    
}

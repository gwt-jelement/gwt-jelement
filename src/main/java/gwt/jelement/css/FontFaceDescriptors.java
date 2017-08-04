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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class FontFaceDescriptors extends JsObject{

    @JsProperty(name="style")
    private String style;

    @JsProperty(name="weight")
    private String weight;

    @JsProperty(name="stretch")
    private String stretch;

    @JsProperty(name="unicodeRange")
    private String unicodeRange;

    @JsProperty(name="variant")
    private String variant;

    @JsProperty(name="featureSettings")
    private String featureSettings;

    @JsProperty(name="display")
    private String display;

    public FontFaceDescriptors(){
    }

    @JsOverlay
    public final String getStyle(){
        return this.style;
    }

    @JsOverlay
    public final void setStyle(String style){
        this.style = style;
    }

    @JsOverlay
    public final String getWeight(){
        return this.weight;
    }

    @JsOverlay
    public final void setWeight(String weight){
        this.weight = weight;
    }

    @JsOverlay
    public final String getStretch(){
        return this.stretch;
    }

    @JsOverlay
    public final void setStretch(String stretch){
        this.stretch = stretch;
    }

    @JsOverlay
    public final String getUnicodeRange(){
        return this.unicodeRange;
    }

    @JsOverlay
    public final void setUnicodeRange(String unicodeRange){
        this.unicodeRange = unicodeRange;
    }

    @JsOverlay
    public final String getVariant(){
        return this.variant;
    }

    @JsOverlay
    public final void setVariant(String variant){
        this.variant = variant;
    }

    @JsOverlay
    public final String getFeatureSettings(){
        return this.featureSettings;
    }

    @JsOverlay
    public final void setFeatureSettings(String featureSettings){
        this.featureSettings = featureSettings;
    }

    @JsOverlay
    public final String getDisplay(){
        return this.display;
    }

    @JsOverlay
    public final void setDisplay(String display){
        this.display = display;
    }


}

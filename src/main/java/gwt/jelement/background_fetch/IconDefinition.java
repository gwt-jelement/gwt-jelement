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
package gwt.jelement.background_fetch;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class IconDefinition{

    @JsProperty(name="src")
    private String src;

    @JsProperty(name="sizes")
    private String sizes;

    @JsProperty(name="type")
    private String type;

    public IconDefinition(){
    }

    @JsOverlay
    public final String getSrc(){
        return this.src;
    }

    @JsOverlay
    public final void setSrc(String src){
        this.src = src;
    }

    @JsOverlay
    public final String getSizes(){
        return this.sizes;
    }

    @JsOverlay
    public final void setSizes(String sizes){
        this.sizes = sizes;
    }

    @JsOverlay
    public final String getType(){
        return this.type;
    }

    @JsOverlay
    public final void setType(String type){
        this.type = type;
    }

}

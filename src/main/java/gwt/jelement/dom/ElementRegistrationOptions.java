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
package gwt.jelement.dom;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ElementRegistrationOptions extends JsObject{

    @JsProperty(name="prototype")
    private Object prototype;

    @JsProperty(name="extends")
    private String extends_;

    public ElementRegistrationOptions(){
    }

    @JsOverlay
    public final Object getPrototype(){
        return this.prototype;
    }

    @JsOverlay
    public final void setPrototype(Object prototype){
        this.prototype = prototype;
    }

    @JsOverlay
    public final String getExtends(){
        return this.extends_;
    }

    @JsOverlay
    public final void setExtends(String extends_){
        this.extends_ = extends_;
    }


}

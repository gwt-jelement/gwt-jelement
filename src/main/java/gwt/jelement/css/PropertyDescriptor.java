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
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class PropertyDescriptor extends JsObject{

    @JsProperty(name="name")
    private String name;

    @JsProperty(name="syntax")
    private String syntax;

    @JsProperty(name="inherits")
    private boolean inherits;

    @JsProperty(name="initialValue")
    private String initialValue;

    public PropertyDescriptor(){
    }

    @JsOverlay
    public final String getName(){
        return this.name;
    }

    @JsOverlay
    public final void setName(String name){
        this.name = name;
    }

    @JsOverlay
    public final String getSyntax(){
        return this.syntax;
    }

    @JsOverlay
    public final void setSyntax(String syntax){
        this.syntax = syntax;
    }

    @JsOverlay
    public final boolean isInherits(){
        return this.inherits;
    }

    @JsOverlay
    public final void setInherits(boolean inherits){
        this.inherits = inherits;
    }

    @JsOverlay
    public final String getInitialValue(){
        return this.initialValue;
    }

    @JsOverlay
    public final void setInitialValue(String initialValue){
        this.initialValue = initialValue;
    }


}

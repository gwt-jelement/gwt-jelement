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
package gwt.jelement.core;

import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ObjectPropertyDescriptor<T> extends JsObject{

    @JsProperty(name="configurable")
    private boolean configurable;

    @JsProperty(name="enumerable")
    private boolean enumerable;

    @JsProperty(name="value")
    private T value;

    @JsProperty(name="writable")
    private boolean writable;

    @JsProperty(name="get")
    private ObjectPropertyGetterFunction<T> get;

    @JsProperty(name="set")
    private ObjectPropertySetterFunction<T> set;

    public ObjectPropertyDescriptor(){
    }

    @JsOverlay
    public final boolean isConfigurable(){
        return this.configurable;
    }

    @JsOverlay
    public final void setConfigurable(boolean configurable){
        this.configurable = configurable;
    }

    @JsOverlay
    public final boolean isEnumerable(){
        return this.enumerable;
    }

    @JsOverlay
    public final void setEnumerable(boolean enumerable){
        this.enumerable = enumerable;
    }

    @JsOverlay
    public final T getValue(){
        return this.value;
    }

    @JsOverlay
    public final void setValue(T value){
        this.value = value;
    }

    @JsOverlay
    public final boolean isWritable(){
        return this.writable;
    }

    @JsOverlay
    public final void setWritable(boolean writable){
        this.writable = writable;
    }

    @JsOverlay
    public final ObjectPropertyGetterFunction<T> getGet(){
        return this.get;
    }

    @JsOverlay
    public final void setGet(ObjectPropertyGetterFunction<T> get){
        this.get = get;
    }

    @JsOverlay
    public final ObjectPropertySetterFunction<T> getSet(){
        return this.set;
    }

    @JsOverlay
    public final void setSet(ObjectPropertySetterFunction<T> set){
        this.set = set;
    }


}

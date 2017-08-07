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
public class IteratorValue<T> extends JsObject{

    @JsProperty(name="value")
    private T value;

    @JsProperty(name="done")
    private boolean done;

    public IteratorValue(){
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
    public final boolean isDone(){
        return this.done;
    }

    @JsOverlay
    public final void setDone(boolean done){
        this.done = done;
    }


}

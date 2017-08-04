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
package gwt.jelement.mediastream;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ConstrainDoubleRange extends DoubleRange{

    @JsProperty(name="exact")
    private double exact;

    @JsProperty(name="ideal")
    private double ideal;

    public ConstrainDoubleRange(){
    }

    @JsOverlay
    public final double getExact(){
        return this.exact;
    }

    @JsOverlay
    public final void setExact(double exact){
        this.exact = exact;
    }

    @JsOverlay
    public final double getIdeal(){
        return this.ideal;
    }

    @JsOverlay
    public final void setIdeal(double ideal){
        this.ideal = ideal;
    }


}

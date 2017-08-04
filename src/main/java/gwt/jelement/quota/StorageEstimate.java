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
package gwt.jelement.quota;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class StorageEstimate extends JsObject{

    @JsProperty(name="usage")
    private double usage;

    @JsProperty(name="quota")
    private double quota;

    public StorageEstimate(){
    }

    @JsOverlay
    public final double getUsage(){
        return this.usage;
    }

    @JsOverlay
    public final void setUsage(double usage){
        this.usage = usage;
    }

    @JsOverlay
    public final double getQuota(){
        return this.quota;
    }

    @JsOverlay
    public final void setQuota(double quota){
        this.quota = quota;
    }


}

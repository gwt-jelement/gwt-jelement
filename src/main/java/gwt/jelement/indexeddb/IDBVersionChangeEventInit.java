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
package gwt.jelement.indexeddb;

import gwt.jelement.events.EventInit;
import gwt.jelement.indexeddb.IDBDataLossAmount;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class IDBVersionChangeEventInit extends EventInit{

    public IDBVersionChangeEventInit(){
    }

    @JsProperty(name="oldVersion")
    public double oldVersion;

    @JsOverlay
    public final double getOldVersion(){
        return this.oldVersion;
    }

    @JsOverlay
    public final void setOldVersion(double oldVersion){
        this.oldVersion = oldVersion;
    }

    @JsProperty(name="newVersion")
    public double newVersion;

    @JsOverlay
    public final double getNewVersion(){
        return this.newVersion;
    }

    @JsOverlay
    public final void setNewVersion(double newVersion){
        this.newVersion = newVersion;
    }

    @JsProperty(name="dataLoss")
    public String dataLoss;

    @JsOverlay
    public final IDBDataLossAmount getDataLoss(){
        return IDBDataLossAmount.of(this.dataLoss);
    }

    @JsOverlay
    public final void setDataLoss(IDBDataLossAmount dataLoss){
        this.dataLoss = dataLoss.getInternalValue();
    }


}

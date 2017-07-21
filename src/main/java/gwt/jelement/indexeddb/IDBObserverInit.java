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

import gwt.jelement.indexeddb.IDBObservationType;
import java.util.Arrays;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class IDBObserverInit{

    @JsProperty(name="transaction")
    public boolean transaction = false;

    @JsProperty(name="values")
    public boolean values = false;

    @JsProperty(name="noRecords")
    public boolean noRecords = false;

    @JsProperty(name="operationTypes")
    public String[] operationTypes = new String[0];

    @JsOverlay
    public IDBObservationType[] getOperationTypes(){
        return IDBObservationType.ofArray(this.operationTypes);
    }

    @JsOverlay
    public void setOperationTypes(IDBObservationType[] operationTypes){
        this.operationTypes = Arrays.stream(operationTypes)
            .map(IDBObservationType::getInternalValue)
            .toArray(String[]::new);
    }


}

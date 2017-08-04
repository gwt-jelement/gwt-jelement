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
package gwt.jelement.budget;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, name="BudgetService", isNative = true)
public class BudgetService extends IsObject{
    @JsMethod(name = "getBudget")
    public native Promise<BudgetState[]> getBudget();
    
    @JsOverlay
    public final Promise<Double> getCost(OperationType operation){
        return getCost(operation.getInternalValue());
    }
    
    @JsMethod(name = "getCost")
    public native Promise<Double> getCost(String operation);
    
    @JsOverlay
    public final Promise<Boolean> reserve(OperationType operation){
        return reserve(operation.getInternalValue());
    }
    
    @JsMethod(name = "reserve")
    public native Promise<Boolean> reserve(String operation);
    
}

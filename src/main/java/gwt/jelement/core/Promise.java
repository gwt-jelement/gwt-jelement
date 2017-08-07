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

@JsType(namespace = JsPackage.GLOBAL, name="Promise", isNative = true)
public class Promise<T> extends Thenable<T> {
    @JsConstructor
    public Promise(PromiseExecutor<T> executor){
        super();
    }
    
    @SafeVarargs
    @JsMethod(name = "all")
    public static native <U> Promise<U> all(Promise<? extends U>... promises);
    
    @JsMethod(name = "catch")
    public native Promise<T> catch_();
    
    @JsMethod(name = "catch")
    public native Promise<T> catch_(PromiseRejectCallback rejectCallback);
    
    @SafeVarargs
    @JsMethod(name = "race")
    public static native <U> Promise<U> race(Promise<? extends U>... promises);
    
    @JsMethod(name = "reject")
    public static native <U> Promise<U> reject(Object value);
    
    @JsMethod(name = "resolve")
    public static native <U> Promise<U> resolve(Thenable<U> value);
    
}

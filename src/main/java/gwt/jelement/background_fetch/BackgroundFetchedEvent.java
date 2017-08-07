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
package gwt.jelement.background_fetch;

import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="BackgroundFetchedEvent", isNative = true)
public class BackgroundFetchedEvent extends BackgroundFetchEvent {
    @JsConstructor
    public BackgroundFetchedEvent(String type, BackgroundFetchedEventInit init){
        super((String) null, (BackgroundFetchEventInit) null);
    }
    
    @JsProperty(name="fetches")
    public native BackgroundFetchSettledFetch[] getFetches();
    
    @JsMethod(name = "updateUI")
    public native Promise<Void> updateUI(String title);
    
}

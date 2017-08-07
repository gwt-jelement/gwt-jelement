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

import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="BackgroundFetchRegistration", isNative = true)
public class BackgroundFetchRegistration implements IsObject {
    @JsProperty(name="tag")
    public native String getTag();
    
    @JsProperty(name="icons")
    public native IconDefinition[] getIcons();
    
    @JsProperty(name="totalDownloadSize")
    public native double getTotalDownloadSize();
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsMethod(name = "abort")
    public native Promise<Boolean> abort();
    
}

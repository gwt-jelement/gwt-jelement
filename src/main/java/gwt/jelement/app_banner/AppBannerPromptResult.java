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
package gwt.jelement.app_banner;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="AppBannerPromptResult", isNative = true)
public class AppBannerPromptResult implements IsObject {
    @JsProperty(name="outcome")
    private String outcome;
    
    @JsProperty(name="platform")
    public native String getPlatform();
    
    @JsOverlay
    public final AppBannerPromptOutcome getOutcome(){
       return AppBannerPromptOutcome.of(outcome);
    }
    
}

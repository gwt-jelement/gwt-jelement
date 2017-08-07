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
public class LocaleOptions extends JsObject{

    @JsProperty(name="localeMatcher")
    private String localeMatcher;

    @JsProperty(name="timeZone")
    private String timeZone;

    @JsProperty(name="hour12")
    private boolean hour12;

    @JsProperty(name="formatMatcher")
    private String formatMatcher;

    public LocaleOptions(){
    }

    @JsOverlay
    public final LocaleMatchingAlgorithm getLocaleMatcher(){
        return LocaleMatchingAlgorithm.of(this.localeMatcher);
    }

    @JsOverlay
    public final void setLocaleMatcher(LocaleMatchingAlgorithm localeMatcher){
        this.localeMatcher = localeMatcher.getInternalValue();
    }

    @JsOverlay
    public final String getTimeZone(){
        return this.timeZone;
    }

    @JsOverlay
    public final void setTimeZone(String timeZone){
        this.timeZone = timeZone;
    }

    @JsOverlay
    public final boolean isHour12(){
        return this.hour12;
    }

    @JsOverlay
    public final void setHour12(boolean hour12){
        this.hour12 = hour12;
    }

    @JsOverlay
    public final LocaleFormatMatchingAlgorithm getFormatMatcher(){
        return LocaleFormatMatchingAlgorithm.of(this.formatMatcher);
    }

    @JsOverlay
    public final void setFormatMatcher(LocaleFormatMatchingAlgorithm formatMatcher){
        this.formatMatcher = formatMatcher.getInternalValue();
    }


}

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
package gwt.jelement.cachestorage;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class CacheQueryOptions extends JsObject{

    @JsProperty(name="ignoreSearch")
    private boolean ignoreSearch;

    @JsProperty(name="ignoreMethod")
    private boolean ignoreMethod;

    @JsProperty(name="ignoreVary")
    private boolean ignoreVary;

    @JsProperty(name="cacheName")
    private String cacheName;

    public CacheQueryOptions(){
    }

    @JsOverlay
    public final boolean getIgnoreSearch(){
        return this.ignoreSearch;
    }

    @JsOverlay
    public final void setIgnoreSearch(boolean ignoreSearch){
        this.ignoreSearch = ignoreSearch;
    }

    @JsOverlay
    public final boolean getIgnoreMethod(){
        return this.ignoreMethod;
    }

    @JsOverlay
    public final void setIgnoreMethod(boolean ignoreMethod){
        this.ignoreMethod = ignoreMethod;
    }

    @JsOverlay
    public final boolean getIgnoreVary(){
        return this.ignoreVary;
    }

    @JsOverlay
    public final void setIgnoreVary(boolean ignoreVary){
        this.ignoreVary = ignoreVary;
    }

    @JsOverlay
    public final String getCacheName(){
        return this.cacheName;
    }

    @JsOverlay
    public final void setCacheName(String cacheName){
        this.cacheName = cacheName;
    }

}

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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class BackgroundFetchOptions extends JsObject{

    @JsProperty(name="icons")
    private IconDefinition[] icons;

    @JsProperty(name="title")
    private String title;

    @JsProperty(name="totalDownloadSize")
    private double totalDownloadSize;

    public BackgroundFetchOptions(){
    }

    @JsOverlay
    public final IconDefinition[] getIcons(){
        return this.icons;
    }

    @JsOverlay
    public final void setIcons(IconDefinition[] icons){
        this.icons = icons;
    }

    @JsOverlay
    public final String getTitle(){
        return this.title;
    }

    @JsOverlay
    public final void setTitle(String title){
        this.title = title;
    }

    @JsOverlay
    public final double getTotalDownloadSize(){
        return this.totalDownloadSize;
    }

    @JsOverlay
    public final void setTotalDownloadSize(double totalDownloadSize){
        this.totalDownloadSize = totalDownloadSize;
    }

}

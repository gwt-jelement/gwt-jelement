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
package gwt.jelement.webshare;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ShareData{

    public ShareData(){
    }

    @JsProperty(name="title")
    public String title;

    @JsOverlay
    public final String getTitle(){
        return this.title;
    }

    @JsOverlay
    public final void setTitle(String title){
        this.title = title;
    }

    @JsProperty(name="text")
    public String text;

    @JsOverlay
    public final String getText(){
        return this.text;
    }

    @JsOverlay
    public final void setText(String text){
        this.text = text;
    }

    @JsProperty(name="url")
    public String url;

    @JsOverlay
    public final String getUrl(){
        return this.url;
    }

    @JsOverlay
    public final void setUrl(String url){
        this.url = url;
    }


}

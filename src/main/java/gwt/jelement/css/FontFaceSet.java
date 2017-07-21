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
package gwt.jelement.css;

import gwt.jelement.css.FontFace;
import gwt.jelement.css.FontFaceSet;
import gwt.jelement.css.FontFaceSetLoadStatus;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class FontFaceSet extends EventTarget{
    
    @JsConstructor
    public FontFaceSet(){
        super();
    }
    
    @JsProperty(name="onloading")
    public EventHandlerNonNull onloading;
    
    @JsProperty(name="onloadingdone")
    public EventHandlerNonNull onloadingdone;
    
    @JsProperty(name="onloadingerror")
    public EventHandlerNonNull onloadingerror;
    
    @JsProperty(name="ready")
    public native Promise<FontFaceSet> getReady();
    
    @JsOverlay
    public  FontFaceSetLoadStatus getStatusAsFontFaceSetLoadStatus(){
        return FontFaceSetLoadStatus.of(getStatus());
    }
    
    @JsProperty(name="status")
    public native String getStatus();
    
    @JsMethod(name = "check")
    public native boolean check(String font);
    
    @JsMethod(name = "check")
    public native boolean check(String font, String text);
    
    @JsMethod(name = "load")
    public native Promise<FontFace[]> load(String font);
    
    @JsMethod(name = "load")
    public native Promise<FontFace[]> load(String font, String text);
    
}

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
package gwt.jelement.html;

import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.track.TextTrack;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLTrackElement extends HTMLElement{
    public static int NONE;
    public static int LOADING;
    public static int LOADED;
    public static int ERROR;
    
    
    @JsConstructor
    public HTMLTrackElement(){
        super();
    }
    
    @JsProperty(name="kind")
    public native String getKind();
    
    @JsProperty(name="kind")
    public native void setKind(String kind);
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="srclang")
    public native String getSrclang();
    
    @JsProperty(name="srclang")
    public native void setSrclang(String srclang);
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="label")
    public native void setLabel(String label);
    
    @JsProperty(name="default")
    public native boolean getDefault();
    
    @JsProperty(name="default")
    public native void setDefault(boolean default_);
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="track")
    public native TextTrack getTrack();
    
    
}

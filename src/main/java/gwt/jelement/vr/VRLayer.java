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
package gwt.jelement.vr;

import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class VRLayer{

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface VRSource {
        @JsOverlay
        default HTMLCanvasElement asHTMLCanvasElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default OffscreenCanvas asOffscreenCanvas(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isHTMLCanvasElement(){
            return (Object) this instanceof HTMLCanvasElement;
        }
    
        @JsOverlay
        default boolean isOffscreenCanvas(){
            return (Object) this instanceof OffscreenCanvas;
        }
    
    }
    
    @JsProperty(name="source")
    public VRLayer.VRSource source = null;

    @JsProperty(name="leftBounds")
    public float[] leftBounds = new float[0];

    @JsProperty(name="rightBounds")
    public float[] rightBounds = new float[0];


}

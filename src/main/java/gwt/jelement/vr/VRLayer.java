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

import gwt.jelement.core.JsObject;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.webgl.WebGL2RenderingContext;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class VRLayer extends JsObject{

    @JsProperty(name="source")
    private WebGL2RenderingContext.VRSource source;

    @JsProperty(name="leftBounds")
    private float[] leftBounds;

    @JsProperty(name="rightBounds")
    private float[] rightBounds;

    public VRLayer(){
    }

    @JsOverlay
    public final void setSource(HTMLCanvasElement source){
        this.source = WebGL2RenderingContext.VRSource.of(source);
    }

    @JsOverlay
    public final void setSource(OffscreenCanvas source){
        this.source = WebGL2RenderingContext.VRSource.of(source);
    }

    @JsOverlay
    public final float[] getLeftBounds(){
        return this.leftBounds;
    }

    @JsOverlay
    public final void setLeftBounds(float[] leftBounds){
        this.leftBounds = leftBounds;
    }

    @JsOverlay
    public final float[] getRightBounds(){
        return this.rightBounds;
    }

    @JsOverlay
    public final void setRightBounds(float[] rightBounds){
        this.rightBounds = rightBounds;
    }

}

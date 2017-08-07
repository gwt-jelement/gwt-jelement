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
package gwt.jelement.canvas2d;

import gwt.jelement.core.JsObject;
import gwt.jelement.dom.Element;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class HitRegionOptions extends JsObject{

    @JsProperty(name="path")
    private Path2D path;

    @JsProperty(name="fillRule")
    private String fillRule;

    @JsProperty(name="id")
    private String id;

    @JsProperty(name="control")
    private Element control;

    public HitRegionOptions(){
    }

    @JsOverlay
    public final Path2D getPath(){
        return this.path;
    }

    @JsOverlay
    public final void setPath(Path2D path){
        this.path = path;
    }

    @JsOverlay
    public final CanvasFillRule getFillRule(){
        return CanvasFillRule.of(this.fillRule);
    }

    @JsOverlay
    public final void setFillRule(CanvasFillRule fillRule){
        this.fillRule = fillRule.getInternalValue();
    }

    @JsOverlay
    public final String getId(){
        return this.id;
    }

    @JsOverlay
    public final void setId(String id){
        this.id = id;
    }

    @JsOverlay
    public final Element getControl(){
        return this.control;
    }

    @JsOverlay
    public final void setControl(Element control){
        this.control = control;
    }


}

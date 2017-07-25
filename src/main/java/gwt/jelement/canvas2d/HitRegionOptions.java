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

import gwt.jelement.canvas2d.CanvasFillRule;
import gwt.jelement.canvas2d.Path2D;
import gwt.jelement.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class HitRegionOptions{

    public HitRegionOptions(){
    }

    @JsProperty(name="path")
    public Path2D path;

    @JsOverlay
    public final Path2D getPath(){
        return this.path;
    }

    @JsOverlay
    public final void setPath(Path2D path){
        this.path = path;
    }

    @JsProperty(name="fillRule")
    public String fillRule;

    @JsOverlay
    public final CanvasFillRule getFillRule(){
        return CanvasFillRule.of(this.fillRule);
    }

    @JsOverlay
    public final void setFillRule(CanvasFillRule fillRule){
        this.fillRule = fillRule.getInternalValue();
    }

    @JsProperty(name="id")
    public String id;

    @JsOverlay
    public final String getId(){
        return this.id;
    }

    @JsOverlay
    public final void setId(String id){
        this.id = id;
    }

    @JsProperty(name="control")
    public Element control;

    @JsOverlay
    public final Element getControl(){
        return this.control;
    }

    @JsOverlay
    public final void setControl(Element control){
        this.control = control;
    }


}

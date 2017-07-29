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
package gwt.jelement.geometry;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class DOMQuadInit extends JsObject{

    @JsProperty(name="p1")
    private DOMPointInit p1;

    @JsProperty(name="p2")
    private DOMPointInit p2;

    @JsProperty(name="p3")
    private DOMPointInit p3;

    @JsProperty(name="p4")
    private DOMPointInit p4;

    public DOMQuadInit(){
    }

    @JsOverlay
    public final DOMPointInit getP1(){
        return this.p1;
    }

    @JsOverlay
    public final void setP1(DOMPointInit p1){
        this.p1 = p1;
    }

    @JsOverlay
    public final DOMPointInit getP2(){
        return this.p2;
    }

    @JsOverlay
    public final void setP2(DOMPointInit p2){
        this.p2 = p2;
    }

    @JsOverlay
    public final DOMPointInit getP3(){
        return this.p3;
    }

    @JsOverlay
    public final void setP3(DOMPointInit p3){
        this.p3 = p3;
    }

    @JsOverlay
    public final DOMPointInit getP4(){
        return this.p4;
    }

    @JsOverlay
    public final void setP4(DOMPointInit p4){
        this.p4 = p4;
    }

}

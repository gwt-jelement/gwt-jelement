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
package gwt.jelement.dom;

import gwt.jelement.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class IntersectionObserverInit{

    @JsProperty(name="root")
    private Element root;

    @JsProperty(name="rootMargin")
    private String rootMargin;

    @JsProperty(name="threshold")
    private ThresholdUnion threshold;

    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface ThresholdUnion {
        @JsOverlay
        static ThresholdUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static ThresholdUnion of(double[] value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default double[] asDoubleArray(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isDoubleArray(){
            return (Object) this instanceof double[];
        }
    
    }
    
    public IntersectionObserverInit(){
    }

    @JsOverlay
    public final Element getRoot(){
        return this.root;
    }

    @JsOverlay
    public final void setRoot(Element root){
        this.root = root;
    }

    @JsOverlay
    public final String getRootMargin(){
        return this.rootMargin;
    }

    @JsOverlay
    public final void setRootMargin(String rootMargin){
        this.rootMargin = rootMargin;
    }

    @JsOverlay
    public final void setThreshold(double threshold){
        this.threshold = IntersectionObserverInit.ThresholdUnion.of(threshold);
    }

    @JsOverlay
    public final void setThreshold(double[] threshold){
        this.threshold = IntersectionObserverInit.ThresholdUnion.of(threshold);
    }

}

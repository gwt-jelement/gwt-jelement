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

import gwt.jelement.dom.ClientRect;
import gwt.jelement.dom.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class IntersectionObserverEntry{
    
    @JsProperty(name="time")
    public double time;
    
    @JsProperty(name="rootBounds")
    public ClientRect rootBounds;
    
    @JsProperty(name="boundingClientRect")
    public ClientRect boundingClientRect;
    
    @JsProperty(name="intersectionRect")
    public ClientRect intersectionRect;
    
    @JsProperty(name="isIntersecting")
    public boolean isIntersecting;
    
    @JsProperty(name="intersectionRatio")
    public double intersectionRatio;
    
    @JsProperty(name="target")
    public Element target;
    
    
}

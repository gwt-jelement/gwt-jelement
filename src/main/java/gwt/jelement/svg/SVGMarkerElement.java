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
package gwt.jelement.svg;

import gwt.jelement.svg.SVGAngle;
import gwt.jelement.svg.SVGAnimatedAngle;
import gwt.jelement.svg.SVGAnimatedEnumeration;
import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGMarkerElement extends SVGElement{
    public static int SVG_MARKERUNITS_UNKNOWN;
    public static int SVG_MARKERUNITS_USERSPACEONUSE;
    public static int SVG_MARKERUNITS_STROKEWIDTH;
    public static int SVG_MARKER_ORIENT_UNKNOWN;
    public static int SVG_MARKER_ORIENT_AUTO;
    public static int SVG_MARKER_ORIENT_ANGLE;
    
    
    @JsConstructor
    public SVGMarkerElement(){
        super();
    }
    
    @JsProperty(name="refX")
    public SVGAnimatedLength refX;
    
    @JsProperty(name="refY")
    public SVGAnimatedLength refY;
    
    @JsProperty(name="markerUnits")
    public SVGAnimatedEnumeration markerUnits;
    
    @JsProperty(name="markerWidth")
    public SVGAnimatedLength markerWidth;
    
    @JsProperty(name="markerHeight")
    public SVGAnimatedLength markerHeight;
    
    @JsProperty(name="orientType")
    public SVGAnimatedEnumeration orientType;
    
    @JsProperty(name="orientAngle")
    public SVGAnimatedAngle orientAngle;
    
    @JsMethod(name = "setOrientToAngle")
    public native void setOrientToAngle(SVGAngle angle);
    
    @JsMethod(name = "setOrientToAuto")
    public native void setOrientToAuto();
    
}

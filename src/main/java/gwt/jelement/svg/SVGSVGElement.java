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

import gwt.jelement.dom.Element;
import gwt.jelement.dom.NodeList;
import gwt.jelement.svg.SVGAngle;
import gwt.jelement.svg.SVGAnimatedLength;
import gwt.jelement.svg.SVGAnimatedPreserveAspectRatio;
import gwt.jelement.svg.SVGAnimatedRect;
import gwt.jelement.svg.SVGElement;
import gwt.jelement.svg.SVGGraphicsElement;
import gwt.jelement.svg.SVGLength;
import gwt.jelement.svg.SVGMatrix;
import gwt.jelement.svg.SVGNumber;
import gwt.jelement.svg.SVGPoint;
import gwt.jelement.svg.SVGRect;
import gwt.jelement.svg.SVGTransform;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGSVGElement extends SVGGraphicsElement{
    public static int SVG_ZOOMANDPAN_UNKNOWN;
    public static int SVG_ZOOMANDPAN_DISABLE;
    public static int SVG_ZOOMANDPAN_MAGNIFY;
    
    
    @JsConstructor
    public SVGSVGElement(){
        super();
    }
    
    @JsProperty(name="currentScale")
    public float currentScale;
    
    @JsProperty(name="zoomAndPan")
    public short zoomAndPan;
    
    @JsProperty(name="x")
    public native SVGAnimatedLength getX();
    
    @JsProperty(name="y")
    public native SVGAnimatedLength getY();
    
    @JsProperty(name="width")
    public native SVGAnimatedLength getWidth();
    
    @JsProperty(name="height")
    public native SVGAnimatedLength getHeight();
    
    @JsProperty(name="currentTranslate")
    public native SVGPoint getCurrentTranslate();
    
    @JsProperty(name="viewBox")
    public native SVGAnimatedRect getViewBox();
    
    @JsProperty(name="preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    
    @JsMethod(name = "animationsPaused")
    public native boolean animationsPaused();
    
    @JsMethod(name = "checkEnclosure")
    public native boolean checkEnclosure(SVGElement element, SVGRect rect);
    
    @JsMethod(name = "checkIntersection")
    public native boolean checkIntersection(SVGElement element, SVGRect rect);
    
    @JsMethod(name = "createSVGAngle")
    public native SVGAngle createSVGAngle();
    
    @JsMethod(name = "createSVGLength")
    public native SVGLength createSVGLength();
    
    @JsMethod(name = "createSVGMatrix")
    public native SVGMatrix createSVGMatrix();
    
    @JsMethod(name = "createSVGNumber")
    public native SVGNumber createSVGNumber();
    
    @JsMethod(name = "createSVGPoint")
    public native SVGPoint createSVGPoint();
    
    @JsMethod(name = "createSVGRect")
    public native SVGRect createSVGRect();
    
    @JsMethod(name = "createSVGTransform")
    public native SVGTransform createSVGTransform();
    
    @JsMethod(name = "createSVGTransformFromMatrix")
    public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    
    @JsMethod(name = "deselectAll")
    public native void deselectAll();
    
    @JsMethod(name = "forceRedraw")
    public native void forceRedraw();
    
    @JsMethod(name = "getCurrentTime")
    public native float getCurrentTime();
    
    @JsMethod(name = "getElementById")
    public native Element getElementById(String elementId);
    
    @JsMethod(name = "getEnclosureList")
    public native NodeList getEnclosureList(SVGRect rect, SVGElement referenceElement);
    
    @JsMethod(name = "getIntersectionList")
    public native NodeList getIntersectionList(SVGRect rect, SVGElement referenceElement);
    
    @JsMethod(name = "pauseAnimations")
    public native void pauseAnimations();
    
    @JsMethod(name = "setCurrentTime")
    public native void setCurrentTime(float seconds);
    
    @JsMethod(name = "suspendRedraw")
    public native double suspendRedraw(double maxWaitMilliseconds);
    
    @JsMethod(name = "unpauseAnimations")
    public native void unpauseAnimations();
    
    @JsMethod(name = "unsuspendRedraw")
    public native void unsuspendRedraw(double suspendHandleId);
    
    @JsMethod(name = "unsuspendRedrawAll")
    public native void unsuspendRedrawAll();
    
}

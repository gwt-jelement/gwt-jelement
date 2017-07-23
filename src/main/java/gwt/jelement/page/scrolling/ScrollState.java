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
package gwt.jelement.page.scrolling;

import gwt.jelement.page.scrolling.ScrollStateInit;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollState{
    
    @JsConstructor
    public ScrollState(){
    }
    
    @JsConstructor
    public ScrollState(ScrollStateInit scrollStateInit){
    }
    
    @JsProperty(name="deltaX")
    public double deltaX;
    
    @JsProperty(name="deltaY")
    public double deltaY;
    
    @JsProperty(name="positionX")
    public double positionX;
    
    @JsProperty(name="positionY")
    public double positionY;
    
    @JsProperty(name="velocityX")
    public double velocityX;
    
    @JsProperty(name="velocityY")
    public double velocityY;
    
    @JsProperty(name="isBeginning")
    public boolean isBeginning;
    
    @JsProperty(name="inInertialPhase")
    public boolean inInertialPhase;
    
    @JsProperty(name="isEnding")
    public boolean isEnding;
    
    @JsProperty(name="shouldPropagate")
    public boolean shouldPropagate;
    
    @JsProperty(name="fromUserInput")
    public boolean fromUserInput;
    
    @JsProperty(name="isDirectManipulation")
    public boolean isDirectManipulation;
    
    @JsProperty(name="deltaGranularity")
    public double deltaGranularity;
    
    @JsMethod(name = "consumeDelta")
    public native void consumeDelta(double x, double y);
    
    @JsMethod(name = "distributeToScrollChainDescendant")
    public native void distributeToScrollChainDescendant();
    
}

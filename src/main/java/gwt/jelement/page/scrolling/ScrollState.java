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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ScrollState", isNative = true)
public class ScrollState implements IsObject {
    @JsConstructor
    public ScrollState(){
    }
    
    @JsConstructor
    public ScrollState(ScrollStateInit scrollStateInit){
    }
    
    @JsProperty(name="deltaX")
    public native double getDeltaX();
    
    @JsProperty(name="deltaY")
    public native double getDeltaY();
    
    @JsProperty(name="positionX")
    public native double getPositionX();
    
    @JsProperty(name="positionY")
    public native double getPositionY();
    
    @JsProperty(name="velocityX")
    public native double getVelocityX();
    
    @JsProperty(name="velocityY")
    public native double getVelocityY();
    
    @JsProperty(name="isBeginning")
    public native boolean getIsBeginning();
    
    @JsProperty(name="inInertialPhase")
    public native boolean getInInertialPhase();
    
    @JsProperty(name="isEnding")
    public native boolean getIsEnding();
    
    @JsProperty(name="shouldPropagate")
    public native boolean getShouldPropagate();
    
    @JsProperty(name="fromUserInput")
    public native boolean getFromUserInput();
    
    @JsProperty(name="isDirectManipulation")
    public native boolean getIsDirectManipulation();
    
    @JsProperty(name="deltaGranularity")
    public native double getDeltaGranularity();
    
    @JsMethod(name = "consumeDelta")
    public native void consumeDelta(double x, double y);
    
    @JsMethod(name = "distributeToScrollChainDescendant")
    public native void distributeToScrollChainDescendant();
    
}

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
package gwt.jelement.html;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLMarqueeElement", isNative = true)
public class HTMLMarqueeElement extends HTMLElement {
    @JsProperty(name="behavior")
    public native String getBehavior();
    
    @JsProperty(name="behavior")
    public native void setBehavior(String behavior);
    
    @JsProperty(name="bgColor")
    public native String getBgColor();
    
    @JsProperty(name="bgColor")
    public native void setBgColor(String bgColor);
    
    @JsProperty(name="direction")
    public native String getDirection();
    
    @JsProperty(name="direction")
    public native void setDirection(String direction);
    
    @JsProperty(name="height")
    public native String getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(String height);
    
    @JsProperty(name="hspace")
    public native double getHspace();
    
    @JsProperty(name="hspace")
    public native void setHspace(double hspace);
    
    @JsProperty(name="loop")
    public native double getLoop();
    
    @JsProperty(name="loop")
    public native void setLoop(double loop);
    
    @JsProperty(name="scrollAmount")
    public native double getScrollAmount();
    
    @JsProperty(name="scrollAmount")
    public native void setScrollAmount(double scrollAmount);
    
    @JsProperty(name="scrollDelay")
    public native double getScrollDelay();
    
    @JsProperty(name="scrollDelay")
    public native void setScrollDelay(double scrollDelay);
    
    @JsProperty(name="trueSpeed")
    public native boolean getTrueSpeed();
    
    @JsProperty(name="trueSpeed")
    public native void setTrueSpeed(boolean trueSpeed);
    
    @JsProperty(name="vspace")
    public native double getVspace();
    
    @JsProperty(name="vspace")
    public native void setVspace(double vspace);
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
    @JsMethod(name = "start")
    public native void start();
    
    @JsMethod(name = "stop")
    public native void stop();
    
}

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
package gwt.jelement.frame;

import gwt.jelement.core.IsObject;
import gwt.jelement.screen_orientation.ScreenOrientation;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Screen", isNative = true)
public class Screen implements IsObject {
    @JsProperty(name="availWidth")
    public native double getAvailWidth();
    
    @JsProperty(name="availHeight")
    public native double getAvailHeight();
    
    @JsProperty(name="width")
    public native double getWidth();
    
    @JsProperty(name="height")
    public native double getHeight();
    
    @JsProperty(name="colorDepth")
    public native double getColorDepth();
    
    @JsProperty(name="pixelDepth")
    public native double getPixelDepth();
    
    @JsProperty(name="availLeft")
    public native double getAvailLeft();
    
    @JsProperty(name="availTop")
    public native double getAvailTop();
    
    @JsProperty(name="orientation")
    public native ScreenOrientation getOrientation();
    
    @JsProperty(name="keepAwake")
    public native boolean getKeepAwake();
    
    @JsProperty(name="keepAwake")
    public native void setKeepAwake(boolean keepAwake);
    
}

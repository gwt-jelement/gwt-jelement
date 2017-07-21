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
package gwt.jelement.html.track.vtt;

import gwt.jelement.html.track.vtt.ScrollSetting;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class VTTRegion{
    
    @JsProperty(name="width")
    public double width;
    
    @JsProperty(name="lines")
    public long lines;
    
    @JsProperty(name="regionAnchorX")
    public double regionAnchorX;
    
    @JsProperty(name="regionAnchorY")
    public double regionAnchorY;
    
    @JsProperty(name="viewportAnchorX")
    public double viewportAnchorX;
    
    @JsProperty(name="viewportAnchorY")
    public double viewportAnchorY;
    
    @JsProperty(name="scroll")
    public ScrollSetting scroll;
    
    
}

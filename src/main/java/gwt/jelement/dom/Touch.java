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

import gwt.jelement.core.IsObject;
import gwt.jelement.events.EventTarget;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Touch", isNative = true)
public class Touch implements IsObject {
    @JsConstructor
    public Touch(TouchInit initDict){
    }
    
    @JsProperty(name="identifier")
    public native double getIdentifier();
    
    @JsProperty(name="target")
    public native EventTarget getTarget();
    
    @JsProperty(name="screenX")
    public native double getScreenX();
    
    @JsProperty(name="screenY")
    public native double getScreenY();
    
    @JsProperty(name="clientX")
    public native double getClientX();
    
    @JsProperty(name="clientY")
    public native double getClientY();
    
    @JsProperty(name="pageX")
    public native double getPageX();
    
    @JsProperty(name="pageY")
    public native double getPageY();
    
    @JsProperty(name="radiusX")
    public native double getRadiusX();
    
    @JsProperty(name="radiusY")
    public native double getRadiusY();
    
    @JsProperty(name="rotationAngle")
    public native double getRotationAngle();
    
    @JsProperty(name="force")
    public native double getForce();
    
    @JsProperty(name="region")
    public native String getRegion();
    
}

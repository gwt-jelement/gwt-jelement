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
package gwt.jelement.events;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="CustomEvent", isNative = true)
public class CustomEvent extends Event {
    @JsConstructor
    public CustomEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public CustomEvent(String type, CustomEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="detail")
    public native Object getDetail();
    
    @JsMethod(name = "initCustomEvent")
    public native void initCustomEvent(String type);
    
    @JsMethod(name = "initCustomEvent")
    public native void initCustomEvent(String type, boolean bubbles);
    
    @JsMethod(name = "initCustomEvent")
    public native void initCustomEvent(String type, boolean bubbles, boolean cancelable);
    
    @JsMethod(name = "initCustomEvent")
    public native void initCustomEvent(String type, boolean bubbles, boolean cancelable, Object detail);
    
}

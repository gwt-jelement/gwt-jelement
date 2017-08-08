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
package gwt.jelement.serviceworkers;

import gwt.jelement.core.Promise;
import gwt.jelement.dom.VisibilityState;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="WindowClient", isNative = true)
public class WindowClient extends Client {
    @JsProperty(name="visibilityState")
    private String visibilityState;
    
    @JsProperty(name="focused")
    public native boolean isFocused();
    
    @JsOverlay
    public final VisibilityState getVisibilityState(){
       return VisibilityState.of(visibilityState);
    }
    
    @JsMethod(name = "focus")
    public native Promise<WindowClient> focus();
    
    @JsMethod(name = "navigate")
    public native Promise<WindowClient> navigate(String url);
    
}

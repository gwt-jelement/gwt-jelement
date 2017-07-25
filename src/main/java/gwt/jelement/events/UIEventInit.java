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

import gwt.jelement.events.EventInit;
import gwt.jelement.frame.Window;
import gwt.jelement.input.InputDeviceCapabilities;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class UIEventInit extends EventInit{

    public UIEventInit(){
    }

    @JsProperty(name="view")
    public Window view;

    @JsOverlay
    public final Window getView(){
        return this.view;
    }

    @JsOverlay
    public final void setView(Window view){
        this.view = view;
    }

    @JsProperty(name="detail")
    public double detail;

    @JsOverlay
    public final double getDetail(){
        return this.detail;
    }

    @JsOverlay
    public final void setDetail(double detail){
        this.detail = detail;
    }

    @JsProperty(name="sourceCapabilities")
    public InputDeviceCapabilities sourceCapabilities;

    @JsOverlay
    public final InputDeviceCapabilities getSourceCapabilities(){
        return this.sourceCapabilities;
    }

    @JsOverlay
    public final void setSourceCapabilities(InputDeviceCapabilities sourceCapabilities){
        this.sourceCapabilities = sourceCapabilities;
    }


}

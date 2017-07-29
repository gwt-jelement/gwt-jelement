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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ShadowRootInit extends JsObject{

    @JsProperty(name="mode")
    private String mode;

    @JsProperty(name="delegatesFocus")
    private boolean delegatesFocus;

    public ShadowRootInit(){
    }

    @JsOverlay
    public final ShadowRootMode getMode(){
        return ShadowRootMode.of(this.mode);
    }

    @JsOverlay
    public final void setMode(ShadowRootMode mode){
        this.mode = mode.getInternalValue();
    }

    @JsOverlay
    public final boolean getDelegatesFocus(){
        return this.delegatesFocus;
    }

    @JsOverlay
    public final void setDelegatesFocus(boolean delegatesFocus){
        this.delegatesFocus = delegatesFocus;
    }

}

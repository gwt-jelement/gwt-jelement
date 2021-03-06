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

import gwt.jelement.dom.Touch;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class TouchEventInit extends EventModifierInit{

    @JsProperty(name="touches")
    private Touch[] touches;

    @JsProperty(name="targetTouches")
    private Touch[] targetTouches;

    @JsProperty(name="changedTouches")
    private Touch[] changedTouches;

    public TouchEventInit(){
    }

    @JsOverlay
    public final Touch[] getTouches(){
        return this.touches;
    }

    @JsOverlay
    public final void setTouches(Touch[] touches){
        this.touches = touches;
    }

    @JsOverlay
    public final Touch[] getTargetTouches(){
        return this.targetTouches;
    }

    @JsOverlay
    public final void setTargetTouches(Touch[] targetTouches){
        this.targetTouches = targetTouches;
    }

    @JsOverlay
    public final Touch[] getChangedTouches(){
        return this.changedTouches;
    }

    @JsOverlay
    public final void setChangedTouches(Touch[] changedTouches){
        this.changedTouches = changedTouches;
    }


}

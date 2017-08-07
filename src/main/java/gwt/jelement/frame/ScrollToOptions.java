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

import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollToOptions extends ScrollOptions{

    @JsProperty(name="left")
    private double left;

    @JsProperty(name="top")
    private double top;

    public ScrollToOptions(){
    }

    @JsOverlay
    public final double getLeft(){
        return this.left;
    }

    @JsOverlay
    public final void setLeft(double left){
        this.left = left;
    }

    @JsOverlay
    public final double getTop(){
        return this.top;
    }

    @JsOverlay
    public final void setTop(double top){
        this.top = top;
    }


}

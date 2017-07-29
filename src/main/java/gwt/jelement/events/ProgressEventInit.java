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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ProgressEventInit extends EventInit{

    @JsProperty(name="lengthComputable")
    private boolean lengthComputable;

    @JsProperty(name="loaded")
    private double loaded;

    @JsProperty(name="total")
    private double total;

    public ProgressEventInit(){
    }

    @JsOverlay
    public final boolean getLengthComputable(){
        return this.lengthComputable;
    }

    @JsOverlay
    public final void setLengthComputable(boolean lengthComputable){
        this.lengthComputable = lengthComputable;
    }

    @JsOverlay
    public final double getLoaded(){
        return this.loaded;
    }

    @JsOverlay
    public final void setLoaded(double loaded){
        this.loaded = loaded;
    }

    @JsOverlay
    public final double getTotal(){
        return this.total;
    }

    @JsOverlay
    public final void setTotal(double total){
        this.total = total;
    }

}

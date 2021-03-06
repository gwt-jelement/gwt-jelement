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
package gwt.jelement.fileapi;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class BlobPropertyBag extends JsObject{

    @JsProperty(name="type")
    private String type;

    @JsProperty(name="endings")
    private String endings;

    public BlobPropertyBag(){
    }

    @JsOverlay
    public final String getType(){
        return this.type;
    }

    @JsOverlay
    public final void setType(String type){
        this.type = type;
    }

    @JsOverlay
    public final NormalizeLineEndings getEndings(){
        return NormalizeLineEndings.of(this.endings);
    }

    @JsOverlay
    public final void setEndings(NormalizeLineEndings endings){
        this.endings = endings.getInternalValue();
    }


}

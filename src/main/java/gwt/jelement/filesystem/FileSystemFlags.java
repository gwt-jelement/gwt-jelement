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
package gwt.jelement.filesystem;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class FileSystemFlags extends JsObject{

    @JsProperty(name="create")
    private boolean create;

    @JsProperty(name="exclusive")
    private boolean exclusive;

    public FileSystemFlags(){
    }

    @JsOverlay
    public final boolean isCreate(){
        return this.create;
    }

    @JsOverlay
    public final void setCreate(boolean create){
        this.create = create;
    }

    @JsOverlay
    public final boolean isExclusive(){
        return this.exclusive;
    }

    @JsOverlay
    public final void setExclusive(boolean exclusive){
        this.exclusive = exclusive;
    }


}

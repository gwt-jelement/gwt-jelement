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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class FileSystemFlags{

    public FileSystemFlags(){
    }

    @JsProperty(name="create")
    public boolean create;

    @JsOverlay
    public final boolean getCreate(){
        return this.create;
    }

    @JsOverlay
    public final void setCreate(boolean create){
        this.create = create;
    }

    @JsProperty(name="exclusive")
    public boolean exclusive;

    @JsOverlay
    public final boolean getExclusive(){
        return this.exclusive;
    }

    @JsOverlay
    public final void setExclusive(boolean exclusive){
        this.exclusive = exclusive;
    }


}

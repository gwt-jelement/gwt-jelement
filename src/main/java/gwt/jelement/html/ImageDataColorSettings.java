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
package gwt.jelement.html;

import gwt.jelement.html.ImageDataStorageFormat;
import gwt.jelement.html.canvas.CanvasColorSpace;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ImageDataColorSettings{

    @JsProperty(name="colorSpace")
    private String colorSpace;

    @JsProperty(name="storageFormat")
    private String storageFormat;

    public ImageDataColorSettings(){
    }

    @JsOverlay
    public final CanvasColorSpace getColorSpace(){
        return CanvasColorSpace.of(this.colorSpace);
    }

    @JsOverlay
    public final void setColorSpace(CanvasColorSpace colorSpace){
        this.colorSpace = colorSpace.getInternalValue();
    }

    @JsOverlay
    public final ImageDataStorageFormat getStorageFormat(){
        return ImageDataStorageFormat.of(this.storageFormat);
    }

    @JsOverlay
    public final void setStorageFormat(ImageDataStorageFormat storageFormat){
        this.storageFormat = storageFormat.getInternalValue();
    }

}

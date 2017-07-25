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
package gwt.jelement.shapedetection;

import gwt.jelement.imagecapture.Point2D;
import gwt.jelement.shapedetection.LandmarkType;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class Landmark{

    public Landmark(){
    }

    @JsProperty(name="location")
    public Point2D location;

    @JsOverlay
    public final Point2D getLocation(){
        return this.location;
    }

    @JsOverlay
    public final void setLocation(Point2D location){
        this.location = location;
    }

    @JsProperty(name="type")
    public String type;

    @JsOverlay
    public final LandmarkType getType(){
        return LandmarkType.of(this.type);
    }

    @JsOverlay
    public final void setType(LandmarkType type){
        this.type = type.getInternalValue();
    }


}

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
package gwt.jelement.animation;

import gwt.jelement.animation.ScrollDirection;
import gwt.jelement.animation.ScrollTimeline;
import gwt.jelement.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollTimelineOptions{

    public ScrollTimelineOptions(){
    }

    @JsProperty(name="scrollSource")
    public Element scrollSource;

    @JsOverlay
    public final Element getScrollSource(){
        return this.scrollSource;
    }

    @JsOverlay
    public final void setScrollSource(Element scrollSource){
        this.scrollSource = scrollSource;
    }

    @JsProperty(name="orientation")
    public String orientation;

    @JsOverlay
    public final ScrollDirection getOrientation(){
        return ScrollDirection.of(this.orientation);
    }

    @JsOverlay
    public final void setOrientation(ScrollDirection orientation){
        this.orientation = orientation.getInternalValue();
    }

    @JsProperty(name="timeRange")
    public ScrollTimeline.TimeRangeUnion timeRange;

    @JsOverlay
    public final void setTimeRange(double timeRange){
        this.timeRange = ScrollTimeline.TimeRangeUnion.of(timeRange);
    }

    @JsOverlay
    public final void setTimeRange(String timeRange){
        this.timeRange = ScrollTimeline.TimeRangeUnion.of(timeRange);
    }


}

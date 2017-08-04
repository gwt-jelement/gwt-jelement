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

import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import gwt.jelement.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ScrollTimelineOptions extends JsObject{

    @JsProperty(name="scrollSource")
    private Element scrollSource;

    @JsProperty(name="orientation")
    private String orientation;

    @JsProperty(name="timeRange")
    private ScrollTimeline.TimeRangeUnion timeRange;

    public ScrollTimelineOptions(){
    }

    @JsOverlay
    public final Element getScrollSource(){
        return this.scrollSource;
    }

    @JsOverlay
    public final void setScrollSource(Element scrollSource){
        this.scrollSource = scrollSource;
    }

    @JsOverlay
    public final ScrollDirection getOrientation(){
        return ScrollDirection.of(this.orientation);
    }

    @JsOverlay
    public final void setOrientation(ScrollDirection orientation){
        this.orientation = orientation.getInternalValue();
    }

    @JsOverlay
    public final void setTimeRange(double timeRange){
        this.timeRange = ScrollTimeline.TimeRangeUnion.of(timeRange);
    }

    @JsOverlay
    public final void setTimeRange(String timeRange){
        this.timeRange = ScrollTimeline.TimeRangeUnion.of(timeRange);
    }

}

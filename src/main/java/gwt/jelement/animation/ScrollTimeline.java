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

import gwt.jelement.dom.Element;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="ScrollTimeline", isNative = true)
public class ScrollTimeline extends AnimationTimeline{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface TimeRangeUnion {
        @JsOverlay
        static TimeRangeUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static TimeRangeUnion of(String value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default double asDouble(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default String asString(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isDouble(){
            return (Object) this instanceof Double;
        }
    
        @JsOverlay
        default boolean isString(){
            return (Object) this instanceof String;
        }
    
    }
    
    @JsProperty(name="timeRange")
    private TimeRangeUnion timeRange;
    
    @JsProperty(name="orientation")
    private String orientation;
    
    @JsConstructor
    public ScrollTimeline(){
        super();
    }
    
    @JsConstructor
    public ScrollTimeline(ScrollTimelineOptions options){
        super();
    }
    
    @JsProperty(name="scrollSource")
    public native Element getScrollSource();
    
    @JsOverlay
    public final TimeRangeUnion getTimeRange(){
        return this.timeRange;
    }
    
    @JsOverlay
    public final ScrollDirection getOrientation(){
       return ScrollDirection.of(orientation);
    }
    
}

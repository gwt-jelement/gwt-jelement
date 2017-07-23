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
package gwt.jelement.html.track.vtt;

import gwt.jelement.dom.DocumentFragment;
import gwt.jelement.html.track.TextTrackCue;
import gwt.jelement.html.track.vtt.AlignSetting;
import gwt.jelement.html.track.vtt.DirectionSetting;
import gwt.jelement.html.track.vtt.VTTRegion;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class VTTCue extends TextTrackCue{
    
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface DoubleOrAutoKeywordUnionType {
        @JsOverlay
        static DoubleOrAutoKeywordUnionType of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static DoubleOrAutoKeywordUnionType of(String value){
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
    
    @JsConstructor
    public VTTCue(){
        super();
    }
    
    @JsProperty(name="region")
    public VTTRegion region;
    
    @JsProperty(name="vertical")
    public String vertical;
    
    @JsOverlay
    public final DirectionSetting getVertical(){
       return DirectionSetting.of(vertical);
    }
    
    @JsOverlay
    public final void setVertical(DirectionSetting vertical){
       this.vertical = vertical.getInternalValue();
    }
    
    @JsProperty(name="snapToLines")
    public boolean snapToLines;
    
    @JsProperty(name="line")
    public VTTCue.DoubleOrAutoKeywordUnionType line;
    
    @JsOverlay
    public final void setLine(double line){
        this.line = VTTCue.DoubleOrAutoKeywordUnionType.of(line);
    }
    
    @JsOverlay
    public final void setLine(String line){
        this.line = VTTCue.DoubleOrAutoKeywordUnionType.of(line);
    }
    
    @JsProperty(name="position")
    public VTTCue.DoubleOrAutoKeywordUnionType position;
    
    @JsOverlay
    public final void setPosition(double position){
        this.position = VTTCue.DoubleOrAutoKeywordUnionType.of(position);
    }
    
    @JsOverlay
    public final void setPosition(String position){
        this.position = VTTCue.DoubleOrAutoKeywordUnionType.of(position);
    }
    
    @JsProperty(name="size")
    public double size;
    
    @JsProperty(name="align")
    public String align;
    
    @JsOverlay
    public final AlignSetting getAlign(){
       return AlignSetting.of(align);
    }
    
    @JsOverlay
    public final void setAlign(AlignSetting align){
       this.align = align.getInternalValue();
    }
    
    @JsProperty(name="text")
    public String text;
    
    @JsMethod(name = "getCueAsHTML")
    public native DocumentFragment getCueAsHTML();
    
}

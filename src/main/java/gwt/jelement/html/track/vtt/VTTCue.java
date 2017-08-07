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

import gwt.jelement.core.Js;
import gwt.jelement.dom.DocumentFragment;
import gwt.jelement.html.track.TextTrackCue;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="VTTCue", isNative = true)
public class VTTCue extends TextTrackCue {
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface LineUnion {
        @JsOverlay
        static LineUnion of(double value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static LineUnion of(String value){
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
    
    @JsProperty(name="line")
    private LineUnion line;
    
    @JsProperty(name="position")
    private LineUnion position;
    
    @JsProperty(name="vertical")
    private String vertical;
    
    @JsProperty(name="align")
    private String align;
    
    @JsConstructor
    public VTTCue(double startTime, double endTime, String text){
        super();
    }
    
    @JsProperty(name="region")
    public native VTTRegion getRegion();
    
    @JsProperty(name="region")
    public native void setRegion(VTTRegion region);
    
    @JsProperty(name="snapToLines")
    public native boolean getSnapToLines();
    
    @JsProperty(name="snapToLines")
    public native void setSnapToLines(boolean snapToLines);
    
    @JsOverlay
    public final LineUnion getLine(){
        return this.line;
    }
    
    @JsOverlay
    public final void setLine(double line){
        this.line = VTTCue.LineUnion.of(line);
    }
    
    @JsOverlay
    public final void setLine(String line){
        this.line = VTTCue.LineUnion.of(line);
    }
    
    @JsOverlay
    public final LineUnion getPosition(){
        return this.position;
    }
    
    @JsOverlay
    public final void setPosition(double position){
        this.position = VTTCue.LineUnion.of(position);
    }
    
    @JsOverlay
    public final void setPosition(String position){
        this.position = VTTCue.LineUnion.of(position);
    }
    
    @JsProperty(name="size")
    public native double getSize();
    
    @JsProperty(name="size")
    public native void setSize(double size);
    
    @JsProperty(name="text")
    public native String getText();
    
    @JsProperty(name="text")
    public native void setText(String text);
    
    @JsOverlay
    public final DirectionSetting getVertical(){
       return DirectionSetting.of(vertical);
    }
    
    @JsOverlay
    public final void setVertical(DirectionSetting vertical){
       this.vertical = vertical.getInternalValue();
    }
    
    @JsOverlay
    public final AlignSetting getAlign(){
       return AlignSetting.of(align);
    }
    
    @JsOverlay
    public final void setAlign(AlignSetting align){
       this.align = align.getInternalValue();
    }
    
    @JsMethod(name = "getCueAsHTML")
    public native DocumentFragment getCueAsHTML();
    
}

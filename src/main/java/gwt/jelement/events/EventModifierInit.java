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
package gwt.jelement.events;

import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class EventModifierInit extends UIEventInit{

    @JsProperty(name="ctrlKey")
    private boolean ctrlKey;

    @JsProperty(name="shiftKey")
    private boolean shiftKey;

    @JsProperty(name="altKey")
    private boolean altKey;

    @JsProperty(name="metaKey")
    private boolean metaKey;

    @JsProperty(name="modifierAltGraph")
    private boolean modifierAltGraph;

    @JsProperty(name="modifierCapsLock")
    private boolean modifierCapsLock;

    @JsProperty(name="modifierFn")
    private boolean modifierFn;

    @JsProperty(name="modifierNumLock")
    private boolean modifierNumLock;

    @JsProperty(name="modifierScrollLock")
    private boolean modifierScrollLock;

    @JsProperty(name="modifierSymbol")
    private boolean modifierSymbol;

    public EventModifierInit(){
    }

    @JsOverlay
    public final boolean isCtrlKey(){
        return this.ctrlKey;
    }

    @JsOverlay
    public final void setCtrlKey(boolean ctrlKey){
        this.ctrlKey = ctrlKey;
    }

    @JsOverlay
    public final boolean isShiftKey(){
        return this.shiftKey;
    }

    @JsOverlay
    public final void setShiftKey(boolean shiftKey){
        this.shiftKey = shiftKey;
    }

    @JsOverlay
    public final boolean isAltKey(){
        return this.altKey;
    }

    @JsOverlay
    public final void setAltKey(boolean altKey){
        this.altKey = altKey;
    }

    @JsOverlay
    public final boolean isMetaKey(){
        return this.metaKey;
    }

    @JsOverlay
    public final void setMetaKey(boolean metaKey){
        this.metaKey = metaKey;
    }

    @JsOverlay
    public final boolean isModifierAltGraph(){
        return this.modifierAltGraph;
    }

    @JsOverlay
    public final void setModifierAltGraph(boolean modifierAltGraph){
        this.modifierAltGraph = modifierAltGraph;
    }

    @JsOverlay
    public final boolean isModifierCapsLock(){
        return this.modifierCapsLock;
    }

    @JsOverlay
    public final void setModifierCapsLock(boolean modifierCapsLock){
        this.modifierCapsLock = modifierCapsLock;
    }

    @JsOverlay
    public final boolean isModifierFn(){
        return this.modifierFn;
    }

    @JsOverlay
    public final void setModifierFn(boolean modifierFn){
        this.modifierFn = modifierFn;
    }

    @JsOverlay
    public final boolean isModifierNumLock(){
        return this.modifierNumLock;
    }

    @JsOverlay
    public final void setModifierNumLock(boolean modifierNumLock){
        this.modifierNumLock = modifierNumLock;
    }

    @JsOverlay
    public final boolean isModifierScrollLock(){
        return this.modifierScrollLock;
    }

    @JsOverlay
    public final void setModifierScrollLock(boolean modifierScrollLock){
        this.modifierScrollLock = modifierScrollLock;
    }

    @JsOverlay
    public final boolean isModifierSymbol(){
        return this.modifierSymbol;
    }

    @JsOverlay
    public final void setModifierSymbol(boolean modifierSymbol){
        this.modifierSymbol = modifierSymbol;
    }


}

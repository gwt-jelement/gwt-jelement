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
package gwt.jelement.dom;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MutationObserverInit{

    @JsProperty(name="childList")
    private boolean childList;

    @JsProperty(name="attributes")
    private boolean attributes;

    @JsProperty(name="characterData")
    private boolean characterData;

    @JsProperty(name="subtree")
    private boolean subtree;

    @JsProperty(name="attributeOldValue")
    private boolean attributeOldValue;

    @JsProperty(name="characterDataOldValue")
    private boolean characterDataOldValue;

    @JsProperty(name="attributeFilter")
    private String[] attributeFilter;

    public MutationObserverInit(){
    }

    @JsOverlay
    public final boolean getChildList(){
        return this.childList;
    }

    @JsOverlay
    public final void setChildList(boolean childList){
        this.childList = childList;
    }

    @JsOverlay
    public final boolean getAttributes(){
        return this.attributes;
    }

    @JsOverlay
    public final void setAttributes(boolean attributes){
        this.attributes = attributes;
    }

    @JsOverlay
    public final boolean getCharacterData(){
        return this.characterData;
    }

    @JsOverlay
    public final void setCharacterData(boolean characterData){
        this.characterData = characterData;
    }

    @JsOverlay
    public final boolean getSubtree(){
        return this.subtree;
    }

    @JsOverlay
    public final void setSubtree(boolean subtree){
        this.subtree = subtree;
    }

    @JsOverlay
    public final boolean getAttributeOldValue(){
        return this.attributeOldValue;
    }

    @JsOverlay
    public final void setAttributeOldValue(boolean attributeOldValue){
        this.attributeOldValue = attributeOldValue;
    }

    @JsOverlay
    public final boolean getCharacterDataOldValue(){
        return this.characterDataOldValue;
    }

    @JsOverlay
    public final void setCharacterDataOldValue(boolean characterDataOldValue){
        this.characterDataOldValue = characterDataOldValue;
    }

    @JsOverlay
    public final String[] getAttributeFilter(){
        return this.attributeFilter;
    }

    @JsOverlay
    public final void setAttributeFilter(String[] attributeFilter){
        this.attributeFilter = attributeFilter;
    }

}

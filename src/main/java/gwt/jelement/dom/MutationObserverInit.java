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

    public MutationObserverInit(){
    }

    @JsProperty(name="childList")
    public boolean childList;

    @JsOverlay
    public final boolean getChildList(){
        return this.childList;
    }

    @JsOverlay
    public final void setChildList(boolean childList){
        this.childList = childList;
    }

    @JsProperty(name="attributes")
    public boolean attributes;

    @JsOverlay
    public final boolean getAttributes(){
        return this.attributes;
    }

    @JsOverlay
    public final void setAttributes(boolean attributes){
        this.attributes = attributes;
    }

    @JsProperty(name="characterData")
    public boolean characterData;

    @JsOverlay
    public final boolean getCharacterData(){
        return this.characterData;
    }

    @JsOverlay
    public final void setCharacterData(boolean characterData){
        this.characterData = characterData;
    }

    @JsProperty(name="subtree")
    public boolean subtree;

    @JsOverlay
    public final boolean getSubtree(){
        return this.subtree;
    }

    @JsOverlay
    public final void setSubtree(boolean subtree){
        this.subtree = subtree;
    }

    @JsProperty(name="attributeOldValue")
    public boolean attributeOldValue;

    @JsOverlay
    public final boolean getAttributeOldValue(){
        return this.attributeOldValue;
    }

    @JsOverlay
    public final void setAttributeOldValue(boolean attributeOldValue){
        this.attributeOldValue = attributeOldValue;
    }

    @JsProperty(name="characterDataOldValue")
    public boolean characterDataOldValue;

    @JsOverlay
    public final boolean getCharacterDataOldValue(){
        return this.characterDataOldValue;
    }

    @JsOverlay
    public final void setCharacterDataOldValue(boolean characterDataOldValue){
        this.characterDataOldValue = characterDataOldValue;
    }

    @JsProperty(name="attributeFilter")
    public String[] attributeFilter;

    @JsOverlay
    public final String[] getAttributeFilter(){
        return this.attributeFilter;
    }

    @JsOverlay
    public final void setAttributeFilter(String[] attributeFilter){
        this.attributeFilter = attributeFilter;
    }


}

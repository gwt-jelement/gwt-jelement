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

import gwt.jelement.dom.Node;
import gwt.jelement.events.Event;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MutationEvent extends Event{
    public static int MODIFICATION;
    public static int ADDITION;
    public static int REMOVAL;
    
    
    @JsConstructor
    public MutationEvent(){
        super((String) null);
    }
    
    @JsProperty(name="relatedNode")
    public native Node getRelatedNode();
    
    @JsProperty(name="prevValue")
    public native String getPrevValue();
    
    @JsProperty(name="newValue")
    public native String getNewValue();
    
    @JsProperty(name="attrName")
    public native String getAttrName();
    
    @JsProperty(name="attrChange")
    public native short getAttrChange();
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent();
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles, boolean cancelable);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles, boolean cancelable, Node relatedNode);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles, boolean cancelable, Node relatedNode, String prevValue);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles, boolean cancelable, Node relatedNode, String prevValue, String newValue);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles, boolean cancelable, Node relatedNode, String prevValue, String newValue, String attrName);
    
    @JsMethod(name = "initMutationEvent")
    public native void initMutationEvent(String type, boolean bubbles, boolean cancelable, Node relatedNode, String prevValue, String newValue, String attrName, short attrChange);
    
}

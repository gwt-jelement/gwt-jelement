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
package gwt.jelement.html;

import gwt.jelement.core.Js;
import gwt.jelement.dom.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLFormElement", isNative = true)
public class HTMLFormElement extends HTMLElement{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface FormControlsUnion {
        @JsOverlay
        static FormControlsUnion of(RadioNodeList value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static FormControlsUnion of(Element value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default RadioNodeList asRadioNodeList(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default Element asElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isRadioNodeList(){
            return (Object) this instanceof RadioNodeList;
        }
    
        @JsOverlay
        default boolean isElement(){
            return (Object) this instanceof Element;
        }
    
    }
    
    @JsProperty(name="acceptCharset")
    public native String getAcceptCharset();
    
    @JsProperty(name="acceptCharset")
    public native void setAcceptCharset(String acceptCharset);
    
    @JsProperty(name="action")
    public native String getAction();
    
    @JsProperty(name="action")
    public native void setAction(String action);
    
    @JsProperty(name="autocomplete")
    public native String getAutocomplete();
    
    @JsProperty(name="autocomplete")
    public native void setAutocomplete(String autocomplete);
    
    @JsProperty(name="enctype")
    public native String getEnctype();
    
    @JsProperty(name="enctype")
    public native void setEnctype(String enctype);
    
    @JsProperty(name="encoding")
    public native String getEncoding();
    
    @JsProperty(name="encoding")
    public native void setEncoding(String encoding);
    
    @JsProperty(name="method")
    public native String getMethod();
    
    @JsProperty(name="method")
    public native void setMethod(String method);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="noValidate")
    public native boolean getNoValidate();
    
    @JsProperty(name="noValidate")
    public native void setNoValidate(boolean noValidate);
    
    @JsProperty(name="target")
    public native String getTarget();
    
    @JsProperty(name="target")
    public native void setTarget(String target);
    
    @JsProperty(name="elements")
    public native HTMLFormControlsCollection getElements();
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsOverlay
    public final Element get(double index){
        return (Element) Js.get(this.object(), index);
    }
    
    @JsOverlay
    public final HTMLFormElement.FormControlsUnion get(String name){
        return (HTMLFormElement.FormControlsUnion) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsMethod(name = "reset")
    public native void reset();
    
    @JsMethod(name = "submit")
    public native void submit();
    
}

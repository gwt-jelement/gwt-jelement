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
import gwt.jelement.dom.Document;
import gwt.jelement.dom.Node;
import gwt.jelement.frame.Window;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLObjectElement", isNative = true)
public class HTMLObjectElement extends HTMLElement{
    @JsProperty(name="data")
    public native String getData();
    
    @JsProperty(name="data")
    public native void setData(String data);
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsProperty(name="type")
    public native void setType(String type);
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="useMap")
    public native String getUseMap();
    
    @JsProperty(name="useMap")
    public native void setUseMap(String useMap);
    
    @JsProperty(name="form")
    public native HTMLFormElement getForm();
    
    @JsProperty(name="width")
    public native String getWidth();
    
    @JsProperty(name="width")
    public native void setWidth(String width);
    
    @JsProperty(name="height")
    public native String getHeight();
    
    @JsProperty(name="height")
    public native void setHeight(String height);
    
    @JsProperty(name="contentDocument")
    public native Document getContentDocument();
    
    @JsProperty(name="contentWindow")
    public native Window getContentWindow();
    
    @JsProperty(name="willValidate")
    public native boolean getWillValidate();
    
    @JsProperty(name="validity")
    public native ValidityState getValidity();
    
    @JsProperty(name="validationMessage")
    public native String getValidationMessage();
    
    @JsProperty(name="align")
    public native String getAlign();
    
    @JsProperty(name="align")
    public native void setAlign(String align);
    
    @JsProperty(name="archive")
    public native String getArchive();
    
    @JsProperty(name="archive")
    public native void setArchive(String archive);
    
    @JsProperty(name="code")
    public native String getCode();
    
    @JsProperty(name="code")
    public native void setCode(String code);
    
    @JsProperty(name="declare")
    public native boolean getDeclare();
    
    @JsProperty(name="declare")
    public native void setDeclare(boolean declare);
    
    @JsProperty(name="hspace")
    public native double getHspace();
    
    @JsProperty(name="hspace")
    public native void setHspace(double hspace);
    
    @JsProperty(name="standby")
    public native String getStandby();
    
    @JsProperty(name="standby")
    public native void setStandby(String standby);
    
    @JsProperty(name="vspace")
    public native double getVspace();
    
    @JsProperty(name="vspace")
    public native void setVspace(double vspace);
    
    @JsProperty(name="codeBase")
    public native String getCodeBase();
    
    @JsProperty(name="codeBase")
    public native void setCodeBase(String codeBase);
    
    @JsProperty(name="codeType")
    public native String getCodeType();
    
    @JsProperty(name="codeType")
    public native void setCodeType(String codeType);
    
    @JsProperty(name="border")
    public native String getBorder();
    
    @JsProperty(name="border")
    public native void setBorder(String border);
    
    @JsMethod(name = "checkValidity")
    public native boolean checkValidity();
    
    @JsOverlay
    public final Node get(String name){
        return (Node) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "getSVGDocument")
    public native Document getSVGDocument();
    
    @JsMethod(name = "reportValidity")
    public native boolean reportValidity();
    
    @JsOverlay
    public final Node set(String name, Node value){
        return Js.<Node>set(this.object(), name, value);
    }
    
    @JsMethod(name = "setCustomValidity")
    public native void setCustomValidity(String error);
    
}

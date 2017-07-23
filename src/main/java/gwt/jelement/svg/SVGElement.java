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
package gwt.jelement.svg;

import gwt.jelement.css.CSSStyleDeclaration;
import gwt.jelement.dom.DOMStringMap;
import gwt.jelement.dom.Element;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.svg.SVGElement;
import gwt.jelement.svg.SVGSVGElement;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SVGElement extends Element{
    
    @JsConstructor
    public SVGElement(){
        super();
    }
    
    @JsProperty(name="dataset")
    public DOMStringMap dataset;
    
    @JsProperty(name="style")
    public CSSStyleDeclaration style;
    
    @JsProperty(name="ownerSVGElement")
    public SVGSVGElement ownerSVGElement;
    
    @JsProperty(name="viewportElement")
    public SVGElement viewportElement;
    
    @JsProperty(name="tabIndex")
    public double tabIndex;
    
    @JsProperty(name="onabort")
    public EventHandlerNonNull onabort;
    
    @JsProperty(name="onblur")
    public EventHandlerNonNull onblur;
    
    @JsProperty(name="oncancel")
    public EventHandlerNonNull oncancel;
    
    @JsProperty(name="oncanplay")
    public EventHandlerNonNull oncanplay;
    
    @JsProperty(name="oncanplaythrough")
    public EventHandlerNonNull oncanplaythrough;
    
    @JsProperty(name="onchange")
    public EventHandlerNonNull onchange;
    
    @JsProperty(name="onclick")
    public EventHandlerNonNull onclick;
    
    @JsProperty(name="onclose")
    public EventHandlerNonNull onclose;
    
    @JsProperty(name="oncontextmenu")
    public EventHandlerNonNull oncontextmenu;
    
    @JsProperty(name="oncuechange")
    public EventHandlerNonNull oncuechange;
    
    @JsProperty(name="ondblclick")
    public EventHandlerNonNull ondblclick;
    
    @JsProperty(name="ondrag")
    public EventHandlerNonNull ondrag;
    
    @JsProperty(name="ondragend")
    public EventHandlerNonNull ondragend;
    
    @JsProperty(name="ondragenter")
    public EventHandlerNonNull ondragenter;
    
    @JsProperty(name="ondragleave")
    public EventHandlerNonNull ondragleave;
    
    @JsProperty(name="ondragover")
    public EventHandlerNonNull ondragover;
    
    @JsProperty(name="ondragstart")
    public EventHandlerNonNull ondragstart;
    
    @JsProperty(name="ondrop")
    public EventHandlerNonNull ondrop;
    
    @JsProperty(name="ondurationchange")
    public EventHandlerNonNull ondurationchange;
    
    @JsProperty(name="onemptied")
    public EventHandlerNonNull onemptied;
    
    @JsProperty(name="onended")
    public EventHandlerNonNull onended;
    
    @JsProperty(name="onerror")
    public EventHandlerNonNull onerror;
    
    @JsProperty(name="onfocus")
    public EventHandlerNonNull onfocus;
    
    @JsProperty(name="oninput")
    public EventHandlerNonNull oninput;
    
    @JsProperty(name="oninvalid")
    public EventHandlerNonNull oninvalid;
    
    @JsProperty(name="onkeydown")
    public EventHandlerNonNull onkeydown;
    
    @JsProperty(name="onkeypress")
    public EventHandlerNonNull onkeypress;
    
    @JsProperty(name="onkeyup")
    public EventHandlerNonNull onkeyup;
    
    @JsProperty(name="onload")
    public EventHandlerNonNull onload;
    
    @JsProperty(name="onloadeddata")
    public EventHandlerNonNull onloadeddata;
    
    @JsProperty(name="onloadedmetadata")
    public EventHandlerNonNull onloadedmetadata;
    
    @JsProperty(name="onloadstart")
    public EventHandlerNonNull onloadstart;
    
    @JsProperty(name="onmousedown")
    public EventHandlerNonNull onmousedown;
    
    @JsProperty(name="onmouseenter")
    public EventHandlerNonNull onmouseenter;
    
    @JsProperty(name="onmouseleave")
    public EventHandlerNonNull onmouseleave;
    
    @JsProperty(name="onmousemove")
    public EventHandlerNonNull onmousemove;
    
    @JsProperty(name="onmouseout")
    public EventHandlerNonNull onmouseout;
    
    @JsProperty(name="onmouseover")
    public EventHandlerNonNull onmouseover;
    
    @JsProperty(name="onmouseup")
    public EventHandlerNonNull onmouseup;
    
    @JsProperty(name="onmousewheel")
    public EventHandlerNonNull onmousewheel;
    
    @JsProperty(name="onpause")
    public EventHandlerNonNull onpause;
    
    @JsProperty(name="onplay")
    public EventHandlerNonNull onplay;
    
    @JsProperty(name="onplaying")
    public EventHandlerNonNull onplaying;
    
    @JsProperty(name="onprogress")
    public EventHandlerNonNull onprogress;
    
    @JsProperty(name="onratechange")
    public EventHandlerNonNull onratechange;
    
    @JsProperty(name="onreset")
    public EventHandlerNonNull onreset;
    
    @JsProperty(name="onresize")
    public EventHandlerNonNull onresize;
    
    @JsProperty(name="onscroll")
    public EventHandlerNonNull onscroll;
    
    @JsProperty(name="onseeked")
    public EventHandlerNonNull onseeked;
    
    @JsProperty(name="onseeking")
    public EventHandlerNonNull onseeking;
    
    @JsProperty(name="onselect")
    public EventHandlerNonNull onselect;
    
    @JsProperty(name="onstalled")
    public EventHandlerNonNull onstalled;
    
    @JsProperty(name="onsubmit")
    public EventHandlerNonNull onsubmit;
    
    @JsProperty(name="onsuspend")
    public EventHandlerNonNull onsuspend;
    
    @JsProperty(name="ontimeupdate")
    public EventHandlerNonNull ontimeupdate;
    
    @JsProperty(name="ontoggle")
    public EventHandlerNonNull ontoggle;
    
    @JsProperty(name="onvolumechange")
    public EventHandlerNonNull onvolumechange;
    
    @JsProperty(name="onwaiting")
    public EventHandlerNonNull onwaiting;
    
    @JsProperty(name="onauxclick")
    public EventHandlerNonNull onauxclick;
    
    @JsProperty(name="ongotpointercapture")
    public EventHandlerNonNull ongotpointercapture;
    
    @JsProperty(name="onlostpointercapture")
    public EventHandlerNonNull onlostpointercapture;
    
    @JsProperty(name="onpointerdown")
    public EventHandlerNonNull onpointerdown;
    
    @JsProperty(name="onpointermove")
    public EventHandlerNonNull onpointermove;
    
    @JsProperty(name="onpointerup")
    public EventHandlerNonNull onpointerup;
    
    @JsProperty(name="onpointercancel")
    public EventHandlerNonNull onpointercancel;
    
    @JsProperty(name="onpointerover")
    public EventHandlerNonNull onpointerover;
    
    @JsProperty(name="onpointerout")
    public EventHandlerNonNull onpointerout;
    
    @JsProperty(name="onpointerenter")
    public EventHandlerNonNull onpointerenter;
    
    @JsProperty(name="onpointerleave")
    public EventHandlerNonNull onpointerleave;
    
    @JsProperty(name="ontouchcancel")
    public EventHandlerNonNull ontouchcancel;
    
    @JsProperty(name="ontouchend")
    public EventHandlerNonNull ontouchend;
    
    @JsProperty(name="ontouchmove")
    public EventHandlerNonNull ontouchmove;
    
    @JsProperty(name="ontouchstart")
    public EventHandlerNonNull ontouchstart;
    
    @JsProperty(name="nonce")
    public String nonce;
    
    @JsMethod(name = "blur")
    public native void blur();
    
    @JsMethod(name = "focus")
    public native void focus();
    
}

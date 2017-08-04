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

import gwt.jelement.animation.Animation;
import gwt.jelement.animation.DocumentTimeline;
import gwt.jelement.core.Function;
import gwt.jelement.core.Js;
import gwt.jelement.css.FontFaceSet;
import gwt.jelement.css.StyleSheetList;
import gwt.jelement.editing.Selection;
import gwt.jelement.events.Event;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.frame.Location;
import gwt.jelement.frame.Window;
import gwt.jelement.html.HTMLCollection;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.HTMLHeadElement;
import gwt.jelement.html.HTMLScriptElement;
import gwt.jelement.svg.SVGSVGElement;
import gwt.jelement.svg.SVGScriptElement;
import gwt.jelement.xml.XPathExpression;
import gwt.jelement.xml.XPathNSResolver;
import gwt.jelement.xml.XPathResult;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Document", isNative = true)
public class Document extends Node{
    @JsType(isNative = true, name = "?", namespace = JsPackage.GLOBAL)
    public interface HTMLOrSVGScriptElement {
        @JsOverlay
        static HTMLOrSVGScriptElement of(HTMLScriptElement value){
            return Js.cast(value);
        }
    
        @JsOverlay
        static HTMLOrSVGScriptElement of(SVGScriptElement value){
            return Js.cast(value);
        }
    
        @JsOverlay
        default HTMLScriptElement asHTMLScriptElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default SVGScriptElement asSVGScriptElement(){
            return Js.cast(this);
        }
    
        @JsOverlay
        default boolean isHTMLScriptElement(){
            return (Object) this instanceof HTMLScriptElement;
        }
    
        @JsOverlay
        default boolean isSVGScriptElement(){
            return (Object) this instanceof SVGScriptElement;
        }
    
    }
    
    @JsProperty(name="currentScript")
    private HTMLOrSVGScriptElement currentScript;
    
    @JsProperty(name="onreadystatechange")
    private EventHandlerNonNull onreadystatechange;
    
    @JsProperty(name="onpointerlockchange")
    private EventHandlerNonNull onpointerlockchange;
    
    @JsProperty(name="onpointerlockerror")
    private EventHandlerNonNull onpointerlockerror;
    
    @JsProperty(name="onbeforecopy")
    private EventHandlerNonNull onbeforecopy;
    
    @JsProperty(name="onbeforecut")
    private EventHandlerNonNull onbeforecut;
    
    @JsProperty(name="onbeforepaste")
    private EventHandlerNonNull onbeforepaste;
    
    @JsProperty(name="oncopy")
    private EventHandlerNonNull oncopy;
    
    @JsProperty(name="oncut")
    private EventHandlerNonNull oncut;
    
    @JsProperty(name="onpaste")
    private EventHandlerNonNull onpaste;
    
    @JsProperty(name="onsearch")
    private EventHandlerNonNull onsearch;
    
    @JsProperty(name="onsecuritypolicyviolation")
    private EventHandlerNonNull onsecuritypolicyviolation;
    
    @JsProperty(name="onselectionchange")
    private EventHandlerNonNull onselectionchange;
    
    @JsProperty(name="onselectstart")
    private EventHandlerNonNull onselectstart;
    
    @JsProperty(name="onwheel")
    private EventHandlerNonNull onwheel;
    
    @JsProperty(name="onfullscreenchange")
    private EventHandlerNonNull onfullscreenchange;
    
    @JsProperty(name="onfullscreenerror")
    private EventHandlerNonNull onfullscreenerror;
    
    @JsProperty(name="onwebkitfullscreenchange")
    private EventHandlerNonNull onwebkitfullscreenchange;
    
    @JsProperty(name="onwebkitfullscreenerror")
    private EventHandlerNonNull onwebkitfullscreenerror;
    
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="onblur")
    private EventHandlerNonNull onblur;
    
    @JsProperty(name="oncancel")
    private EventHandlerNonNull oncancel;
    
    @JsProperty(name="oncanplay")
    private EventHandlerNonNull oncanplay;
    
    @JsProperty(name="oncanplaythrough")
    private EventHandlerNonNull oncanplaythrough;
    
    @JsProperty(name="onchange")
    private EventHandlerNonNull onchange;
    
    @JsProperty(name="onclick")
    private EventHandlerNonNull onclick;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="oncontextmenu")
    private EventHandlerNonNull oncontextmenu;
    
    @JsProperty(name="oncuechange")
    private EventHandlerNonNull oncuechange;
    
    @JsProperty(name="ondblclick")
    private EventHandlerNonNull ondblclick;
    
    @JsProperty(name="ondrag")
    private EventHandlerNonNull ondrag;
    
    @JsProperty(name="ondragend")
    private EventHandlerNonNull ondragend;
    
    @JsProperty(name="ondragenter")
    private EventHandlerNonNull ondragenter;
    
    @JsProperty(name="ondragleave")
    private EventHandlerNonNull ondragleave;
    
    @JsProperty(name="ondragover")
    private EventHandlerNonNull ondragover;
    
    @JsProperty(name="ondragstart")
    private EventHandlerNonNull ondragstart;
    
    @JsProperty(name="ondrop")
    private EventHandlerNonNull ondrop;
    
    @JsProperty(name="ondurationchange")
    private EventHandlerNonNull ondurationchange;
    
    @JsProperty(name="onemptied")
    private EventHandlerNonNull onemptied;
    
    @JsProperty(name="onended")
    private EventHandlerNonNull onended;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onfocus")
    private EventHandlerNonNull onfocus;
    
    @JsProperty(name="oninput")
    private EventHandlerNonNull oninput;
    
    @JsProperty(name="oninvalid")
    private EventHandlerNonNull oninvalid;
    
    @JsProperty(name="onkeydown")
    private EventHandlerNonNull onkeydown;
    
    @JsProperty(name="onkeypress")
    private EventHandlerNonNull onkeypress;
    
    @JsProperty(name="onkeyup")
    private EventHandlerNonNull onkeyup;
    
    @JsProperty(name="onload")
    private EventHandlerNonNull onload;
    
    @JsProperty(name="onloadeddata")
    private EventHandlerNonNull onloadeddata;
    
    @JsProperty(name="onloadedmetadata")
    private EventHandlerNonNull onloadedmetadata;
    
    @JsProperty(name="onloadstart")
    private EventHandlerNonNull onloadstart;
    
    @JsProperty(name="onmousedown")
    private EventHandlerNonNull onmousedown;
    
    @JsProperty(name="onmouseenter")
    private EventHandlerNonNull onmouseenter;
    
    @JsProperty(name="onmouseleave")
    private EventHandlerNonNull onmouseleave;
    
    @JsProperty(name="onmousemove")
    private EventHandlerNonNull onmousemove;
    
    @JsProperty(name="onmouseout")
    private EventHandlerNonNull onmouseout;
    
    @JsProperty(name="onmouseover")
    private EventHandlerNonNull onmouseover;
    
    @JsProperty(name="onmouseup")
    private EventHandlerNonNull onmouseup;
    
    @JsProperty(name="onmousewheel")
    private EventHandlerNonNull onmousewheel;
    
    @JsProperty(name="onpause")
    private EventHandlerNonNull onpause;
    
    @JsProperty(name="onplay")
    private EventHandlerNonNull onplay;
    
    @JsProperty(name="onplaying")
    private EventHandlerNonNull onplaying;
    
    @JsProperty(name="onprogress")
    private EventHandlerNonNull onprogress;
    
    @JsProperty(name="onratechange")
    private EventHandlerNonNull onratechange;
    
    @JsProperty(name="onreset")
    private EventHandlerNonNull onreset;
    
    @JsProperty(name="onresize")
    private EventHandlerNonNull onresize;
    
    @JsProperty(name="onscroll")
    private EventHandlerNonNull onscroll;
    
    @JsProperty(name="onseeked")
    private EventHandlerNonNull onseeked;
    
    @JsProperty(name="onseeking")
    private EventHandlerNonNull onseeking;
    
    @JsProperty(name="onselect")
    private EventHandlerNonNull onselect;
    
    @JsProperty(name="onstalled")
    private EventHandlerNonNull onstalled;
    
    @JsProperty(name="onsubmit")
    private EventHandlerNonNull onsubmit;
    
    @JsProperty(name="onsuspend")
    private EventHandlerNonNull onsuspend;
    
    @JsProperty(name="ontimeupdate")
    private EventHandlerNonNull ontimeupdate;
    
    @JsProperty(name="ontoggle")
    private EventHandlerNonNull ontoggle;
    
    @JsProperty(name="onvolumechange")
    private EventHandlerNonNull onvolumechange;
    
    @JsProperty(name="onwaiting")
    private EventHandlerNonNull onwaiting;
    
    @JsProperty(name="onauxclick")
    private EventHandlerNonNull onauxclick;
    
    @JsProperty(name="ongotpointercapture")
    private EventHandlerNonNull ongotpointercapture;
    
    @JsProperty(name="onlostpointercapture")
    private EventHandlerNonNull onlostpointercapture;
    
    @JsProperty(name="onpointerdown")
    private EventHandlerNonNull onpointerdown;
    
    @JsProperty(name="onpointermove")
    private EventHandlerNonNull onpointermove;
    
    @JsProperty(name="onpointerup")
    private EventHandlerNonNull onpointerup;
    
    @JsProperty(name="onpointercancel")
    private EventHandlerNonNull onpointercancel;
    
    @JsProperty(name="onpointerover")
    private EventHandlerNonNull onpointerover;
    
    @JsProperty(name="onpointerout")
    private EventHandlerNonNull onpointerout;
    
    @JsProperty(name="onpointerenter")
    private EventHandlerNonNull onpointerenter;
    
    @JsProperty(name="onpointerleave")
    private EventHandlerNonNull onpointerleave;
    
    @JsProperty(name="ontouchcancel")
    private EventHandlerNonNull ontouchcancel;
    
    @JsProperty(name="ontouchend")
    private EventHandlerNonNull ontouchend;
    
    @JsProperty(name="ontouchmove")
    private EventHandlerNonNull ontouchmove;
    
    @JsProperty(name="ontouchstart")
    private EventHandlerNonNull ontouchstart;
    
    @JsProperty(name="readyState")
    private String readyState;
    
    @JsProperty(name="visibilityState")
    private String visibilityState;
    
    @JsProperty(name="addressSpace")
    private String addressSpace;
    
    @JsConstructor
    public Document(){
        super();
    }
    
    @JsProperty(name="implementation")
    public native DOMImplementation getImplementation();
    
    @JsProperty(name="URL")
    public native String getURL();
    
    @JsProperty(name="documentURI")
    public native String getDocumentURI();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="suborigin")
    public native String getSuborigin();
    
    @JsProperty(name="compatMode")
    public native String getCompatMode();
    
    @JsProperty(name="characterSet")
    public native String getCharacterSet();
    
    @JsProperty(name="charset")
    public native String getCharset();
    
    @JsProperty(name="inputEncoding")
    public native String getInputEncoding();
    
    @JsProperty(name="contentType")
    public native String getContentType();
    
    @JsProperty(name="doctype")
    public native DocumentType getDoctype();
    
    @JsProperty(name="documentElement")
    public native Element getDocumentElement();
    
    @JsProperty(name="rootScroller")
    public native Element getRootScroller();
    
    @JsProperty(name="rootScroller")
    public native void setRootScroller(Element rootScroller);
    
    @JsProperty(name="xmlEncoding")
    public native String getXmlEncoding();
    
    @JsProperty(name="xmlVersion")
    public native String getXmlVersion();
    
    @JsProperty(name="xmlVersion")
    public native void setXmlVersion(String xmlVersion);
    
    @JsProperty(name="xmlStandalone")
    public native boolean getXmlStandalone();
    
    @JsProperty(name="xmlStandalone")
    public native void setXmlStandalone(boolean xmlStandalone);
    
    @JsProperty(name="location")
    public native Location getLocation();
    
    @JsProperty(name="domain")
    public native String getDomain();
    
    @JsProperty(name="domain")
    public native void setDomain(String domain);
    
    @JsProperty(name="referrer")
    public native String getReferrer();
    
    @JsProperty(name="cookie")
    public native String getCookie();
    
    @JsProperty(name="cookie")
    public native void setCookie(String cookie);
    
    @JsProperty(name="lastModified")
    public native String getLastModified();
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsProperty(name="title")
    public native void setTitle(String title);
    
    @JsProperty(name="dir")
    public native String getDir();
    
    @JsProperty(name="dir")
    public native void setDir(String dir);
    
    @JsProperty(name="body")
    public native HTMLElement getBody();
    
    @JsProperty(name="body")
    public native void setBody(HTMLElement body);
    
    @JsProperty(name="head")
    public native HTMLHeadElement getHead();
    
    @JsProperty(name="images")
    public native HTMLCollection getImages();
    
    @JsProperty(name="embeds")
    public native HTMLCollection getEmbeds();
    
    @JsProperty(name="plugins")
    public native HTMLCollection getPlugins();
    
    @JsProperty(name="links")
    public native HTMLCollection getLinks();
    
    @JsProperty(name="forms")
    public native HTMLCollection getForms();
    
    @JsProperty(name="scripts")
    public native HTMLCollection getScripts();
    
    @JsOverlay
    public final HTMLOrSVGScriptElement getCurrentScript(){
        return this.currentScript;
    }
    
    @JsProperty(name="defaultView")
    public native Window getDefaultView();
    
    @JsProperty(name="designMode")
    public native String getDesignMode();
    
    @JsProperty(name="designMode")
    public native void setDesignMode(String designMode);
    
    @JsOverlay
    public final EventHandlerNonNull getOnReadystatechange(){
        return this.onreadystatechange;
    }
    
    @JsOverlay
    public final void setOnReadystatechange(EventHandlerNonNull onreadystatechange){
        this.onreadystatechange = onreadystatechange;
    }
    
    @JsProperty(name="anchors")
    public native HTMLCollection getAnchors();
    
    @JsProperty(name="applets")
    public native HTMLCollection getApplets();
    
    @JsProperty(name="selectedStylesheetSet")
    public native String getSelectedStylesheetSet();
    
    @JsProperty(name="selectedStylesheetSet")
    public native void setSelectedStylesheetSet(String selectedStylesheetSet);
    
    @JsProperty(name="preferredStylesheetSet")
    public native String getPreferredStylesheetSet();
    
    @JsProperty(name="scrollingElement")
    public native Element getScrollingElement();
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerlockchange(){
        return this.onpointerlockchange;
    }
    
    @JsOverlay
    public final void setOnPointerlockchange(EventHandlerNonNull onpointerlockchange){
        this.onpointerlockchange = onpointerlockchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerlockerror(){
        return this.onpointerlockerror;
    }
    
    @JsOverlay
    public final void setOnPointerlockerror(EventHandlerNonNull onpointerlockerror){
        this.onpointerlockerror = onpointerlockerror;
    }
    
    @JsProperty(name="hidden")
    public native boolean getHidden();
    
    @JsProperty(name="webkitVisibilityState")
    public native String getWebkitVisibilityState();
    
    @JsProperty(name="webkitHidden")
    public native boolean getWebkitHidden();
    
    @JsOverlay
    public final EventHandlerNonNull getOnBeforecopy(){
        return this.onbeforecopy;
    }
    
    @JsOverlay
    public final void setOnBeforecopy(EventHandlerNonNull onbeforecopy){
        this.onbeforecopy = onbeforecopy;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBeforecut(){
        return this.onbeforecut;
    }
    
    @JsOverlay
    public final void setOnBeforecut(EventHandlerNonNull onbeforecut){
        this.onbeforecut = onbeforecut;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBeforepaste(){
        return this.onbeforepaste;
    }
    
    @JsOverlay
    public final void setOnBeforepaste(EventHandlerNonNull onbeforepaste){
        this.onbeforepaste = onbeforepaste;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCopy(){
        return this.oncopy;
    }
    
    @JsOverlay
    public final void setOnCopy(EventHandlerNonNull oncopy){
        this.oncopy = oncopy;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCut(){
        return this.oncut;
    }
    
    @JsOverlay
    public final void setOnCut(EventHandlerNonNull oncut){
        this.oncut = oncut;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPaste(){
        return this.onpaste;
    }
    
    @JsOverlay
    public final void setOnPaste(EventHandlerNonNull onpaste){
        this.onpaste = onpaste;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSearch(){
        return this.onsearch;
    }
    
    @JsOverlay
    public final void setOnSearch(EventHandlerNonNull onsearch){
        this.onsearch = onsearch;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSecuritypolicyviolation(){
        return this.onsecuritypolicyviolation;
    }
    
    @JsOverlay
    public final void setOnSecuritypolicyviolation(EventHandlerNonNull onsecuritypolicyviolation){
        this.onsecuritypolicyviolation = onsecuritypolicyviolation;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSelectionchange(){
        return this.onselectionchange;
    }
    
    @JsOverlay
    public final void setOnSelectionchange(EventHandlerNonNull onselectionchange){
        this.onselectionchange = onselectionchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSelectstart(){
        return this.onselectstart;
    }
    
    @JsOverlay
    public final void setOnSelectstart(EventHandlerNonNull onselectstart){
        this.onselectstart = onselectstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWheel(){
        return this.onwheel;
    }
    
    @JsOverlay
    public final void setOnWheel(EventHandlerNonNull onwheel){
        this.onwheel = onwheel;
    }
    
    @JsProperty(name="timeline")
    public native DocumentTimeline getTimeline();
    
    @JsProperty(name="fullscreenEnabled")
    public native boolean getFullscreenEnabled();
    
    @JsOverlay
    public final EventHandlerNonNull getOnFullscreenchange(){
        return this.onfullscreenchange;
    }
    
    @JsOverlay
    public final void setOnFullscreenchange(EventHandlerNonNull onfullscreenchange){
        this.onfullscreenchange = onfullscreenchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnFullscreenerror(){
        return this.onfullscreenerror;
    }
    
    @JsOverlay
    public final void setOnFullscreenerror(EventHandlerNonNull onfullscreenerror){
        this.onfullscreenerror = onfullscreenerror;
    }
    
    @JsProperty(name="webkitIsFullScreen")
    public native boolean getWebkitIsFullScreen();
    
    @JsProperty(name="webkitCurrentFullScreenElement")
    public native Element getWebkitCurrentFullScreenElement();
    
    @JsProperty(name="webkitFullscreenEnabled")
    public native boolean getWebkitFullscreenEnabled();
    
    @JsProperty(name="webkitFullscreenElement")
    public native Element getWebkitFullscreenElement();
    
    @JsOverlay
    public final EventHandlerNonNull getOnWebkitfullscreenchange(){
        return this.onwebkitfullscreenchange;
    }
    
    @JsOverlay
    public final void setOnWebkitfullscreenchange(EventHandlerNonNull onwebkitfullscreenchange){
        this.onwebkitfullscreenchange = onwebkitfullscreenchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWebkitfullscreenerror(){
        return this.onwebkitfullscreenerror;
    }
    
    @JsOverlay
    public final void setOnWebkitfullscreenerror(EventHandlerNonNull onwebkitfullscreenerror){
        this.onwebkitfullscreenerror = onwebkitfullscreenerror;
    }
    
    @JsProperty(name="rootElement")
    public native SVGSVGElement getRootElement();
    
    @JsOverlay
    public final EventHandlerNonNull getOnAbort(){
        return this.onabort;
    }
    
    @JsOverlay
    public final void setOnAbort(EventHandlerNonNull onabort){
        this.onabort = onabort;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBlur(){
        return this.onblur;
    }
    
    @JsOverlay
    public final void setOnBlur(EventHandlerNonNull onblur){
        this.onblur = onblur;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCancel(){
        return this.oncancel;
    }
    
    @JsOverlay
    public final void setOnCancel(EventHandlerNonNull oncancel){
        this.oncancel = oncancel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCanplay(){
        return this.oncanplay;
    }
    
    @JsOverlay
    public final void setOnCanplay(EventHandlerNonNull oncanplay){
        this.oncanplay = oncanplay;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCanplaythrough(){
        return this.oncanplaythrough;
    }
    
    @JsOverlay
    public final void setOnCanplaythrough(EventHandlerNonNull oncanplaythrough){
        this.oncanplaythrough = oncanplaythrough;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnChange(){
        return this.onchange;
    }
    
    @JsOverlay
    public final void setOnChange(EventHandlerNonNull onchange){
        this.onchange = onchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClick(){
        return this.onclick;
    }
    
    @JsOverlay
    public final void setOnClick(EventHandlerNonNull onclick){
        this.onclick = onclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClose(){
        return this.onclose;
    }
    
    @JsOverlay
    public final void setOnClose(EventHandlerNonNull onclose){
        this.onclose = onclose;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnContextmenu(){
        return this.oncontextmenu;
    }
    
    @JsOverlay
    public final void setOnContextmenu(EventHandlerNonNull oncontextmenu){
        this.oncontextmenu = oncontextmenu;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCuechange(){
        return this.oncuechange;
    }
    
    @JsOverlay
    public final void setOnCuechange(EventHandlerNonNull oncuechange){
        this.oncuechange = oncuechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDblclick(){
        return this.ondblclick;
    }
    
    @JsOverlay
    public final void setOnDblclick(EventHandlerNonNull ondblclick){
        this.ondblclick = ondblclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDrag(){
        return this.ondrag;
    }
    
    @JsOverlay
    public final void setOnDrag(EventHandlerNonNull ondrag){
        this.ondrag = ondrag;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragend(){
        return this.ondragend;
    }
    
    @JsOverlay
    public final void setOnDragend(EventHandlerNonNull ondragend){
        this.ondragend = ondragend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragenter(){
        return this.ondragenter;
    }
    
    @JsOverlay
    public final void setOnDragenter(EventHandlerNonNull ondragenter){
        this.ondragenter = ondragenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragleave(){
        return this.ondragleave;
    }
    
    @JsOverlay
    public final void setOnDragleave(EventHandlerNonNull ondragleave){
        this.ondragleave = ondragleave;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragover(){
        return this.ondragover;
    }
    
    @JsOverlay
    public final void setOnDragover(EventHandlerNonNull ondragover){
        this.ondragover = ondragover;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragstart(){
        return this.ondragstart;
    }
    
    @JsOverlay
    public final void setOnDragstart(EventHandlerNonNull ondragstart){
        this.ondragstart = ondragstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDrop(){
        return this.ondrop;
    }
    
    @JsOverlay
    public final void setOnDrop(EventHandlerNonNull ondrop){
        this.ondrop = ondrop;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDurationchange(){
        return this.ondurationchange;
    }
    
    @JsOverlay
    public final void setOnDurationchange(EventHandlerNonNull ondurationchange){
        this.ondurationchange = ondurationchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEmptied(){
        return this.onemptied;
    }
    
    @JsOverlay
    public final void setOnEmptied(EventHandlerNonNull onemptied){
        this.onemptied = onemptied;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnded(){
        return this.onended;
    }
    
    @JsOverlay
    public final void setOnEnded(EventHandlerNonNull onended){
        this.onended = onended;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnFocus(){
        return this.onfocus;
    }
    
    @JsOverlay
    public final void setOnFocus(EventHandlerNonNull onfocus){
        this.onfocus = onfocus;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnInput(){
        return this.oninput;
    }
    
    @JsOverlay
    public final void setOnInput(EventHandlerNonNull oninput){
        this.oninput = oninput;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnInvalid(){
        return this.oninvalid;
    }
    
    @JsOverlay
    public final void setOnInvalid(EventHandlerNonNull oninvalid){
        this.oninvalid = oninvalid;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeydown(){
        return this.onkeydown;
    }
    
    @JsOverlay
    public final void setOnKeydown(EventHandlerNonNull onkeydown){
        this.onkeydown = onkeydown;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeypress(){
        return this.onkeypress;
    }
    
    @JsOverlay
    public final void setOnKeypress(EventHandlerNonNull onkeypress){
        this.onkeypress = onkeypress;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeyup(){
        return this.onkeyup;
    }
    
    @JsOverlay
    public final void setOnKeyup(EventHandlerNonNull onkeyup){
        this.onkeyup = onkeyup;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoad(){
        return this.onload;
    }
    
    @JsOverlay
    public final void setOnLoad(EventHandlerNonNull onload){
        this.onload = onload;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadeddata(){
        return this.onloadeddata;
    }
    
    @JsOverlay
    public final void setOnLoadeddata(EventHandlerNonNull onloadeddata){
        this.onloadeddata = onloadeddata;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadedmetadata(){
        return this.onloadedmetadata;
    }
    
    @JsOverlay
    public final void setOnLoadedmetadata(EventHandlerNonNull onloadedmetadata){
        this.onloadedmetadata = onloadedmetadata;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadstart(){
        return this.onloadstart;
    }
    
    @JsOverlay
    public final void setOnLoadstart(EventHandlerNonNull onloadstart){
        this.onloadstart = onloadstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMousedown(){
        return this.onmousedown;
    }
    
    @JsOverlay
    public final void setOnMousedown(EventHandlerNonNull onmousedown){
        this.onmousedown = onmousedown;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseenter(){
        return this.onmouseenter;
    }
    
    @JsOverlay
    public final void setOnMouseenter(EventHandlerNonNull onmouseenter){
        this.onmouseenter = onmouseenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseleave(){
        return this.onmouseleave;
    }
    
    @JsOverlay
    public final void setOnMouseleave(EventHandlerNonNull onmouseleave){
        this.onmouseleave = onmouseleave;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMousemove(){
        return this.onmousemove;
    }
    
    @JsOverlay
    public final void setOnMousemove(EventHandlerNonNull onmousemove){
        this.onmousemove = onmousemove;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseout(){
        return this.onmouseout;
    }
    
    @JsOverlay
    public final void setOnMouseout(EventHandlerNonNull onmouseout){
        this.onmouseout = onmouseout;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseover(){
        return this.onmouseover;
    }
    
    @JsOverlay
    public final void setOnMouseover(EventHandlerNonNull onmouseover){
        this.onmouseover = onmouseover;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseup(){
        return this.onmouseup;
    }
    
    @JsOverlay
    public final void setOnMouseup(EventHandlerNonNull onmouseup){
        this.onmouseup = onmouseup;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMousewheel(){
        return this.onmousewheel;
    }
    
    @JsOverlay
    public final void setOnMousewheel(EventHandlerNonNull onmousewheel){
        this.onmousewheel = onmousewheel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPause(){
        return this.onpause;
    }
    
    @JsOverlay
    public final void setOnPause(EventHandlerNonNull onpause){
        this.onpause = onpause;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPlay(){
        return this.onplay;
    }
    
    @JsOverlay
    public final void setOnPlay(EventHandlerNonNull onplay){
        this.onplay = onplay;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPlaying(){
        return this.onplaying;
    }
    
    @JsOverlay
    public final void setOnPlaying(EventHandlerNonNull onplaying){
        this.onplaying = onplaying;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnProgress(){
        return this.onprogress;
    }
    
    @JsOverlay
    public final void setOnProgress(EventHandlerNonNull onprogress){
        this.onprogress = onprogress;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRatechange(){
        return this.onratechange;
    }
    
    @JsOverlay
    public final void setOnRatechange(EventHandlerNonNull onratechange){
        this.onratechange = onratechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnReset(){
        return this.onreset;
    }
    
    @JsOverlay
    public final void setOnReset(EventHandlerNonNull onreset){
        this.onreset = onreset;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnResize(){
        return this.onresize;
    }
    
    @JsOverlay
    public final void setOnResize(EventHandlerNonNull onresize){
        this.onresize = onresize;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnScroll(){
        return this.onscroll;
    }
    
    @JsOverlay
    public final void setOnScroll(EventHandlerNonNull onscroll){
        this.onscroll = onscroll;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSeeked(){
        return this.onseeked;
    }
    
    @JsOverlay
    public final void setOnSeeked(EventHandlerNonNull onseeked){
        this.onseeked = onseeked;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSeeking(){
        return this.onseeking;
    }
    
    @JsOverlay
    public final void setOnSeeking(EventHandlerNonNull onseeking){
        this.onseeking = onseeking;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSelect(){
        return this.onselect;
    }
    
    @JsOverlay
    public final void setOnSelect(EventHandlerNonNull onselect){
        this.onselect = onselect;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnStalled(){
        return this.onstalled;
    }
    
    @JsOverlay
    public final void setOnStalled(EventHandlerNonNull onstalled){
        this.onstalled = onstalled;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSubmit(){
        return this.onsubmit;
    }
    
    @JsOverlay
    public final void setOnSubmit(EventHandlerNonNull onsubmit){
        this.onsubmit = onsubmit;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSuspend(){
        return this.onsuspend;
    }
    
    @JsOverlay
    public final void setOnSuspend(EventHandlerNonNull onsuspend){
        this.onsuspend = onsuspend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTimeupdate(){
        return this.ontimeupdate;
    }
    
    @JsOverlay
    public final void setOnTimeupdate(EventHandlerNonNull ontimeupdate){
        this.ontimeupdate = ontimeupdate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnToggle(){
        return this.ontoggle;
    }
    
    @JsOverlay
    public final void setOnToggle(EventHandlerNonNull ontoggle){
        this.ontoggle = ontoggle;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnVolumechange(){
        return this.onvolumechange;
    }
    
    @JsOverlay
    public final void setOnVolumechange(EventHandlerNonNull onvolumechange){
        this.onvolumechange = onvolumechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWaiting(){
        return this.onwaiting;
    }
    
    @JsOverlay
    public final void setOnWaiting(EventHandlerNonNull onwaiting){
        this.onwaiting = onwaiting;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAuxclick(){
        return this.onauxclick;
    }
    
    @JsOverlay
    public final void setOnAuxclick(EventHandlerNonNull onauxclick){
        this.onauxclick = onauxclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnGotpointercapture(){
        return this.ongotpointercapture;
    }
    
    @JsOverlay
    public final void setOnGotpointercapture(EventHandlerNonNull ongotpointercapture){
        this.ongotpointercapture = ongotpointercapture;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLostpointercapture(){
        return this.onlostpointercapture;
    }
    
    @JsOverlay
    public final void setOnLostpointercapture(EventHandlerNonNull onlostpointercapture){
        this.onlostpointercapture = onlostpointercapture;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerdown(){
        return this.onpointerdown;
    }
    
    @JsOverlay
    public final void setOnPointerdown(EventHandlerNonNull onpointerdown){
        this.onpointerdown = onpointerdown;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointermove(){
        return this.onpointermove;
    }
    
    @JsOverlay
    public final void setOnPointermove(EventHandlerNonNull onpointermove){
        this.onpointermove = onpointermove;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerup(){
        return this.onpointerup;
    }
    
    @JsOverlay
    public final void setOnPointerup(EventHandlerNonNull onpointerup){
        this.onpointerup = onpointerup;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointercancel(){
        return this.onpointercancel;
    }
    
    @JsOverlay
    public final void setOnPointercancel(EventHandlerNonNull onpointercancel){
        this.onpointercancel = onpointercancel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerover(){
        return this.onpointerover;
    }
    
    @JsOverlay
    public final void setOnPointerover(EventHandlerNonNull onpointerover){
        this.onpointerover = onpointerover;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerout(){
        return this.onpointerout;
    }
    
    @JsOverlay
    public final void setOnPointerout(EventHandlerNonNull onpointerout){
        this.onpointerout = onpointerout;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerenter(){
        return this.onpointerenter;
    }
    
    @JsOverlay
    public final void setOnPointerenter(EventHandlerNonNull onpointerenter){
        this.onpointerenter = onpointerenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerleave(){
        return this.onpointerleave;
    }
    
    @JsOverlay
    public final void setOnPointerleave(EventHandlerNonNull onpointerleave){
        this.onpointerleave = onpointerleave;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchcancel(){
        return this.ontouchcancel;
    }
    
    @JsOverlay
    public final void setOnTouchcancel(EventHandlerNonNull ontouchcancel){
        this.ontouchcancel = ontouchcancel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchend(){
        return this.ontouchend;
    }
    
    @JsOverlay
    public final void setOnTouchend(EventHandlerNonNull ontouchend){
        this.ontouchend = ontouchend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchmove(){
        return this.ontouchmove;
    }
    
    @JsOverlay
    public final void setOnTouchmove(EventHandlerNonNull ontouchmove){
        this.ontouchmove = ontouchmove;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchstart(){
        return this.ontouchstart;
    }
    
    @JsOverlay
    public final void setOnTouchstart(EventHandlerNonNull ontouchstart){
        this.ontouchstart = ontouchstart;
    }
    
    @JsProperty(name="children")
    public native HTMLCollection getChildren();
    
    @JsProperty(name="firstElementChild")
    public native Element getFirstElementChild();
    
    @JsProperty(name="lastElementChild")
    public native Element getLastElementChild();
    
    @JsProperty(name="childElementCount")
    public native double getChildElementCount();
    
    @JsProperty(name="activeElement")
    public native Element getActiveElement();
    
    @JsProperty(name="styleSheets")
    public native StyleSheetList getStyleSheets();
    
    @JsProperty(name="pointerLockElement")
    public native Element getPointerLockElement();
    
    @JsProperty(name="fullscreenElement")
    public native Element getFullscreenElement();
    
    @JsProperty(name="fonts")
    public native FontFaceSet getFonts();
    
    @JsOverlay
    public final DocumentReadyState getReadyState(){
       return DocumentReadyState.of(readyState);
    }
    
    @JsOverlay
    public final VisibilityState getVisibilityState(){
       return VisibilityState.of(visibilityState);
    }
    
    @JsOverlay
    public final AddressSpace getAddressSpace(){
       return AddressSpace.of(addressSpace);
    }
    
    @JsMethod(name = "adoptNode")
    public native Node adoptNode(Node node);
    
    @JsMethod(name = "append")
    public native void append(Node... nodes);
    
    @JsMethod(name = "append")
    public native void append(String... nodes);
    
    @JsMethod(name = "caretRangeFromPoint")
    public native Range caretRangeFromPoint();
    
    @JsMethod(name = "caretRangeFromPoint")
    public native Range caretRangeFromPoint(double x);
    
    @JsMethod(name = "caretRangeFromPoint")
    public native Range caretRangeFromPoint(double x, double y);
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "createAttribute")
    public native Attr createAttribute(String localName);
    
    @JsMethod(name = "createAttributeNS")
    public native Attr createAttributeNS(String namespaceURI, String qualifiedName);
    
    @JsMethod(name = "createCDATASection")
    public native CDATASection createCDATASection(String data);
    
    @JsMethod(name = "createComment")
    public native Comment createComment(String data);
    
    @JsMethod(name = "createDocumentFragment")
    public native DocumentFragment createDocumentFragment();
    
    @JsMethod(name = "createElement")
    public native <T> T createElement(String localName);
    
    @JsMethod(name = "createElement")
    public native <T> T createElement(String localName, String options);
    
    @JsMethod(name = "createElement")
    public native <T> T createElement(String localName, Object options);
    
    @JsMethod(name = "createElementNS")
    public native <T> T createElementNS(String namespaceURI, String qualifiedName);
    
    @JsMethod(name = "createElementNS")
    public native <T> T createElementNS(String namespaceURI, String qualifiedName, String options);
    
    @JsMethod(name = "createElementNS")
    public native <T> T createElementNS(String namespaceURI, String qualifiedName, Object options);
    
    @JsMethod(name = "createEvent")
    public native Event createEvent(String eventType);
    
    @JsMethod(name = "createExpression")
    public native XPathExpression createExpression(String expression);
    
    @JsMethod(name = "createExpression")
    public native XPathExpression createExpression(String expression, XPathNSResolver resolver);
    
    @JsMethod(name = "createNSResolver")
    public native XPathNSResolver createNSResolver(Node nodeResolver);
    
    @JsMethod(name = "createNodeIterator")
    public native NodeIterator createNodeIterator(Node root);
    
    @JsMethod(name = "createNodeIterator")
    public native NodeIterator createNodeIterator(Node root, double whatToShow);
    
    @JsMethod(name = "createNodeIterator")
    public native NodeIterator createNodeIterator(Node root, double whatToShow, NodeFilter filter);
    
    @JsMethod(name = "createProcessingInstruction")
    public native ProcessingInstruction createProcessingInstruction(String target, String data);
    
    @JsMethod(name = "createRange")
    public native Range createRange();
    
    @JsMethod(name = "createTextNode")
    public native Text createTextNode(String data);
    
    @JsMethod(name = "createTouch")
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY);
    
    @JsMethod(name = "createTouch")
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY, double radiusX);
    
    @JsMethod(name = "createTouch")
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY, double radiusX, double radiusY);
    
    @JsMethod(name = "createTouch")
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY, double radiusX, double radiusY, double rotationAngle);
    
    @JsMethod(name = "createTouch")
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY, double radiusX, double radiusY, double rotationAngle, double force);
    
    @JsMethod(name = "createTouchList")
    public native TouchList createTouchList(Touch... touches);
    
    @JsMethod(name = "createTreeWalker")
    public native TreeWalker createTreeWalker(Node root);
    
    @JsMethod(name = "createTreeWalker")
    public native TreeWalker createTreeWalker(Node root, double whatToShow);
    
    @JsMethod(name = "createTreeWalker")
    public native TreeWalker createTreeWalker(Node root, double whatToShow, NodeFilter filter);
    
    @JsMethod(name = "elementFromPoint")
    public native Element elementFromPoint(double x, double y);
    
    @JsMethod(name = "elementsFromPoint")
    public native Element[] elementsFromPoint(double x, double y);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, short type);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, short type, Object inResult);
    
    @JsMethod(name = "execCommand")
    public native boolean execCommand(String commandId);
    
    @JsMethod(name = "execCommand")
    public native boolean execCommand(String commandId, boolean showUI);
    
    @JsMethod(name = "execCommand")
    public native boolean execCommand(String commandId, boolean showUI, String value);
    
    @JsMethod(name = "exitFullscreen")
    public native void exitFullscreen();
    
    @JsMethod(name = "exitPointerLock")
    public native void exitPointerLock();
    
    @JsMethod(name = "getAnimations")
    public native Animation[] getAnimations();
    
    @JsMethod(name = "getElementById")
    public native <T> T getElementById(String elementId);
    
    @JsMethod(name = "getElementsByClassName")
    public native HTMLCollection getElementsByClassName(String classNames);
    
    @JsMethod(name = "getElementsByName")
    public native NodeList getElementsByName(String elementName);
    
    @JsMethod(name = "getElementsByTagName")
    public native HTMLCollection getElementsByTagName(String localName);
    
    @JsMethod(name = "getElementsByTagNameNS")
    public native HTMLCollection getElementsByTagNameNS(String namespaceURI, String localName);
    
    @JsMethod(name = "getSelection")
    public native Selection getSelection();
    
    @JsMethod(name = "hasFocus")
    public native boolean hasFocus();
    
    @JsMethod(name = "importNode")
    public native Node importNode(Node node);
    
    @JsMethod(name = "importNode")
    public native Node importNode(Node node, boolean deep);
    
    @JsMethod(name = "open")
    public native void open();
    
    @JsMethod(name = "prepend")
    public native void prepend(Node... nodes);
    
    @JsMethod(name = "prepend")
    public native void prepend(String... nodes);
    
    @JsMethod(name = "queryCommandEnabled")
    public native boolean queryCommandEnabled(String commandId);
    
    @JsMethod(name = "queryCommandIndeterm")
    public native boolean queryCommandIndeterm(String commandId);
    
    @JsMethod(name = "queryCommandState")
    public native boolean queryCommandState(String commandId);
    
    @JsMethod(name = "queryCommandSupported")
    public native boolean queryCommandSupported(String commandId);
    
    @JsMethod(name = "queryCommandValue")
    public native String queryCommandValue(String commandId);
    
    @JsMethod(name = "querySelector")
    public native <T> T querySelector(String selectors);
    
    @JsMethod(name = "querySelectorAll")
    public native NodeList querySelectorAll(String selectors);
    
    @JsMethod(name = "registerElement")
    public native Function registerElement(String type);
    
    @JsMethod(name = "registerElement")
    public native Function registerElement(String type, ElementRegistrationOptions options);
    
    @JsMethod(name = "webkitCancelFullScreen")
    public native void webkitCancelFullScreen();
    
    @JsMethod(name = "webkitExitFullscreen")
    public native void webkitExitFullscreen();
    
    @JsMethod(name = "write")
    public native void write(String... text);
    
    @JsMethod(name = "writeln")
    public native void writeln(String... text);
    
}

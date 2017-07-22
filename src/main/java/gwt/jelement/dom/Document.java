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
import gwt.jelement.css.FontFaceSet;
import gwt.jelement.css.StyleSheetList;
import gwt.jelement.dom.AddressSpace;
import gwt.jelement.dom.Attr;
import gwt.jelement.dom.CDATASection;
import gwt.jelement.dom.Comment;
import gwt.jelement.dom.CustomElementConstructor;
import gwt.jelement.dom.DOMImplementation;
import gwt.jelement.dom.DocumentFragment;
import gwt.jelement.dom.DocumentReadyState;
import gwt.jelement.dom.DocumentType;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.ElementRegistrationOptions;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.NodeFilter;
import gwt.jelement.dom.NodeIterator;
import gwt.jelement.dom.NodeList;
import gwt.jelement.dom.ProcessingInstruction;
import gwt.jelement.dom.Range;
import gwt.jelement.dom.Text;
import gwt.jelement.dom.Touch;
import gwt.jelement.dom.TouchList;
import gwt.jelement.dom.TreeWalker;
import gwt.jelement.dom.VisibilityState;
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
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
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
    
    @JsConstructor
    public Document(){
        super();
    }
    
    @JsProperty(name="rootScroller")
    public Element rootScroller;
    
    @JsProperty(name="xmlVersion")
    public String xmlVersion;
    
    @JsProperty(name="xmlStandalone")
    public boolean xmlStandalone;
    
    @JsProperty(name="domain")
    public String domain;
    
    @JsProperty(name="cookie")
    public String cookie;
    
    @JsProperty(name="title")
    public String title;
    
    @JsProperty(name="dir")
    public String dir;
    
    @JsProperty(name="body")
    public HTMLElement body;
    
    @JsProperty(name="designMode")
    public String designMode;
    
    @JsProperty(name="onreadystatechange")
    public EventHandlerNonNull onreadystatechange;
    
    @JsProperty(name="selectedStylesheetSet")
    public String selectedStylesheetSet;
    
    @JsProperty(name="onpointerlockchange")
    public EventHandlerNonNull onpointerlockchange;
    
    @JsProperty(name="onpointerlockerror")
    public EventHandlerNonNull onpointerlockerror;
    
    @JsProperty(name="onbeforecopy")
    public EventHandlerNonNull onbeforecopy;
    
    @JsProperty(name="onbeforecut")
    public EventHandlerNonNull onbeforecut;
    
    @JsProperty(name="onbeforepaste")
    public EventHandlerNonNull onbeforepaste;
    
    @JsProperty(name="oncopy")
    public EventHandlerNonNull oncopy;
    
    @JsProperty(name="oncut")
    public EventHandlerNonNull oncut;
    
    @JsProperty(name="onpaste")
    public EventHandlerNonNull onpaste;
    
    @JsProperty(name="onsearch")
    public EventHandlerNonNull onsearch;
    
    @JsProperty(name="onsecuritypolicyviolation")
    public EventHandlerNonNull onsecuritypolicyviolation;
    
    @JsProperty(name="onselectionchange")
    public EventHandlerNonNull onselectionchange;
    
    @JsProperty(name="onselectstart")
    public EventHandlerNonNull onselectstart;
    
    @JsProperty(name="onwheel")
    public EventHandlerNonNull onwheel;
    
    @JsProperty(name="onfullscreenchange")
    public EventHandlerNonNull onfullscreenchange;
    
    @JsProperty(name="onfullscreenerror")
    public EventHandlerNonNull onfullscreenerror;
    
    @JsProperty(name="onwebkitfullscreenchange")
    public EventHandlerNonNull onwebkitfullscreenchange;
    
    @JsProperty(name="onwebkitfullscreenerror")
    public EventHandlerNonNull onwebkitfullscreenerror;
    
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
    
    @JsProperty(name="xmlEncoding")
    public native String getXmlEncoding();
    
    @JsProperty(name="location")
    public native Location getLocation();
    
    @JsProperty(name="referrer")
    public native String getReferrer();
    
    @JsProperty(name="lastModified")
    public native String getLastModified();
    
    @JsOverlay
    public final DocumentReadyState getReadyStateAsDocumentReadyState(){
        return DocumentReadyState.of(getReadyState());
    }
    
    @JsProperty(name="readyState")
    public native String getReadyState();
    
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
    
    @JsProperty(name="currentScript")
    public native Document.HTMLOrSVGScriptElement getCurrentScript();
    
    @JsProperty(name="defaultView")
    public native Window getDefaultView();
    
    @JsProperty(name="anchors")
    public native HTMLCollection getAnchors();
    
    @JsProperty(name="applets")
    public native HTMLCollection getApplets();
    
    @JsProperty(name="preferredStylesheetSet")
    public native String getPreferredStylesheetSet();
    
    @JsProperty(name="scrollingElement")
    public native Element getScrollingElement();
    
    @JsProperty(name="hidden")
    public native boolean getHidden();
    
    @JsOverlay
    public final VisibilityState getVisibilityStateAsVisibilityState(){
        return VisibilityState.of(getVisibilityState());
    }
    
    @JsProperty(name="visibilityState")
    public native String getVisibilityState();
    
    @JsOverlay
    public final AddressSpace getAddressSpaceAsAddressSpace(){
        return AddressSpace.of(getAddressSpace());
    }
    
    @JsProperty(name="addressSpace")
    public native String getAddressSpace();
    
    @JsProperty(name="webkitVisibilityState")
    public native String getWebkitVisibilityState();
    
    @JsProperty(name="webkitHidden")
    public native boolean getWebkitHidden();
    
    @JsProperty(name="timeline")
    public native DocumentTimeline getTimeline();
    
    @JsProperty(name="fullscreenEnabled")
    public native boolean getFullscreenEnabled();
    
    @JsProperty(name="webkitIsFullScreen")
    public native boolean getWebkitIsFullScreen();
    
    @JsProperty(name="webkitCurrentFullScreenElement")
    public native Element getWebkitCurrentFullScreenElement();
    
    @JsProperty(name="webkitFullscreenEnabled")
    public native boolean getWebkitFullscreenEnabled();
    
    @JsProperty(name="webkitFullscreenElement")
    public native Element getWebkitFullscreenElement();
    
    @JsProperty(name="rootElement")
    public native SVGSVGElement getRootElement();
    
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
    
    @JsMethod(name = "adoptNode")
    public native Node adoptNode(Node node);
    
    @JsMethod(name = "append")
    public native void append(Node nodes);
    
    @JsMethod(name = "append")
    public native void append(String nodes);
    
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
    public native Element createElement(String localName);
    
    @JsMethod(name = "createElement")
    public native Element createElement(String localName, String options);
    
    @JsMethod(name = "createElement")
    public native Element createElement(String localName, Object options);
    
    @JsMethod(name = "createElementNS")
    public native Element createElementNS(String namespaceURI, String qualifiedName);
    
    @JsMethod(name = "createElementNS")
    public native Element createElementNS(String namespaceURI, String qualifiedName, String options);
    
    @JsMethod(name = "createElementNS")
    public native Element createElementNS(String namespaceURI, String qualifiedName, Object options);
    
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
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY, double radiusX, double radiusY, float rotationAngle);
    
    @JsMethod(name = "createTouch")
    public native Touch createTouch(Window view, EventTarget target, double identifier, double pageX, double pageY, double screenX, double screenY, double radiusX, double radiusY, float rotationAngle, float force);
    
    @JsMethod(name = "createTouchList")
    public native TouchList createTouchList(Touch touches);
    
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
    public native Element getElementById(String elementId);
    
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
    public native void prepend(Node nodes);
    
    @JsMethod(name = "prepend")
    public native void prepend(String nodes);
    
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
    public native Element querySelector(String selectors);
    
    @JsMethod(name = "querySelectorAll")
    public native NodeList querySelectorAll(String selectors);
    
    @JsMethod(name = "registerElement")
    public native CustomElementConstructor registerElement(String type);
    
    @JsMethod(name = "registerElement")
    public native CustomElementConstructor registerElement(String type, ElementRegistrationOptions options);
    
    @JsMethod(name = "webkitCancelFullScreen")
    public native void webkitCancelFullScreen();
    
    @JsMethod(name = "webkitExitFullscreen")
    public native void webkitExitFullscreen();
    
    @JsMethod(name = "write")
    public native void write(String text);
    
    @JsMethod(name = "writeln")
    public native void writeln(String text);
    
}

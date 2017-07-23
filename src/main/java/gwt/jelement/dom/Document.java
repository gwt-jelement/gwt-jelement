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
    
    @JsProperty(name="implementation")
    public DOMImplementation implementation;
    
    @JsProperty(name="URL")
    public String URL;
    
    @JsProperty(name="documentURI")
    public String documentURI;
    
    @JsProperty(name="origin")
    public String origin;
    
    @JsProperty(name="suborigin")
    public String suborigin;
    
    @JsProperty(name="compatMode")
    public String compatMode;
    
    @JsProperty(name="characterSet")
    public String characterSet;
    
    @JsProperty(name="charset")
    public String charset;
    
    @JsProperty(name="inputEncoding")
    public String inputEncoding;
    
    @JsProperty(name="contentType")
    public String contentType;
    
    @JsProperty(name="doctype")
    public DocumentType doctype;
    
    @JsProperty(name="documentElement")
    public Element documentElement;
    
    @JsProperty(name="rootScroller")
    public Element rootScroller;
    
    @JsProperty(name="xmlEncoding")
    public String xmlEncoding;
    
    @JsProperty(name="xmlVersion")
    public String xmlVersion;
    
    @JsProperty(name="xmlStandalone")
    public boolean xmlStandalone;
    
    @JsProperty(name="location")
    public Location location;
    
    @JsProperty(name="domain")
    public String domain;
    
    @JsProperty(name="referrer")
    public String referrer;
    
    @JsProperty(name="cookie")
    public String cookie;
    
    @JsProperty(name="lastModified")
    public String lastModified;
    
    @JsProperty(name="readyState")
    public String readyState;
    @JsOverlay
    public final DocumentReadyState getReadyState(){
       return DocumentReadyState.of(readyState);
    }
    
    @JsProperty(name="title")
    public String title;
    
    @JsProperty(name="dir")
    public String dir;
    
    @JsProperty(name="body")
    public HTMLElement body;
    
    @JsProperty(name="head")
    public HTMLHeadElement head;
    
    @JsProperty(name="images")
    public HTMLCollection images;
    
    @JsProperty(name="embeds")
    public HTMLCollection embeds;
    
    @JsProperty(name="plugins")
    public HTMLCollection plugins;
    
    @JsProperty(name="links")
    public HTMLCollection links;
    
    @JsProperty(name="forms")
    public HTMLCollection forms;
    
    @JsProperty(name="scripts")
    public HTMLCollection scripts;
    
    @JsProperty(name="currentScript")
    public Document.HTMLOrSVGScriptElement currentScript;
    
    @JsProperty(name="defaultView")
    public Window defaultView;
    
    @JsProperty(name="designMode")
    public String designMode;
    
    @JsProperty(name="onreadystatechange")
    public EventHandlerNonNull onreadystatechange;
    
    @JsProperty(name="anchors")
    public HTMLCollection anchors;
    
    @JsProperty(name="applets")
    public HTMLCollection applets;
    
    @JsProperty(name="selectedStylesheetSet")
    public String selectedStylesheetSet;
    
    @JsProperty(name="preferredStylesheetSet")
    public String preferredStylesheetSet;
    
    @JsProperty(name="scrollingElement")
    public Element scrollingElement;
    
    @JsProperty(name="onpointerlockchange")
    public EventHandlerNonNull onpointerlockchange;
    
    @JsProperty(name="onpointerlockerror")
    public EventHandlerNonNull onpointerlockerror;
    
    @JsProperty(name="hidden")
    public boolean hidden;
    
    @JsProperty(name="visibilityState")
    public String visibilityState;
    @JsOverlay
    public final VisibilityState getVisibilityState(){
       return VisibilityState.of(visibilityState);
    }
    
    @JsProperty(name="addressSpace")
    public String addressSpace;
    @JsOverlay
    public final AddressSpace getAddressSpace(){
       return AddressSpace.of(addressSpace);
    }
    
    @JsProperty(name="webkitVisibilityState")
    public String webkitVisibilityState;
    
    @JsProperty(name="webkitHidden")
    public boolean webkitHidden;
    
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
    
    @JsProperty(name="timeline")
    public DocumentTimeline timeline;
    
    @JsProperty(name="fullscreenEnabled")
    public boolean fullscreenEnabled;
    
    @JsProperty(name="onfullscreenchange")
    public EventHandlerNonNull onfullscreenchange;
    
    @JsProperty(name="onfullscreenerror")
    public EventHandlerNonNull onfullscreenerror;
    
    @JsProperty(name="webkitIsFullScreen")
    public boolean webkitIsFullScreen;
    
    @JsProperty(name="webkitCurrentFullScreenElement")
    public Element webkitCurrentFullScreenElement;
    
    @JsProperty(name="webkitFullscreenEnabled")
    public boolean webkitFullscreenEnabled;
    
    @JsProperty(name="webkitFullscreenElement")
    public Element webkitFullscreenElement;
    
    @JsProperty(name="onwebkitfullscreenchange")
    public EventHandlerNonNull onwebkitfullscreenchange;
    
    @JsProperty(name="onwebkitfullscreenerror")
    public EventHandlerNonNull onwebkitfullscreenerror;
    
    @JsProperty(name="rootElement")
    public SVGSVGElement rootElement;
    
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
    
    @JsProperty(name="children")
    public HTMLCollection children;
    
    @JsProperty(name="firstElementChild")
    public Element firstElementChild;
    
    @JsProperty(name="lastElementChild")
    public Element lastElementChild;
    
    @JsProperty(name="childElementCount")
    public double childElementCount;
    
    @JsProperty(name="activeElement")
    public Element activeElement;
    
    @JsProperty(name="styleSheets")
    public StyleSheetList styleSheets;
    
    @JsProperty(name="pointerLockElement")
    public Element pointerLockElement;
    
    @JsProperty(name="fullscreenElement")
    public Element fullscreenElement;
    
    @JsProperty(name="fonts")
    public FontFaceSet fonts;
    
    @JsMethod(name = "adoptNode")
    public native Node adoptNode(Node node);
    
    @JsMethod(name = "append")
    public native void append();
    
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
    public native TouchList createTouchList();
    
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
    public native void prepend();
    
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
    public native void write();
    
    @JsMethod(name = "write")
    public native void write(String... text);
    
    @JsMethod(name = "writeln")
    public native void writeln();
    
    @JsMethod(name = "writeln")
    public native void writeln(String... text);
    
}

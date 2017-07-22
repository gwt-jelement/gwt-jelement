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
import gwt.jelement.animation.KeyframeAnimationOptions;
import gwt.jelement.css.cssom.StylePropertyMap;
import gwt.jelement.dom.AccessibleNode;
import gwt.jelement.dom.Attr;
import gwt.jelement.dom.ClientRect;
import gwt.jelement.dom.ClientRectList;
import gwt.jelement.dom.DOMTokenList;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.NamedNodeMap;
import gwt.jelement.dom.NativeScrollBehavior;
import gwt.jelement.dom.Node;
import gwt.jelement.dom.NodeList;
import gwt.jelement.dom.ShadowRoot;
import gwt.jelement.dom.ShadowRootInit;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.frame.ScrollIntoViewOptions;
import gwt.jelement.frame.ScrollToOptions;
import gwt.jelement.html.HTMLCollection;
import gwt.jelement.html.HTMLSlotElement;
import gwt.jelement.page.scrolling.ScrollStateCallback;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Element extends Node{
    
    @JsConstructor
    public Element(){
        super();
    }
    
    @JsProperty(name="id")
    public String id;
    
    @JsProperty(name="className")
    public String className;
    
    @JsProperty(name="slot")
    public String slot;
    
    @JsProperty(name="innerHTML")
    public String innerHTML;
    
    @JsProperty(name="outerHTML")
    public String outerHTML;
    
    @JsProperty(name="scrollTop")
    public double scrollTop;
    
    @JsProperty(name="scrollLeft")
    public double scrollLeft;
    
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
    
    @JsProperty(name="namespaceURI")
    public native String getNamespaceURI();
    
    @JsProperty(name="prefix")
    public native String getPrefix();
    
    @JsProperty(name="localName")
    public native String getLocalName();
    
    @JsProperty(name="tagName")
    public native String getTagName();
    
    @JsProperty(name="classList")
    public native DOMTokenList getClassList();
    
    @JsProperty(name="attributes")
    public native NamedNodeMap getAttributes();
    
    @JsProperty(name="shadowRoot")
    public native ShadowRoot getShadowRoot();
    
    @JsProperty(name="assignedSlot")
    public native HTMLSlotElement getAssignedSlot();
    
    @JsProperty(name="scrollWidth")
    public native double getScrollWidth();
    
    @JsProperty(name="scrollHeight")
    public native double getScrollHeight();
    
    @JsProperty(name="clientTop")
    public native double getClientTop();
    
    @JsProperty(name="clientLeft")
    public native double getClientLeft();
    
    @JsProperty(name="clientWidth")
    public native double getClientWidth();
    
    @JsProperty(name="clientHeight")
    public native double getClientHeight();
    
    @JsProperty(name="styleMap")
    public native StylePropertyMap getStyleMap();
    
    @JsProperty(name="computedRole")
    public native String getComputedRole();
    
    @JsProperty(name="computedName")
    public native String getComputedName();
    
    @JsProperty(name="accessibleNode")
    public native AccessibleNode getAccessibleNode();
    
    @JsProperty(name="children")
    public native HTMLCollection getChildren();
    
    @JsProperty(name="firstElementChild")
    public native Element getFirstElementChild();
    
    @JsProperty(name="lastElementChild")
    public native Element getLastElementChild();
    
    @JsProperty(name="childElementCount")
    public native double getChildElementCount();
    
    @JsProperty(name="previousElementSibling")
    public native Element getPreviousElementSibling();
    
    @JsProperty(name="nextElementSibling")
    public native Element getNextElementSibling();
    
    @JsMethod(name = "after")
    public native void after(Node nodes);
    
    @JsMethod(name = "after")
    public native void after(String nodes);
    
    @JsMethod(name = "animate")
    public native Animation animate(Object[] effect);
    
    @JsMethod(name = "animate")
    public native Animation animate(Object effect);
    
    @JsMethod(name = "animate")
    public native Animation animate(Object[] effect, double options);
    
    @JsMethod(name = "animate")
    public native Animation animate(Object[] effect, KeyframeAnimationOptions options);
    
    @JsMethod(name = "animate")
    public native Animation animate(Object effect, double options);
    
    @JsMethod(name = "animate")
    public native Animation animate(Object effect, KeyframeAnimationOptions options);
    
    @JsMethod(name = "append")
    public native void append(Node nodes);
    
    @JsMethod(name = "append")
    public native void append(String nodes);
    
    @JsMethod(name = "attachShadow")
    public native ShadowRoot attachShadow(ShadowRootInit shadowRootInitDict);
    
    @JsMethod(name = "before")
    public native void before(Node nodes);
    
    @JsMethod(name = "before")
    public native void before(String nodes);
    
    @JsMethod(name = "closest")
    public native Element closest(String selectors);
    
    @JsMethod(name = "createShadowRoot")
    public native ShadowRoot createShadowRoot();
    
    @JsMethod(name = "getAnimations")
    public native Animation[] getAnimations();
    
    @JsMethod(name = "getAttribute")
    public native String getAttribute(String name);
    
    @JsMethod(name = "getAttributeNS")
    public native String getAttributeNS(String namespaceURI, String localName);
    
    @JsMethod(name = "getAttributeNames")
    public native String[] getAttributeNames();
    
    @JsMethod(name = "getAttributeNode")
    public native Attr getAttributeNode(String name);
    
    @JsMethod(name = "getAttributeNodeNS")
    public native Attr getAttributeNodeNS(String namespaceURI, String localName);
    
    @JsMethod(name = "getBoundingClientRect")
    public native ClientRect getBoundingClientRect();
    
    @JsMethod(name = "getClientRects")
    public native ClientRectList getClientRects();
    
    @JsMethod(name = "getDestinationInsertionPoints")
    public native NodeList getDestinationInsertionPoints();
    
    @JsMethod(name = "getElementsByClassName")
    public native HTMLCollection getElementsByClassName(String classNames);
    
    @JsMethod(name = "getElementsByTagName")
    public native HTMLCollection getElementsByTagName(String localName);
    
    @JsMethod(name = "getElementsByTagNameNS")
    public native HTMLCollection getElementsByTagNameNS(String namespaceURI, String localName);
    
    @JsMethod(name = "hasAttribute")
    public native boolean hasAttribute(String name);
    
    @JsMethod(name = "hasAttributeNS")
    public native boolean hasAttributeNS(String namespaceURI, String localName);
    
    @JsMethod(name = "hasAttributes")
    public native boolean hasAttributes();
    
    @JsMethod(name = "hasPointerCapture")
    public native boolean hasPointerCapture(double pointerId);
    
    @JsMethod(name = "insertAdjacentElement")
    public native Element insertAdjacentElement(String where, Element element);
    
    @JsMethod(name = "insertAdjacentHTML")
    public native void insertAdjacentHTML(String position, String text);
    
    @JsMethod(name = "insertAdjacentText")
    public native void insertAdjacentText(String where, String data);
    
    @JsMethod(name = "matches")
    public native boolean matches(String selectors);
    
    @JsMethod(name = "prepend")
    public native void prepend(Node nodes);
    
    @JsMethod(name = "prepend")
    public native void prepend(String nodes);
    
    @JsMethod(name = "querySelector")
    public native Element querySelector(String selectors);
    
    @JsMethod(name = "querySelectorAll")
    public native NodeList querySelectorAll(String selectors);
    
    @JsMethod(name = "releasePointerCapture")
    public native void releasePointerCapture(double pointerId);
    
    @JsMethod(name = "remove")
    public native void remove();
    
    @JsMethod(name = "removeAttribute")
    public native void removeAttribute(String name);
    
    @JsMethod(name = "removeAttributeNS")
    public native void removeAttributeNS(String namespaceURI, String localName);
    
    @JsMethod(name = "removeAttributeNode")
    public native Attr removeAttributeNode(Attr attr);
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith(Node nodes);
    
    @JsMethod(name = "replaceWith")
    public native void replaceWith(String nodes);
    
    @JsMethod(name = "requestFullscreen")
    public native void requestFullscreen();
    
    @JsMethod(name = "requestPointerLock")
    public native void requestPointerLock();
    
    @JsMethod(name = "scroll")
    public native void scroll();
    
    @JsMethod(name = "scroll")
    public native void scroll(ScrollToOptions options);
    
    @JsMethod(name = "scroll")
    public native void scroll(double x, double y);
    
    @JsMethod(name = "scrollBy")
    public native void scrollBy();
    
    @JsMethod(name = "scrollBy")
    public native void scrollBy(ScrollToOptions options);
    
    @JsMethod(name = "scrollBy")
    public native void scrollBy(double x, double y);
    
    @JsMethod(name = "scrollIntoView")
    public native void scrollIntoView();
    
    @JsMethod(name = "scrollIntoView")
    public native void scrollIntoView(ScrollIntoViewOptions arg);
    
    @JsMethod(name = "scrollIntoView")
    public native void scrollIntoView(boolean arg);
    
    @JsMethod(name = "scrollIntoViewIfNeeded")
    public native void scrollIntoViewIfNeeded();
    
    @JsMethod(name = "scrollIntoViewIfNeeded")
    public native void scrollIntoViewIfNeeded(boolean centerIfNeeded);
    
    @JsMethod(name = "scrollTo")
    public native void scrollTo();
    
    @JsMethod(name = "scrollTo")
    public native void scrollTo(ScrollToOptions options);
    
    @JsMethod(name = "scrollTo")
    public native void scrollTo(double x, double y);
    
    @JsOverlay
    public final void setApplyScroll(ScrollStateCallback scrollStateCallback, NativeScrollBehavior nativeScrollBehavior){
        setApplyScroll(scrollStateCallback, nativeScrollBehavior.getInternalValue());
    }
    
    @JsMethod(name = "setApplyScroll")
    public native void setApplyScroll(ScrollStateCallback scrollStateCallback, String nativeScrollBehavior);
    
    @JsMethod(name = "setAttribute")
    public native void setAttribute(String name, String value);
    
    @JsMethod(name = "setAttributeNS")
    public native void setAttributeNS(String namespaceURI, String name, String value);
    
    @JsMethod(name = "setAttributeNode")
    public native Attr setAttributeNode(Attr attr);
    
    @JsMethod(name = "setAttributeNodeNS")
    public native Attr setAttributeNodeNS(Attr attr);
    
    @JsOverlay
    public final void setDistributeScroll(ScrollStateCallback scrollStateCallback, NativeScrollBehavior nativeScrollBehavior){
        setDistributeScroll(scrollStateCallback, nativeScrollBehavior.getInternalValue());
    }
    
    @JsMethod(name = "setDistributeScroll")
    public native void setDistributeScroll(ScrollStateCallback scrollStateCallback, String nativeScrollBehavior);
    
    @JsMethod(name = "setPointerCapture")
    public native void setPointerCapture(double pointerId);
    
    @JsMethod(name = "webkitMatchesSelector")
    public native boolean webkitMatchesSelector(String selectors);
    
    @JsMethod(name = "webkitRequestFullScreen")
    public native void webkitRequestFullScreen();
    
    @JsMethod(name = "webkitRequestFullscreen")
    public native void webkitRequestFullscreen();
    
}

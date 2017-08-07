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
import gwt.jelement.core.JsObject;
import gwt.jelement.css.cssom.StylePropertyMap;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.frame.ScrollIntoViewOptions;
import gwt.jelement.frame.ScrollToOptions;
import gwt.jelement.html.HTMLCollection;
import gwt.jelement.html.HTMLSlotElement;
import gwt.jelement.page.scrolling.ScrollStateCallback;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Element", isNative = true)
public class Element extends Node {
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
    
    @JsProperty(name="namespaceURI")
    public native String getNamespaceURI();
    
    @JsProperty(name="prefix")
    public native String getPrefix();
    
    @JsProperty(name="localName")
    public native String getLocalName();
    
    @JsProperty(name="tagName")
    public native String getTagName();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="id")
    public native void setId(String id);
    
    @JsProperty(name="className")
    public native String getClassName();
    
    @JsProperty(name="className")
    public native void setClassName(String className);
    
    @JsProperty(name="classList")
    public native DOMTokenList getClassList();
    
    @JsProperty(name="slot")
    public native String getSlot();
    
    @JsProperty(name="slot")
    public native void setSlot(String slot);
    
    @JsProperty(name="attributes")
    public native NamedNodeMap getAttributes();
    
    @JsProperty(name="shadowRoot")
    public native ShadowRoot getShadowRoot();
    
    @JsProperty(name="assignedSlot")
    public native HTMLSlotElement getAssignedSlot();
    
    @JsProperty(name="innerHTML")
    public native String getInnerHTML();
    
    @JsProperty(name="innerHTML")
    public native void setInnerHTML(String innerHTML);
    
    @JsProperty(name="outerHTML")
    public native String getOuterHTML();
    
    @JsProperty(name="outerHTML")
    public native void setOuterHTML(String outerHTML);
    
    @JsProperty(name="scrollTop")
    public native double getScrollTop();
    
    @JsProperty(name="scrollTop")
    public native void setScrollTop(double scrollTop);
    
    @JsProperty(name="scrollLeft")
    public native double getScrollLeft();
    
    @JsProperty(name="scrollLeft")
    public native void setScrollLeft(double scrollLeft);
    
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
    
    @SafeVarargs
    @JsMethod(name = "after")
    public final native void after(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "after")
    public final native void after(String... nodes);
    
    @JsMethod(name = "animate")
    public native Animation animate(JsObject[] effect);
    
    @JsMethod(name = "animate")
    public native Animation animate(JsObject effect);
    
    @JsMethod(name = "animate")
    public native Animation animate(JsObject[] effect, double options);
    
    @JsMethod(name = "animate")
    public native Animation animate(JsObject[] effect, KeyframeAnimationOptions options);
    
    @JsMethod(name = "animate")
    public native Animation animate(JsObject effect, double options);
    
    @JsMethod(name = "animate")
    public native Animation animate(JsObject effect, KeyframeAnimationOptions options);
    
    @SafeVarargs
    @JsMethod(name = "append")
    public final native void append(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "append")
    public final native void append(String... nodes);
    
    @JsMethod(name = "attachShadow")
    public native ShadowRoot attachShadow(ShadowRootInit shadowRootInitDict);
    
    @SafeVarargs
    @JsMethod(name = "before")
    public final native void before(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "before")
    public final native void before(String... nodes);
    
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
    
    @SafeVarargs
    @JsMethod(name = "prepend")
    public final native void prepend(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "prepend")
    public final native void prepend(String... nodes);
    
    @JsMethod(name = "querySelector")
    public native <T extends Element> T querySelector(String selectors);
    
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
    
    @SafeVarargs
    @JsMethod(name = "replaceWith")
    public final native void replaceWith(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "replaceWith")
    public final native void replaceWith(String... nodes);
    
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

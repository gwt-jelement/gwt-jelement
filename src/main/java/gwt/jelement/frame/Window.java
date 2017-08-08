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
package gwt.jelement.frame;

import gwt.jelement.cachestorage.CacheStorage;
import gwt.jelement.core.ArrayLike;
import gwt.jelement.core.CallbackFunction;
import gwt.jelement.core.JSONImpl;
import gwt.jelement.core.Js;
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.crypto.Crypto;
import gwt.jelement.css.CSSRuleList;
import gwt.jelement.css.CSSStyleDeclaration;
import gwt.jelement.css.MediaQueryList;
import gwt.jelement.css.StyleMedia;
import gwt.jelement.css.cssom.StylePropertyMapReadonly;
import gwt.jelement.dom.Document;
import gwt.jelement.dom.Element;
import gwt.jelement.dom.FrameRequestCallback;
import gwt.jelement.dom.IdleRequestCallback;
import gwt.jelement.dom.IdleRequestOptions;
import gwt.jelement.dom.MessagePort;
import gwt.jelement.dom.MutationObserver;
import gwt.jelement.dom.URL;
import gwt.jelement.editing.Selection;
import gwt.jelement.events.AnimationEvent;
import gwt.jelement.events.Event;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.events.EventTarget;
import gwt.jelement.events.TransitionEvent;
import gwt.jelement.fetch.Request;
import gwt.jelement.fetch.Response;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.filesystem.EntryCallback;
import gwt.jelement.filesystem.ErrorCallback;
import gwt.jelement.filesystem.FileSystemCallback;
import gwt.jelement.geometry.DOMMatrix;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.html.custom.CustomElementRegistry;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.imagebitmap.ImageBitmapOptions;
import gwt.jelement.indexeddb.IDBFactory;
import gwt.jelement.loader.appcache.ApplicationCache;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.peerconnection.RTCPeerConnection;
import gwt.jelement.quota.DeprecatedStorageInfo;
import gwt.jelement.speech.SpeechGrammar;
import gwt.jelement.speech.SpeechGrammarList;
import gwt.jelement.speech.SpeechRecognition;
import gwt.jelement.speech.SpeechRecognitionError;
import gwt.jelement.speech.SpeechRecognitionEvent;
import gwt.jelement.speech.SpeechSynthesis;
import gwt.jelement.storage.Storage;
import gwt.jelement.svg.SVGImageElement;
import gwt.jelement.timing.Performance;
import gwt.jelement.webdatabase.Database;
import gwt.jelement.webdatabase.DatabaseCallback;
import gwt.jelement.workers.Worklet;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Window", isNative = true)
public class Window extends EventTarget implements ArrayLike<Window> {
    public static short TEMPORARY; /* 0 */
    public static short PERSISTENT; /* 1 */
    
    @JsProperty(name="onorientationchange")
    private EventHandlerNonNull onorientationchange;
    
    @JsProperty(name="onanimationend")
    private EventHandlerNonNull onanimationend;
    
    @JsProperty(name="onanimationiteration")
    private EventHandlerNonNull onanimationiteration;
    
    @JsProperty(name="onanimationstart")
    private EventHandlerNonNull onanimationstart;
    
    @JsProperty(name="onsearch")
    private EventHandlerNonNull onsearch;
    
    @JsProperty(name="ontransitionend")
    private EventHandlerNonNull ontransitionend;
    
    @JsProperty(name="onwebkitanimationend")
    private EventHandlerNonNull onwebkitanimationend;
    
    @JsProperty(name="onwebkitanimationiteration")
    private EventHandlerNonNull onwebkitanimationiteration;
    
    @JsProperty(name="onwebkitanimationstart")
    private EventHandlerNonNull onwebkitanimationstart;
    
    @JsProperty(name="onwebkittransitionend")
    private EventHandlerNonNull onwebkittransitionend;
    
    @JsProperty(name="onwheel")
    private EventHandlerNonNull onwheel;
    
    @JsProperty(name="onappinstalled")
    private EventHandlerNonNull onappinstalled;
    
    @JsProperty(name="onbeforeinstallprompt")
    private EventHandlerNonNull onbeforeinstallprompt;
    
    @JsProperty(name="ondevicemotion")
    private EventHandlerNonNull ondevicemotion;
    
    @JsProperty(name="ondeviceorientation")
    private EventHandlerNonNull ondeviceorientation;
    
    @JsProperty(name="ondeviceorientationabsolute")
    private EventHandlerNonNull ondeviceorientationabsolute;
    
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
    
    @JsProperty(name="onbeforeunload")
    private EventHandlerNonNull onbeforeunload;
    
    @JsProperty(name="onhashchange")
    private EventHandlerNonNull onhashchange;
    
    @JsProperty(name="onlanguagechange")
    private EventHandlerNonNull onlanguagechange;
    
    @JsProperty(name="onmessage")
    private EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    private EventHandlerNonNull onmessageerror;
    
    @JsProperty(name="onoffline")
    private EventHandlerNonNull onoffline;
    
    @JsProperty(name="ononline")
    private EventHandlerNonNull ononline;
    
    @JsProperty(name="onpagehide")
    private EventHandlerNonNull onpagehide;
    
    @JsProperty(name="onpageshow")
    private EventHandlerNonNull onpageshow;
    
    @JsProperty(name="onpopstate")
    private EventHandlerNonNull onpopstate;
    
    @JsProperty(name="onrejectionhandled")
    private EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onstorage")
    private EventHandlerNonNull onstorage;
    
    @JsProperty(name="onunhandledrejection")
    private EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="onunload")
    private EventHandlerNonNull onunload;
    
    @JsProperty(name="window")
    public native Window getWindow();
    
    @JsProperty(name="self")
    public native Window getSelf();
    
    @JsProperty(name="document")
    public native Document getDocument();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="name")
    public native void setName(String name);
    
    @JsProperty(name="location")
    public native Location getLocation();
    
    @JsProperty(name="history")
    public native History getHistory();
    
    @JsProperty(name="locationbar")
    public native BarProp getLocationbar();
    
    @JsProperty(name="menubar")
    public native BarProp getMenubar();
    
    @JsProperty(name="personalbar")
    public native BarProp getPersonalbar();
    
    @JsProperty(name="scrollbars")
    public native BarProp getScrollbars();
    
    @JsProperty(name="statusbar")
    public native BarProp getStatusbar();
    
    @JsProperty(name="toolbar")
    public native BarProp getToolbar();
    
    @JsProperty(name="status")
    public native String getStatus();
    
    @JsProperty(name="status")
    public native void setStatus(String status);
    
    @JsProperty(name="closed")
    public native boolean isClosed();
    
    @JsProperty(name="frames")
    public native Window getFrames();
    
    @JsProperty(name="top")
    public native Window getTop();
    
    @JsProperty(name="opener")
    public native Window getOpener();
    
    @JsProperty(name="opener")
    public native void setOpener(Window opener);
    
    @JsProperty(name="parent")
    public native Window getParent();
    
    @JsProperty(name="frameElement")
    public native Element getFrameElement();
    
    @JsProperty(name="navigator")
    public native Navigator getNavigator();
    
    @JsProperty(name="applicationCache")
    public native ApplicationCache getApplicationCache();
    
    @JsProperty(name="customElements")
    public native CustomElementRegistry getCustomElements();
    
    @JsProperty(name="external")
    public native External getExternal();
    
    @JsProperty(name="screen")
    public native Screen getScreen();
    
    @JsProperty(name="innerWidth")
    public native double getInnerWidth();
    
    @JsProperty(name="innerHeight")
    public native double getInnerHeight();
    
    @JsProperty(name="scrollX")
    public native double getScrollX();
    
    @JsProperty(name="pageXOffset")
    public native double getPageXOffset();
    
    @JsProperty(name="scrollY")
    public native double getScrollY();
    
    @JsProperty(name="pageYOffset")
    public native double getPageYOffset();
    
    @JsProperty(name="visualViewport")
    public native VisualViewport getVisualViewport();
    
    @JsProperty(name="screenX")
    public native double getScreenX();
    
    @JsProperty(name="screenY")
    public native double getScreenY();
    
    @JsProperty(name="outerWidth")
    public native double getOuterWidth();
    
    @JsProperty(name="outerHeight")
    public native double getOuterHeight();
    
    @JsProperty(name="devicePixelRatio")
    public native double getDevicePixelRatio();
    
    @JsProperty(name="console")
    public native Console getConsole();
    
    @JsOverlay
    public final EventHandlerNonNull getOnOrientationchange(){
        return this.onorientationchange;
    }
    
    @JsOverlay
    public final void setOnOrientationchange(EventHandlerNonNull onorientationchange){
        this.onorientationchange = onorientationchange;
    }
    
    @JsProperty(name="orientation")
    public native double getOrientation();
    
    @JsProperty(name="clientInformation")
    public native Navigator getClientInformation();
    
    @JsProperty(name="event")
    public native Event getEvent();
    
    @JsProperty(name="event")
    public native void setEvent(Event event);
    
    @JsProperty(name="offscreenBuffering")
    public native boolean isOffscreenBuffering();
    
    @JsProperty(name="screenLeft")
    public native double getScreenLeft();
    
    @JsProperty(name="screenTop")
    public native double getScreenTop();
    
    @JsProperty(name="defaultStatus")
    public native String getDefaultStatus();
    
    @JsProperty(name="defaultStatus")
    public native void setDefaultStatus(String defaultStatus);
    
    @JsProperty(name="defaultstatus")
    public native String getDefaultstatus();
    
    @JsProperty(name="defaultstatus")
    public native void setDefaultstatus(String defaultstatus);
    
    @JsProperty(name="styleMedia")
    public native StyleMedia getStyleMedia();
    
    @JsProperty(name="WebKitTransitionEvent")
    public native TransitionEvent getWebKitTransitionEvent();
    
    @JsProperty(name="WebKitTransitionEvent")
    public native void setWebKitTransitionEvent(TransitionEvent WebKitTransitionEvent);
    
    @JsProperty(name="WebKitAnimationEvent")
    public native AnimationEvent getWebKitAnimationEvent();
    
    @JsProperty(name="WebKitAnimationEvent")
    public native void setWebKitAnimationEvent(AnimationEvent WebKitAnimationEvent);
    
    @JsProperty(name="webkitURL")
    public native URL getWebkitURL();
    
    @JsProperty(name="webkitURL")
    public native void setWebkitURL(URL webkitURL);
    
    @JsProperty(name="WebKitMutationObserver")
    public native MutationObserver getWebKitMutationObserver();
    
    @JsProperty(name="WebKitMutationObserver")
    public native void setWebKitMutationObserver(MutationObserver WebKitMutationObserver);
    
    @JsOverlay
    public final EventHandlerNonNull getOnAnimationend(){
        return this.onanimationend;
    }
    
    @JsOverlay
    public final void setOnAnimationend(EventHandlerNonNull onanimationend){
        this.onanimationend = onanimationend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAnimationiteration(){
        return this.onanimationiteration;
    }
    
    @JsOverlay
    public final void setOnAnimationiteration(EventHandlerNonNull onanimationiteration){
        this.onanimationiteration = onanimationiteration;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAnimationstart(){
        return this.onanimationstart;
    }
    
    @JsOverlay
    public final void setOnAnimationstart(EventHandlerNonNull onanimationstart){
        this.onanimationstart = onanimationstart;
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
    public final EventHandlerNonNull getOnTransitionend(){
        return this.ontransitionend;
    }
    
    @JsOverlay
    public final void setOnTransitionend(EventHandlerNonNull ontransitionend){
        this.ontransitionend = ontransitionend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWebkitanimationend(){
        return this.onwebkitanimationend;
    }
    
    @JsOverlay
    public final void setOnWebkitanimationend(EventHandlerNonNull onwebkitanimationend){
        this.onwebkitanimationend = onwebkitanimationend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWebkitanimationiteration(){
        return this.onwebkitanimationiteration;
    }
    
    @JsOverlay
    public final void setOnWebkitanimationiteration(EventHandlerNonNull onwebkitanimationiteration){
        this.onwebkitanimationiteration = onwebkitanimationiteration;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWebkitanimationstart(){
        return this.onwebkitanimationstart;
    }
    
    @JsOverlay
    public final void setOnWebkitanimationstart(EventHandlerNonNull onwebkitanimationstart){
        this.onwebkitanimationstart = onwebkitanimationstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWebkittransitionend(){
        return this.onwebkittransitionend;
    }
    
    @JsOverlay
    public final void setOnWebkittransitionend(EventHandlerNonNull onwebkittransitionend){
        this.onwebkittransitionend = onwebkittransitionend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWheel(){
        return this.onwheel;
    }
    
    @JsOverlay
    public final void setOnWheel(EventHandlerNonNull onwheel){
        this.onwheel = onwheel;
    }
    
    @JsProperty(name="isSecureContext")
    public native boolean isIsSecureContext();
    
    @JsProperty(name="WebKitCSSMatrix")
    public native DOMMatrix getWebKitCSSMatrix();
    
    @JsProperty(name="WebKitCSSMatrix")
    public native void setWebKitCSSMatrix(DOMMatrix WebKitCSSMatrix);
    
    @JsOverlay
    public final EventHandlerNonNull getOnAppinstalled(){
        return this.onappinstalled;
    }
    
    @JsOverlay
    public final void setOnAppinstalled(EventHandlerNonNull onappinstalled){
        this.onappinstalled = onappinstalled;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBeforeinstallprompt(){
        return this.onbeforeinstallprompt;
    }
    
    @JsOverlay
    public final void setOnBeforeinstallprompt(EventHandlerNonNull onbeforeinstallprompt){
        this.onbeforeinstallprompt = onbeforeinstallprompt;
    }
    
    @JsProperty(name="caches")
    public native CacheStorage getCaches();
    
    @JsProperty(name="animationWorklet")
    public native Worklet getAnimationWorklet();
    
    @JsProperty(name="JSON")
    public native JSONImpl getJSON();
    
    @JsProperty(name="crypto")
    public native Crypto getCrypto();
    
    @JsProperty(name="paintWorklet")
    public native Worklet getPaintWorklet();
    
    @JsOverlay
    public final EventHandlerNonNull getOnDevicemotion(){
        return this.ondevicemotion;
    }
    
    @JsOverlay
    public final void setOnDevicemotion(EventHandlerNonNull ondevicemotion){
        this.ondevicemotion = ondevicemotion;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDeviceorientation(){
        return this.ondeviceorientation;
    }
    
    @JsOverlay
    public final void setOnDeviceorientation(EventHandlerNonNull ondeviceorientation){
        this.ondeviceorientation = ondeviceorientation;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDeviceorientationabsolute(){
        return this.ondeviceorientationabsolute;
    }
    
    @JsOverlay
    public final void setOnDeviceorientationabsolute(EventHandlerNonNull ondeviceorientationabsolute){
        this.ondeviceorientationabsolute = ondeviceorientationabsolute;
    }
    
    @JsProperty(name="indexedDB")
    public native IDBFactory getIndexedDB();
    
    @JsProperty(name="webkitMediaStream")
    public native MediaStream getWebkitMediaStream();
    
    @JsProperty(name="webkitMediaStream")
    public native void setWebkitMediaStream(MediaStream webkitMediaStream);
    
    @JsProperty(name="webkitRTCPeerConnection")
    public native RTCPeerConnection getWebkitRTCPeerConnection();
    
    @JsProperty(name="webkitRTCPeerConnection")
    public native void setWebkitRTCPeerConnection(RTCPeerConnection webkitRTCPeerConnection);
    
    @JsProperty(name="webkitStorageInfo")
    public native DeprecatedStorageInfo getWebkitStorageInfo();
    
    @JsProperty(name="webkitSpeechGrammar")
    public native SpeechGrammar getWebkitSpeechGrammar();
    
    @JsProperty(name="webkitSpeechGrammar")
    public native void setWebkitSpeechGrammar(SpeechGrammar webkitSpeechGrammar);
    
    @JsProperty(name="webkitSpeechGrammarList")
    public native SpeechGrammarList getWebkitSpeechGrammarList();
    
    @JsProperty(name="webkitSpeechGrammarList")
    public native void setWebkitSpeechGrammarList(SpeechGrammarList webkitSpeechGrammarList);
    
    @JsProperty(name="webkitSpeechRecognition")
    public native SpeechRecognition getWebkitSpeechRecognition();
    
    @JsProperty(name="webkitSpeechRecognition")
    public native void setWebkitSpeechRecognition(SpeechRecognition webkitSpeechRecognition);
    
    @JsProperty(name="webkitSpeechRecognitionError")
    public native SpeechRecognitionError getWebkitSpeechRecognitionError();
    
    @JsProperty(name="webkitSpeechRecognitionError")
    public native void setWebkitSpeechRecognitionError(SpeechRecognitionError webkitSpeechRecognitionError);
    
    @JsProperty(name="webkitSpeechRecognitionEvent")
    public native SpeechRecognitionEvent getWebkitSpeechRecognitionEvent();
    
    @JsProperty(name="webkitSpeechRecognitionEvent")
    public native void setWebkitSpeechRecognitionEvent(SpeechRecognitionEvent webkitSpeechRecognitionEvent);
    
    @JsProperty(name="speechSynthesis")
    public native SpeechSynthesis getSpeechSynthesis();
    
    @JsProperty(name="sessionStorage")
    public native Storage getSessionStorage();
    
    @JsProperty(name="localStorage")
    public native Storage getLocalStorage();
    
    @JsProperty(name="performance")
    public native Performance getPerformance();
    
    @JsProperty(name="audioWorklet")
    public native Worklet getAudioWorklet();
    
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
    
    @JsOverlay
    public final EventHandlerNonNull getOnBeforeunload(){
        return this.onbeforeunload;
    }
    
    @JsOverlay
    public final void setOnBeforeunload(EventHandlerNonNull onbeforeunload){
        this.onbeforeunload = onbeforeunload;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnHashchange(){
        return this.onhashchange;
    }
    
    @JsOverlay
    public final void setOnHashchange(EventHandlerNonNull onhashchange){
        this.onhashchange = onhashchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLanguagechange(){
        return this.onlanguagechange;
    }
    
    @JsOverlay
    public final void setOnLanguagechange(EventHandlerNonNull onlanguagechange){
        this.onlanguagechange = onlanguagechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessage(){
        return this.onmessage;
    }
    
    @JsOverlay
    public final void setOnMessage(EventHandlerNonNull onmessage){
        this.onmessage = onmessage;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMessageerror(){
        return this.onmessageerror;
    }
    
    @JsOverlay
    public final void setOnMessageerror(EventHandlerNonNull onmessageerror){
        this.onmessageerror = onmessageerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnOffline(){
        return this.onoffline;
    }
    
    @JsOverlay
    public final void setOnOffline(EventHandlerNonNull onoffline){
        this.onoffline = onoffline;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnOnline(){
        return this.ononline;
    }
    
    @JsOverlay
    public final void setOnOnline(EventHandlerNonNull ononline){
        this.ononline = ononline;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPagehide(){
        return this.onpagehide;
    }
    
    @JsOverlay
    public final void setOnPagehide(EventHandlerNonNull onpagehide){
        this.onpagehide = onpagehide;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPageshow(){
        return this.onpageshow;
    }
    
    @JsOverlay
    public final void setOnPageshow(EventHandlerNonNull onpageshow){
        this.onpageshow = onpageshow;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPopstate(){
        return this.onpopstate;
    }
    
    @JsOverlay
    public final void setOnPopstate(EventHandlerNonNull onpopstate){
        this.onpopstate = onpopstate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRejectionhandled(){
        return this.onrejectionhandled;
    }
    
    @JsOverlay
    public final void setOnRejectionhandled(EventHandlerNonNull onrejectionhandled){
        this.onrejectionhandled = onrejectionhandled;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnStorage(){
        return this.onstorage;
    }
    
    @JsOverlay
    public final void setOnStorage(EventHandlerNonNull onstorage){
        this.onstorage = onstorage;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUnhandledrejection(){
        return this.onunhandledrejection;
    }
    
    @JsOverlay
    public final void setOnUnhandledrejection(EventHandlerNonNull onunhandledrejection){
        this.onunhandledrejection = onunhandledrejection;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnUnload(){
        return this.onunload;
    }
    
    @JsOverlay
    public final void setOnUnload(EventHandlerNonNull onunload){
        this.onunload = onunload;
    }
    
    @JsMethod(name = "alert")
    public native void alert();
    
    @JsMethod(name = "alert")
    public native void alert(String message);
    
    @JsMethod(name = "atob")
    public native String atob(String atob);
    
    @JsMethod(name = "blur")
    public native void blur();
    
    @JsMethod(name = "btoa")
    public native String btoa(String btoa);
    
    @JsMethod(name = "cancelAnimationFrame")
    public native void cancelAnimationFrame(double handle);
    
    @JsMethod(name = "cancelIdleCallback")
    public native void cancelIdleCallback(double handle);
    
    @JsMethod(name = "captureEvents")
    public native void captureEvents();
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval();
    
    @JsMethod(name = "clearInterval")
    public native void clearInterval(double handle);
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout();
    
    @JsMethod(name = "clearTimeout")
    public native void clearTimeout(double handle);
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "confirm")
    public native boolean confirm();
    
    @JsMethod(name = "confirm")
    public native boolean confirm(String message);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, double sx, double sy, double sw, double sh);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLImageElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(SVGImageElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLVideoElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(HTMLCanvasElement imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(Blob imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageData imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(ImageBitmap imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "createImageBitmap")
    public native Promise createImageBitmap(OffscreenCanvas imageBitmap, double sx, double sy, double sw, double sh, ImageBitmapOptions options);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(Request input, JsObject init);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, JsObject init);
    
    @JsMethod(name = "find")
    public native boolean find();
    
    @JsMethod(name = "find")
    public native boolean find(String string);
    
    @JsMethod(name = "find")
    public native boolean find(String string, boolean caseSensitive);
    
    @JsMethod(name = "find")
    public native boolean find(String string, boolean caseSensitive, boolean backwards);
    
    @JsMethod(name = "find")
    public native boolean find(String string, boolean caseSensitive, boolean backwards, boolean wrap);
    
    @JsMethod(name = "find")
    public native boolean find(String string, boolean caseSensitive, boolean backwards, boolean wrap, boolean wholeWord);
    
    @JsMethod(name = "find")
    public native boolean find(String string, boolean caseSensitive, boolean backwards, boolean wrap, boolean wholeWord, boolean searchInFrames);
    
    @JsMethod(name = "find")
    public native boolean find(String string, boolean caseSensitive, boolean backwards, boolean wrap, boolean wholeWord, boolean searchInFrames, boolean showDialog);
    
    @JsMethod(name = "focus")
    public native void focus();
    
    @JsOverlay
    public final Object get(String name){
        return (Object) Js.get(this.object(), name);
    }
    
    @JsMethod(name = "getComputedStyle")
    public native CSSStyleDeclaration getComputedStyle(Element elt);
    
    @JsMethod(name = "getComputedStyle")
    public native CSSStyleDeclaration getComputedStyle(Element elt, String pseudoElt);
    
    @JsMethod(name = "getComputedStyleMap")
    public native StylePropertyMapReadonly getComputedStyleMap(Element element);
    
    @JsMethod(name = "getComputedStyleMap")
    public native StylePropertyMapReadonly getComputedStyleMap(Element element, String pseudoElement);
    
    @JsMethod(name = "getMatchedCSSRules")
    public native CSSRuleList getMatchedCSSRules();
    
    @JsMethod(name = "getMatchedCSSRules")
    public native CSSRuleList getMatchedCSSRules(Element element);
    
    @JsMethod(name = "getMatchedCSSRules")
    public native CSSRuleList getMatchedCSSRules(Element element, String pseudoElement);
    
    @JsMethod(name = "getSelection")
    public native Selection getSelection();
    
    @JsMethod(name = "matchMedia")
    public native MediaQueryList matchMedia(String query);
    
    @JsMethod(name = "moveBy")
    public native void moveBy(double x, double y);
    
    @JsMethod(name = "moveTo")
    public native void moveTo(double x, double y);
    
    @JsMethod(name = "open")
    public native Window open(String url, String target);
    
    @JsMethod(name = "open")
    public native Window open(String url, String target, String features);
    
    @JsMethod(name = "openDatabase")
    public native Database openDatabase(String name, String version, String displayName, double estimatedSize);
    
    @JsMethod(name = "openDatabase")
    public native Database openDatabase(String name, String version, String displayName, double estimatedSize, DatabaseCallback creationCallback);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message, String targetOrigin);
    
    @JsMethod(name = "postMessage")
    public native void postMessage(Object message, String targetOrigin, MessagePort[] transfer);
    
    @JsMethod(name = "print")
    public native void print();
    
    @JsMethod(name = "prompt")
    public native String prompt();
    
    @JsMethod(name = "prompt")
    public native String prompt(String message);
    
    @JsMethod(name = "prompt")
    public native String prompt(String message, String defaultValue);
    
    @JsMethod(name = "releaseEvents")
    public native void releaseEvents();
    
    @JsMethod(name = "requestAnimationFrame")
    public native double requestAnimationFrame(FrameRequestCallback callback);
    
    @JsMethod(name = "requestIdleCallback")
    public native double requestIdleCallback(IdleRequestCallback callback);
    
    @JsMethod(name = "requestIdleCallback")
    public native double requestIdleCallback(IdleRequestCallback callback, IdleRequestOptions options);
    
    @JsMethod(name = "resizeBy")
    public native void resizeBy(double x, double y);
    
    @JsMethod(name = "resizeTo")
    public native void resizeTo(double x, double y);
    
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
    
    @JsMethod(name = "scrollTo")
    public native void scrollTo();
    
    @JsMethod(name = "scrollTo")
    public native void scrollTo(ScrollToOptions options);
    
    @JsMethod(name = "scrollTo")
    public native void scrollTo(double x, double y);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(CallbackFunction handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(CallbackFunction handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(CallbackFunction handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(CallbackFunction handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler, double timeout, Object... arguments);
    
    @JsMethod(name = "stop")
    public native void stop();
    
    @JsMethod(name = "webkitCancelAnimationFrame")
    public native void webkitCancelAnimationFrame(double id);
    
    @JsMethod(name = "webkitRequestAnimationFrame")
    public native double webkitRequestAnimationFrame(FrameRequestCallback callback);
    
    @JsMethod(name = "webkitRequestFileSystem")
    public native void webkitRequestFileSystem(short type, double size, FileSystemCallback successCallback);
    
    @JsMethod(name = "webkitRequestFileSystem")
    public native void webkitRequestFileSystem(short type, double size, FileSystemCallback successCallback, ErrorCallback errorCallback);
    
    @JsMethod(name = "webkitResolveLocalFileSystemURL")
    public native void webkitResolveLocalFileSystemURL(String url, EntryCallback successCallback);
    
    @JsMethod(name = "webkitResolveLocalFileSystemURL")
    public native void webkitResolveLocalFileSystemURL(String url, EntryCallback successCallback, ErrorCallback errorCallback);
    
}

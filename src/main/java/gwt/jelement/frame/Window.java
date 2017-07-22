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
import gwt.jelement.frame.BarProp;
import gwt.jelement.frame.Console;
import gwt.jelement.frame.External;
import gwt.jelement.frame.History;
import gwt.jelement.frame.Location;
import gwt.jelement.frame.Navigator;
import gwt.jelement.frame.Screen;
import gwt.jelement.frame.ScrollToOptions;
import gwt.jelement.frame.VisualViewport;
import gwt.jelement.frame.Window;
import gwt.jelement.geometry.DOMMatrix;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.html.custom.CustomElementRegistry;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.imagebitmap.ImageBitmapOptions;
import gwt.jelement.indexeddb.IDBFactory;
import gwt.jelement.jelement.Function;
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
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Window extends EventTarget{
    public static int TEMPORARY;
    public static int PERSISTENT;
    
    
    @JsConstructor
    public Window(){
        super();
    }
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="status")
    public String status;
    
    @JsProperty(name="opener")
    public Window opener;
    
    @JsProperty(name="onorientationchange")
    public EventHandlerNonNull onorientationchange;
    
    @JsProperty(name="event")
    public Event event;
    
    @JsProperty(name="defaultStatus")
    public String defaultStatus;
    
    @JsProperty(name="defaultstatus")
    public String defaultstatus;
    
    @JsProperty(name="WebKitTransitionEvent")
    public TransitionEvent WebKitTransitionEvent;
    
    @JsProperty(name="WebKitAnimationEvent")
    public AnimationEvent WebKitAnimationEvent;
    
    @JsProperty(name="webkitURL")
    public URL webkitURL;
    
    @JsProperty(name="WebKitMutationObserver")
    public MutationObserver WebKitMutationObserver;
    
    @JsProperty(name="onanimationend")
    public EventHandlerNonNull onanimationend;
    
    @JsProperty(name="onanimationiteration")
    public EventHandlerNonNull onanimationiteration;
    
    @JsProperty(name="onanimationstart")
    public EventHandlerNonNull onanimationstart;
    
    @JsProperty(name="onsearch")
    public EventHandlerNonNull onsearch;
    
    @JsProperty(name="ontransitionend")
    public EventHandlerNonNull ontransitionend;
    
    @JsProperty(name="onwebkitanimationend")
    public EventHandlerNonNull onwebkitanimationend;
    
    @JsProperty(name="onwebkitanimationiteration")
    public EventHandlerNonNull onwebkitanimationiteration;
    
    @JsProperty(name="onwebkitanimationstart")
    public EventHandlerNonNull onwebkitanimationstart;
    
    @JsProperty(name="onwebkittransitionend")
    public EventHandlerNonNull onwebkittransitionend;
    
    @JsProperty(name="onwheel")
    public EventHandlerNonNull onwheel;
    
    @JsProperty(name="WebKitCSSMatrix")
    public DOMMatrix WebKitCSSMatrix;
    
    @JsProperty(name="onappinstalled")
    public EventHandlerNonNull onappinstalled;
    
    @JsProperty(name="onbeforeinstallprompt")
    public EventHandlerNonNull onbeforeinstallprompt;
    
    @JsProperty(name="ondevicemotion")
    public EventHandlerNonNull ondevicemotion;
    
    @JsProperty(name="ondeviceorientation")
    public EventHandlerNonNull ondeviceorientation;
    
    @JsProperty(name="ondeviceorientationabsolute")
    public EventHandlerNonNull ondeviceorientationabsolute;
    
    @JsProperty(name="webkitMediaStream")
    public MediaStream webkitMediaStream;
    
    @JsProperty(name="webkitRTCPeerConnection")
    public RTCPeerConnection webkitRTCPeerConnection;
    
    @JsProperty(name="webkitSpeechGrammar")
    public SpeechGrammar webkitSpeechGrammar;
    
    @JsProperty(name="webkitSpeechGrammarList")
    public SpeechGrammarList webkitSpeechGrammarList;
    
    @JsProperty(name="webkitSpeechRecognition")
    public SpeechRecognition webkitSpeechRecognition;
    
    @JsProperty(name="webkitSpeechRecognitionError")
    public SpeechRecognitionError webkitSpeechRecognitionError;
    
    @JsProperty(name="webkitSpeechRecognitionEvent")
    public SpeechRecognitionEvent webkitSpeechRecognitionEvent;
    
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
    
    @JsProperty(name="onbeforeunload")
    public EventHandlerNonNull onbeforeunload;
    
    @JsProperty(name="onhashchange")
    public EventHandlerNonNull onhashchange;
    
    @JsProperty(name="onlanguagechange")
    public EventHandlerNonNull onlanguagechange;
    
    @JsProperty(name="onmessage")
    public EventHandlerNonNull onmessage;
    
    @JsProperty(name="onmessageerror")
    public EventHandlerNonNull onmessageerror;
    
    @JsProperty(name="onoffline")
    public EventHandlerNonNull onoffline;
    
    @JsProperty(name="ononline")
    public EventHandlerNonNull ononline;
    
    @JsProperty(name="onpagehide")
    public EventHandlerNonNull onpagehide;
    
    @JsProperty(name="onpageshow")
    public EventHandlerNonNull onpageshow;
    
    @JsProperty(name="onpopstate")
    public EventHandlerNonNull onpopstate;
    
    @JsProperty(name="onrejectionhandled")
    public EventHandlerNonNull onrejectionhandled;
    
    @JsProperty(name="onstorage")
    public EventHandlerNonNull onstorage;
    
    @JsProperty(name="onunhandledrejection")
    public EventHandlerNonNull onunhandledrejection;
    
    @JsProperty(name="onunload")
    public EventHandlerNonNull onunload;
    
    @JsProperty(name="window")
    public native Window getWindow();
    
    @JsProperty(name="self")
    public native Window getSelf();
    
    @JsProperty(name="document")
    public native Document getDocument();
    
    @JsProperty(name="origin")
    public native String getOrigin();
    
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
    
    @JsProperty(name="closed")
    public native boolean getClosed();
    
    @JsProperty(name="frames")
    public native Window getFrames();
    
    @JsProperty(name="length")
    public native double getLength();
    
    @JsProperty(name="top")
    public native Window getTop();
    
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
    
    @JsProperty(name="orientation")
    public native double getOrientation();
    
    @JsProperty(name="clientInformation")
    public native Navigator getClientInformation();
    
    @JsProperty(name="offscreenBuffering")
    public native boolean getOffscreenBuffering();
    
    @JsProperty(name="screenLeft")
    public native double getScreenLeft();
    
    @JsProperty(name="screenTop")
    public native double getScreenTop();
    
    @JsProperty(name="styleMedia")
    public native StyleMedia getStyleMedia();
    
    @JsProperty(name="isSecureContext")
    public native boolean getIsSecureContext();
    
    @JsProperty(name="caches")
    public native CacheStorage getCaches();
    
    @JsProperty(name="animationWorklet")
    public native Worklet getAnimationWorklet();
    
    @JsProperty(name="crypto")
    public native Crypto getCrypto();
    
    @JsProperty(name="paintWorklet")
    public native Worklet getPaintWorklet();
    
    @JsProperty(name="indexedDB")
    public native IDBFactory getIndexedDB();
    
    @JsProperty(name="webkitStorageInfo")
    public native DeprecatedStorageInfo getWebkitStorageInfo();
    
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
    public native Promise<Response> fetch(Request input, Object init);
    
    @JsMethod(name = "fetch")
    public native Promise<Response> fetch(String input, Object init);
    
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
    public native double setInterval(Function handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(Function handler, double timeout);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler, double timeout);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(Function handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setInterval")
    public native double setInterval(String handler, double timeout, Object... arguments);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(Function handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(Function handler, double timeout);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(String handler, double timeout);
    
    @JsMethod(name = "setTimeout")
    public native double setTimeout(Function handler, double timeout, Object... arguments);
    
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

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
import gwt.jelement.html.custom.CustomElementRegistry;
import gwt.jelement.indexeddb.IDBFactory;
import gwt.jelement.loader.appcache.ApplicationCache;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.peerconnection.RTCPeerConnection;
import gwt.jelement.quota.DeprecatedStorageInfo;
import gwt.jelement.speech.SpeechGrammar;
import gwt.jelement.speech.SpeechGrammarList;
import gwt.jelement.speech.SpeechRecognition;
import gwt.jelement.speech.SpeechRecognitionError;
import gwt.jelement.speech.SpeechRecognitionEvent;
import gwt.jelement.speech.SpeechSynthesis;
import gwt.jelement.storage.Storage;
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
    
    @JsProperty(name="window")
    public Window window;
    
    @JsProperty(name="self")
    public Window self;
    
    @JsProperty(name="document")
    public Document document;
    
    @JsProperty(name="origin")
    public String origin;
    
    @JsProperty(name="name")
    public String name;
    
    @JsProperty(name="location")
    public Location location;
    
    @JsProperty(name="history")
    public History history;
    
    @JsProperty(name="locationbar")
    public BarProp locationbar;
    
    @JsProperty(name="menubar")
    public BarProp menubar;
    
    @JsProperty(name="personalbar")
    public BarProp personalbar;
    
    @JsProperty(name="scrollbars")
    public BarProp scrollbars;
    
    @JsProperty(name="statusbar")
    public BarProp statusbar;
    
    @JsProperty(name="toolbar")
    public BarProp toolbar;
    
    @JsProperty(name="status")
    public String status;
    
    @JsProperty(name="closed")
    public boolean closed;
    
    @JsProperty(name="frames")
    public Window frames;
    
    @JsProperty(name="length")
    public double length;
    
    @JsProperty(name="top")
    public Window top;
    
    @JsProperty(name="opener")
    public Window opener;
    
    @JsProperty(name="parent")
    public Window parent;
    
    @JsProperty(name="frameElement")
    public Element frameElement;
    
    @JsProperty(name="navigator")
    public Navigator navigator;
    
    @JsProperty(name="applicationCache")
    public ApplicationCache applicationCache;
    
    @JsProperty(name="customElements")
    public CustomElementRegistry customElements;
    
    @JsProperty(name="external")
    public External external;
    
    @JsProperty(name="screen")
    public Screen screen;
    
    @JsProperty(name="innerWidth")
    public double innerWidth;
    
    @JsProperty(name="innerHeight")
    public double innerHeight;
    
    @JsProperty(name="scrollX")
    public double scrollX;
    
    @JsProperty(name="pageXOffset")
    public double pageXOffset;
    
    @JsProperty(name="scrollY")
    public double scrollY;
    
    @JsProperty(name="pageYOffset")
    public double pageYOffset;
    
    @JsProperty(name="visualViewport")
    public VisualViewport visualViewport;
    
    @JsProperty(name="screenX")
    public double screenX;
    
    @JsProperty(name="screenY")
    public double screenY;
    
    @JsProperty(name="outerWidth")
    public double outerWidth;
    
    @JsProperty(name="outerHeight")
    public double outerHeight;
    
    @JsProperty(name="devicePixelRatio")
    public double devicePixelRatio;
    
    @JsProperty(name="console")
    public Console console;
    
    @JsProperty(name="onorientationchange")
    public EventHandlerNonNull onorientationchange;
    
    @JsProperty(name="orientation")
    public double orientation;
    
    @JsProperty(name="clientInformation")
    public Navigator clientInformation;
    
    @JsProperty(name="event")
    public Event event;
    
    @JsProperty(name="offscreenBuffering")
    public boolean offscreenBuffering;
    
    @JsProperty(name="screenLeft")
    public double screenLeft;
    
    @JsProperty(name="screenTop")
    public double screenTop;
    
    @JsProperty(name="defaultStatus")
    public String defaultStatus;
    
    @JsProperty(name="defaultstatus")
    public String defaultstatus;
    
    @JsProperty(name="styleMedia")
    public StyleMedia styleMedia;
    
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
    
    @JsProperty(name="isSecureContext")
    public boolean isSecureContext;
    
    @JsProperty(name="WebKitCSSMatrix")
    public DOMMatrix WebKitCSSMatrix;
    
    @JsProperty(name="onappinstalled")
    public EventHandlerNonNull onappinstalled;
    
    @JsProperty(name="onbeforeinstallprompt")
    public EventHandlerNonNull onbeforeinstallprompt;
    
    @JsProperty(name="caches")
    public CacheStorage caches;
    
    @JsProperty(name="animationWorklet")
    public Worklet animationWorklet;
    
    @JsProperty(name="crypto")
    public Crypto crypto;
    
    @JsProperty(name="paintWorklet")
    public Worklet paintWorklet;
    
    @JsProperty(name="ondevicemotion")
    public EventHandlerNonNull ondevicemotion;
    
    @JsProperty(name="ondeviceorientation")
    public EventHandlerNonNull ondeviceorientation;
    
    @JsProperty(name="ondeviceorientationabsolute")
    public EventHandlerNonNull ondeviceorientationabsolute;
    
    @JsProperty(name="indexedDB")
    public IDBFactory indexedDB;
    
    @JsProperty(name="webkitMediaStream")
    public MediaStream webkitMediaStream;
    
    @JsProperty(name="webkitRTCPeerConnection")
    public RTCPeerConnection webkitRTCPeerConnection;
    
    @JsProperty(name="webkitStorageInfo")
    public DeprecatedStorageInfo webkitStorageInfo;
    
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
    
    @JsProperty(name="speechSynthesis")
    public SpeechSynthesis speechSynthesis;
    
    @JsProperty(name="sessionStorage")
    public Storage sessionStorage;
    
    @JsProperty(name="localStorage")
    public Storage localStorage;
    
    @JsProperty(name="performance")
    public Performance performance;
    
    @JsProperty(name="audioWorklet")
    public Worklet audioWorklet;
    
    @JsMethod(name = "alert")
    public native void alert();
    
    @JsMethod(name = "alert")
    public native void alert(String message);
    
    @JsMethod(name = "blur")
    public native void blur();
    
    @JsMethod(name = "cancelAnimationFrame")
    public native void cancelAnimationFrame(double handle);
    
    @JsMethod(name = "cancelIdleCallback")
    public native void cancelIdleCallback(double handle);
    
    @JsMethod(name = "captureEvents")
    public native void captureEvents();
    
    @JsMethod(name = "close")
    public native void close();
    
    @JsMethod(name = "confirm")
    public native boolean confirm();
    
    @JsMethod(name = "confirm")
    public native boolean confirm(String message);
    
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

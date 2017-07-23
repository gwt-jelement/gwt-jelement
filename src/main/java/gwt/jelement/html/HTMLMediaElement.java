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

import gwt.jelement.dom.DOMTokenList;
import gwt.jelement.encryptedmedia.MediaKeys;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.html.CanPlayTypeResult;
import gwt.jelement.html.HTMLElement;
import gwt.jelement.html.TimeRanges;
import gwt.jelement.html.media.MediaError;
import gwt.jelement.html.track.AudioTrackList;
import gwt.jelement.html.track.TextTrack;
import gwt.jelement.html.track.TextTrackKind;
import gwt.jelement.html.track.TextTrackList;
import gwt.jelement.html.track.VideoTrackList;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.remoteplayback.RemotePlayback;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class HTMLMediaElement extends HTMLElement{
    public static int NETWORK_EMPTY;
    public static int NETWORK_IDLE;
    public static int NETWORK_LOADING;
    public static int NETWORK_NO_SOURCE;
    public static int HAVE_NOTHING;
    public static int HAVE_METADATA;
    public static int HAVE_CURRENT_DATA;
    public static int HAVE_FUTURE_DATA;
    public static int HAVE_ENOUGH_DATA;
    
    
    @JsConstructor
    public HTMLMediaElement(){
        super();
    }
    
    @JsProperty(name="error")
    public MediaError error;
    
    @JsProperty(name="src")
    public String src;
    
    @JsProperty(name="currentSrc")
    public String currentSrc;
    
    @JsProperty(name="crossOrigin")
    public String crossOrigin;
    
    @JsProperty(name="networkState")
    public short networkState;
    
    @JsProperty(name="preload")
    public String preload;
    
    @JsProperty(name="buffered")
    public TimeRanges buffered;
    
    @JsProperty(name="readyState")
    public short readyState;
    
    @JsProperty(name="seeking")
    public boolean seeking;
    
    @JsProperty(name="currentTime")
    public double currentTime;
    
    @JsProperty(name="duration")
    public double duration;
    
    @JsProperty(name="paused")
    public boolean paused;
    
    @JsProperty(name="defaultPlaybackRate")
    public double defaultPlaybackRate;
    
    @JsProperty(name="playbackRate")
    public double playbackRate;
    
    @JsProperty(name="played")
    public TimeRanges played;
    
    @JsProperty(name="seekable")
    public TimeRanges seekable;
    
    @JsProperty(name="ended")
    public boolean ended;
    
    @JsProperty(name="autoplay")
    public boolean autoplay;
    
    @JsProperty(name="loop")
    public boolean loop;
    
    @JsProperty(name="controls")
    public boolean controls;
    
    @JsProperty(name="controlsList")
    public DOMTokenList controlsList;
    
    @JsProperty(name="volume")
    public double volume;
    
    @JsProperty(name="muted")
    public boolean muted;
    
    @JsProperty(name="defaultMuted")
    public boolean defaultMuted;
    
    @JsProperty(name="audioTracks")
    public AudioTrackList audioTracks;
    
    @JsProperty(name="videoTracks")
    public VideoTrackList videoTracks;
    
    @JsProperty(name="textTracks")
    public TextTrackList textTracks;
    
    @JsProperty(name="webkitAudioDecodedByteCount")
    public double webkitAudioDecodedByteCount;
    
    @JsProperty(name="webkitVideoDecodedByteCount")
    public double webkitVideoDecodedByteCount;
    
    @JsProperty(name="sinkId")
    public String sinkId;
    
    @JsProperty(name="mediaKeys")
    public MediaKeys mediaKeys;
    
    @JsProperty(name="onencrypted")
    public EventHandlerNonNull onencrypted;
    
    @JsProperty(name="onwaitingforkey")
    public EventHandlerNonNull onwaitingforkey;
    
    @JsProperty(name="remote")
    public RemotePlayback remote;
    
    @JsProperty(name="disableRemotePlayback")
    public boolean disableRemotePlayback;
    
    @JsProperty(name="srcObject")
    public MediaStream srcObject;
    
    @JsOverlay
    public final TextTrack addTextTrack(TextTrackKind kind){
        return addTextTrack(kind.getInternalValue());
    }
    
    @JsMethod(name = "addTextTrack")
    public native TextTrack addTextTrack(String kind);
    
    @JsOverlay
    public final TextTrack addTextTrack(TextTrackKind kind, String label){
        return addTextTrack(kind.getInternalValue(), label);
    }
    
    @JsMethod(name = "addTextTrack")
    public native TextTrack addTextTrack(String kind, String label);
    
    @JsOverlay
    public final TextTrack addTextTrack(TextTrackKind kind, String label, String language){
        return addTextTrack(kind.getInternalValue(), label, language);
    }
    
    @JsMethod(name = "addTextTrack")
    public native TextTrack addTextTrack(String kind, String label, String language);
    
    @JsOverlay
    public final CanPlayTypeResult canPlayTypeAsCanPlayTypeResult(String type){
        return CanPlayTypeResult.of(canPlayType(type));
    }
    
    @JsMethod(name = "canPlayType")
    public native String canPlayType(String type);
    
    @JsMethod(name = "captureStream")
    public native MediaStream captureStream();
    
    @JsMethod(name = "load")
    public native void load();
    
    @JsMethod(name = "pause")
    public native void pause();
    
    @JsMethod(name = "play")
    public native Promise<Void> play();
    
    @JsMethod(name = "setMediaKeys")
    public native Promise setMediaKeys(MediaKeys mediaKeys);
    
    @JsMethod(name = "setSinkId")
    public native Promise<Void> setSinkId(String sinkId);
    
}

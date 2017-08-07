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

import gwt.jelement.core.Promise;
import gwt.jelement.dom.DOMTokenList;
import gwt.jelement.encryptedmedia.MediaKeys;
import gwt.jelement.events.EventHandlerNonNull;
import gwt.jelement.html.media.MediaError;
import gwt.jelement.html.track.AudioTrackList;
import gwt.jelement.html.track.TextTrack;
import gwt.jelement.html.track.TextTrackKind;
import gwt.jelement.html.track.TextTrackList;
import gwt.jelement.html.track.VideoTrackList;
import gwt.jelement.mediastream.MediaStream;
import gwt.jelement.remoteplayback.RemotePlayback;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLMediaElement", isNative = true)
public class HTMLMediaElement extends HTMLElement {
    public static short NETWORK_EMPTY; /* 0 */
    public static short NETWORK_IDLE; /* 1 */
    public static short NETWORK_LOADING; /* 2 */
    public static short NETWORK_NO_SOURCE; /* 3 */
    public static short HAVE_NOTHING; /* 0 */
    public static short HAVE_METADATA; /* 1 */
    public static short HAVE_CURRENT_DATA; /* 2 */
    public static short HAVE_FUTURE_DATA; /* 3 */
    public static short HAVE_ENOUGH_DATA; /* 4 */
    
    @JsProperty(name="onencrypted")
    private EventHandlerNonNull onencrypted;
    
    @JsProperty(name="onwaitingforkey")
    private EventHandlerNonNull onwaitingforkey;
    
    @JsProperty(name="error")
    public native MediaError getError();
    
    @JsProperty(name="src")
    public native String getSrc();
    
    @JsProperty(name="src")
    public native void setSrc(String src);
    
    @JsProperty(name="currentSrc")
    public native String getCurrentSrc();
    
    @JsProperty(name="crossOrigin")
    public native String getCrossOrigin();
    
    @JsProperty(name="crossOrigin")
    public native void setCrossOrigin(String crossOrigin);
    
    @JsProperty(name="networkState")
    public native short getNetworkState();
    
    @JsProperty(name="preload")
    public native String getPreload();
    
    @JsProperty(name="preload")
    public native void setPreload(String preload);
    
    @JsProperty(name="buffered")
    public native TimeRanges getBuffered();
    
    @JsProperty(name="readyState")
    public native short getReadyState();
    
    @JsProperty(name="seeking")
    public native boolean getSeeking();
    
    @JsProperty(name="currentTime")
    public native double getCurrentTime();
    
    @JsProperty(name="currentTime")
    public native void setCurrentTime(double currentTime);
    
    @JsProperty(name="duration")
    public native double getDuration();
    
    @JsProperty(name="paused")
    public native boolean getPaused();
    
    @JsProperty(name="defaultPlaybackRate")
    public native double getDefaultPlaybackRate();
    
    @JsProperty(name="defaultPlaybackRate")
    public native void setDefaultPlaybackRate(double defaultPlaybackRate);
    
    @JsProperty(name="playbackRate")
    public native double getPlaybackRate();
    
    @JsProperty(name="playbackRate")
    public native void setPlaybackRate(double playbackRate);
    
    @JsProperty(name="played")
    public native TimeRanges getPlayed();
    
    @JsProperty(name="seekable")
    public native TimeRanges getSeekable();
    
    @JsProperty(name="ended")
    public native boolean getEnded();
    
    @JsProperty(name="autoplay")
    public native boolean getAutoplay();
    
    @JsProperty(name="autoplay")
    public native void setAutoplay(boolean autoplay);
    
    @JsProperty(name="loop")
    public native boolean getLoop();
    
    @JsProperty(name="loop")
    public native void setLoop(boolean loop);
    
    @JsProperty(name="controls")
    public native boolean getControls();
    
    @JsProperty(name="controls")
    public native void setControls(boolean controls);
    
    @JsProperty(name="controlsList")
    public native DOMTokenList getControlsList();
    
    @JsProperty(name="volume")
    public native double getVolume();
    
    @JsProperty(name="volume")
    public native void setVolume(double volume);
    
    @JsProperty(name="muted")
    public native boolean getMuted();
    
    @JsProperty(name="muted")
    public native void setMuted(boolean muted);
    
    @JsProperty(name="defaultMuted")
    public native boolean getDefaultMuted();
    
    @JsProperty(name="defaultMuted")
    public native void setDefaultMuted(boolean defaultMuted);
    
    @JsProperty(name="audioTracks")
    public native AudioTrackList getAudioTracks();
    
    @JsProperty(name="videoTracks")
    public native VideoTrackList getVideoTracks();
    
    @JsProperty(name="textTracks")
    public native TextTrackList getTextTracks();
    
    @JsProperty(name="webkitAudioDecodedByteCount")
    public native double getWebkitAudioDecodedByteCount();
    
    @JsProperty(name="webkitVideoDecodedByteCount")
    public native double getWebkitVideoDecodedByteCount();
    
    @JsProperty(name="sinkId")
    public native String getSinkId();
    
    @JsProperty(name="mediaKeys")
    public native MediaKeys getMediaKeys();
    
    @JsOverlay
    public final EventHandlerNonNull getOnEncrypted(){
        return this.onencrypted;
    }
    
    @JsOverlay
    public final void setOnEncrypted(EventHandlerNonNull onencrypted){
        this.onencrypted = onencrypted;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWaitingforkey(){
        return this.onwaitingforkey;
    }
    
    @JsOverlay
    public final void setOnWaitingforkey(EventHandlerNonNull onwaitingforkey){
        this.onwaitingforkey = onwaitingforkey;
    }
    
    @JsProperty(name="remote")
    public native RemotePlayback getRemote();
    
    @JsProperty(name="disableRemotePlayback")
    public native boolean getDisableRemotePlayback();
    
    @JsProperty(name="disableRemotePlayback")
    public native void setDisableRemotePlayback(boolean disableRemotePlayback);
    
    @JsProperty(name="srcObject")
    public native MediaStream getSrcObject();
    
    @JsProperty(name="srcObject")
    public native void setSrcObject(MediaStream srcObject);
    
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

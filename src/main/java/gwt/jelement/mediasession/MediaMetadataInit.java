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
package gwt.jelement.mediasession;

import gwt.jelement.mediasession.MediaImage;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaMetadataInit{

    @JsProperty(name="title")
    private String title;

    @JsProperty(name="artist")
    private String artist;

    @JsProperty(name="album")
    private String album;

    @JsProperty(name="artwork")
    private MediaImage[] artwork;

    public MediaMetadataInit(){
    }

    @JsOverlay
    public final String getTitle(){
        return this.title;
    }

    @JsOverlay
    public final void setTitle(String title){
        this.title = title;
    }

    @JsOverlay
    public final String getArtist(){
        return this.artist;
    }

    @JsOverlay
    public final void setArtist(String artist){
        this.artist = artist;
    }

    @JsOverlay
    public final String getAlbum(){
        return this.album;
    }

    @JsOverlay
    public final void setAlbum(String album){
        this.album = album;
    }

    @JsOverlay
    public final MediaImage[] getArtwork(){
        return this.artwork;
    }

    @JsOverlay
    public final void setArtwork(MediaImage[] artwork){
        this.artwork = artwork;
    }

}

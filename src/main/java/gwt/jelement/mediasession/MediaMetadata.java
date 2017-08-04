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

import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MediaMetadata", isNative = true)
public class MediaMetadata extends IsObject{
    @JsConstructor
    public MediaMetadata(){
        super();
    }
    
    @JsConstructor
    public MediaMetadata(MediaMetadataInit metadata){
        super();
    }
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsProperty(name="title")
    public native void setTitle(String title);
    
    @JsProperty(name="artist")
    public native String getArtist();
    
    @JsProperty(name="artist")
    public native void setArtist(String artist);
    
    @JsProperty(name="album")
    public native String getAlbum();
    
    @JsProperty(name="album")
    public native void setAlbum(String album);
    
    @JsProperty(name="artwork")
    public native MediaImage[] getArtwork();
    
    @JsProperty(name="artwork")
    public native void setArtwork(MediaImage[] artwork);
    
}

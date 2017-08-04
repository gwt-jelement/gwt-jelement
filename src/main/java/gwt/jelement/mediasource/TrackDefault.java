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
package gwt.jelement.mediasource;

import gwt.jelement.core.Array;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="TrackDefault", isNative = true)
public class TrackDefault extends IsObject{
    @JsProperty(name="type")
    private String type;
    
    @JsConstructor
    public TrackDefault(TrackDefaultType type, String language, String label, String[] kinds){
        super();
    }
    
    @JsConstructor
    public TrackDefault(TrackDefaultType type, String language, String label, String[] kinds, String byteStreamTrackID){
        super();
    }
    
    @JsConstructor
    public TrackDefault(TrackDefaultType type, String language, String label, Array kinds){
        super();
    }
    
    @JsConstructor
    public TrackDefault(TrackDefaultType type, String language, String label, Array kinds, String byteStreamTrackID){
        super();
    }
    
    @JsProperty(name="byteStreamTrackID")
    public native String getByteStreamTrackID();
    
    @JsProperty(name="language")
    public native String getLanguage();
    
    @JsProperty(name="label")
    public native String getLabel();
    
    @JsProperty(name="kinds")
    public native String[] getKinds();
    
    @JsOverlay
    public final TrackDefaultType getType(){
       return TrackDefaultType.of(type);
    }
    
}

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
package gwt.jelement.nfc;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class NFCWatchOptions extends JsObject{

    @JsProperty(name="url")
    private String url;

    @JsProperty(name="recordType")
    private String recordType;

    @JsProperty(name="mediaType")
    private String mediaType;

    @JsProperty(name="mode")
    private String mode;

    public NFCWatchOptions(){
    }

    @JsOverlay
    public final String getUrl(){
        return this.url;
    }

    @JsOverlay
    public final void setUrl(String url){
        this.url = url;
    }

    @JsOverlay
    public final NFCRecordType getRecordType(){
        return NFCRecordType.of(this.recordType);
    }

    @JsOverlay
    public final void setRecordType(NFCRecordType recordType){
        this.recordType = recordType.getInternalValue();
    }

    @JsOverlay
    public final String getMediaType(){
        return this.mediaType;
    }

    @JsOverlay
    public final void setMediaType(String mediaType){
        this.mediaType = mediaType;
    }

    @JsOverlay
    public final NFCWatchMode getMode(){
        return NFCWatchMode.of(this.mode);
    }

    @JsOverlay
    public final void setMode(NFCWatchMode mode){
        this.mode = mode.getInternalValue();
    }


}

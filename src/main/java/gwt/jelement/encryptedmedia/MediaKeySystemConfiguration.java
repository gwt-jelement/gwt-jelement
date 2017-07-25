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
package gwt.jelement.encryptedmedia;

import gwt.jelement.encryptedmedia.MediaKeySystemMediaCapability;
import gwt.jelement.encryptedmedia.MediaKeysRequirement;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaKeySystemConfiguration{

    public MediaKeySystemConfiguration(){
    }

    @JsProperty(name="label")
    public String label;

    @JsOverlay
    public final String getLabel(){
        return this.label;
    }

    @JsOverlay
    public final void setLabel(String label){
        this.label = label;
    }

    @JsProperty(name="initDataTypes")
    public String[] initDataTypes;

    @JsOverlay
    public final String[] getInitDataTypes(){
        return this.initDataTypes;
    }

    @JsOverlay
    public final void setInitDataTypes(String[] initDataTypes){
        this.initDataTypes = initDataTypes;
    }

    @JsProperty(name="audioCapabilities")
    public MediaKeySystemMediaCapability[] audioCapabilities;

    @JsOverlay
    public final MediaKeySystemMediaCapability[] getAudioCapabilities(){
        return this.audioCapabilities;
    }

    @JsOverlay
    public final void setAudioCapabilities(MediaKeySystemMediaCapability[] audioCapabilities){
        this.audioCapabilities = audioCapabilities;
    }

    @JsProperty(name="videoCapabilities")
    public MediaKeySystemMediaCapability[] videoCapabilities;

    @JsOverlay
    public final MediaKeySystemMediaCapability[] getVideoCapabilities(){
        return this.videoCapabilities;
    }

    @JsOverlay
    public final void setVideoCapabilities(MediaKeySystemMediaCapability[] videoCapabilities){
        this.videoCapabilities = videoCapabilities;
    }

    @JsProperty(name="distinctiveIdentifier")
    public String distinctiveIdentifier;

    @JsOverlay
    public final MediaKeysRequirement getDistinctiveIdentifier(){
        return MediaKeysRequirement.of(this.distinctiveIdentifier);
    }

    @JsOverlay
    public final void setDistinctiveIdentifier(MediaKeysRequirement distinctiveIdentifier){
        this.distinctiveIdentifier = distinctiveIdentifier.getInternalValue();
    }

    @JsProperty(name="persistentState")
    public String persistentState;

    @JsOverlay
    public final MediaKeysRequirement getPersistentState(){
        return MediaKeysRequirement.of(this.persistentState);
    }

    @JsOverlay
    public final void setPersistentState(MediaKeysRequirement persistentState){
        this.persistentState = persistentState.getInternalValue();
    }

    @JsProperty(name="sessionTypes")
    public String[] sessionTypes;

    @JsOverlay
    public final String[] getSessionTypes(){
        return this.sessionTypes;
    }

    @JsOverlay
    public final void setSessionTypes(String[] sessionTypes){
        this.sessionTypes = sessionTypes;
    }


}

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

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class MediaKeySystemConfiguration extends JsObject{

    @JsProperty(name="label")
    private String label;

    @JsProperty(name="initDataTypes")
    private String[] initDataTypes;

    @JsProperty(name="audioCapabilities")
    private MediaKeySystemMediaCapability[] audioCapabilities;

    @JsProperty(name="videoCapabilities")
    private MediaKeySystemMediaCapability[] videoCapabilities;

    @JsProperty(name="distinctiveIdentifier")
    private String distinctiveIdentifier;

    @JsProperty(name="persistentState")
    private String persistentState;

    @JsProperty(name="sessionTypes")
    private String[] sessionTypes;

    public MediaKeySystemConfiguration(){
    }

    @JsOverlay
    public final String getLabel(){
        return this.label;
    }

    @JsOverlay
    public final void setLabel(String label){
        this.label = label;
    }

    @JsOverlay
    public final String[] getInitDataTypes(){
        return this.initDataTypes;
    }

    @JsOverlay
    public final void setInitDataTypes(String[] initDataTypes){
        this.initDataTypes = initDataTypes;
    }

    @JsOverlay
    public final MediaKeySystemMediaCapability[] getAudioCapabilities(){
        return this.audioCapabilities;
    }

    @JsOverlay
    public final void setAudioCapabilities(MediaKeySystemMediaCapability[] audioCapabilities){
        this.audioCapabilities = audioCapabilities;
    }

    @JsOverlay
    public final MediaKeySystemMediaCapability[] getVideoCapabilities(){
        return this.videoCapabilities;
    }

    @JsOverlay
    public final void setVideoCapabilities(MediaKeySystemMediaCapability[] videoCapabilities){
        this.videoCapabilities = videoCapabilities;
    }

    @JsOverlay
    public final MediaKeysRequirement getDistinctiveIdentifier(){
        return MediaKeysRequirement.of(this.distinctiveIdentifier);
    }

    @JsOverlay
    public final void setDistinctiveIdentifier(MediaKeysRequirement distinctiveIdentifier){
        this.distinctiveIdentifier = distinctiveIdentifier.getInternalValue();
    }

    @JsOverlay
    public final MediaKeysRequirement getPersistentState(){
        return MediaKeysRequirement.of(this.persistentState);
    }

    @JsOverlay
    public final void setPersistentState(MediaKeysRequirement persistentState){
        this.persistentState = persistentState.getInternalValue();
    }

    @JsOverlay
    public final String[] getSessionTypes(){
        return this.sessionTypes;
    }

    @JsOverlay
    public final void setSessionTypes(String[] sessionTypes){
        this.sessionTypes = sessionTypes;
    }

}

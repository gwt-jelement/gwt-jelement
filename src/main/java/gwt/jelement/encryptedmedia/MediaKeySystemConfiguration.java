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

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class MediaKeySystemConfiguration{

    @JsProperty(name="label")
    public String label = "";

    @JsProperty(name="initDataTypes")
    public String[] initDataTypes = new String[0];

    @JsProperty(name="audioCapabilities")
    public MediaKeySystemMediaCapability[] audioCapabilities = new MediaKeySystemMediaCapability[0];

    @JsProperty(name="videoCapabilities")
    public MediaKeySystemMediaCapability[] videoCapabilities = new MediaKeySystemMediaCapability[0];

    @JsProperty(name="distinctiveIdentifier")
    public MediaKeysRequirement distinctiveIdentifier = MediaKeysRequirement.of("optional");

    @JsProperty(name="persistentState")
    public MediaKeysRequirement persistentState = MediaKeysRequirement.of("optional");

    @JsProperty(name="sessionTypes")
    public String[] sessionTypes;


}

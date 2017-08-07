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
package gwt.jelement.peerconnection;

import gwt.jelement.core.Date;
import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="RTCLegacyStatsReport", isNative = true)
public class RTCLegacyStatsReport implements IsObject {
    @JsProperty(name="timestamp")
    public native Date getTimestamp();
    
    @JsProperty(name="id")
    public native String getId();
    
    @JsProperty(name="type")
    public native String getType();
    
    @JsMethod(name = "names")
    public native String[] names();
    
    @JsMethod(name = "stat")
    public native String stat(String name);
    
}

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
package gwt.jelement.events;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="ProgressEvent", isNative = true)
public class ProgressEvent extends Event {
    @JsConstructor
    public ProgressEvent(String type){
        super((String) null);
    }
    
    @JsConstructor
    public ProgressEvent(String type, ProgressEventInit eventInitDict){
        super((String) null);
    }
    
    @JsProperty(name="lengthComputable")
    public native boolean isLengthComputable();
    
    @JsProperty(name="loaded")
    public native double getLoaded();
    
    @JsProperty(name="total")
    public native double getTotal();
    
}

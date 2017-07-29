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
package gwt.jelement.webmidi;

import gwt.jelement.core.Uint8Array;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="MIDIOutput", isNative = true)
public class MIDIOutput extends MIDIPort{
    @JsConstructor
    public MIDIOutput(){
        super();
    }
    
    @JsMethod(name = "send")
    public native void send(Uint8Array data);
    
    @JsMethod(name = "send")
    public native void send(double[] data);
    
    @JsMethod(name = "send")
    public native void send(Uint8Array data, double timestamp);
    
    @JsMethod(name = "send")
    public native void send(double[] data, double timestamp);
    
}

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

import gwt.jelement.events.UIEventInit;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class EventModifierInit extends UIEventInit{

    @JsProperty(name="ctrlKey")
    public boolean ctrlKey;

    @JsProperty(name="shiftKey")
    public boolean shiftKey;

    @JsProperty(name="altKey")
    public boolean altKey;

    @JsProperty(name="metaKey")
    public boolean metaKey;

    @JsProperty(name="modifierAltGraph")
    public boolean modifierAltGraph;

    @JsProperty(name="modifierCapsLock")
    public boolean modifierCapsLock;

    @JsProperty(name="modifierFn")
    public boolean modifierFn;

    @JsProperty(name="modifierNumLock")
    public boolean modifierNumLock;

    @JsProperty(name="modifierScrollLock")
    public boolean modifierScrollLock;

    @JsProperty(name="modifierSymbol")
    public boolean modifierSymbol;


}

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
package gwt.jelement.dom;

import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="DocumentType", isNative = true)
public class DocumentType extends Node {
    @JsProperty(name="name")
    public native String getName();
    
    @JsProperty(name="publicId")
    public native String getPublicId();
    
    @JsProperty(name="systemId")
    public native String getSystemId();
    
    @SafeVarargs
    @JsMethod(name = "after")
    public final native void after(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "after")
    public final native void after(String... nodes);
    
    @SafeVarargs
    @JsMethod(name = "before")
    public final native void before(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "before")
    public final native void before(String... nodes);
    
    @JsMethod(name = "remove")
    public native void remove();
    
    @SafeVarargs
    @JsMethod(name = "replaceWith")
    public final native void replaceWith(Node... nodes);
    
    @SafeVarargs
    @JsMethod(name = "replaceWith")
    public final native void replaceWith(String... nodes);
    
}

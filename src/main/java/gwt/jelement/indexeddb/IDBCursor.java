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
package gwt.jelement.indexeddb;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="IDBCursor", isNative = true)
public class IDBCursor extends JsObject{
    @JsProperty(name="direction")
    private String direction;
    
    @JsConstructor
    public IDBCursor(){
        super();
    }
    
    @JsProperty(name="source")
    public native Object getSource();
    
    @JsProperty(name="key")
    public native Object getKey();
    
    @JsProperty(name="primaryKey")
    public native Object getPrimaryKey();
    
    @JsOverlay
    public final IDBCursorDirection getDirection(){
       return IDBCursorDirection.of(direction);
    }
    
    @JsMethod(name = "advance")
    public native void advance(double count);
    
    @JsMethod(name = "continue")
    public native void continue_();
    
    @JsMethod(name = "continue")
    public native void continue_(Object key);
    
    @JsMethod(name = "continuePrimaryKey")
    public native void continuePrimaryKey(Object key, Object primaryKey);
    
    @JsMethod(name = "delete")
    public native IDBRequest delete();
    
    @JsMethod(name = "update")
    public native IDBRequest update(Object value);
    
}

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
package gwt.jelement.core;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Iterator", isNative = true)
public class Iterator<T extends IteratorValue <V>,V> implements IsObject {
    @JsMethod(name = "next")
    public native T next();
    
    @JsOverlay
    public final Iterable<V> iterable() {
        return new Iterable<V>() {
            @Override
            public java.util.Iterator<V> iterator() {
                return new java.util.Iterator<V>() {
                    private T nextEntry;
    
                    @Override
                    public boolean hasNext() {
                        nextEntry = Iterator.this.next();
                        return nextEntry.isDone();
                    }
    
                    @Override
                    public V next() {
                        return nextEntry.getValue();
                    }
                };
            }
        };
    }
}

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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Iterator;

@JsType(isNative = true)
public class ArrayLike<T> extends IsObject {

    @JsProperty(name = "length")
    public native double getLength();

    @JsOverlay
    public final T get(double index) {
        return (T) Js.get(this.object(), index);
    }

    @JsOverlay
    private final boolean isUndefined(double index) {
        return Js.isUndefined(this.object(), index);
    }

    @JsOverlay
    public final Iterable<T> iterable() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int currentIndex = 0;

                    @Override
                    public boolean hasNext() {
                        while (currentIndex < getLength()) {
                            if (!isUndefined(currentIndex)) {
                                return true;
                            }
                            ++currentIndex;
                        }
                        return false;
                    }

                    @Override
                    public T next() {
                        T result = get(currentIndex);
                        ++currentIndex;
                        return result;
                    }
                };
            }
        };
    }
}
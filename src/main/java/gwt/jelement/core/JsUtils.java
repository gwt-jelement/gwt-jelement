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

public class JsUtils<T> {

    public static native <T> JsObject<T> of(String key, T value)/*-{
        var obj = {};
        obj[key] = value;
        return obj;
    }-*/;

    public static native <T> void set(JsObject<T> obj, String propertyName, T value) /*-{
        obj[propertyName] = value;
    }-*/;

    public static native <T> T get(JsObject<T> obj, String propertyName) /*-{
        return obj[propertyName];
    }-*/;

    public static native <T> boolean has(JsObject<T> obj, String propertyName) /*-{
        return propertyName in obj;
    }-*/;

    public static native <T> void delete(JsObject<T> obj, String propertyName) /*-{
        delete obj[propertyName];
    }-*/;

}

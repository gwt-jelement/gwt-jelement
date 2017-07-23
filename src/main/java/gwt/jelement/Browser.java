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

package gwt.jelement;

import gwt.jelement.frame.Location;
import gwt.jelement.frame.Navigator;
import gwt.jelement.frame.Screen;
import gwt.jelement.frame.Window;
import gwt.jelement.html.HTMLDocument;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(name = "window", isNative = true, namespace = JsPackage.GLOBAL)
public class Browser {
    public static HTMLDocument document;
    public static Location location;
    public static Navigator navigator;
    public static Screen screen;
    public static Window self;
    public static Window top;
    public static Window window;
}
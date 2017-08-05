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
package gwt.jelement.inspector;

import gwt.jelement.core.IsObject;
import gwt.jelement.dom.Document;
import gwt.jelement.filesystem.DOMFileSystem;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, name="DevToolsHost", isNative = true)
public class DevToolsHost extends IsObject{
    @JsMethod(name = "copyText")
    public native void copyText(String text);
    
    @JsMethod(name = "getSelectionBackgroundColor")
    public native String getSelectionBackgroundColor();
    
    @JsMethod(name = "getSelectionForegroundColor")
    public native String getSelectionForegroundColor();
    
    @JsMethod(name = "isHostedMode")
    public native boolean isHostedMode();
    
    @JsMethod(name = "isUnderTest")
    public native boolean isUnderTest();
    
    @JsMethod(name = "isolatedFileSystem")
    public native DOMFileSystem isolatedFileSystem(String fileSystemId, String registeredName);
    
    @JsMethod(name = "platform")
    public native String platform();
    
    @JsMethod(name = "sendMessageToEmbedder")
    public native void sendMessageToEmbedder(String message);
    
    @JsMethod(name = "showContextMenuAtPoint")
    public native void showContextMenuAtPoint(double x, double y, Any items);
    
    @JsMethod(name = "showContextMenuAtPoint")
    public native void showContextMenuAtPoint(double x, double y, Any items, Document document);
    
    @JsMethod(name = "upgradeDraggedFileSystemPermissions")
    public native void upgradeDraggedFileSystemPermissions(DOMFileSystem domFileSystem);
    
    @JsMethod(name = "zoomFactor")
    public native double zoomFactor();
    
}

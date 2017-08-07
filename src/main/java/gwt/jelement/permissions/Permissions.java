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
package gwt.jelement.permissions;

import gwt.jelement.core.IsObject;
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Promise;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Permissions", isNative = true)
public class Permissions implements IsObject {
    @JsMethod(name = "query")
    public native Promise<PermissionStatus> query(JsObject permission);
    
    @JsMethod(name = "request")
    public native Promise<PermissionStatus> request(JsObject permissions);
    
    @JsMethod(name = "requestAll")
    public native Promise<PermissionStatus[]> requestAll(JsObject[] permissions);
    
    @JsMethod(name = "revoke")
    public native Promise<PermissionStatus> revoke(JsObject permission);
    
}
